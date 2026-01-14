import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int rnd = new Random().nextInt(100); //gera um numero aleatorio
        int chute = 0;
        int tentativas = 0;

        while (chute != rnd){
            System.out.println("Digite um numero de 1 a 100");
            chute = leitura.nextInt();
            tentativas++;

            if (chute == rnd) {
                System.out.println("Parabéns, você acertou o numero em "+tentativas+" tentativas. O número era: "+rnd);
                break; //intenrrompe o loop
            }
            else if (chute > rnd){
                System.out.println("O número aleatório é menor");
            }
            else {
                System.out.println("O número aleatório é maior");
            }
        }

        if (tentativas == 5 && chute != rnd){
            System.out.println("Você não conseguiu acertar o número em 5 tentativas");
        }
    }
}