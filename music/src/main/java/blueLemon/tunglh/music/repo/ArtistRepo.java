package blueLemon.tunglh.music.repo;

import blueLemon.tunglh.music.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepo extends JpaRepository<Artist, Integer> {
}
