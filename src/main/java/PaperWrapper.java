public class PaperWrapper extends BouquetDecorator {

    public PaperWrapper(Bouquet bouquet) {
        this.bouquet = bouquet;
        this.description = ", paper wrapper";
        this.price = 12.0;
    }

    @Override
    public String getDescription() {
        return bouquet.getDescription() + this.description;
    }

    @Override
    public double getPrice() {
        return bouquet.getPrice() + price;
    }
}
