public class Cello extends Instruments implements IPlay {

    private int size;

    public Cello(String colour, String type, String material, int size) {
        super(colour, type, material);
        this.size = size;

    }


    public int getSize() {
        return size;
    }

    public String play() {
        return "Cello is playing";
    }

}

