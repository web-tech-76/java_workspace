package basics.generics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class NumberOpClass <N extends Number>{

    N value;

    NumberOpClass (N val){
        this.value = val;
    }

    public void doSomething(N num){
        System.out.println("number passed as param " + num);
    }
}
