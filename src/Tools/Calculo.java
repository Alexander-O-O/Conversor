package Tools;

import java.util.Scanner;

public class Calculo {


    void Conversion (double valor, String moneda1, String moneda2){
        Scanner scaner = new Scanner(System.in);
        try{
            System.out.println(" INGRESE LA CANTIDAD QUE DESEA CONVERTIR: ");
            double cantidad = scaner.nextInt();
            double  conversion = cantidad*valor;

            System.out.println("LA CONVERSION DE MONEDA ES LA SIGUIENTE: "+moneda1+": "+cantidad+" A "+moneda2+" :"+conversion);
        }
        catch (Exception e){
            System.out.println("NO INGRESO UN VALOR VALIDO!");
        }
    }

}
