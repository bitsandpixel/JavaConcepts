package myjava.oops.class_object_method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Vishnu Kandanelly
 */
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Slf4j
@Data
public class LombokfunctionalityDemo {

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

class Random {
    public static void main(String[] args) {
        LombokfunctionalityDemo empty = new LombokfunctionalityDemo();
        LombokfunctionalityDemo oneArg = new LombokfunctionalityDemo(1, "one");
        empty.toString();
    }
}
