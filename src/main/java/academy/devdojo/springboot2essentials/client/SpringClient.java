package academy.devdojo.springboot2essentials.client;

import academy.devdojo.springboot2essentials.domain.Anime;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Log4j2
public class SpringClient {
  public static void main(String[] args) {
    ResponseEntity<Anime> entity =
        new RestTemplate().getForEntity("http://localhost:8080/animes/{id}", Anime.class, 4);
    log.info(entity);

    ResponseEntity<List<Anime>> exchange =
        new RestTemplate()
            .exchange(
                "http://localhost:8080/animes/all",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {});
    log.info(exchange.getBody());
  }
}
