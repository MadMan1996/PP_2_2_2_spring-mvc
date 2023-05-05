package web.models;

public class Car {
    String model;
    int series;
    double engineVolume;
    String color;

    public Car(String model, int series, double engineVolume, String color) {
        this.model = model;
        this.series = series;
        this.engineVolume = engineVolume;
        this.color = color;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
