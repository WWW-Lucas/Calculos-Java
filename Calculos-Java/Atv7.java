import java.util.Scanner;

    public class Atv7{

        public static void main(String[] args) {
        //Calculo da área de um retangulo.
        
        System.out.println("INSIRA O RAIO:");

        Scanner in = new Scanner (System.in);
        
        double raio = in.nextInt();

        double pi = 3.1415926535897;

        System.out.println("AREA DO RETANGULO: " + pi*(raio*raio));

        }
    }