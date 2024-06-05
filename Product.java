package s210316033;
public class Product {
    private String category;
    private String name;
    private String color;
    private int stock;
    private double weight;
    private String desc;
    public Product(String category, String name, String color, int stock,
            double weight, String desc){
    super();
    setCategory(category);
    setColor(color);
    setDesc(desc);
    setName(name);
    setStock(stock);
    setWeight(weight);
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
        @Override
    public String toString() {
            return String.format("Category: %s%nName: %s%nColor: %s%nWeight: "
                    + "%.2f%nDescription: %s%nStock: %d%n",
                     this.getCategory(), this.getName(), this.getColor(),
                     this.getWeight(), this.getDesc(), this.getStock());
    }
    public static boolean stockControl(Product pro, int num){
    if (pro.stock >= num){
        pro.stock = pro.stock - num;
        return true;
    }
    else{
        System.out.println("Not enough products in stock");
        return false;
    }
    }
}