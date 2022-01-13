package academy.devdojo.springboot2essentials.service;

import academy.devdojo.springboot2essentials.domain.Anime;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AnimeService {
  private final List<Anime> animes =
      List.of(new Anime(0L, "Shingeki no Kyojin"), new Anime(1L, "Kimetsu no Yaiba"));

  // private finalAnimeRepository animeRepository;

  public List<Anime> listAll() {
    return animes;
  }

  public Anime findById(long id) {
    return animes.stream()
        .filter(anime -> anime.getId().equals(id))
        .findFirst()
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
  }
}
