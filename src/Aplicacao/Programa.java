package Aplicacao;

import Entidade.Aluno;
import Entidade.Funcionario;
import Entidade.Produto;
import Entidade.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        //Programa Aluno
        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do Aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Digite as 3 notas do Semestre: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("Nota final : %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60) {
            System.out.println("Reprovado");
            System.out.printf("Faltaram %.2f pontos%n", aluno.pontosFaltantes());
        } else {

            System.out.println("Aprovado");
        }
        */

        //Programa Retangulo
        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println(" Digite  a largura e a altura do retangulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.printf( " AREA DO RETANGULO = %.2f%n" , retangulo.area());
        System.out.printf( " PERIMETRO = %.2f%n" , retangulo.perimetro());
        System.out.printf( " DIAGONAL = %.2f%n" , retangulo.diagonal());
         */

        //Programa Triangulo
        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com os valores do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com os valores do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();


        double areaY = y.area();

        System.out.printf(" Triangulo X area: %.4f%n" , areaX);
        System.out.printf(" Triangulo Y area: %.4f%n" , areaY);

        if (areaX > areaY) {
            System.out.println( " Maior area: X ");
        }
        else {
            System.out.println(" Maior area: Y ");
        }
        */


        //Programa Funcionario
        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print( "Digite o nome do funcionario: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Digite o Salario Bruto do funcionário:");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Digite o valor dos Descontos: ");
        funcionario.descontos = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + funcionario);
        System.out.println();
        System.out.print( "Qual porcentagem de aumento para esse funcionario? ");
        double porcentagem = sc.nextDouble();
        funcionario.incremetarSalario(porcentagem);

        System.out.println();
        System.out.println("Salario atualizado com aumento doª funcionario:  " + funcionario);
         */

        //Programa Produto Em Estoque - Construtores e Encapsulamento
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o produto");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preco:");
        double preco = sc.nextDouble();
        Produto produto= new Produto(nome, preco);

        produto.setNome("Computador");
        System.out.println("Nome atualizado: " + produto.getNome());
        produto.setPreco(1200.00);
        System.out.println("Preco atualizado: " + produto.getPreco());


        System.out.println();
        System.out.println("Dados dos Produtos : " +produto);

        System.out.println();
        System.out.println("Entre com o numero de produtos para ser adicionado no estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados de estoque : " +produto);

        System.out.println();
        System.out.println("Entre com o numero de produtos para serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados de estoque : " +produto);


        sc.close();
    }

}
