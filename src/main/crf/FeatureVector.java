/**
 * Created with IntelliJ IDEA.
 * User: Fujinuma
 * Date: 2013/11/03
 * Time: 21:13
 * To change this template use File | Settings | File Templates.
 */
public class FeatureVector {
    String prevState; //label
    // Sring current
    String label;
    int indice; // place of the state

    FeatureVector(String prevState, String label, int indice) {
        this.prevState = prevState;
        this.label = label;
        this.indice = indice;
    }
}