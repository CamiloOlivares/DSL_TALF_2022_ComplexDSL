/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antlr.example;

import java.util.ArrayList;

/**
 *
 * @author cml_9
 */
public class newComplexListener extends complexBaseListener{
    
    ArrayList<Numeros> variables = new ArrayList<>();
    ArrayList<String> variableNames = new ArrayList<>();
    
    public ArrayList<Numeros> grafNums=new ArrayList<>();
    public ArrayList<String> mostrarVar = new ArrayList<>();
    Operations op = new Operations();
    
    @Override
    public void exitBinomica(complexParser.BinomicaContext ctx) { 
        int real = Integer.parseInt(ctx.getChild(0).getText());
        int imag = Integer.parseInt(ctx.getChild(2).getChild(0).getText());
        String tipo = "binomica";
        Numeros numero = new Numeros(real,imag,tipo);
        variables.add(numero);
        //System.out.println(variables.get(0).getNumero());
    }
    
    @Override
    public void exitPolar(complexParser.PolarContext ctx){
        int mod = Integer.parseInt(ctx.getChild(0).getText());
        int arg = Integer.parseInt(ctx.getChild(4).getText());
        String tipo = "polar";
        Numeros numero = new Numeros(mod,arg,tipo);
        variables.add(numero);
    }
    
    @Override
    public void enterNumdef(complexParser.NumdefContext ctx){
        String vName = ctx.getChild(1).getText();
        variableNames.add(vName);
    }
    
    @Override
    public void exitSuma(complexParser.SumaContext ctx){
        int n1 = variableNames.indexOf(ctx.getChild(0).getText());
        int n2 = variableNames.indexOf(ctx.getChild(2).getText());
        String res = "";
        if(n1<0 || n2<0){
            res=res+"No se encontro la variable"+ctx.getChild(0).getText()+"\n";
            System.out.println(variableNames.get(variableNames.size()-1));
            variableNames.remove( variableNames.size()-1);
            return;
        }
        Numeros num1 =variables.get(n1);
        Numeros num2 =variables.get(n2);
        if(num1.tipo == num2.tipo){
            if(num1.tipo=="polar"){
                res="No se pueden sumar numeros polares";
                System.out.println(variableNames.get(variableNames.size()-1));
                variableNames.remove( variableNames.size()-1);
                
            }
            else{
                Numeros resultado = op.suma(num1, num2);
                res=resultado.getNumero();
                variables.add(resultado);
            }
        } 
        else{
            res = "Los numeros estan escritos en formatos distintos";
            System.out.println(variableNames.get(variableNames.size()-1));
            variableNames.remove( variableNames.size()-1);
            
        }
        System.out.println(res);
    }
    
    @Override
    public void exitResta(complexParser.RestaContext ctx){
        int n1 = variableNames.indexOf(ctx.getChild(0).getText());
        int n2 = variableNames.indexOf(ctx.getChild(2).getText());
        String res = "";
        if(n1<0 || n2<0){
            res=res+"No se encontro la variable"+ctx.getChild(0).getText()+"\n";
            variableNames.remove( variableNames.size()-1);
            return;
        }
        Numeros num1 =variables.get(n1);
        Numeros num2 =variables.get(n2);
        if(num1.tipo == num2.tipo){
            if(num1.tipo=="polar"){
                res="No se pueden restar numeros polares";
                variableNames.remove( variableNames.size()-1);
            }
            else{
                Numeros resultado = op.resta(num1, num2);
                res=resultado.getNumero();
                variables.add(resultado);
            }
        } 
        else{
            res = "Los numeros estan escritos en formatos distintos";
            variableNames.remove( variableNames.size()-1);
        }
        //System.out.println(res);
    }
    
    @Override public void exitMul(complexParser.MulContext ctx) {
        int n1 = variableNames.indexOf(ctx.getChild(0).getText());
        int n2 = variableNames.indexOf(ctx.getChild(2).getText());
        String res = "";
        if(n1<0 || n2<0){
            res=res+"No se encontro la variable"+ctx.getChild(0).getText()+"\n";
            variableNames.remove( variableNames.size()-1);
            return;
        }
        Numeros num1 =variables.get(n1);
        Numeros num2 =variables.get(n2);
        if(num1.tipo == num2.tipo){
            Numeros resultado = op.mul(num1,num2);
            if(res!=null){
                res = resultado.getNumero(); 
                variables.add(resultado);
            }
            else{
                variableNames.remove( variableNames.size()-1);
            }
            
        } 
        else{
            res = "Los numeros estan escritos en formatos distintos";
            variableNames.remove( variableNames.size()-1);
        }
        //System.out.println(res);  
    }
    
    @Override public void exitDiv(complexParser.DivContext ctx) {
        int n1 = variableNames.indexOf(ctx.getChild(0).getText());
        int n2 = variableNames.indexOf(ctx.getChild(2).getText());
        String res = "";
        if(n1<0 || n2<0){
            res=res+"No se encontro la variable"+ctx.getChild(0).getText()+"\n";
            variableNames.remove( variableNames.size()-1);
            return;
        }
        Numeros num1 =variables.get(n1);
        Numeros num2 =variables.get(n2);
        if(num1.tipo == num2.tipo){
            Numeros resultado = op.div(num1,num2);
            if(res!=null){
                res = resultado.getNumero(); 
                variables.add(resultado);
            }
            else{
                variableNames.remove( variableNames.size()-1);
            }
            
        } 
        else{
            res = "Los numeros estan escritos en formatos distintos";
            variableNames.remove( variableNames.size()-1);
        }
        //System.out.println(res);
    }
    
    @Override
    public void enterOperdef(complexParser.OperdefContext ctx) { 
        String vName = ctx.getChild(1).getText();
        variableNames.add(vName);
    }
    
    @Override
    public void exitPrintvar(complexParser.PrintvarContext ctx) {
        int lugar = variableNames.indexOf(ctx.getChild(1).getText());
        if(lugar>=0){
            String vari = variables.get(lugar).getNumero();
            mostrarVar.add(vari);
            System.out.println(vari);
            return;
        }
        //System.out.println();
        mostrarVar.add("No se encontro la variable"+": "+ctx.getChild(1).getText());
    }
    
    public void exitGrafvar(complexParser.GrafvarContext ctx) {
        int lugar = variableNames.indexOf(ctx.getChild(1).getText());
        if(lugar>=0){
            Numeros vari = variables.get(lugar);
            this.grafNums.add(vari);
            String agregar ="El punto "+ ctx.getChild(1).getText()+" esta listo para exportarse";
            mostrarVar.add(agregar);
        }
        else{
            String agregar ="El punto "+ ctx.getChild(1).getText()+" no puede exportarse";
            mostrarVar.add(agregar);
        }
    }
}
