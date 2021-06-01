public class EjemploAutomovilEnum {
    public static void main(String[] args) {


        Automovil auto = new Automovil("ferrari", "hfhr");
        auto.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        auto.setEstanque(new Estanque());
        auto.setColor(Color.AMARILLO);
        auto.setTipo(TipoAutomovil.CHEVROLET);

        Motor motorAuto1 = new Motor(3.0, TipoMotor.BENCINA);
        Automovil auto1 = new Automovil("mazda", "hdhe", Color.AZUL);
        auto1.setEstanque(new Estanque(50));
        auto1.setTipo(TipoAutomovil.COOPER);


        TipoAutomovil tipo = auto1.getTipo();
        System.out.println("el auto tiene " + tipo.getNumeroPuertas() + " puertas");
        tipo = auto.getTipo();

        switch (tipo){
            case AUDI ->
                System.out.println("es un auto perfecto para viajar");

            case COOPER ->
                System.out.println("es un auto incomodo pero bonito");

            case FURGON ->
                System.out.println("es un auto grande y pesado");

            case TOYOTA ->
                System.out.println("es camioneta perfecta");

            case CHEVROLET ->
                System.out.println("es un auto chevrolet");

            case MAZDA ->
                System.out.println("es un auto deportivo");

            default ->
                System.out.println("no exite auto");

        }
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos){
            System.out.print(ta + " => "+ ta.name()+ " "+
                    ta.getNombre()+ " "+
                    ta.getDescripcion()+ " "+
                    ta.getNumeroPuertas());
            System.out.println();
        }




    }
}
