package modules;

public class Item {
    private String discount;
    private String originPrice;
    private String newPrice;

    public Item(String discount, String originPrice, String newPrice) {
        this.discount = discount;
        this.originPrice = originPrice;
        this.newPrice = newPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public String getOriginPrice() {
        return originPrice;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setOriginPrice(String originPrice) {
        this.originPrice = originPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }
}
