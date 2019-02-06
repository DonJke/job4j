package ru.job4j.calculate;

/**
 * Программа расчета идеального веса
 * @author Ilja Danilov
 * @since 27.01.2019
 * @version 1
 */

public class Fit {
    private static final double IDEAL_WEIGHT_FOR_MAN = 100.0;
    /**
     * Для формулы мужского веса.
     */
    private static final double IDEAL_WEIGHT_FOR_WOMAN = 110.0;
    /**
     * Для формулы женского веса.
     */
    private static final double FORMULA_CONSTANT = 1.15;
    /**
     * Множитель для формул.
     */
    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - IDEAL_WEIGHT_FOR_MAN) * FORMULA_CONSTANT;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - IDEAL_WEIGHT_FOR_WOMAN) * FORMULA_CONSTANT;
    }
}

