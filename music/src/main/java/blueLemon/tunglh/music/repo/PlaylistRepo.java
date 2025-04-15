package blueLemon.tunglh.music.repo;

import blueLemon.tunglh.music.entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepo extends JpaRepository<Playlist, Integer> {
}
