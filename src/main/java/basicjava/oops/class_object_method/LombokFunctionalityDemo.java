package basicjava.oops.class_object_method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Vishnu Kandanelly
 */
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Data
public class LombokFunctionalityDemo {

    private int number;
    private String name;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Element {
    private int number;
    private Element next;
}

@Slf4j
class Random {
    public static void main(String[] args) {
        LombokFunctionalityDemo empty = new LombokFunctionalityDemo();
        LombokFunctionalityDemo oneArg = new LombokFunctionalityDemo(1, "one");
        log.info(empty.toString());
        log.info(oneArg.toString());
    }
}
