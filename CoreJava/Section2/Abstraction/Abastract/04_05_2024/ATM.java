// package 04_05_2024;
// public  abstract class ATM{
public  abstract class ATM{
    public static String name;
    public abstract void withdraw(double amount);
    public abstract void checkBalance();
    public abstract void deposit(double amount);
}
// public class HDFC extends ATM{
class HDFC extends ATM{
    int balance;
    public  static String name = "HDFC";
    public void withdraw(double amount){
        if(amount<balance){
            balance -= amount;
            System.out.println("Withdraw Succesful");
        }
        else{
            System.out.println("Withdraw unSuccessful");
        }
    }
    public void checkBalance(){
        System.out.println("Available Balance is " + balance);
    }
    public void deposit(double amount){
        balance += amount;
    }
}
// public class ICICI extends ATM{
class ICICI extends ATM{
    int balance;
    public  static String name = "ICICI";
    public void withdraw(double amount){
        if(amount<balance){
            balance -= amount;
            System.out.println("Withdraw Succesful");
        }
        else{
            System.out.println("Withdraw unSuccessful");
        }
    }
    public void checkBalance(){
        System.out.println("Available Balance is " + balance);
    }
    public void deposit(double amount){
        balance += amount;
    }
}
// public class SBI extends ATM{
class SBI extends ATM{
    int balance;
    public  static String name = "SBI";
    public void withdraw(double amount){
        if(amount<balance){
            balance -= amount;
            System.out.println("Withdraw Succesful");
        }
        else{
            System.out.println("Withdraw unSuccessful");
        }
    }
    public void checkBalance(){
        System.out.println("Available Balance is " + balance);
    }
    public void deposit(double amount){
        balance += amount;
    }
}