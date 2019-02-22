public class Glitters extends BouquetDecorator {

    public Glitters(Bouquet bouquet) {
        this.bouquet = bouquet;
        this.description = ", glitters";
        this.price = 7.0;
    }

    @Override
    public String getDescription() {
        return bouquet.getDescription() + this.description;
    }

    @Override
    public double getPrice() {
        return bouquet.getPrice() + this.price;
    }
}
