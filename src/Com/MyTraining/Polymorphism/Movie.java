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

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark movie!";
    }
}

class Alien extends Movie{
    public Alien(){
        super("Alien");
    }

    @Override
    public String plot() {
        return "Aliens on a cargo ship!";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens try to take over the world!";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over universe!";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable");
    }

    @Override
    public String plot() {
        return super.plot();
    }
}



