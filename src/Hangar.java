public class Hangar {
    public static void main(String[] args) {
        Car voitureDeRobin = new Car("Dacia");
        System.out.println(voitureDeRobin.doStuff());
        Boat bateauDeRobin = new Boat("Bateau");
        System.out.println(bateauDeRobin.doStuff());
    }
}
