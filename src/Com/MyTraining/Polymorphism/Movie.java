package Com.MyTraining.Polymorphism;

public class Movie {
    private String name;
    private double length;

    public Movie(String name, double length) {
        this.name = name;
        this.length = length;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }
}


class Titanic extends Movie{

    public Titanic(String name, double length) {
        super(name, length);
    }

    @Override
    public String plot() {
        return "A movie about a ship with a tragic end!";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getLength() {
        return super.getLength();
    }
}

class Alien extends Movie{
    public Alien(String name, double length) {
        super(name, length);
    }

    @Override
    public String plot() {
        return "A movie about a cargoship in space finding an alien egg and a bunch of bad luck";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getLength() {
        return super.getLength();
    }
}

class Greace extends Movie{
    public Greace(String name, double length) {
        super(name, length);
    }

    @Override
    public String plot() {
        return "A movie about dancing people in a very awkward realtionship";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getLength() {
        return super.getLength();
    }
}

