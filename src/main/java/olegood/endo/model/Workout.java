package olegood.endo.model;

import lombok.Data;
import olegood.endo.process.aux.Required;

import java.time.LocalDateTime;

/**
 * Workout data.
 *
 * @author Oleg Anastassov
 */
@Data
public class Workout {

  /** Custom workout name. */
  private String name;

  /** Workout type. */
  @Required private Sport sport;

  /** Workout date and time. */
  @Required private LocalDateTime createdDate;

  /** Workout source. */
  private Source source;
}
