package uni.rostock.tripadvisor.tripadvisor.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private int id;

    @Column(name = "comment_text")
    private String text;

    @Column(name = "comment_date")
    private LocalDate date;

    public Comment() {
    }

    public Comment(String text, LocalDate date) {
        this.text = text;
        this.date = date;
    }
}

