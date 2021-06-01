public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil auto = new Automovil("ferrari", "hfhr");
        auto.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        auto.setEstanque(new Estanque());
        auto.setColor(Color.AMARILLO);
        auto.setTipo(TipoAutomovil.CHEVROLET);

        Automovil auto1 = new Automovil("mazda", "hdhe", Color.AZUL, new Motor(3.0, TipoMotor.BENCINA));
        //,new Estanque(50));
        auto1.setTipo(TipoAutomovil.AUDI);

        Automovil auto2 = new Automovil("toyota", "4uhf", Color.CAFE, new Motor(4.0, TipoMotor.DIESEL),
                new Estanque(60));
        auto2.setTipo(TipoAutomovil.COOPER);

        Automovil auto3 = new Automovil("toyota", "4uhf", Color.CAFE, new Motor(5.0, TipoMotor.BENCINA),
                new Estanque(70));
        auto3.setColor(Color.AZUL);
        auto3.setTipo(TipoAutomovil.TOYOTA);
        Automovil.setColorPatente(Color.NARANJA);

        Automovil auto4 = new Automovil();

        Automovil.setColorPatente(Color.NARANJA);
        Automovil.setCapacidadEstanqueEstatico(50);


        System.out.println(auto.detalle());
        System.out.println(auto1.detalle());
        System.out.println(auto2.detalle());
        System.out.println(auto3.detalle());
        System.out.println("automovil color patente "+ Automovil.getColorPatente());
        System.out.println("km por litros "+ Automovil.calcularConsumoEstatico(300, 500));
        System.out.println("velocidad carretera "+ Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("velocidad ciudad "+ Automovil.VELOCIDAD_MAXIMA_CIUDAD);
        System.out.println(auto1.calcularConsumo(50,20f));



    }
}
