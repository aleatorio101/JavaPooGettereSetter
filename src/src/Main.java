public class Main {
    public static void main(String[] args) {
        System.out.println("=== Exercício 1 e 2: Pessoa ===");
        Pessoa p1 = new Pessoa();
        p1.setNome("Lucas");
        p1.setIdade(25);
        p1.setIdade(-5);
        System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.getIdade());

        System.out.println("\n=== Exercício 3: ContaBancaria ===");
        ContaBancaria conta = new ContaBancaria("Maria", "12345");
        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(1000);
        System.out.println("Saldo final: " + conta.getSaldo());

        System.out.println("\n=== Exercício 4: Funcionario ===");
        Funcionario f1 = new Funcionario("João", "Analista", 3000);
        f1.setSalario(-1000);
        System.out.println("Salário atual: " + f1.getSalario());

        System.out.println("\n=== Exercício 5: Aluno ===");
        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setNota1(9);
        aluno.setNota2(11);
        System.out.println("Aluno: " + aluno.getNome() + ", Nota1: " + aluno.getNota1() + ", Nota2: " + aluno.getNota2());

        System.out.println("\n=== Exercício 6: Produto ===");
        Produto prod = new Produto("Notebook", 3500);
        prod.setPreco(-500);
        System.out.println("Produto: " + prod.getPreco());

        System.out.println("\n=== Exercício 7: Livro ===");
        Livro livro = new Livro("O Senhor dos Anéis", "Tolkien");
        System.out.println("Disponível? " + livro.getDisponivel());
        livro.emprestar();
        System.out.println("Disponível após empréstimo? " + livro.getDisponivel());
        livro.devolver();
        System.out.println("Disponível após devolução? " + livro.getDisponivel());

        System.out.println("\n=== Exercício 8: Termostato ===");
        Termostato t1 = new Termostato();
        t1.setTemperaturaAtual(22);
        t1.setTemperaturaDesejada(10);
        t1.setTemperaturaDesejada(25);
        System.out.println("Atual: " + t1.getTemperaturaAtual() + "°C, Desejada: " + t1.getTemperaturaDesejada() + "°C");

        System.out.println("\n=== Exercício 9: Usuario ===");
        Usuario u1 = new Usuario("Carlos", "1234");
        Usuario u2 = new Usuario("Mariana", "seguranca123");
        System.out.println("Usuário válido: " + u2.getNome());

        System.out.println("\n=== Exercício 10: Carro ===");
        Carro c1 = new Carro("Toyota", "Corolla");
        c1.acelerar(100);
        c1.acelerar(100);
        System.out.println("Velocidade: " + c1.getVelocidadeAtual() + " km/h");
        c1.frear(50);
        c1.frear(200);
        System.out.println("Velocidade final: " + c1.getVelocidadeAtual() + " km/h");
    }
}
