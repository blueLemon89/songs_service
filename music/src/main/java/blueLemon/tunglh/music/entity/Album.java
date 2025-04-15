package blueLemon.tunglh.music.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private String coverImage;
    private LocalDate releaseDate;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
}
