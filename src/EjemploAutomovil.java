import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {


        Motor motorAuto = new Motor(2.0, TipoMotor.DIESEL);
        Estanque estanqueAuto = new Estanque();
        Automovil auto = new Automovil("ferrari", "hfhr");
        auto.setMotor(motorAuto);
        auto.setEstanque(estanqueAuto);


        Motor motorAuto1 = new Motor(3.0, TipoMotor.BENCINA);
        Automovil auto1 = new Automovil("mazda", "hdhe", Color.VERDE, motorAuto1);
        auto1.setEstanque(new Estanque(50));


        Automovil auto2 = new Automovil("toyota", "4uhf", Color.ROJO, new Motor(4.0, TipoMotor.DIESEL),
                new Estanque(60));

        Automovil auto3 = new Automovil("tuolingo", "jfi", Color.CAFE,  new Motor(5.0, TipoMotor.BENCINA),
                new Estanque(70));


        Automovil auto5 = new Automovil();


 // se imprimia desde la clase
//        auto.detalle();
//        auto1.detalle();
// ahora se imprime desde el metodo main
        System.out.println(auto.detalle());
        System.out.println(auto1.detalle());
        System.out.println(auto2.detalle());
        System.out.println(auto3.detalle());
        System.out.println(auto1.acelerar(2500));
        System.out.println(auto1.frenar());
        System.out.println(auto.aceleraFrena(2000));
        System.out.println("kilometros se gastaron " + auto.calcularConsumo(300, 2.0f));
        System.out.println("kilometros en litros " + auto.calcularConsumo(300, 200));
        System.out.println("kilometros en litros double " + auto.calcularConsumo(300,200));


    }
}
