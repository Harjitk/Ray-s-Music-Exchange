public abstract class Instruments {

    String colour;
    String type;
    String material;

    public Instruments(String colour, String type, String material) {
        this.colour = colour;
        this.type = type;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }
}



//
//
//    Create an Instrument superclass which contains attributes you see as being common to all instruments
// e.g. material it is made from, colour, type (Brass, String, Woodwind, Keyboard etc).
//  The classes created in step 2 above can then inherit from this Instruments class.