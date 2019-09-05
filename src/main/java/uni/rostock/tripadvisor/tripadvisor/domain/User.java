package uni.rostock.tripadvisor.tripadvisor.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String login;

    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval = true)
    @JoinTable(name = "user_trip",
            joinColumns = @JoinColumn(name = "user_fk_id"),
            inverseJoinColumns = @JoinColumn(name = "trip_fk_id"))
    private List<Trip> trips = new ArrayList<>();

    public User(String firstName, String lastName, String login) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
    }

    public User() {

    }
}
