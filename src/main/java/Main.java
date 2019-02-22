public class Main {
    public static void main(String[] args) {

        Bouquet decoratedRoseBouquet = new RoseBouquet();

        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new Glitters(decoratedRoseBouquet);

        System.out.println(decoratedRoseBouquet.getDescription() + " " +
                decoratedRoseBouquet.getPrice());

    }
}
