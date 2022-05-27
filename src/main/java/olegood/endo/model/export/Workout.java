package olegood.endo.model.export;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@Builder(setterPrefix = "with")
public class Workout {

  private String name;
  private LocalDateTime createdDate;
  private String text;
  private Collection<Photo> photos;
}
