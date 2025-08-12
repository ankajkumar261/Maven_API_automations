package EX_07_payload_management.Class.tools.responsepojo;

import EX_07_payload_management.Class.manually.requestpojo.Booking;

public class bookingresponse {

    private Integer bookingid;
    private Booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
