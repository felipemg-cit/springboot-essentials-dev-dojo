package academy.devdojo.springboot2essentials.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Anime {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  public Anime(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Anime() {
    // Default Constructor
  }

  public String getName() {
    return name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }
}
