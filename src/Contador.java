import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        // Instânciadno a classe scanner para receber dados do teclado seguindo o padrão norte americano.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Variável de controle do loop Do while.
        boolean controleLoop = true;

        do {

            // Esse bloco é executado pelo menos uma vez.
            try {

                System.out.println("Digite o primeiro número;");
                int parametroUm = scanner.nextInt();
                System.out.println("Digite o segundo número;");
                int parametroDois = scanner.nextInt();

                controleInteracao(parametroUm, parametroDois);
                // Casso o método controleInteração lance um erro a variável contrele loop permane com seu valor inicial, 
                // desse modo, o bloco try é execudato novamente.
                // Caso não ocorra o erro a variável controlleloop será false, encerrando assim o loop.
                controleLoop = false;

            } catch (ParametrosInvalidosException erro) {
                erro.message();

            }

        } while (controleLoop);

        scanner.close();
    }

    static void controleInteracao(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o parâmetro um e maior que o dois, se sim, lança o erro que inpede a variável de controle de se tonrnar false
        // e assim inicia o código para entrada de parâmetros válidos.
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        // For para imprimir a diferença entre os parâmetros.
        for (int i = 1; i <= (parametroDois - parametroUm); i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
