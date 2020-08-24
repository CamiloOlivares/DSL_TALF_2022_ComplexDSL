/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antlr.example;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 *
 * @author cml_9
 */
public class ComplexErrorListener extends BaseErrorListener{
    
    ArrayList<String> errores=new ArrayList();
    
    @Override
    public void syntaxError(Recognizer <?,?> recognizer,Object offendingSymbol,int line,int charPositionInLine,String msg,RecognitionException e){
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        //System.err.println("rule stack: "+stack);
        //System.err.println("line "+line+":"+charPositionInLine+" at "+
        //offendingSymbol+": "+msg);
        errores.add("rule stack: "+stack);
        errores.add("\n");
        errores.add("line "+line+":"+charPositionInLine+" "+msg);
        errores.add("\n");
    }
    
    public void showErrores(){
        if(errores.isEmpty()){
            errores.add("No hay errores");
            System.out.println(errores);
            JOptionPane.showMessageDialog(null, errores);
        }
        else{
            String errorCadena = "";
            for(String elemento:errores){
                System.out.println(elemento);
                errorCadena = errorCadena + elemento;
            }
            JOptionPane.showMessageDialog(null, errorCadena);
        }
        
    } 
}
