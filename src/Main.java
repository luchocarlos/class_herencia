public class Main {
    public static void main(String[] args) {

        Cliente Clientep = new Cliente();
        Trabajador Trabajadorp = new Trabajador();

        Clientep.edad=20;
        Clientep.telefono = "312 870 5645";
        Clientep.nombre = "Carlos";
        Clientep.credito="Credito Estudiantil";
        System.out.println( "El señor " + Clientep.nombre +" tiene "+ Clientep.edad + " su contacto es "+ Clientep.telefono +" el credito que tiene es "+ Clientep.credito);


        Trabajadorp.edad=22;
        Trabajadorp.telefono = "311 210 9872";
        Trabajadorp.nombre = "Luis";
        Trabajadorp.salario ="$ 1'200.000";

        System.out.println( "El señor " + Trabajadorp.nombre +" tiene "+ Trabajadorp.edad +" su contacto es "+ Trabajadorp.telefono +" su salaraios es "+ Trabajadorp.salario);


    }

}
 class Persona {
        int edad;
        String nombre;
        String telefono;
    }

    class Cliente extends Persona{
       String credito;
    }

    class Trabajador extends Persona {
       String salario;
    }
