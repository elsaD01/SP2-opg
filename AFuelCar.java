abstract class AFuelCar extends ACar{

    private int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();


    public int kmPrLitre(){
        return kmPrLitre;

    }

    @Override
    public String toString() {
        return "AFuelCar{" +
                "kmPrLitre= " + kmPrLitre + super.toString() +
                "\n\n";
    }
}
