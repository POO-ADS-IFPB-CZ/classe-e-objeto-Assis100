//resposta referente a questao 4
public class Lampada {
    private String marca;
    private double potencia;
    private int voltagem;
    private String cor;
    private double preco;
    private boolean ligada;

    public Lampada(String marca, double potencia, int voltagem, String cor, double preco) {
        this.marca = marca;
        this.potencia = potencia;
        this.voltagem = voltagem;
        this.cor = cor;
        this.preco = preco;
        this.ligada = false;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public boolean isLigada() {
        return ligada;
    }
}