import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Zad1 {

    private String pesel;



    public Zad1(String pesel) {
        this.pesel = pesel;
    }



    public LocalDate convertPeselToDate(){
        String trimedPesel = pesel.substring(0, 6);
        String ofsetPesel = "19" + trimedPesel;
        LocalDate parsed = LocalDate.parse(ofsetPesel, DateTimeFormatter.ofPattern("yyyyMMdd"));
        return parsed;
    }

    public long getNumberOfDays(){
        LocalDate parsedDate = convertPeselToDate();
        LocalDate now = LocalDate.now();

        long days = ChronoUnit.DAYS.between(parsedDate, now);

        return days;
    }

    public int moduloFromDays(){
        return (int)getNumberOfDays() % 2;
    }
}
