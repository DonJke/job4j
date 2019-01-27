package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import ru.job4j.converter.Converter;

public class ConverterTest {
    @Test
    public void when70RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(70);
        assertThat(result, is(1));
    }

    @Test
    public void when80RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(80);
        assertThat(result, is(1));
    }
	@Test
    public void when1DollarToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(70));
    }
	@Test
    public void when1EuroToRubleThen80() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(80));
    }
}