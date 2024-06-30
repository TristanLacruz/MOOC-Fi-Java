public class Debt {

    private double balance;
    private double interesRate;
    
    public Debt(double initialBalance, double initialInteresRate){
        this.balance = initialBalance;
        this.interesRate = initialInteresRate;
    }
    
    public void printBalance(){
        System.out.println(this.balance);
    }
    
    public void waitOneYear(){
        this.balance *= this.interesRate;
    }
}
