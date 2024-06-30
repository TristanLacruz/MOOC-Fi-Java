/**
 *
 * @author trist
 */
public class Cube {

    private int edgeLength;
    private int volume;
    
    public Cube(int edgeLength){
        this.edgeLength = edgeLength; 
    }
    
    public int getEdgeLength(){
        return edgeLength;
    }
    
    public int volume(){
        return (int)(Math.pow(edgeLength, 3));
    }
    
    @Override
    public String toString(){
        return "The length of the edge is " + edgeLength + " and the volume is " + volume();
    }
}