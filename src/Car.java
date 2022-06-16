import java.util.Objects;

public class Car  {

    public String model;
    boolean airConition;

    public boolean isAirConition() {
        return airConition;
    }

    public void setAirConition(boolean airConition) {
        this.airConition = airConition;
    }

    public Car(String model, boolean airConition){
        this.model = model;
        this.airConition = airConition;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), airConition);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", airConition=" + airConition +
                '}';
    }
}
