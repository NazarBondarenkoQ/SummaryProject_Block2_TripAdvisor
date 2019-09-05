package uni.rostock.tripadvisor.tripadvisor.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Data
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "location_id")
    private int id;

    @Column(name = "country")
    @Enumerated(EnumType.STRING)
    private Country country;

    @Column(name = "city")
    private String city;

    @OneToOne(mappedBy = "to", cascade = CascadeType.MERGE)
    private Trip trip;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval = true)
    @JoinTable(name = "location_comment",
            joinColumns = @JoinColumn(name = "location_fk_id"),
            inverseJoinColumns = @JoinColumn(name = "comment_fk_id"))
    private List<Comment> comments = new LinkedList<>();

    private int rating;

    public Location(Country country, String city, int rating) {
        this.country = country;
        this.city = city;
        this.rating = rating;
    }

    public Location() {
    }
}

