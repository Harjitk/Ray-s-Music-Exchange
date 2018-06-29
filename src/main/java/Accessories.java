public abstract class Accessories{

String description;
 int buyPrice;
int sellPrice;

    public Accessories(String description,int buyPrice, int sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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

}

//
//  Create classes for items the shop may sell, i.e. which implement the ISell interface.
// Such items should have the following:
//  a type/description e.g. guitar, drum sticks, guitar strings, sheet music etc.
//  a price at which the shop bought the item.
//  a price at which the shop plans to sell the item.
// Some ISell items will be musical instruments i.e. instruments can be both IPlay and ISell.