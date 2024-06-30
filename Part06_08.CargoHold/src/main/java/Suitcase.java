
import java.util.ArrayList;

/**
 *
 * @author trist
 */
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if ((this.maxWeight - item.getWeight()) >= 0) {
            this.maxWeight -= item.getWeight();
            items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviest = items.get(0);
        
        for (Item item : items) {
            if(heaviest.getWeight() < item.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    public ArrayList<Item> getArray(){
        return items;
    }

    @Override
    public String toString() {

        if (items.isEmpty()) {
            return "no items (0kg)";
        }
        if (items.size() == 1) {
            return "1 item (" + items.get(0).getWeight() + " kg)";
        }

        return items.size() + " items (" + totalWeight() + "kg)";
    }
}
