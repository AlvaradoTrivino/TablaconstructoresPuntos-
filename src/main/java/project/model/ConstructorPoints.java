package project.model;

public class ConstructorPoints {

    private String constructorName;
    private float points;

    public ConstructorPoints(String constructorName, float points) {
        this.constructorName = constructorName;
        this.points = points;
    }

    public String getConstructorName() {
        return constructorName;
    }

    public void setConstructorName(String constructorName) {
        this.constructorName = constructorName;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }
}