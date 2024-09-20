public class CarrotPlant extends Plant {
    private int waterLevel;

    public CarrotPlant() {
        super("Carrot", 5);
        this.waterLevel = 0;
    }

    @Override
    public void water() {
        waterLevel++;
        System.out.println(name + " has been watered. Water level: " + waterLevel);
    }

    @Override
    public void grow() {
        if (waterLevel >= growthTime) {
            setHarvestable(true);
            System.out.println(name + " is ready to harvest.");
        } else {
            System.out.println(name + " is growing.");
        }
    }

    @Override
    public void harvest() {
        if (isHarvestable()) {
            System.out.println(name + " has been harvested.");
            setHarvestable(false);
            waterLevel = 0;  // Reset water level after harvesting
        } else {
            System.out.println(name + " is not ready to harvest.");
        }
    }
}