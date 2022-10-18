import java.util.Scanner;
public class TrabalhoUninter {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        String nome, ano;
        float media, classe, p1, p2;
        int dificuldade, num;

        nome = "Andressa Carolina Rodrigues";
        ano = "E.M";
        num = 3;
        classe = 30;

        System.out.println("Qual o nome do aluno ou da aluna?: " + nome);
        System.out.println("Qual o ano em que este aluno ou aluna esta cursando?: " + num + " " + ano);
        System.out.print("Quantos alunos possuem nesta classe de aula?: ");
        classe = tc.nextFloat();
        System.out.println("Na disciplina 'Matematica' na materia 'Raciocinio Logico'");

        System.out.print("A nota da primeira prova: " );
        p1 = tc.nextFloat();
        System.out.print("A nota da segunda prova: " );
        p2 = tc.nextFloat();
        System.out.printf("A media arredondada desse aluno ou aluna: %.2f \n", (media = (p1 + p2) / 2));

        if (media <= 5){
            System.out.println("Possui dificuldade nesta materia.");
        }else{
            System.out.println("Nao possui dificuldade nessa materia.");
        }

        System.out.print("A quantidade de alunos que estao com dificuldade nessa materia: " );
        dificuldade = tc.nextInt();

        if (dificuldade < 8){
            System.out.println("Nao temos problemas com o ensinamento do professor.");
        }else {
            System.out.println("Podemos ter problemas com o ensinamento do professor.");
        }
    }
}
