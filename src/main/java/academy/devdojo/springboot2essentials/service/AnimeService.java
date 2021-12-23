package academy.devdojo.springboot2essentials.service;

import academy.devdojo.springboot2essentials.domain.Anime;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AnimeService {
  // private finalAnimeRepository animeRepository;
  public List<Anime> listAll() {
    return List.of(new Anime(0L, "Shingeki no Kyojin"), new Anime(1L, "Kimetsu no Yaiba"));
  }
}
