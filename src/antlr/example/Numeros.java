/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antlr.example;

import java.util.Vector;

/**
 *
 * @author cml_9
 */
public class Numeros{
    //number1 is the first imaginary number and number2 is the second
    String tipo;
    float realPart;
    float imagPart;
    float mod;
    float arg;
    
    Numeros(float n1,float n2,String tipo){
        if(tipo == "polar"){
            mod = n1;
            arg = n2;
            this.tipo = tipo;
        }
        else if(tipo == "binomica"){
            realPart = n1;
            imagPart = n2;
            this.tipo = tipo;
        }
    }
    
    public float getRealPart(){
        return realPart;
    }
    
    public float getImPart(){
        return imagPart;
    }
    
    public String getNumero(){
        if(this.tipo == "binomica"){
            return (String.valueOf(realPart)+"+"+String.valueOf(imagPart)+"i");
        }
        else if(this.tipo == "polar"){
            return(String.valueOf(mod)+"e(i"+String.valueOf(arg)+")");
        }
        return "";
    }
}


