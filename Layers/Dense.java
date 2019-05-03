import DeepLearningUtils.Utils;
import ActivationFunctions.ActivationFunctions;

public class Dense implements Layer {
  private int nDims, nOutputs;
  private double[] weights;
  private String activation;

  public Dense(int nDims, int nOutputs, String activation) {
    this.nDims = nDims;
    this.nOutputs = nOutputs;
    this.activation = activation;
    initWeights();
  }

  public double[] getWeights() {
    return this.weights;
  }

  public void setWeights(double[] weights) {
    this.weights = weights;
  }

  public double[] getOutputs(double[] x) {
    double[] currentWeights = new double[this.nDims];
    double[] outputs = new double[this.nOutputs];
    int counter = 0;

    for (int i = 0; i < outputs.length; i++) {
      for (int j = 0; j < currentWeights.length; j++)
        currentWeights[j] = this.weights[counter++];

      outputs[i] = Utils.dot(currentWeights, x);
    }

    if (this.activation.equals("relu")) {
      return ActivationFunctions.relu(outputs);
    }

    return outputs;
  }

  private void initWeights() {
    this.weights = new double[this.nDims * this.nOutputs];

    for (int i = 0; i < this.weights.length; i++)
      this.weights[i] = Math.random();
  }
}
