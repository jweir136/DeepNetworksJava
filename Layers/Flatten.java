package DeepLearningLayers;

public class Flatten implements Layer {
  public double[] getOutputs(double[] x) {
    throw new java.lang.Error("Error: inputed array must be 2D.");
  }

  public double[] getOutputs(double[][] x) {
    double[] output = new double[x.length*x[0].length];
    int counter = 0;

    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[0].length; j++) {
        output[counter++] = x[i][j];
      }
    }

    return output;
  }
}
