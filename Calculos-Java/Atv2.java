import java.util.Scanner;

    public class Atv2{

        public static void main(String[] args) {
        //Calculo da área de um quadrado.
        
        System.out.println("INSIRA A MEDIDA DO LADO:");

        Scanner in = new Scanner (System.in);
        
        double lado = in.nextInt();

        System.out.println("AREA DO QUADRADO: " + lado*lado);
        }
    }