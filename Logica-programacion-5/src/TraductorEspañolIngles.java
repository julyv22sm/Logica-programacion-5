
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class TraductorEspañolIngles {

    public static void main(String[] args) {

        Map<String, String> diccionario = new HashMap<>();

        // Palabras del diccionario
        diccionario.put("Aplicación", "Application");
        diccionario.put("Dispositivo", "Device");
        diccionario.put("Conectar", "Connect");
        diccionario.put("Dominio", "Domain");
        diccionario.put("Desarrollar", "Develop");
        diccionario.put("Descargar", "Download");
        diccionario.put("Entorno", "Environment ");
        diccionario.put("Equipo", "Equipment");
        diccionario.put("Archivo", "File");
        diccionario.put("Instalar", "Install");
        diccionario.put("ramificar", "Branch");
        diccionario.put("Matriz", "Matrix");
        diccionario.put("Red", "Network");
        diccionario.put("Especificaciones", "Specifications");
        diccionario.put("Transferir", "Transfer");
        diccionario.put("Arreglo", "Array");
        diccionario.put("Contraseña", "Password");
        diccionario.put("Interfaz", "Interface");
        diccionario.put("Autenticación", "Authentication");
        diccionario.put("Datos", "Data");
        diccionario.put("Clave", "Key");
        diccionario.put("Blucle", "Loop");
        diccionario.put("Maquetación", "Markup");
        diccionario.put("Parche", "Patch");
        diccionario.put("Puerto", "Port");
        diccionario.put("Servidor", "Proxy");
        diccionario.put("Aleatorio", "Random");
        diccionario.put("Interruptor", "Switch");
        diccionario.put("Etiqueta", "Tag");



        Random rand = new Random();
        int correctas = 0;
        int incorrectas = 0;

        // Escoger 5 palabras al azar
        for(int i = 0; i < 5; i++) {
            Object[] valores = diccionario.keySet().toArray();
            String palabra = (String)valores[rand.nextInt(valores.length)];

            Scanner scanner = new Scanner(System.in);
            System.out.print("Traduce la palabra " + palabra + ": ");
            String traduccion = scanner.nextLine();

            if(diccionario.get(palabra).equals(traduccion)) {
                correctas++;
            } else {
                incorrectas++;
            }
        }

        // Mostrar resultado
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

    }

}