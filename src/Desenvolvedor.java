public class Desenvolvedor extends Funcionario {

    private int quantidadeProjetos;

    public Desenvolvedor(String nome,double salarioBase,int quantidadeProjetos){
        super(nome, salarioBase);
        this.quantidadeProjetos = quantidadeProjetos;
    }

    public int getQuantidadeProjetos() {
        return this.quantidadeProjetos;
    }

    public void setQuantidadeProjetos(int quantidadeProjetos) {
        this.quantidadeProjetos = quantidadeProjetos;
    }

    @Override
    public void calcularSalario() {
        double calcularSalario = this.salarioBase + (this.quantidadeProjetos * 500);
        System.out.println("O salario total é: " + calcularSalario);

    }

}