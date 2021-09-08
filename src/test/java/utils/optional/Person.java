package utils.optional;

import java.util.Optional;

public class Person {

    // 人可能有汽车，也可能没有汽车，因此可以声明为 Optional
    private Optional<Car> car;

    public Optional<Car> getCar() {
        return car;
    }
}

