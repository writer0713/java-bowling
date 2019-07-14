package models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlayerTest {

  @Test
  void play() {
    final int targetScore = 5;
    final String name = "kjh";
    Player player = new Player(name, SimpleScoreGenerator.of(targetScore));

    int score = player.play();
    assertThat(score).isEqualTo(targetScore);
  }
}
