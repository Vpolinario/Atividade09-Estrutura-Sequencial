package Atts_Montanha;

import java.util.Scanner;

public class att9 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	
        double Farenheit;
        double GrausCelsius;



    System.out.println("digite temperatura em graus Farenheit:");
 
    Farenheit = scanner.nextDouble();

            GrausCelsius  = (Farenheit-32) * 5/9 ;

            System.out.println("GrausCelsius:"+ GrausCelsius);

}
}