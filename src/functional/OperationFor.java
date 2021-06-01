package functional;

import java.util.List;

public class OperationFor {
    public int sum(List<Widget> widgets) {
        int sum = 0;
        for (Widget widget : widgets) {
            int valueWeight = 0;
            if (widget.getColor() == "rojo") {
                valueWeight = widget.getWeight();
            }
            sum += valueWeight;
        }
        return sum;
    }
}
