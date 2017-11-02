import java.time.LocalDate;

/**
 * Created by Damian on 02.11.2017.
 */
public class Main {

    public static void main(String[] args){

        Inquiry inquiry = new Inquiry("Jan Kowalski", "kowalski@wp.pl");
        inquiry.setDateCreationOfQuery(LocalDate.of(2017,10,1));
        System.out.println(inquiry.checkIsOlderThenTwoWeeks());

    }
}
