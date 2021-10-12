package myjava.playground;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sequence {
    private static Object sorting;

    public static void main(String[] args) throws IOException {

        String filePath = Paths.get("ListOfNames.csv").toString();
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            lines.skip(1).map(line ->
                    Arrays.asList(line.split(","))).collect(Collectors.toList())
                    .stream().sorted().collect(Collectors.toList())
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

