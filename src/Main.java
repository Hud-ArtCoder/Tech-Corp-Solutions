public class Main {

    public static void main(String[] args) {

        Funcionario[] funcionarios = {

                new Desenvolvedor("Ana", 5000, 1),
                new Gerente("Carlos", 7000, 200),

        };


        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + ": Cargo-" + f.getClass().getSimpleName());

        }
    }

}
