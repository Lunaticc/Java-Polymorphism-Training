package Com.MyTraining.Abstract;

public abstract class Dog extends Animal{
    private int legs;
    private int tail;
    private int eyes;
    private int head;

    public Dog(String name, int legs, int tail, int eyes, int head) {
        super(name);
        this.legs = legs;
        this.tail = tail;
        this.eyes = eyes;
        this.head = head;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getEyes() {
        return eyes;
    }

    public int getHead() {
        return head;
    }
}
