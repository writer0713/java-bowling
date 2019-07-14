package models;

import models.Player;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlayerTest {

  @Test
  void play() {
    final String name = "kjh";
    Player player = new Player(name);

    int score = player.play();
    assertThat(score).isEqualTo(5);
  }
}
