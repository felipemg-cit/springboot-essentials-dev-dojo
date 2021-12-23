package academy.devdojo.springboot2essentials.controller;

import academy.devdojo.springboot2essentials.domain.Anime;
import academy.devdojo.springboot2essentials.util.DateUtil;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("anime")
@Log4j2
public class AnimeController {
  private final DateUtil dateUtil = new DateUtil();

  @GetMapping(path = "list")
  public List<Anime> list(){
    log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
    return List.of(new Anime("Shingeki no Kyojin"), new Anime("Kimetsu no Yaiba"));
  }
}
