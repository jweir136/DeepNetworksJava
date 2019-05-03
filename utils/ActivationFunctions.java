package ActivationFunctions;

public class ActivationFunctions {
  public static double[] relu(double[] values) {
    double[] result = new double[values.length];
    int counter = 0;

    for (double value : values) {
      if (value >= 0)
        result[counter++] = value;
      else
        result[counter++] = 0.0;
    }

    return result;
  }
}
