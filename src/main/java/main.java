import java.time.LocalDate;

public class main {

    public static void main(String[] args) {


        Zad1 zad1 = new Zad1("82112611111");

        LocalDate temp = zad1.convertPeselToDate();

        System.out.println("Date of birth from PESEL: " + temp);

        System.out.println("Number of days from birth: " + zad1.getNumberOfDays());

        System.out.println("Modulo from number of days: " + zad1.moduloFromDays());
    }



}
