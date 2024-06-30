public class Statistics {

    private int count;
    private int sum;
    
    public Statistics(){
        this.count = count;
        this.sum = sum;
    }
    
    public void addNumber(int number){
        this.sum += number;
        this.count++;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        if(this.count == 0){
            return 0;
        }else{
            return 1.0*this.sum/this.count;
        }
    }
    
    public void oddSum(int number){
        if((number%2)!=0){
            
        }
    }
}
