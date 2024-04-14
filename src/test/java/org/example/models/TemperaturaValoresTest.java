package org.example.models;
import org.example.models.TemperaturaValores;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperaturaValoresTest {

    @Test
    public void testReturnRightValueExempleOne() {
        TemperaturaValores semana = new TemperaturaValores(2, 2, 2, 2, 2, 2, 3);
        int[] valores = { semana.getTempSegunda(), semana.getTempTerca(), semana.getTempQuarta(), semana.getTempQuinta(), semana.getTempSexta(), semana.getTempSabado(), semana.getTempDomingo()};
        assertEquals(1, TemperaturaValores.valoresAcimaMedia(valores));
        System.out.println("Test Retorna o valor correto exemplo 1 - 1 valor da Lista de temperatura da semana está a cima da média de temperatura");
    }

    @Test
    public void testReturnRightValueExempleTwo() {
        TemperaturaValores semana1 = new TemperaturaValores(21, 10, 13, 34, 30, 21, 34);
        int[] valores = { semana1.getTempSegunda(), semana1.getTempTerca(), semana1.getTempQuarta(), semana1.getTempQuinta(), semana1.getTempSexta(), semana1.getTempSabado(), semana1.getTempDomingo()};
        assertEquals(3, TemperaturaValores.valoresAcimaMedia(valores));
        System.out.println("Test Retorna o valor correto exemplo 2 - 3 valores da Lista de temperatura da semana está a cima da média de temperatura");
    }

    @Test
    public void testReturnRightValueExempleThree() {
        TemperaturaValores semana3 = new TemperaturaValores(2, 2, 2, 2, 2, 2, 1);
        int[] valores = { semana3.getTempSegunda(), semana3.getTempTerca(), semana3.getTempQuarta(), semana3.getTempQuinta(), semana3.getTempSexta(), semana3.getTempSabado(), semana3.getTempDomingo()};
        assertEquals(6, TemperaturaValores.valoresAcimaMedia(valores));
        System.out.println("Test Retorna o valor correto exemplo 3 - 6 valores da Lista de temperatura da semana está a cima da média de temperatura");
    }

    @Test
    public void testReturnError() {
        TemperaturaValores semana3 = new TemperaturaValores(101, 2, 2, 2, 2, 2, 1);
        int[] valores = { semana3.getTempSegunda(), semana3.getTempTerca(), semana3.getTempQuarta(), semana3.getTempQuinta(), semana3.getTempSexta(), semana3.getTempSabado(), semana3.getTempDomingo()};
        assertEquals("Error", TemperaturaValores.valoresAcimaMedia(valores));
        System.out.println("Test Retorna o valor com erro - Error");
    }
}
