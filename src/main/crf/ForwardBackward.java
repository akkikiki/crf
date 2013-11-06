import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Fujinuma
 * Date: 2013/11/03
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */
public class ForwardBackward {
    int length;

    ForwardBackward(int length) {
        this.length = length;
    }

    public double calcForward(String state, int indice) {


        if (state.equals("BOS") && indice == 0) {
            return 1;
        }

        // Previous node is the "JUST ONE previous from the current node"

        previous_states = getPreviousStates(state);

        alpha *= getNodeFeature(state, label);

        return 0;
    }

    public double[] calcForwardTotal(List<String> states, List<String> labels) {
        // inserting BOS and EOS

        states.add(0, "BOS");
        states.add("EOS");
        labels.add(0, "BOS");
        labels.add("EOS");

        // store alpha to each node???

        double[] alphas = new double[labels.size()];

        for(int i = 0; i < labels.size(); i++) {
            alphas[i] = calcForward(states.get(i), i);
        }



        return alphas;
    }

    public double calcBackward(String state, int indice) {
        if (state.equals("EOS") && indice == length + 1) {
            return 1;
        }
        return 0;
    }
}
