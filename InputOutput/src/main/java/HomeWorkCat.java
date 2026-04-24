import java.io.Serializable;

public class HomeWorkCat implements Serializable {
    private String clichka;
    private String poroda;
    private double weight;

    public HomeWorkCat(String clichka, String poroda, double weight) {
        this.clichka = clichka;
        this.poroda = poroda;
        this.weight = weight;
    }

    public String getClichka() {
        return clichka;
    }

    public void setClichka(String clichka) {
        this.clichka = clichka;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HomeWorkCat{" +
                "clichka='" + clichka + '\'' +
                ", poroda='" + poroda + '\'' +
                ", weight=" + weight +
                '}';
    }
}
