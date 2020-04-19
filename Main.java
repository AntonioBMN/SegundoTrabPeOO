package TrabalhoPoo2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static File disciplina =  new File("c:\\Disciplinas");

    public static void criarDisciplina() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a disciplina");
        String disc = scan.next();
        FileWriter fW;
        try{
            File prova = new File(disciplina, disc+".txt");
            int b = 1;
            System.out.println("Agora adicione os alunos");
            while(b==1){
                fW = new FileWriter(prova,true);
                BufferedWriter e = new BufferedWriter(fW);
                System.out.println("Digite os 10 itens do aluno 1");
                e.write(scan.next());
                System.out.println("Digite agora o nome completo do Aluno em questão");
                Scanner imput = new Scanner(System.in);
                e.write("\t"+imput.nextLine());
                e.newLine();
                e.close();
                fW.close();
                System.out.println("digite 1 para continuar adicionando alunos ou qualquer outro numero para parar");
                b=scan.nextInt();
            }
        } catch(IOException e){
            System.out.println("Erro na criação do arquivo de texto.");
        }
    }



    public static void  main(String []args) throws IOException {
        Scanner s = new Scanner(System.in);
        disciplina.mkdir();
        int a = 0;
        System.out.println("Digite 1 para criar disciplina e adicionar as respostas dos alunos.\n" +
                "Ou 2 para fechar a aplicação");
        a = s.nextInt();
        while(a!=2){
            if (a==1) {
                criarDisciplina();
            }
            System.out.println("Digite 1 para criar disciplina e adicionar as respostas dos alunos.\n" +
                    "Digite 2 para fechar a aplicação");
            a = s.nextInt();
        }
    }
}
