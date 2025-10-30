import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o CEP");
        String cep = scan.nextLine();
        try{
            ConsultarCEP.Consultar(cep);
        } catch (IOException e) {
            System.out.println("Erro ao consultar CEP" + e.getMessage());
        }

    }
}
