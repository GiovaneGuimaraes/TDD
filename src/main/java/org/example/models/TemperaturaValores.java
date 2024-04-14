package org.example.models;

public class TemperaturaValores {
    public TemperaturaValores(int tempSegunda, int tempTerca, int tempQuarta, int tempQuinta, int tempSexta, int tempSabado, int tempDomingo) {
        this.tempSegunda = tempSegunda;
        this.tempTerca = tempTerca;
        this.tempQuarta = tempQuarta;
        this.tempQuinta = tempQuinta;
        this.tempSexta = tempSexta;
        this.tempSabado = tempSabado;
        this.tempDomingo = tempDomingo;
    }

    private int tempSegunda;
    private int tempTerca;
    private int tempQuarta;
    private int tempQuinta;
    private int tempSexta;
    private int tempSabado;
    private int tempDomingo;

    public int getTempSegunda() {
        return tempSegunda;
    }

    public void setTempSegunda(int tempSegunda) {
        this.tempSegunda = tempSegunda;
    }

    public int getTempTerca() {
        return tempTerca;
    }

    public void setTempTerca(int tempTerca) {
        this.tempTerca = tempTerca;
    }

    public int getTempQuarta() {
        return tempQuarta;
    }

    public void setTempQuarta(int tempQuarta) {
        this.tempQuarta = tempQuarta;
    }

    public int getTempQuinta() {
        return tempQuinta;
    }

    public void setTempQuinta(int tempQuinta) {
        this.tempQuinta = tempQuinta;
    }

    public int getTempSexta() {
        return tempSexta;
    }

    public void setTempSexta(int tempSexta) {
        this.tempSexta = tempSexta;
    }

    public int getTempSabado() {
        return tempSabado;
    }

    public void setTempSabado(int tempSabado) {
        this.tempSabado = tempSabado;
    }

    public int getTempDomingo() {
        return tempDomingo;
    }

    public void setTempDomingo(int tempDomingo) {
        this.tempDomingo = tempDomingo;
    }

    public static Object valoresAcimaMedia(int[] valores) {

        for (int valor : valores) {
            if (valor < -100 || valor > 100) {
                return "Error";
            }
        }

        double soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
        double media = soma / valores.length;

        int contadorAcimaMedia = 0;
        for (int valor : valores) {
            if (valor > media) {
                contadorAcimaMedia++;
            }
        }
        return contadorAcimaMedia;
    }

}
