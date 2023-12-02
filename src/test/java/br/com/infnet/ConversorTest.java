package br.com.infnet;

import br.com.infnet.util.ConversorDeTemperaturas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ConversorTest {
    @Test
    @DisplayName("Deve testar a conversao de C para K")
    public void testaCalciusPraKelvin(){
        ConversorDeTemperaturas conversor = new ConversorDeTemperaturas();
        assertEquals(273.5, conversor.celciusParaKelvin(00));
        assertEquals(348.13, conversor.celciusParaKelvin(74.98),0.1);
        assertEquals(198.17, conversor.celciusParaKelvin(-74.98),0.1);
    }

    @Test
    @DisplayName("Deve testar a conversao de C para F")
    public void testaCalciusPraFahrenheit() {
        ConversorDeTemperaturas conversor = new ConversorDeTemperaturas();
        assertEquals(32, conversor.celciusParaFahrenheit(00));
        assertEquals(319.46, conversor.celciusParaFahrenheit(159.7));
        assertEquals(-69.16, conversor.celciusParaFahrenheit(-56.2));
    }

    @Test
    @DisplayName("Deve testar a conversao de K para c")
    public void testakelvinParaCelcius() {
        ConversorDeTemperaturas conversor = new ConversorDeTemperaturas();
        assertEquals(-273.15, conversor.kelvinParaCelcius(0.0));
        assertEquals(592.17, conversor.kelvinParaCelcius(865.32));
        assertEquals(-296.595, conversor.kelvinParaCelcius(-0));
    }

}
