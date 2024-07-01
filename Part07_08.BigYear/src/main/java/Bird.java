
/**
 *
 * @author trist
 */
public class Bird {
    
    private String englishName;
    private String latinName;
    private int observations;

    public Bird(String englishName, String latinName) {
        this.englishName = englishName;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }
    
    @Override
    public String toString(){
        return this.englishName + " (" + this.latinName + "): " + this.observations + " observations";
    }
}
