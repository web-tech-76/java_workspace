package basics.models;

import java.time.LocalDate;

import static java.lang.StringTemplate.RAW;
import static java.util.FormatProcessor.FMT;

public class EmpBuilder {


    public static void main(String[] args) {


        var emp = Emp.builder().
                id(100)
                .name("")
                .doj(LocalDate.of(2023, 11, 12))
                .salary(1000.00)
                .build();

        String str = FMT.
                """
                     {
                        "doj": "%1s\{emp.getDoj()}",
                        "salary": "%2.2f\{emp.getSalary()}",
                     }
                        """;
        System.out.println(str);

        StringTemplate str1 = RAW." Employee doj \{emp.getDoj()} and salary is \{emp.getSalary()} ";
        System.out.println(STR.process(str1));

    }
}
