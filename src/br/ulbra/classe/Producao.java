package br.ulbra.classe;

/**
 *
 * @author Murilo Fernandes Mello Inicio da programacao: 16/03/2022 - 21:13
 */
public class Producao {

    private String peca;
    private int segundos;
    private int hora;
    private int minuto;
    private int segundo;

    public Producao(int hora) {
        this.peca = "Teclado";
        this.segundos = 100;
        this.hora = hora;
    }

    public void setPeca(String peca) {
        this.peca = peca;

    }

    public String getPeca() {
        return peca;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;

        if (this.segundos < 0) {
            this.segundos = 100;

        } else {
            this.segundos = segundos;

        }
    }

    public int getSegundos() {
        return segundos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void calcularHMS() {
        int ssegundo = segundos;
        this.hora = ssegundo / 3600;
        ssegundo %=3600;
        this.minuto = ssegundo / 60;
        ssegundo %= 60;
        this.segundo = ssegundo / 1;
        ssegundo &=1;
    }

    @Override
    public String toString() {
        return "A peça: " + this.getPeca()
                + " que levou um total de "
                + this.getSegundos()
                + " levou "
                + this.getHora()
                + ":"
                + this.getMinuto()
                + ":"
                + this.getSegundo()
                + " para ficar pronta!";

    }
}
