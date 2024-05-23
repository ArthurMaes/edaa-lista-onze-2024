
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> listaDeDados = new HashMap<String, String>();

        for(int i = 0; i <5; i++) {
            System.out.println("\nDigite o CPF:");
            String CPF = scanner.next();
            System.out.println("\nDigite o número de telefone:");
            String numero = scanner.next();
            listaDeDados.put(CPF, numero);
        }
        System.out.println("\nDados:");
        listaDeDados.forEach((CPF, numero) -> {
        System.out.println("CPF: " + CPF + ", Telefone: " + numero);
    });
    
    scanner.close();

    }

}