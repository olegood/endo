package olegood.endo.process.transform.json;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

/**
 * Transforms JSON to JSON applying "shifting" operations.
 *
 * @author Oleg Anastassov
 * @see https://github.com/bazaarvoice/jolt
 */
public class JoltTransformation implements Transformation {

  /** File holds "shifting" operations. */
  private final String specification;

  /**
   * Init strategy with transformation rules.
   *
   * @param jsonFile JSON file containing transformation rules
   */
  public JoltTransformation(String jsonFile) {
    this.specification = jsonFile;
  }

  @Override
  public String transform(String jsonFile) {
    var json = JsonUtils.filepathToList(jsonFile);

    var spec = JsonUtils.classpathToList(specification);
    var object = Chainr.fromSpec(spec).transform(json);

    return JsonUtils.toJsonString(object);
  }
}
