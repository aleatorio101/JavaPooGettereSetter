public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        setSenha(senha);
    }

    public void setSenha(String senha) {
        if (senha.length() >= 8) {
            this.senha = senha;
        } else {
            System.out.println("A senha deve ter pelo menos 8 caracteres.");
        }
    }

    public String getNome() {
        return nome;
    }
}
