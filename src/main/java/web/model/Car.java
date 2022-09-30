package web.model;

public class Car {
    private String modelCar;
    private String color;
    private Long winNumber;

    public Car(String modelCar) {
        this.modelCar = modelCar;
    }

    public Car(String modelCar, String color, Long winNumber) {
        this.modelCar = modelCar;
        this.color = color;
        this.winNumber = winNumber;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getWinNumber() {
        return winNumber;
    }

    public void setWinNumber(Long winNumber) {
        this.winNumber = winNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", color='" + color + '\'' +
                ", winNumber=" + winNumber +
                '}';
    }
}
