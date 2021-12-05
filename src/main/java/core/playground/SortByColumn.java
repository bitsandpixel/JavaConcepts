package core.playground;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class SortByColumn {
    public static void main(String[] args) throws IOException {
        /*
         * Sorting by a particular column
         */
        SortedMap<Integer, List<String>> lines = Files.readAllLines(Paths.get("ListOfNames.csv"))
                .stream().skip(1).distinct().collect(Collectors.groupingBy(
                        list -> Integer.valueOf(list.split(",", 3)[2]),
                        TreeMap::new, Collectors.toList()));

        for (Map.Entry<Integer, List<String>> entry : lines.entrySet()) {
            System.out.println(entry.getValue());
        }

        /*Sorting in natural order*/

        /*List<String> lines = Files.readAllLines(Paths.get("ListOfNames.csv"));
        lines = lines.stream().skip(1)
                .distinct()
                .collect(Collectors.toList());
        lines.forEach(line -> Arrays.stream(line.split(",")).sorted(Comparator.naturalOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println));*/
    }
}

