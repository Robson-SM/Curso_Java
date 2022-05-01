import java.util.Scanner;


public class SegundoPrograma {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float nota4;

        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = scan.nextFloat();

        System.out.println("Digite a quarta nota: ");
        nota4 = scan.nextFloat();

        float media = (nota1+nota2+nota3+nota4)/4;

        if(media>=5){System.out.println("Aluno Aprovado!");

        }else{System.out.println("Aluno Reprovado!");

        }
    }
