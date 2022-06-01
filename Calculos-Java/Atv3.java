import java.util.Scanner;

    public class Atv3{

        public static void main(String[] args) {
        //Calculo da área de um Losango.
        
        System.out.println("INSIRA A MEDIDA DA DIAGONAL MAIOR:");

        Scanner in = new Scanner (System.in);
        
        double d1 = in.nextInt();

        System.out.println("INSIRA A MEDIDA DA DIAGONAL MENOR:");

        double d2 = in.nextInt();
  
        System.out.println("AREA DO LOSANGO: " + d1*d2/2);

        }
    }