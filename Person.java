public class Person {
   double height;
   String skin;
   String sense;
   public Person(double height, String skin, String sense){
       this.height = height;
       this.skin = skin;
       this.sense = sense;
   }
public double getHeight(){
       return height;
}
public String getSkin(){
       return skin;
}
public String getSense(){
       return sense;
}
    public static void main(String[] args) {
        Person person = new Person(1.75, "Blonde", "Intelligence");
        System.out.println(person.getHeight());
        System.out.println(person.getSkin());
        System.out.println(person.getSense());

    }
}
