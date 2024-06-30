
import java.util.ArrayList;


/**
 *
 * @author trist
 */
public class TodoList {
    
    private ArrayList<String> list;
    
    public TodoList(){
        list = new ArrayList<>();
    }
    
    public void add(String task){
        list.add(task);
    }
    
    public void print(){
        for (String string : list) {
            System.out.println((list.indexOf(string)+1) + ": " + string);
        }
    }
    
    public void remove(int number){
        list.remove(number-1);
    }
}
