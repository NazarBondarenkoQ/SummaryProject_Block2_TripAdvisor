package uni.rostock.tripadvisor.tripadvisor.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
    private int id;

    @Column(name = "location_from")
    private String from;

    @OneToOne
    @JoinColumn(name = "location_to_fk_id")
    private Location to;

    private LocalDate date;

    private String name;

    private int price;

    public Trip(String from, Location to, LocalDate date, String name, int price) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.name = name;
        this.price = price;
    }

    public Trip() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

/*    public Location getTo() {
        return to;
    }

    public void setTo(Location to) {
        this.to = to;
    }*/

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
