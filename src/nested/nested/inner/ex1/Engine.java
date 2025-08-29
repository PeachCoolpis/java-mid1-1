package nested.nested.inner.ex1;

public class Engine {
    
    
    private Car car;
    
    public Engine(Car car) {
        this.car = car;
    }
    
    public void start() {
        System.out.println("충전 레벨 확인 : "  + this.car.getChargeLevel());
        System.out.println(this.car.getModel() + "의 엔진을 구동합니다.");
    }
    
    private class Car {
        private String model;
        private int chargeLevel;
        
        public Car(String model, int chargeLevel) {
            this.model = model;
            this.chargeLevel = chargeLevel;
        }
        
        public String getModel() {
            return model;
        }
        
        public void setModel(String model) {
            this.model = model;
        }
        
        public int getChargeLevel() {
            return chargeLevel;
        }
        
        public void setChargeLevel(int chargeLevel) {
            this.chargeLevel = chargeLevel;
        }
    }
}
