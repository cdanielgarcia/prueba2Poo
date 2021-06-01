package functional;

import java.util.List;

public class OperationFunctional {
    public static int sum(List<Widget> widgets) {
        return widgets.stream()
                .filter(w -> w.getColor() == "rojo")
//                .peek(System.out::println)
                .mapToInt(w -> w.getWeight())
                .sum();
    }
}
