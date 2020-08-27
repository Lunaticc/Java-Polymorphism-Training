package Com.MyTraining.Abstract;

public class GermanShepherd extends Dog{
    private String coating;
    private String description;

    public GermanShepherd(String coating) {
        super("German Shepherd", 4, 1, 2, 1);
        this.coating = coating;
    }

    public String getCoating() {
        return coating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "GermanShepherd{" +
                "coating='" + coating + '\'' +
                ", description='" + description + '\'' +
                superGet() + '}';
    }//Legs tail eyes head

    private String superGet(){
        return ", legs='" + super.getLegs() + '\'' +
                ", tail='" + super.getTail() + '\'' +
                ", eyes='" + super.getEyes() + '\'' +
                ", head='" + super.getHead();
    }
}
