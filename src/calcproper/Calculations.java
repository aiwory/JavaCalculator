/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcProper;

/**
 *
 * @author Aigars
 */
public class Calculations {
    double num1;
    double num2;
    double sum;
    double diff;
    double div;
    double multiply;
    boolean divGood=true;
    
    //Konstruktors
    public Calculations(double number1, double number2){
        this.num1=number1;
        this.num2=number2;
    }
    
    //Set metode , lai uzstādītu num1
    public void setNum1 (double number1){
        this.num1=number1;
    }
    
    //Set metode , lai uzstādītu num2
    public void setNum2 (double number2){
        this.num2=number2;
    }
    
    //Aprēķina summu
    public void calcSum (){
        this.sum=this.num1+this.num2;
    }
    
    //Aprēķina starpību
    public void calcDiff (){
        this.diff=this.num1-this.num2;
    }
    
    //Aprēķina reizinājumu
    public void calcMultiply (){
        this.multiply=this.num1*this.num2;
    }
    
    //Aprēķina dalījumu, neļauj dalīt, ja otrais skaitlis ir 0, tādā gadījumā rezultātam piešķir 0
    public void calcDiv (){
        if(this.num2==0) this.divGood=false;
        else this.div=this.num1/this.num2;
    }
  
    //Atgriež summu
    public double getSum (){
        return this.sum;
    }
    
    //Atgriež starpību
    public double getDiff (){
        return this.diff;
    }
    
    //Atgriež reizinājumu
    public double getMultiply (){
        return this.multiply;
    }
    
    //Atgriež dalījumu
    public double getDiv (){
        if (this.divGood)
        return this.div;
        else return 0;
    }
    
       
}