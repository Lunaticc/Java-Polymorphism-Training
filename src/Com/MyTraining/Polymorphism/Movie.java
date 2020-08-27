package Com.MyTraining.Polymorphism;

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }

}


class Titanic extends Movie{

    public Titanic(String name) {
        super(name);
    }

    @Override
    public String plot() {
        return "A movie about a ship with a tragic end!";
    }

    @Override
    public String getName() {
        return super.getName();
    }

}

class Alien extends Movie{
    public Alien(String name) {
        super(name);
    }

    @Override
    public String plot() {
        return "A movie about a cargoship in space finding an alien egg and a bunch of bad luck";
    }

}

class Grease extends Movie{
    public Grease(){
        super("Grease");
    }

    @Override
    public String plot() {
        return "A movie about singing and dancing!";
    }
}

