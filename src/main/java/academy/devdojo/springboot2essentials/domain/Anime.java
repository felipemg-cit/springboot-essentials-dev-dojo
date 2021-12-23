package academy.devdojo.springboot2essentials.domain;

public class Anime {
  private Long id;
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
