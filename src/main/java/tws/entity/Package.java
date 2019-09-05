package tws.entity;

import java.util.Date;

public class Package {
    private String id;
    private String bookingNumber;
    private String name;
    private String phone;
    private boolean status;
    private Date bookingDate;
    private int weight;

    public Package() {
    }

    public Package(String id, String bookingNumber, String name, String phone, boolean status, Date bookingDate, int weight) {
        this.id = id;
        this.bookingNumber = bookingNumber;
        this.name = name;
        this.phone = phone;
        this.status = status;
        this.bookingDate = bookingDate;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
