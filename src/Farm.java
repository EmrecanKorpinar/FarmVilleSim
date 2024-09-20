
import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Plant> plants;

    public Farm() {
        plants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void simulateDay() {
        for (Plant plant : plants) {
            plant.water();
            plant.grow();
            plant.harvest();
            System.out.println();
        }
    }
}