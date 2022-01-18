package academy.devdojo.springboot2essentials.requests;

import lombok.Data;

@Data
public class AnimePutRequestBody {
  private String name;
  private Long id;
}
