public class RightTriangle {
 double sideA;
 double sideB;
 double sideC;
 public RightTriangle(double sideA, double sideB){
     this.sideA = sideA;
     this.sideB = sideB;
     this.sideC = Math.sqrt(sideA * sideA + sideB * sideB);
 }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
    public double getPerimetre(){
     return sideA + sideB + sideC;
    }
    public boolean isRightTriangle(){
     return sideC * sideC == sideA * sideA + sideB * sideB;
    }

    public static void main(String[] args) {
        RightTriangle triangle = new RightTriangle(3,4);
        System.out.println("Side A = " + triangle.getSideA());
        System.out.println("Side B = " + triangle.getSideB());
        System.out.println("Side C = " + triangle.getSideC());

        System.out.println("Perimetre = " + triangle.getPerimetre());
        System.out.println("Is Right Triangle ? = " + triangle.isRightTriangle());
    }
}