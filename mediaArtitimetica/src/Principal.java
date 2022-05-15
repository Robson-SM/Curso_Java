import java.util.Scanner;


public class Principal {

    public static int mediaNotas(int nota1, int nota2, int nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args){

        int nota1;
        int nota2;
        int nota3;


        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextInt();

        System.out.println("Digite a terceira nota: ");
        nota3 = scan.nextInt();

        int media = mediaNotas(nota1, nota2, nota3);
        System.out.println(media);


    }


}