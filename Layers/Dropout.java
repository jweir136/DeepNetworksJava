import java.util.*;

public class Dropout implements Layer {
  private double percentDrop;
  
  public Dropout(double percentDrop) {
    this.percentDrop = percentDrop;
  }

  public double[] getOutputs(double[] x) {
    int nIndices = (int)(x.length * this.percentDrop);
    double[] outputs = new double[x.length];
    int index;
    List<Integer> chosenIndices = new ArrayList<Integer>();

    for (int j = 0; j < x.length; j++) 
      outputs[j] = x[j];

    for (int i = 0; i < nIndices; i++) {
      while (true) {
        index = (int)(Math.random() * x.length);

        if (!chosenIndices.contains(index)) {
          outputs[index] = 0.0;
          chosenIndices.add(new Integer(index));
          break;
        }
      }
    }

    return outputs;
  }
}
