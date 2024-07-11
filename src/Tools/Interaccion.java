package Tools;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Interaccion {

    public void  Menu(){
        Scanner scan = new Scanner(System.in);
        boolean salida = true;
        while (salida){

            System.out.println("|| BIENVENIDO ||");
            System.out.println("|| SELECCIONES EL INDICE DEL TIPO DE MONEDA QUE DESEA CONVERTIR: ");
            System.out.println("|| 1. PESO ARGENTINO.");
            System.out.println("|| 2. BOLIVIANO BOLIVIANO.");
            System.out.println("|| 3. REAL BRASILEÑO.");
            System.out.println("|| 4. PESO CHILENO.");
            System.out.println("|| 5. PESO COLOMBIANO.");
            System.out.println("|| 6. DOLAR ESTADOUNIDENSE.");

            try {

                int seleccion = scan.nextInt(); //seleccion del usuario del menu presentado
                String Moneda; //string que contendra el tipo de moneda seleccionada

                switch(seleccion){
                    case 1:
                        Moneda = "ARS";
                        break;
                    case 2:
                        Moneda = "BOB";
                        break;
                    case 3:
                        Moneda = "BRL";
                        break;
                    case 4:
                        Moneda = "CLP";
                        break;
                    case 5:
                        Moneda = "COP";
                        break;
                    case 6:
                        Moneda = "USD";
                        break;
                    default:
                        System.out.println("NO INGRESO UN INDICE VALIDO!");
                }

            }catch (Exception e){
                System.out.println(" NO INGRESO UN INDICE VALIDO!");
            }



        }
    }
}
