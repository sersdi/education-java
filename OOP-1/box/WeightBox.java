package box;

public class WeightBox extends Box {
    protected double weight;

    public WeightBox() {
        this.weight = 10;
    }

    public WeightBox(double length, double wight, double height, double weight) {
        super(length, wight, height);
        this.weight = weight;
    }

    public WeightBox(Box another, double weight) {
        super(another);
        this.weight = weight;
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight);
    }
}
