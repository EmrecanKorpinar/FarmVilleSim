public abstract class Plant implements IPlantActions {
    protected String name;
    protected int growthTime;
    protected boolean isHarvestable;

    public Plant(String name, int growthTime) {
        this.name = name;
        this.growthTime = growthTime;
        this.isHarvestable = false;
    }

    public boolean isHarvestable() {
        return isHarvestable;
    }

    public void setHarvestable(boolean isHarvestable) {
        this.isHarvestable = isHarvestable;
    }

    public int getGrowthTime() {
        return growthTime;
    }

    public void setGrowthTime(int growthTime) {

        this.growthTime = growthTime;
    }

    public String getName() {
        return name;
    }

    public abstract void grow();
}