package Tools;

import com.google.gson.Gson;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Interaccion {

    //varibale moneda de manera global para poder utilizarla en diferentes metodos de esta clase
    private String json; //variable global que contendra el json recibido
    private double cambio; //variable global para guardar el tipo de cambio recibido.

    public void  Menu() {
        Scanner scan = new Scanner(System.in);
        boolean salida = true;
        Request request = new Request();

        String Moneda; //string que contendra el tipo de moneda seleccionada

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
                        Moneda = "ARS";
                        json = request.Valor(Moneda); //obtenemos el json de la moneda
                        salida = false; //cerramos el ciclo de presentacion del menu
                        break;
                    case 2:
                        Moneda = "BOB";
                        json = request.Valor(Moneda);
                        salida = false;
                        break;
                    case 3:
                        Moneda = "BRL";
                        json = request.Valor(Moneda);
                        salida = false;
                        break;
                    case 4:
                        Moneda = "CLP";
                        json = request.Valor(Moneda);
                        salida = false;
                        break;
                    case 5:
                        Moneda = "COP";
                        json = request.Valor(Moneda);
                        salida = false;
                        break;
                    case 6:
                        Moneda = "USD";
                        json = request.Valor(Moneda);
                        salida = false;
                        break;
                    default:
                        System.out.println("NO INGRESO UN INDICE VALIDO!");
                }

            } catch (Exception e) {
                System.out.println(" NO INGRESO UN INDICE VALIDO!");
            }

        }
    }

        public void  Menu2(){
            Scanner scan = new Scanner(System.in);
            boolean salida = true;
            String Moneda; //string que contendra el tipo de moneda seleccionada
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
                            Moneda = "ARS";
                            cambio = respuesta.conversion_rates().get(Moneda); //obtenemos el valor de la moneda
                            salida = false;
                            break;
                        case 2:
                            Moneda = "BOB";
                            cambio = respuesta.conversion_rates().get(Moneda);
                            salida = false;
                            break;
                        case 3:
                            Moneda = "BRL";
                            cambio = respuesta.conversion_rates().get(Moneda);
                            salida = false;
                            break;
                        case 4:
                            Moneda = "CLP";
                            cambio = respuesta.conversion_rates().get(Moneda);
                            salida = false;
                            break;
                        case 5:
                            Moneda = "COP";
                            cambio = respuesta.conversion_rates().get(Moneda);
                            salida = false;
                            break;
                        case 6:
                            Moneda = "USD";
                            cambio = respuesta.conversion_rates().get(Moneda);
                            salida = false;
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
