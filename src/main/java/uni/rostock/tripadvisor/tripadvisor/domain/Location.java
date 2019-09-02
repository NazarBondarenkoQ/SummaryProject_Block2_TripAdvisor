package uni.rostock.tripadvisor.tripadvisor.domain;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "location_id")
    private int id;

    @Column(name = "country")
    @Enumerated(EnumType.STRING) // представление энама в базе данных
    private Country country;

    @Column(name = "city")
    private String city;

    @ManyToOne
    @JoinColumn(name = "user_fk_id")
    private User user;

    @OneToOne(mappedBy = "to")
    private Trip trip;

    @OneToMany(cascade = {CascadeType.PERSIST}, orphanRemoval = true)
    @JoinTable(name = "location_comment",
            joinColumns = @JoinColumn(name = "location_fk_id"),
            inverseJoinColumns = @JoinColumn(name = "comment_fk_id"))
    private List<Comment> comments = new LinkedList<>();

    private int rating;

    public Location(Country country, String city, User user, int rating) {
        this.country = country;
        this.city = city;
        this.user = user;
        this.rating = rating;
    }

    public Location() {
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
