package org.Task1;

import static org.assertj.core.api.AssertionsForClassTypes.*;

/**
 * В классе Calculator создайте метод calculateDiscount,
 * который принимает сумму покупки и процент скидки и
 * возвращает сумму с учетом скидки.
 * Ваша задача - проверить этот метод с использованием
 * библиотеки AssertJ. Если метод calculateDiscount
 * получает недопустимые аргументы, он должен выбрасывать
 * исключение ArithmeticException.
 * Не забудьте написать тесты для проверки этого поведения.
 */

public class Main {
    public static void main(String[] args) {
        assertThat(Calculator.calculatingDiscount(100.0, 30)).isEqualTo(70);
        assertThat(Calculator.calculatingDiscount(100.0, 0)).isEqualTo(100);

        assertThatThrownBy(() -> Calculator.calculatingDiscount(0.0, 50)
        ).isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(() -> Calculator.calculatingDiscount(-10.0, 50)
        ).isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(() -> Calculator.calculatingDiscount(100.0, -50)
        ).isInstanceOf(ArithmeticException.class);
    }


}