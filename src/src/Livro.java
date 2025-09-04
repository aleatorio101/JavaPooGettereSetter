public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("Livro já está emprestado!");
        }
    }

    public void devolver() {
        disponivel = true;
    }

    public boolean getDisponivel() {
        return disponivel;
    }
}
