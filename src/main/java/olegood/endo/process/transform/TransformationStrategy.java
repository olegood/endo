package olegood.endo.process.transform;

import java.util.function.Function;

@FunctionalInterface
public interface TransformationStrategy extends Function<String, String> {}
