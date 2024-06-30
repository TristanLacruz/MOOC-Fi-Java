public class PaymentCard {

  private double balance;
  
  public PaymentCard(double openingBalance){
    this.balance = openingBalance;
  }
  
  public void eatAffordably(){
    if(balance >= 2.60){
      this.balance -= 2.60;
    }
  }
  
  public void eatHeartily(){
    if(balance >= 4.60){
      this.balance -= 4.60;
    }
  }
  
  public void addMoney(double givenMoney){
    if(givenMoney < 0){
      return;
    }
    if((this.balance + givenMoney) < 150){
      this.balance += givenMoney;
    }else{
      this.balance = 150;
    }
  }
  
  @Override
  public String toString(){
    return "The card has a balance of "+balance+" euros";
  }
}
