import Tools.Cambio;
import Tools.Request;

public class Main {

    public static void main(String[] args) {

        Request request = new Request();

        System.out.println("DATOS OBTENIDOS DE LA REQUEST A LA API JSON: "+request.Valor("USD"));


    }
}
