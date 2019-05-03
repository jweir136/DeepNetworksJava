package DeepLearningUtils;

public class Utils {
  public static double dot(double[] arr1, double[] arr2) {
    double result = 0.0;

    for (int i = 0; i < arr1.length; i++)
      result += arr1[i] * arr2[i];

    return result;
  }
}
