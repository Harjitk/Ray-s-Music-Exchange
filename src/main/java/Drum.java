public class Drum  extends Instruments implements IPlay{

    private String shape;

    public Drum(String colour, String type, String material, String shape) {
        super(colour, type, material);
        this.shape = shape;

    }

    public String getShape() {
        return shape;
    }

    public String play() {
        return "Drums are playing";
    }
}

//
// Create classes for different types of instruments e.g. guitars, pianos, etc. (any you can think of).
// Each class will have its own instance variables for attributes particular to that instrument
// e.g. a guitar may have a number of strings, a trumpet may have a number of valves etc.
