package blueLemon.tunglh.music.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "bio")
    private String bio;
    @Column(name = "avatar")
    private String avatar;
    @CreationTimestamp
    @Column(name  = "created_at")
    private Timestamp createdAt;

}
