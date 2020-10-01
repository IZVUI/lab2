package Product;

public class Food extends Product {
    private double calories,fats,proteins,carbonates;



    //getters and setters
    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getCarbonates() {
        return carbonates;
    }

    public void setCarbonates(double carbonates) {
        this.carbonates = carbonates;
    }

    @Override
    public String toString() {
        return super.toString()+
                "calories=" + calories +
                ", fats=" + fats +
                ", proteins=" + proteins +
                ", carbonates=" + carbonates
                ;
    }
}
