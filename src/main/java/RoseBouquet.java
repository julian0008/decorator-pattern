public class RoseBouquet extends Bouquet {

    public RoseBouquet() {
        this.price = 150.0;
        this.description = "Rose Bouquet";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
