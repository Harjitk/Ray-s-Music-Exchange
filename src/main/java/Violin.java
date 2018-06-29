public class Violin extends Instruments implements IPlay{

    private int numberOfStrings;


    public Violin(String colour, String type, String material, int numberOfStrings) {
        super(colour, type, material);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Violin is playing";
    }
}