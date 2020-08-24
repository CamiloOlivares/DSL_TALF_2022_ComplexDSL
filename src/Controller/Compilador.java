/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import antlr.example.ComplexErrorListener;
import antlr.example.Numeros;
import antlr.example.complexLexer;
import antlr.example.complexParser;
import antlr.example.newComplexListener;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author cml_9
 */
public class Compilador {
    
    newComplexListener cl;
    
    public String compilar(String texto){
        complexLexer lexer;
        System.out.println("Ejecutando...");
        CharStream input = CharStreams.fromString(texto);
        //System.out.println(input);
        lexer = new complexLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        complexParser parser = new complexParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ComplexErrorListener());
        ParseTree tree = parser.start();    
        ComplexErrorListener cel = (ComplexErrorListener) parser.getErrorListeners().get(0);
        cel.showErrores();
        newComplexListener ncl = new newComplexListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(ncl,tree);
        System.out.println("Pasa..");
        String output="";
        cl = ncl;
        for(String vars:ncl.mostrarVar){
            output = output+vars+"\n";
        }
        return output;
        //System.out.println(ncl.mostrarVar);
    }
    
    public JTextArea cargar(JTextArea area){
       JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
       
       try{
           File f=chooser.getSelectedFile();
           String filename = f.getAbsolutePath();
           FileReader reader = new FileReader(filename);
           BufferedReader br = new BufferedReader(reader);
           area.read(br,null);
           br.close();
           area.requestFocus();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       return area;
    }
    
    public void showTree(String texto){
        complexLexer lexer;
        System.out.println("Ejecutando...");
        CharStream input = CharStreams.fromString(texto);
        //System.out.println(input);
        lexer = new complexLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        complexParser parser = new complexParser(tokens);
        ParseTree tree = parser.start();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewer.setScale(1.5); // Scale a little       
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.add(viewer);         
        frame.add(panel);         
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);         
        frame.pack();         
        frame.setVisible(true);
    }

    
    String chooseRange(ArrayList<Numeros> nums){
        String range = "";
        int xRange=0;
        int yRange=0;
        for(Numeros n:nums){
            if(Math.abs(n.getRealPart())>xRange){
                xRange= Math.round(Math.abs(n.getRealPart()));
            }
            if(Math.abs(n.getImPart())>yRange){
                yRange= Math.round(Math.abs(n.getImPart()));
            }
        }
        xRange+=5;
        yRange+=5;
        range = "PlotRange->{{-"+xRange+","+xRange+"},{-"+yRange+","+yRange+"}}";
        return range;
    }
    
    public void exportMath() throws IOException{
        JFileChooser selecRuta = new JFileChooser();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   
        String grafSentence ="puntos = ListPlot[{";
        for(Numeros n:cl.grafNums){
            grafSentence = grafSentence +"Labeled[{"+n.getRealPart()+","+n.getImPart()+"},\""+n.getNumero()+"\"],";
        }
        grafSentence = grafSentence.substring(0, grafSentence.length()-1);
        grafSentence = grafSentence + "},";
        grafSentence = grafSentence + chooseRange(cl.grafNums);
        grafSentence = grafSentence + ",GridLines -> Automatic]";
        //String grafS = "puntos = ListPlot[{Labeled[{-4, 4}, \"-4+4i\"],Labeled[{4, -4}, \"4+-4i\"]}, PlotRange -> {{-5, 5}, {-5, 5}},GridLines -> Automatic]";
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            String ruta= fileToSave.getAbsolutePath();
            Writer out =   new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ruta), "UTF-8"));
            //new FileWriter(ruta);                 
            out.write(grafSentence);                 
            out.close();
            Desktop.getDesktop().open(fileToSave);
        }
        
    }
}
