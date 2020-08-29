package Com.MyTraining.Abstract;

public class Main {
    public static void main(String[] args) {
        GermanShepherd dog = new GermanShepherd("Black coating with baige spots.");

        System.out.println(dog.getLegs());
        System.out.println(dog);

        GermanShepherd dogo = new GermanShepherd("Black and blue");
        dogo.setDescription("A jumpy and happy german shepherd");
        System.out.println(dogo.getHead());




        System.out.println(dogo);

        Leven leven = Leven.MEDIUM;

        System.out.println(leven);
    }
}

enum Leven{
    LOW,
    MEDIUM,
    HIGH
}
