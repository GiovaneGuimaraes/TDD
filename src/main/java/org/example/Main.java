package org.example;

import org.example.models.TemperaturaValores;

public class Main {
    public static void main(String[] args) {
        //Exemplo 1
        TemperaturaValores semana = new TemperaturaValores(2, 2, 2, 2, 2, 2, 3);
        int[] valores = { semana.getTempSegunda(), semana.getTempTerca(), semana.getTempQuarta(), semana.getTempQuinta(), semana.getTempSexta(), semana.getTempSabado(), semana.getTempDomingo()};
        System.out.println("A semana 1 possui " + TemperaturaValores.valoresAcimaMedia(valores) + " valor(es) acima da média");

        //Exemplo 2
        TemperaturaValores semana2 = new TemperaturaValores(21, 10, 13, 34, 30, 21, 34);
        int[] valores1 = { semana2.getTempSegunda(), semana2.getTempTerca(), semana2.getTempQuarta(), semana2.getTempQuinta(), semana2.getTempSexta(), semana2.getTempSabado(), semana2.getTempDomingo()};
        System.out.println("A semana 2 possui " + TemperaturaValores.valoresAcimaMedia(valores1) + " valor(es) acima da média");

        //Exemplo 3
        TemperaturaValores semana3 = new TemperaturaValores(2, 2, 2, 2, 2, 2, 1);
        int[] valores3 = { semana3.getTempSegunda(), semana3.getTempTerca(), semana3.getTempQuarta(), semana3.getTempQuinta(), semana3.getTempSexta(), semana3.getTempSabado(), semana3.getTempDomingo()};
        System.out.println("A semana 3 possui " + TemperaturaValores.valoresAcimaMedia(valores3) + " valor(es) acima da média");

        //Exemplo com erro
        TemperaturaValores semana4 = new TemperaturaValores(101, 2, 2, 2, 2, 2, 1);
        int[] valores4 = { semana4.getTempSegunda(), semana4.getTempTerca(), semana4.getTempQuarta(), semana4.getTempQuinta(), semana4.getTempSexta(), semana4.getTempSabado(), semana4.getTempDomingo()};
        System.out.println("Semana teste pra erro - " + TemperaturaValores.valoresAcimaMedia(valores4));
    }
}