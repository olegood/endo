package olegood.endo;

import org.apache.commons.cli.*;

/**
 * Main runnable entrypoint.
 *
 * @author Oleg Anastassov
 */
public class EndoApp {

  /**
   * @param args
   * @throws ParseException
   */
  public static void main(String[] args) throws ParseException {
    Options options = new Options().addOption("info", false, "Information");

    CommandLineParser parser = new DefaultParser();
    CommandLine cmd = parser.parse(options, args);

    if (cmd.hasOption("info")) {
      System.out.println("This is info.");
    }
  }
}
