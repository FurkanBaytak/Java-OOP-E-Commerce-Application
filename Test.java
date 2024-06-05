package s210316033;
import java.util.*;
public class Test {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    User us = new User();
    creditCard CD = new creditCard();
    ArrayList<Product> favorites = new ArrayList<>();
    ArrayList<String> orders = new ArrayList<>();
    ArrayList<Product> electronics = new ArrayList<>();
    ArrayList<Product> fashions = new ArrayList<>();
    ArrayList<Product> cosmetics = new ArrayList<>();
    ArrayList<Product> stationary = new ArrayList<>();
    ArrayList<String> colors = new ArrayList<>();
    Random random = new Random();
    colors.add("Black");
    colors.add("White");
    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("Grey");
    int randomIndex = random.nextInt(colors.size());
    electronics.add(new Product("Electronic", "Phone", colors.get(randomIndex), 
            (int) (Math.random() * 101), Math.random(), "Android"));
    
    randomIndex = random.nextInt(colors.size());
    
    electronics.add(new Product("Electronic", "Tablet", colors.get(randomIndex),
            (int) (Math.random() * 101), Math.random(), "İos"));
    
    randomIndex = random.nextInt(colors.size());
    electronics.add(new Product("Electronic", "Laptop", colors.get(randomIndex),
            (int) (Math.random() * 101), Math.random(), "FreeDos"));
    
    randomIndex = random.nextInt(colors.size());
    fashions.add(new Product("Fashion", "Skirt", colors.get(randomIndex), (int) 
            (Math.random() * 101), Math.random(), "Long slit skirt"));
    
    randomIndex = random.nextInt(colors.size());
    fashions.add(new Product("Fashion", "T-shirt", colors.get(randomIndex), (int
            ) (Math.random() * 101), Math.random(), "Anime printed "
                    + "oversize t-shirt"));
    
    randomIndex = random.nextInt(colors.size());
    fashions.add(new Product("Fashion", "Jacket", colors.get(randomIndex), (int)
            (Math.random() * 101), Math.random(), "Vintage with pockets"));
    
    randomIndex = random.nextInt(colors.size());
    cosmetics.add(new Product("Cosmetic", "Lipstick", colors.get(randomIndex), (
            int) (Math.random() * 101), Math.random(), "Mat"));
    
    randomIndex = random.nextInt(colors.size());
    cosmetics.add(new Product("Cosmetic", "Eyeshadow", "Rainbow", (int) 
            (Math.random() * 101), Math.random(), "Silvery"));
    
    cosmetics.add(new Product("Cosmetic", "Eyeliner", colors.get(randomIndex),
            (int) (Math.random() * 101), Math.random(), "All day eyeliner"));
    
    randomIndex = random.nextInt(colors.size());
    stationary.add(new Product("Stationary", "Pen", colors.get(randomIndex), 
            (int) (Math.random() * 101), Math.random(), "17-M" ));
    
    randomIndex = random.nextInt(colors.size());
    stationary.add(new Product("Stationary", "Notebook",colors.get(randomIndex),
            (int) (Math.random() * 101), Math.random(), "70 sheet notebook"));
    
    randomIndex = random.nextInt(colors.size());
    stationary.add(new Product("Stationary", "sharpener",colors.get(randomIndex)
            , (int) (Math.random() * 101), Math.random(), "Only sharpener"));
    while(!exit){
    System.out.printf("Please choose an action %n 1-Profile %n 2-Buy product %n "
            + "3-Orders%n 4-Favorites%n 0-Exit%n");
    int button = sc.nextInt();
    sc.nextLine();
    switch(button){
        case 1:
            User.profile(us);
            break;
        case 2:
            System.out.printf(" 1-Electronic%n 2-Fashion%n 3-Cosmetic%n"
                    + " 4-Stationary%n 0-Return menu%n");
            int select = sc.nextInt();
            sc.nextLine();
            switch(select){
                case 1:
                    showList(electronics);
                    System.out.println("Select the product");
                    int order = sc.nextInt();
                    Product pro = electronics.get(order);
                    System.out.println("press 1 to buy, press 2 to add to favorite");
                    int n = sc.nextInt();
                    if(n==1){
                        sc.nextLine();
                        System.out.println("How many");
                        int num = sc.nextInt();
                        sc.nextLine();
                        boolean flag = Product.stockControl(pro, num);
                        if (flag){
                        Order or = new Order(us.getName(),us.getSurname(),pro.getName(),
                                CD.getCardNumber(),us.getHome());
                        orders.add(Order.showOrder(or));
                        }
                        break;
                    }
                    
                    if(n==2){
                        favorites.add(pro);
                        break;
                    }
                case 2:
                    showList(fashions);
                    System.out.println("Select the product");
                    order = sc.nextInt();
                    pro = fashions.get(order);
                    System.out.println("press 1 to buy, press 2 to add to favorite");
                    n = sc.nextInt();
                    if (ifForCase(sc, us, CD, orders, pro, n)) break;
                    if(n==2){
                        favorites.add(pro);
                        break;
                    }
                    
                case 3:
                    showList(cosmetics);
                    System.out.println("Select the product");
                    order = sc.nextInt();
                    pro = cosmetics.get(order);
                    System.out.println("press 1 to buy, press 2 to add to favorite");
                    n = sc.nextInt();
                    if (ifForCase(sc, us, CD, orders, pro, n)) break;
                    if(n==2){
                        favorites.add(pro);
                        break;
                    }
                    
                case 4:
                    showList(stationary);
                    System.out.println("Select the product");
                    order = sc.nextInt();
                    pro = stationary.get(order);
                    System.out.println("press 1 to buy, press 2 to add to favorite");
                    n = sc.nextInt();
                    if (ifForCase(sc, us, CD, orders, pro, n)) break;
                    if(n==2){
                        favorites.add(pro);
                        break;
                    }
                    
                case 0:
                    break;   
            }
        case 3:
            for (String order : orders) {
                System.out.println(order);
            }
            break;
        case 4:
            for (Product favorite : favorites) {
                System.out.println(favorite);
            }
            break;
        case 0:
            exit = true;
            break;
            
    }   

    }
    }

    private static boolean ifForCase(Scanner sc, User us, creditCard CD, ArrayList<String> orders, Product pro, int n) {
        if(n==1){
            sc.nextLine();
            System.out.println("How many");
            int num = sc.nextInt();
            sc.nextLine();
            boolean flag = Product.stockControl(pro, num);
            if (flag){
            Order or = new Order(us.getName(),us.getSurname(),pro.getName(),
                    CD.getCardNumber(),us.getHome());
            orders.add(Order.showOrder(or));
            }
            return true;
        }
        return false;
    }

    private static void showList(ArrayList<Product> MyList) {
        for (int i = 0; i < MyList.size(); i++) {
            System.out.println(i + " -> " + MyList.get(i));
    }
    }
    }



    
            
    

