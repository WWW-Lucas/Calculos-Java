import java.util.Scanner;

    public class Atv1{

        public static void main(String[] args) {
        //Calculo da área de um retangulo.
        
        System.out.println("INSIRA A BASE:");

        Scanner in = new Scanner (System.in);
        
        double base = in.nextInt();

        System.out.println("INSIRA A ALTURA:");

        double alt = in.nextInt();

        System.out.println("AREA DO RETANGULO: " + base*alt);

        }

    }