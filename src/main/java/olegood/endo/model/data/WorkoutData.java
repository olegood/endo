package olegood.endo.model.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import olegood.endo.process.aux.Required;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * Workout data mapped from JSON file.
 *
 * @author Oleg Anastassov
 */
@Data
public final class WorkoutData {

  /** Custom workout name. */
  private String name;

  /** Workout type. */
  @Required private Sport sport;

  /** Workout date and time. */
  @Required
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.S")
  private LocalDateTime createdDate;

  /** Workout source. */
  private Source source;

  /** Workout notes. */
  private String notes;

  /** Message content. */
  private String message;

  /** Attached pictures. */
  private Collection<PictureData> pictures;

  /**
   * Workout type (sorted alphabetically).
   *
   * @author Oleg Anastassov
   */
  public enum Sport {
    CROSSFIT,
    CROSS_TRAINING,
    CYCLING_SPORT,
    CYCLING_TRANSPORTATION,
    HIKING,
    ICE_SKATING,
    MOUNTAIN_BIKING,
    OTHER,
    ROWING_INDOOR,
    RUNNING,
    RUNNING_TRAIL,
    SKIING_CROSS_COUNTRY,
    SPINNING,
    SWIMMING,
    TREADMILL_RUNNING,
    WALKING,
    WEIGHT_TRAINING,
    YOGA
  }

  /**
   * Workout source (sorted alphabetically).
   *
   * @author Oleg Anastassov
   */
  public enum Source {
    IMPORT_GARMIN_PUSH_API,
    INPUT_MANUAL,
    INPUT_MANUAL_MERGE,
    INPUT_MANUAL_MOBILE,
    TRACK_MOBILE
  }
}
