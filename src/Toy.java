import java.util.Comparator;

public class Toy {
    protected int toyID;
    protected String name;
    protected int frequency;
    protected int quantity;

    public Toy(int toyID, String name, int frequency){
        this.toyID = toyID;
        this.name = name;
        this.frequency = frequency;
    }

    public int getToyID(){
        return toyID;
    }

    public String getName(){
        return name;
    }

    public int getFrequency(){
        return frequency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "toyID=" + toyID +
                ", name='" + name + '\'' +
                ", frequency=" + frequency;
    }

    public static class freqCompare implements Comparator<Toy>{
        @Override
        public int compare(Toy t1, Toy t2) {
            if (t1.frequency == t2.frequency) {
                return 0;
            } else if (t1.frequency < t2.frequency) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
