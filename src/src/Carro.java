public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int incremento) {
        if (velocidadeAtual + incremento <= 180) {
            velocidadeAtual += incremento;
        } else {
            velocidadeAtual = 180;
            System.out.println("Velocidade máxima atingida!");
        }
    }

    public void frear(int decremento) {
        if (velocidadeAtual - decremento >= 0) {
            velocidadeAtual -= decremento;
        } else {
            velocidadeAtual = 0;
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
