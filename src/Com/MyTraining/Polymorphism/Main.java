package Com.MyTraining.Polymorphism;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" +(i+1)+
                    " : " + movie.getName() + "\nPlot: " +
                    movie.plot() + "\n");
        }



    }

    public static Movie randomMovie(){
        int i = (int) (Math.random()*5)+1;
        System.out.println("Random number was: " + i);

        switch (i){
            case 1:
                return new Jaws();
            case 2:
                return new Alien();
            case 3:
                return new IndependenceDay();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();

        }


        return null;
    }
}
