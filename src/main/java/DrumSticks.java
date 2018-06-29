public class DrumSticks extends Accessories implements ISell {

    public DrumSticks(String description, int buyPrice, int sellPrice) {
        super(description, buyPrice, sellPrice);
    }
    public String getDescription() {
        return description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }


    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateProfit() {
        return sellPrice - buyPrice;
    }
}
