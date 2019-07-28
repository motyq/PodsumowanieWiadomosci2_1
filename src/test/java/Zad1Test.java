import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Zad1Test {

    @Test
    void getNumberOfDays(){
        Zad1 zad1 = new Zad1("82112611111");

        long days = zad1.getNumberOfDays();

        assertEquals(13393, days);
    }

    @Test
    void convertPeselToDateFromMyPesel(){
        Zad1 zad1 = new Zad1("82112611111");

        String parsed = zad1.convertPeselToDate().toString();

        assertEquals("1982-11-26", parsed);
    }

    @Test
    void moduloFromDaysFromMyPeselIsOne(){
        Zad1 zad1 = new Zad1("82112611111");

        int output = zad1.moduloFromDays();

        assertEquals(1, output);
    }
}
