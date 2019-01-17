package pl.jkan.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Reservation {

    String clientFirstName;
    int days;
    double pricePerDay;

    public static ReservationBuilder builder() {
        return new ReservationBuilder();
    }

    static class ReservationBuilder {
        Logger logger = LoggerFactory.getLogger(Reservation.class);

        String clientFirstName;
        int days;
        double pricePerDay;

        public void x(){
            logger.info("ADADSA");
        }

        ReservationBuilder withClientFirstName(String clientFirstName){
            this.clientFirstName = clientFirstName;
            return this;
        }

        ReservationBuilder withPricePerDay(int pricePerDay){
            this.pricePerDay = pricePerDay;
            return this;
        }

        ReservationBuilder withDays(int days){
            this.days = days;
            return this;
        }

        Reservation build() {
            if (clientFirstName.equals("Jakub")) {
                throw new IllegalArgumentException("Nie obslugujemy tego Pana");
            }
            return new Reservation(clientFirstName, days, pricePerDay);
        }

    }

}
