/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antlr.example;

import java.io.IOException;
import static java.time.Clock.system;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author cml_9
 */
public class AntlrcomplexMain {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        complexLexer lexer;
        System.out.println("Ejecutando...");
        CharStream input = CharStreams.fromString("var hola = 3+2i; var perrito = 1+4i;var op = hola+perrito; hola+op;");
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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        frame.pack();         
        frame.setVisible(true);
        newComplexListener ncl = new newComplexListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(ncl,tree);
        System.out.println("Pasa.."); 
    }
}
