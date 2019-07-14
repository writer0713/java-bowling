package models.frames;

import java.util.ArrayList;
import java.util.List;

public class NormalFrame implements Frame {

  private final int SCORES_SIZE = 2;
  private List<Integer> scores;

  public NormalFrame() {
    this.scores = new ArrayList<>();
  }

  public Frame save(int score) {
    scores.add(score);
    if (isDone()) {
      return new NormalFrame();
    }

    return this;
  }

  boolean isDone() {
    return this.scores.size() == SCORES_SIZE;
  }

}
