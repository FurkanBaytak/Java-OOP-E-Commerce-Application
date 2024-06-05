package s210316033;
import java.util.*;
public class User {
    private String ID;
    private String name;
    private String surname;
    private String date;
    private String password;
    private String email;
    private String home;
    private String work;
    private String order;
    private String favoriteProduct;
    private creditCard creditCart;
public String getID(){
    return ID;
   }
public void setID(String ID){
    this.ID = ID;
}
public String getName(){
    return name;
   }
public void setName(String name){
    this.name = name;
}
public String getSurname(){
    return surname;
}
public void setSurname(String surname){
    this.surname = surname;
}
public String getDate(){
    return date;
}
public void setDate(String date){
    this.date = date;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email = email;
}
public String getHome(){
    return home;
}
public void setHome(String home){
    this.home = home;
}
public String getWork(){
    return work;
}
public void setWork(String work){
    this.work = work;
}
public void favProduct(String product){
    this.favoriteProduct = product;
}
public User(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please write your ID");
    setID(sc.nextLine());
    System.out.println("Please write your name and surname (name surname)(if you"
            + " have 2 names please write one)");
    setName(sc.nextLine());
    setSurname(sc.nextLine());
    System.out.println("Please write your birthday date. (mm.dd.yy)");
    setDate(sc.nextLine());
    System.out.println("Please write your password.(at least 3 characters)");
    boolean flag = false;
    while(!flag){
    String pass = sc.nextLine();
    if (pass.length()>=3){this.password = pass;flag = true;}else{
        System.out.println("at least 3 characters");}}
        System.out.println("Please write your email");
        setEmail(sc.nextLine());
        System.out.println("Please write your home address");
        setHome(sc.nextLine());
        System.out.println("Please write your work address (you can leave it blank "
            + "if you want)");
        setWork(sc.nextLine());
        System.out.printf("Profile created%n");
}
public static void profile(User us){
Scanner sc = new Scanner(System.in);    
StringBuilder password = new StringBuilder();
for(int i=0; i<us.password.length(); i++){
    password.append("*");
        }
System.out.printf("ID: %s %nName Surname: %s %s %nBirthday date: %s%nPassword: "
        + "%s%nE-mail: %s%nHome Address: %s%nWork Address: %s%n", us.ID, us.name,
        us.surname, us.date, password,us.email,us.home,us.work);

    }

}

