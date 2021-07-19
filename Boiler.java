public class Boiler extends Kettle{
    private float temperature;
    public Boiler(float v, String model, float temperature) {
        super(v, model);
        this.temperature = temperature;
    }
    public void setTemperature(float temperature) {
        if (temperature<0 || temperature>100) {
            this.temperature = 90f;
        }
        else {
            this.temperature = temperature;
        }
    }
    public  void getTemperature() {
        System.out.println(temperature);
    }
    @Override
    public Boolean chekEnable() {
        System.out.println("Always enable");
        return null;
    }
}
