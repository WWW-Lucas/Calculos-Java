import java.util.Scanner;

    public class Atv4{

        public static void main(String[] args) {
        //Calculo da área de um Trapézio.
        
        System.out.println("INSIRA A MEDIDA DA BASE MAIOR:");

        Scanner in = new Scanner (System.in);
        
        double b1 = in.nextInt();

        System.out.println("INSIRA A MEDIDA DA BASE MENOR:");

        double b2 = in.nextInt();

        System.out.println("INSIRA A MEDIDA DA ALTURA:");

        double alt = in.nextInt();
  
        System.out.println("AREA DO LOSANGO: " + (b1 + b2) * alt/2);

        }
    }