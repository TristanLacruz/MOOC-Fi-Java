
import java.util.ArrayList;


/**
 *
 * @author trist
 */
public class BirdsDatabase {
    
    ArrayList<Bird> birdsList;
    
    public BirdsDatabase(){
        birdsList = new ArrayList<>();
    }
    
    public void add(Bird bird){
        birdsList.add(bird);
    }
    
    public boolean addObervation(String name){
        boolean exist = false;
        for (Bird bird : birdsList) {
            if(bird.getEnglishName().equals(name)){
                bird.setObservations(bird.getObservations() + 1);   
                exist = true;
                break;
            }
        }
        return exist;
    }
    
    public void printBirds(){
        for (Bird bird : birdsList) {
            System.out.println(bird);
        }
    }
    
    public void printSingleBird(String name){
        for (Bird bird : birdsList) {
            if(bird.getEnglishName().equals(name)){
                System.out.println(bird);
            }
        }
    }
    
    
}
