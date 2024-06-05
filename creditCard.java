package s210316033;
import java.util.Scanner;
public class creditCard {
    private String cardNumber;
    private String cardUser;
    private String secCode;
    private String expirationDate;
   
    public String getCardNumber(){
        return cardNumber;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public String getCardUser(){
        return cardUser;
    }
    public void setCardUser(String cardUser){
        this.cardUser = cardUser;
    }
    public String getSecCode(){
        return secCode;
    }
    public void setCode(String secCode){
        this.secCode = secCode;
    }
    public String getExpirationDate(){
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate){
        this.expirationDate = expirationDate;
    }
    public creditCard(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please write your credit card number");
    setCardNumber(sc.nextLine());
    System.out.println("Please write your card user");
    setCardUser(sc.nextLine());
    System.out.println("Please write your security code");
    setCode(sc.nextLine());
    System.out.println("Please write your expirationDate");
    setExpirationDate(sc.nextLine());
    }
    
}
