public class ElectricCar extends ACar {

    int getBatteryCapacityKWh;
    int getMaxRangeKm;

    int getWhPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int getBatteryCapacityKWh, int getMaxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.getBatteryCapacityKWh = getBatteryCapacityKWh;
        this.getMaxRangeKm = getMaxRangeKm;
        this.getWhPrKm = getBatteryCapacityKWh*1000 / getMaxRangeKm;
    }



    public int getBatteryCapacityKWh() {
        return getBatteryCapacityKWh;
    }

    public int getMaxRangeKm() {
        return getMaxRangeKm;
    }

    public int getWhPrKm() {
        return getWhPrKm;
    }


    @Override
    public int getRegistrationFee() {
        return 0;
    }

    @Override
    public String toString() {
        return "ElectricCar{ " +
                " getBatteryCapacityKWh= " + getBatteryCapacityKWh +
                ", getMaxRangeKm= " + getMaxRangeKm +
                ", getWhPrKm= " + getWhPrKm + super.toString() +
                '}';
    }
}