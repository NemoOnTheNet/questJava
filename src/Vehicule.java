public abstract class Vehicule {
    private String brand;
    private int kilometers;

    //constructor
    public Vehicule(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    // getters and setters
    public String getBrand(){
          return this.brand;
    }
    public int getKilometers(){
        return this.kilometers;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setKilometers(int kilometers){
        this.kilometers = kilometers;
    }

    // methode
    public abstract String doStuff();


}
