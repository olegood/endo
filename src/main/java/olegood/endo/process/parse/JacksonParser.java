package olegood.endo.process.parse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import olegood.endo.model.data.WorkoutData;

import java.util.Optional;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static com.fasterxml.jackson.databind.PropertyNamingStrategies.SNAKE_CASE;

public class JacksonParser {

  private final ObjectMapper mapper;

  public JacksonParser() {
    this.mapper =
        new ObjectMapper()
            .configure(FAIL_ON_UNKNOWN_PROPERTIES, false)
            .setPropertyNamingStrategy(SNAKE_CASE)
            .registerModule(new JavaTimeModule());
  }

  public Optional<WorkoutData> parse(String content) {
    try {
      var workout = mapper.readValue(content, WorkoutData.class);
      return Optional.of(workout);
    } catch (JsonProcessingException e) {
      return Optional.empty();
    }
  }
}
