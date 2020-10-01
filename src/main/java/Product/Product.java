package Product;

public abstract class Product {
    //variables
    private int id;
    private double cost;
    private String name;
    private String description;
    private float rate;

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                ", cost='" + cost + '\'' +
                ", description='" + description + '\'' +
                ", rate=" + rate;
    }
}
