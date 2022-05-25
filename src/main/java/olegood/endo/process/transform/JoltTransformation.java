package olegood.endo.process.transform;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

import java.util.List;

/**
 * @author Oleg Anastassov
 */
public class JoltTransformation implements TransformationStrategy {

  private final String specification;

  public JoltTransformation(String specification) {
    this.specification = specification;
  }

  /**
   * @param filePath source JSON file
   * @return transformed JSON content
   */
  @Override
  public String apply(String filePath) {
    Object json = JsonUtils.filepathToList(filePath);

    List<Object> spec = JsonUtils.classpathToList(specification);
    Chainr chainr = Chainr.fromSpec(spec);
    Object object = chainr.transform(json);

    return JsonUtils.toJsonString(object);
  }
}
