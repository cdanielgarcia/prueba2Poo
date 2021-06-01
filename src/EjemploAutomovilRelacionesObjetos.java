public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Rueda[] ruedaAuto = new Rueda[5];
        ruedaAuto[0] = new Rueda("Yokohama", 20, 3);
        ruedaAuto[1] = new Rueda("Yokohama", 20, 3);
        ruedaAuto[2] = new Rueda("Yokohama", 20, 3);
        ruedaAuto[3] = new Rueda("Yokohama", 20, 3);
        ruedaAuto[4] = new Rueda("Yokohama", 20, 3);
        Motor motorAuto = new Motor(2.0, TipoMotor.DIESEL);
        Persona conductorAuto = new Persona("juan", "pineda");
        Automovil auto = new Automovil("ferrari", "hfhr");
       // auto.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        auto.setEstanque(new Estanque());
        auto.setColor(Color.AMARILLO);
        auto.setTipo(TipoAutomovil.CHEVROLET);
        auto.setConductor(conductorAuto);
        auto.setRuedas(ruedaAuto);
        auto.setMotor(motorAuto);


        Rueda[] ruedaAuto1 = {new Rueda("Michelin", 18, 4.5),
                new Rueda("Michelin", 18, 4.5),
                new Rueda("Michelin", 18, 4.5),
                new Rueda("Michelin", 18, 4.5),
                new Rueda("Michelin", 18, 4.5),};
        Persona conductorAuto1 = new Persona("elon", "musk");
        Automovil auto1 = new Automovil("mazda", "hdhe", Color.AZUL, new Motor(3.0, TipoMotor.BENCINA)
                ,new Estanque(50));
        auto1.setTipo(TipoAutomovil.AUDI);
        auto1.setConductor(conductorAuto1);
        auto1.setRuedas(ruedaAuto1);


        Rueda[] ruedaAuto2 = {new Rueda("Scorpion", 19, 3.5),
                new Rueda("Scorpion", 19, 3.5),
                new Rueda("Scorpion", 19, 3.5),
                new Rueda("Scorpion", 19, 3.5),
                new Rueda("Scorpion", 19, 3.5),};
        Persona conductorAuto2 = new Persona("yeison", "mata");
        Automovil auto2 = new Automovil("toyota", "4uhf", Color.CAFE, new Motor(4.0, TipoMotor.DIESEL),
                new Estanque(60), conductorAuto2, ruedaAuto2);
        auto2.setTipo(TipoAutomovil.COOPER);

        Rueda[] ruedaAuto3 = new Rueda[5];
        ruedaAuto[0] = new Rueda("Yamaha", 15, 3.8);
        ruedaAuto[1] = new Rueda("Yamaha", 15, 3.8);
        ruedaAuto[2] = new Rueda("Yamaha", 15, 3.8);
        ruedaAuto[3] = new Rueda("Yamaha", 15, 3.8);
        ruedaAuto[4] = new Rueda("Yamaha", 15, 3.8);
        Persona conductorAuto3 = new Persona("carlos", "garcia");
        Automovil auto3 = new Automovil("toyota", "4uhf", Color.CAFE, new Motor(5.0, TipoMotor.BENCINA),
                new Estanque(70), conductorAuto3, ruedaAuto3);
        auto3.setColor(Color.AZUL);
        auto3.setTipo(TipoAutomovil.TOYOTA);
        Automovil.setColorPatente(Color.NARANJA);


        Automovil auto4 = new Automovil();

        System.out.println(auto.detalle());
//        System.out.println(auto1.detalle());
//        System.out.println(auto2.detalle());
//        System.out.println(auto3.detalle());
        /*System.out.println("conductor auto "+ auto.getConductor());
        for(Rueda r: auto.getRuedas()){
            System.out.println("fabricante "+ r.getFabricante() + "\naro " + r.getAro()
                    + "\nancho " + r.getAncho());
        }*/


    }
}
