/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antlr.example;

/**
 *
 * @author cml_9
 */
public class Operations {
    public Numeros mul(Numeros num1,Numeros num2){
        if(num1.tipo == num2.tipo){
            if(num1.tipo=="polar"){
                float modMul = num1.mod*num2.mod;
                float argMul = num1.arg+num2.arg;
                return new Numeros(modMul,argMul,"polar");
            }
            else{
                float realMul=num1.realPart*num2.realPart - num1.imagPart*num2.imagPart;
                float imagMul=num1.realPart*num2.imagPart + num1.imagPart*num2.realPart;
                return new Numeros(realMul,imagMul,"binomica");
            }
        } 
        else{
            return null;
        }
    }
    
    public Numeros div(Numeros num1,Numeros num2){
        if(num1.tipo == num2.tipo){
            if(num1.tipo=="polar"){
                float modMul = num1.mod/num2.mod;
                float argMul = num1.arg-num2.arg;
                return new Numeros(modMul,argMul,"polar");
            }
            else{
                float realDiv= (float) ((num1.realPart*num2.realPart + num1.imagPart*num2.imagPart)/((Math.pow(num2.realPart,2)+Math.pow(num2.imagPart,2))));
                float imagDiv= (float)((num1.realPart*num2.imagPart - num1.imagPart*num2.realPart)/((Math.pow(num2.realPart,2)+Math.pow(num2.imagPart,2))));
                return new Numeros(realDiv,imagDiv,"binomica");
            }
        } 
        else{
            return null;
        }
    }
    
    public Numeros resta(Numeros num1, Numeros num2) {
        if (num1.tipo == "polar") {
            return null;
        } 
        else {
            float realSum = num1.realPart - num2.realPart;
            float imagSum = num1.imagPart - num2.imagPart;
            return new Numeros(realSum, imagSum, "binomica");
        }
    }

    public Numeros suma(Numeros num1,Numeros num2){
        if(num1.tipo=="polar"){
            return null;
            }
        else{
            float realSum=num1.realPart + num2.realPart;
            float imagSum=num1.imagPart + num2.imagPart;
            return new Numeros(realSum,imagSum,"binomica");
        }
    }
}
