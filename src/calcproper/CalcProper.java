/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcproper;
import calcProper.Calculations;
import java.util.Scanner;

/**
 *
 * @autors: 51edprpencis
 */
public class CalcProper{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        int atkartot;
        do{//izpildis zemak esoso kodu, kamer sk atkartot bus 1
            Scanner kbinput = new Scanner(System.in);
            System.out.println("Ievadiet pirmo skaitli:");
            double a = kbinput.nextDouble();        

            System.out.println("Ievadiet otro skaitli:");
            double b = kbinput.nextDouble();

            System.out.println("Jūsu ievadītie skaitļi:");
            System.out.println(a+" un "+b);
            //izvelne
            System.out.println("Izvēlieties darbību: 1=Saskaitīt, 2=Atņemt, 3=Reizināt, 4=Dalīt");
            int choice = kbinput.nextInt();
            
            //Izveidots klases objekts, kuram piešķir abus skaitļus
            Calculations operacija;
            operacija = new Calculations(a,b);
            // operacija.setNum1(a);//Tikai, ja vajag uzstādīt skaitli atsevišķi
            // operacija.setNum2(b);//^

            switch(choice){
                case 1:
                    System.out.println("Saskaitišana:");
                    operacija.calcSum();
                    System.out.println(operacija.getSum());
                    break;           
                case 2:
                    System.out.println("Atnemšana:");
                    operacija.calcDiff();
                    System.out.println(operacija.getDiff());
                    break;
                case 3:
                    System.out.println("Reizināšana:");
                    operacija.calcMultiply();
                    System.out.println(operacija.getMultiply());
                    break;
                case 4:
                    System.out.println("Dalīšana:");
                    if(b==0) System.out.println("Ar 0 dalīt nevar!");
                    else{
                        operacija.calcDiv();
                        System.out.println(operacija.getDiv()); 
                    }
                    break;
                default: 
                    System.out.println("Nederīga izvēle!");
                    break;
            } 

            System.out.println("vai velaties atkartot? 1 = Jā/ cits skaitlis = Nē");
            atkartot=kbinput.nextInt(); //sk atkartot ievade      
        }while (atkartot==1);//do cikla nosacijums
       
    }
}