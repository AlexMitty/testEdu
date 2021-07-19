public class Kettle extends CookingMachine {
    private float v;
    public String model;
    private Boolean isEnable = false;
    public Kettle(float v, String model) {
        this.v = v;
        this.model = model;
    }
        public Boolean chekEnable() {
            return isEnable;
        }
        public void toggleEnable() {
            isEnable = !isEnable;
            if (isEnable) {
                boilWater();
            }
        }

    @Override
    public void boilWater() {
        System.out.println("бр-бр-бр");
    }
}
