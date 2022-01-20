package academy.devdojo.springboot2essentials.requests;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AnimePostRequestBody {

  @NotEmpty(message = "The name of the anime cannot be empty")
  private String name;
}
