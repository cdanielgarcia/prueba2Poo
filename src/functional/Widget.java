package functional;

public class Widget {
    private String color;
    private int weight;

    public Widget(String color, int weight) {
        this.color=color;
        this.weight=weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Widget{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
