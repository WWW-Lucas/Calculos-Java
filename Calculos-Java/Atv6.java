import java.util.Scanner;

    public class Atv6{

        public static void main(String[] args) {
        //Calculo da área de um Triângulo.
        
        System.out.println("INSIRA A BASE:");

        Scanner in = new Scanner (System.in);
        
        double base = in.nextInt();

        System.out.println("INSIRA A ALTURA:");

        double alt = in.nextInt();

        System.out.println("AREA DO TRIANGULO: " + base*alt/2);

        }

    }