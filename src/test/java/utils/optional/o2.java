package utils.optional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class o2 {


    @Test
    public void opt1() {
        Insurance insurance = new Insurance();

        Optional<Insurance> optionalInsurance = Optional.ofNullable(insurance);
        Optional<String> name = optionalInsurance.map(Insurance::getName);

        if (name.isPresent()) {
            System.out.println(name.get());
        }
    }


    @Test
    public void opt2() {

    }

//    public String getCarInsuranceName(Person person) {
//        return person.getCar().getInsurance().getName();
//    }

    /**
     * 使用 flatMap 链接 Optional 对象
     */
    public String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                     .flatMap(Car::getInsurance)
                     .map(Insurance::getName)
                     .orElse("Unknown");   // 如果Optional的结果值为空，设置默认值
    }


    /**
     * 找到 person 列表所使用的保险公司名称(不含重复项)
     */
    public Set<String> getCarInsuranceNames(List<Person> persons) {
        return persons.stream()
                      .map(Person::getCar)
                      .map(optCar -> optCar.flatMap(Car::getInsurance)) // 对每个 Optional<Car> 执行 flatMap 操作，将其转换成对应的 Optional<Insurance> 对象
                      .map(optIns -> optIns.map(Insurance::getName))    // 将每个 Optional<Insurance> 映射成包含对应保险公司名字的 Optional<String>
                      .flatMap(Optional::stream)    // 将 Stream<Optional<String>> 转换为 Stream<String> 对象，只保留流中那些存在保险公司名的对象
                      .collect(Collectors.toSet());
    }

}
