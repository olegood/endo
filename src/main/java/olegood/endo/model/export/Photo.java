package olegood.endo.model.export;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class Photo {

  @JsonProperty("created_date")
  private LocalDateTime dateTaken;


  private String filePath;
}
