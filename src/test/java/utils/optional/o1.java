package utils.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * 创建 Optional 对象
 */
public class o1 {


    /**
     * 创建一个空的 Optional 对象
     */
    @Test
    public void empty() {
        Optional<Car> optCar = Optional.empty();

        System.out.println(optCar);
    }

    /**
     * 依据一个非空值创建 Optional
     */
    @Test
    public void opt() {
        Car car = new Car();

        // 如果 car 为 null, 该行代码为抛出 NullPointerException
        Optional<Car> optCar = Optional.of(car);
    }

    /**
     * 可接受 null 的 Optional
     */
    @Test
    public void opt2() {
        Car car = null;

        // 如果 car 是 null，那么等到的 Optional 对象就是个空对象
        Optional<Car> optCar = Optional.ofNullable(car);
    }
}
