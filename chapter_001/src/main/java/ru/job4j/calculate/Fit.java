package ru.job4j.calculate;

/**
 * Программа расчета идеального веса
 * @author Ilja Danilov
 * @since 27.01.2019
 * @version 1
 */

public class Fit {
    private final double Ideal_weigth_for_man = 100.0;
    /**
     * Для формулы мужского веса.
     */
    private final double Ideal_weigth_for_woman = 110.0;
    /**
     * Для формулы женского веса.
     */
    private final double Formula_constant = 1.15;
    /**
     * Множитель для формул.
     */
    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - Ideal_weigth_for_man) * Formula_constant;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - Ideal_weigth_for_woman) * Formula_constant;
    }
}

