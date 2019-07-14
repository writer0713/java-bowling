package models;

public class Player {

  private final String name;
  private final ScoreGenerator scoreGenerator;

  public Player(String name, ScoreGenerator scoreGenerator) {
    this.name = name;
    this.scoreGenerator = scoreGenerator;
  }

  public int play() {
    return scoreGenerator.generate();
  }
}
