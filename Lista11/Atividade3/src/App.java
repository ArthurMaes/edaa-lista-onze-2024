import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Map<String, String> pesquisaCpf = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o CPF: ");
            String cpf = scanner.nextLine();
            System.out.println("Digite o telefone: ");
            String phone = scanner.nextLine();
            pesquisaCpf.put(cpf, phone);
        }

        System.out.println("\nDados armazenados:");
        for (Map.Entry<String, String> entry : pesquisaCpf.entrySet()) {
            System.out.println("CPF: " + entry.getKey() + ", Telefone: " + entry.getValue());
        }

        System.out.println("\nDigite o CPF para pesquisar o telefone: ");
        String searchCpf = scanner.nextLine();

        if (pesquisaCpf.containsKey(searchCpf)) {
            System.out.println("O telefone associado ao CPF " + searchCpf + " é: " + pesquisaCpf.get(searchCpf));
        } else {
            System.out.println("CPF não encontrado.");
        }

        scanner.close();
    }
}
