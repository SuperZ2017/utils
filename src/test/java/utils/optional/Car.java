package utils.optional;

import java.util.Optional;

public class Car {

    // 汽车可能进行了保险，也可以没有保险，所有可以声明为 Optional
    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}
