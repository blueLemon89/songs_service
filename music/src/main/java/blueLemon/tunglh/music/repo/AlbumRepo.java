package blueLemon.tunglh.music.repo;


import blueLemon.tunglh.music.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepo extends JpaRepository<Album, Integer> {
}
