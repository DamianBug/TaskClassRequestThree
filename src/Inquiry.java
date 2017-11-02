import java.time.Duration;
import java.time.LocalDate;

/**
 * Created by Damian on 02.11.2017.
 */
public class Inquiry {

    private String whoCreatedQuery;
    private String email;
    private LocalDate dateCreationOfQuery;

    public Inquiry(String whoCreatedQuery, String email) {
        this.whoCreatedQuery = whoCreatedQuery;
        this.email = email;
    }

    public String getWhoCreatedQuery() {
        return whoCreatedQuery;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateCreationOfQuery() {
        return dateCreationOfQuery;
    }

    public void setWhoCreatedQuery(String whoCreatedQuery) {
        this.whoCreatedQuery = whoCreatedQuery;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateCreationOfQuery(LocalDate dateCreationOfQuery) {
        this.dateCreationOfQuery = dateCreationOfQuery;
    }

    public boolean checkIsOlderThenTwoWeeks(){
      if (dateCreationOfQuery.isBefore(LocalDate.now().minusDays(14))){
          return true;
      }else {
          return false;
      }
    }

    @Override
    public String toString() {
        return "Inquiry{" +
                "whoCreatedQuery='" + whoCreatedQuery + '\'' +
                ", email='" + email + '\'' +
                ", dateCreationOfQuery=" + dateCreationOfQuery +
                '}';
    }
}
