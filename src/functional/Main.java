package functional;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Widget widget1 = new Widget("rojo", 15);
        Widget widget2 = new Widget("rojo", 20);
        Widget widget3 = new Widget("amarillo", 34);

        List<Widget> widgets = Arrays.asList(widget1, widget2, widget3);

        OperationFor operationFor = new OperationFor();
        OperationFunctional operationFunctional = new OperationFunctional();

        System.out.println("Operacion con java normal (for) " + operationFor.sum(widgets));
        System.out.println("Operacion con java funcional " + operationFunctional.sum(widgets));


    }

}
