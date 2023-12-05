package basics.optionals;

import basics.models.Emp;

import java.util.Date;
import java.util.stream.Stream;

public class OptionalEx {

    public Stream<Emp> empList() {
        Emp emp = new Emp();
        return Stream.of(emp.builder().id(100).name("name").doj(new Date("2022-11-11")).salary(2000.23).build());

    }

}
