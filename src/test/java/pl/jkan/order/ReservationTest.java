package pl.jkan.order;

import org.junit.Test;



public class ReservationTest {

    @Test
    public void builtWithBuilder() {
        Reservation r = Reservation.builder()
                .clientFirstName("Jakub")
                .days(2)
                .priceperDay(200)
                .build();

        Reservation r2 = new Reservation();
        r2.setDays(2);
        r2.setPricePerDay(200);
        r2.setClientFirstName("Jakub");
    }
}
