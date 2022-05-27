package olegood.endo.model.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Taken picture meta info.
 *
 * @author Oleg Anastassov
 */
@Data
public final class PictureData {

  /** Date taken. */
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.S")
  private LocalDateTime createdDate;

  /** Relative path to image. */
  private String url;
}
