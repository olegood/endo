package olegood.endo.process.transform.json;

/**
 * Transformation function.
 *
 * @author Oleg Anastassov
 */
@FunctionalInterface
public interface Transformation {

  /**
   * Apply transformation operations to origin JSON file.
   *
   * @param jsonFile original JSON file
   * @return transformation result
   */
  String transform(final String jsonFile);
}
