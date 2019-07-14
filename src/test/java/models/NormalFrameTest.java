package models;

import models.frames.NormalFrame;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NormalFrameTest {

  @Test
  void save() {
    NormalFrame frame = new NormalFrame();

    assertThat(frame.save(1)).isEqualTo(frame);
    assertThat(frame.save(2)).isNotEqualTo(frame);
  }
}
