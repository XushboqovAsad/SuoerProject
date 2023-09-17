public class CarProject {
    String color;
    String model;
    int price;
    String type;

    public CarProject(String color, String model, int price, String type){
        this.color = color;
        this.model = model;
        this.price = price;
        this.type = type;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }
    public String getType(){
        return type;
    }
    public static void main(String[] args) {
        CarProject car = new CarProject("Black","Mercedes",250000,"Automathic");
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        System.out.println(car.getType());
    }
}
