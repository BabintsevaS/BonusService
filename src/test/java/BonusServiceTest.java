import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 2100_20;
        boolean registered = true;
        long expected = 63;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 2100_20;
        boolean registered = false;
        long expected = 21;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 55_000_50;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 55_000_50;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredEqualLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16_690_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredEqualLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 50_000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredBorderLeftLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16_660_60;
        boolean registered = true;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredBorderRightLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16_700_00;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredBorderLeftLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 49_900_00;
        boolean registered = false;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredBorderRightLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 50_100_00;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}