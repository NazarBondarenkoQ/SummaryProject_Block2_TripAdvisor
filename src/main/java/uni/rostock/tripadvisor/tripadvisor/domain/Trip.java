package uni.rostock.tripadvisor.tripadvisor.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trip_id")
    private int id;

    @Column(name = "location_from")
    private String from;

    @OneToOne
    @JoinColumn(name = "location_to_fk_id")
    private Location to;

    @Column(name = "trip_date")
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
}

