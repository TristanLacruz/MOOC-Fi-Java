
import java.util.ArrayList;

/**
 *
 * @author trist
 */
public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.maxWeight - suitcase.totalWeight()) >= 0) {
            this.maxWeight -= suitcase.totalWeight();
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            for (Item item : suitcase.getArray()) {
                System.out.println(item.toString());
            }
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
