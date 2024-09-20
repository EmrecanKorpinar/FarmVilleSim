public class FarmVille {
    public static void main(String[] args) {
        Farm farm = new Farm();

        TomatoPlant tomatoPlant = new TomatoPlant();
        CarrotPlant carrotPlant = new CarrotPlant();

        farm.addPlant(tomatoPlant);
        farm.addPlant(carrotPlant);

        for (int day = 1; day <= 3; day++) {
            System.out.println("Day " + day + ":");
            farm.simulateDay();
        }
    }
}