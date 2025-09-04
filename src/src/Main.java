public class Main {
    public static void main(String[] args) {
        System.out.println("=== Exercício 1 e 2: Pessoa ===");
        Pessoa p1 = new Pessoa();
        p1.setNome("Lucas");
        p1.setIdade(25);
        p1.setIdade(-5);
        System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.getIdade());

    }
}
