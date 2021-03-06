package factory_method.product;

import factory_method.product.part.Engine;
import factory_method.product.part.Tire;

public abstract class Vehicle {
    protected String name;
    protected Engine engine;
    protected Tire tire;

    public void assembly() {
        System.out.println(engine + " 엔진을 장착");
        System.out.println(tire + " 타이어를 장착");
    }

    public void loadShip() {
        System.out.println("배에 선적");
    }

    public Engine getEngine() {
        return engine;
    }

    public Tire getTire() {
        return tire;
    }

    public String getName() {
        return name;
    }
}
