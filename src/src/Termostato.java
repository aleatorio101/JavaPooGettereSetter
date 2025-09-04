public class Termostato {
    private double temperaturaAtual;
    private double temperaturaDesejada;

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public double getTemperaturaDesejada() {
        return temperaturaDesejada;
    }

    public void setTemperaturaDesejada(double temperaturaDesejada) {
        if (temperaturaDesejada >= 15 && temperaturaDesejada <= 30) {
            this.temperaturaDesejada = temperaturaDesejada;
        } else {
            System.out.println("Temperatura desejada deve estar entre 15°C e 30°C.");
        }
    }
}
