package models;

public class SimpleScoreGenerator implements ScoreGenerator {

  private final int score;

  private SimpleScoreGenerator(int score) {
    this.score = score;
  }

  public static SimpleScoreGenerator of(int score) {
    return new SimpleScoreGenerator(score);
  }

  @Override
  public int generate() {
    return score;
  }
}
