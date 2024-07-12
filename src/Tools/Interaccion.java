package Tools;

import com.google.gson.Gson;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Interaccion {

    //varibale moneda de manera global para poder utilizarla en diferentes metodos de esta clase
    private String json; //variable global que contendra el json recibido
    private double cambio; //variable global para guardar el tipo de cambio recibido.

    private String moneda2; //variable con monedas seleccionadas
    private String moneda1;

    public void  Menu() {
        Scanner scan = new Scanner(System.in);
        boolean salida = true;
        Request request = new Request();
        System.out.println("|| BIENVENIDO ||");

        while (salida) {
            System.out.println("|| SELECCIONES EL INDICE DE SU MONEDA : ");
            System.out.println("|| 1. PESO ARGENTINO.");
            System.out.println("|| 2. BOLIVIANO BOLIVIANO.");
            System.out.println("|| 3. REAL BRASILEÑO.");
            System.out.println("|| 4. PESO CHILENO.");
            System.out.println("|| 5. PESO COLOMBIANO.");
            System.out.println("|| 6. DOLAR ESTADOUNIDENSE.");

            try {

                int seleccion = scan.nextInt(); //seleccion del usuario del menu presentado


                switch (seleccion) {
                    case 1:
                        moneda1 = "ARS";
                        json = request.Valor(moneda1); //obtenemos el json de la moneda
                        break;
                    case 2:
                        moneda1 = "BOB";
                        json = request.Valor(moneda1);
                        break;
                    case 3:
                        moneda1 = "BRL";
                        json = request.Valor(moneda1);
                        break;
                    case 4:
                        moneda1 = "CLP";
                        json = request.Valor(moneda1);
                        break;
                    case 5:
                        moneda1 = "COP";
                        json = request.Valor(moneda1);
                        break;
                    case 6:
                        moneda1 = "USD";
                        json = request.Valor(moneda1);
                        break;
                    default:
                        System.out.println("NO INGRESO UN INDICE VALIDO!");
                }

                Menu2();

                System.out.println("¿DESEA REALIZAR OTRA CONVERSION?");
                System.out.println("|| 1. SI.");
                System.out.println("|| 2. NO.");

                int repetir = scan.nextInt();

                if (repetir == 1){
                    continue;
                }else if(repetir == 2){
                    salida = false;
                }else{
                    System.out.println("No ingreso una opcion valida.");
                }

            } catch (Exception e) {
                System.out.println(" NO INGRESO UN INDICE VALIDO!");
            }

        }
    }

        public void  Menu2(){
            Scanner scan = new Scanner(System.in);
            boolean salida = true;
            Gson gson = new Gson();
            Cambio respuesta = gson.fromJson(json, Tools.Cambio.class); //convertimos el json a tipo clase Cambio para capturar datos

            while (salida){
                System.out.println("|| SELECCIONES EL INDICE DEL TIPO DE MONEDA QUE DESEA CONVERTIR: ");
                System.out.println("|| 1. PESO ARGENTINO.");
                System.out.println("|| 2. BOLIVIANO BOLIVIANO.");
                System.out.println("|| 3. REAL BRASILEÑO.");
                System.out.println("|| 4. PESO CHILENO.");
                System.out.println("|| 5. PESO COLOMBIANO.");
                System.out.println("|| 6. DOLAR ESTADOUNIDENSE.");

                try {

                    int seleccion = scan.nextInt(); //seleccion del usuario del menu presentado


                    switch(seleccion){
                        case 1:
                            moneda2 = "ARS";
                            cambio = respuesta.conversion_rates().get(moneda2); //obtenemos el valor de la moneda
                            salida = false;
                            break;
                        case 2:
                            moneda2 = "BOB";
                            cambio = respuesta.conversion_rates().get(moneda2);
                            salida = false;
                            break;
                        case 3:
                            moneda2 = "BRL";
                            cambio = respuesta.conversion_rates().get(moneda2);
                            salida = false;
                            break;
                        case 4:
                            moneda2 = "CLP";
                            cambio = respuesta.conversion_rates().get(moneda2);
                            salida = false;
                            break;
                        case 5:
                            moneda2 = "COP";
                            cambio = respuesta.conversion_rates().get(moneda2);
                            salida = false;
                            break;
                        case 6:
                            moneda2 = "USD";
                            cambio = respuesta.conversion_rates().get(moneda2);
                            salida = false;
                            break;
                        default:
                            System.out.println("NO INGRESO UN INDICE VALIDO!");
                    }

                    Calculo calculo = new Calculo();
                    calculo.Conversion(cambio,moneda1,moneda2);

                }catch (Exception e){
                    System.out.println(" NO INGRESO UN INDICE VALIDO!");
                }

            }
    }
}
