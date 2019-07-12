package Entidade;

public class Funcionario {

    public String nome ;
    public double salarioBruto;
    public  double descontos;

    public double salarioLiquido () {
        return salarioBruto - descontos;
    }
    public void incremetarSalario ( double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    public String toString() {

        return nome + " , R$ " + String.format("%.2f", salarioLiquido());

    }
}
