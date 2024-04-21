package OOPS;

public class Oops {
    public static class Students{
        String name ;
        int rollNo;
        double percentage;
    }
    public static class car{
        String name ;
        String type;
        int price;
    }

    public static void main(String[] args) {
        Students s1 = new Students(); // declaration
        s1.name = "Abhay";
        s1.rollNo = 32;
        s1.percentage = 90.8;

        Students s2 = new Students();
        s2.name = "Pranjal";
        s2.rollNo = 97;
        s2.percentage = 94.0;

        car c1 = new car();
        c1.name = "ALto";
        c1.type = "Suv";
        c1.price = 450000;


    }
}
