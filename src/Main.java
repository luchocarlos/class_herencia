public class Main {
    public static void main(String[] args) {

        Persona personac = new Persona() {
            @Override
            public String getCredito() {
                return null;
            }

            @Override
            public void setCredito(String credito) {

            }

            @Override
            public String getSalario() {
                return null;
            }

            @Override
            public void setSalario(String salario) {

            }
        };
        personac.setEdad(20);
        personac.setNombre("Carlos");
        personac.setTelefono("3108871098");

        Cliente Clientep = new Cliente() {
            @Override
            public String getSalario() {
                return null;
            }

            @Override
            public void setSalario(String salario) {

            }
        };
        Clientep.setCredito("Credito Estuadiantil");

        Trabajador Trabajadorp = new Trabajador() {
            @Override
            public String getCredito() {
                return null;
            }

            @Override
            public void setCredito(String credito) {

            }
        };
        Trabajadorp.setSalario("$ 1'200.000");



        System.out.println(personac.getEdad());
        System.out.println(personac.getTelefono());
        System.out.println(personac.getNombre());
        System.out.println(personac.getCredito());
        System.out.println(personac.getSalario());

    }

}

abstract class Persona {
        int edad;
        String nombre;
        String telefono;
        String credito;
        String salario;


        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return this.edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getTelefono() {
            return this.telefono;
        }

        abstract public String getCredito();
        abstract public void setCredito(String credito);

        abstract public String getSalario();
        abstract public void setSalario(String salario);
    }

    abstract class Cliente extends Persona{
        public String getCredito(){
          return this.credito;
        }

        public  void setCredito(String credito){
            this.credito = credito;
        }
    }

    abstract class Trabajador extends Persona {

        public String getSalario() {
            return this.salario;
        }

        public void setSalario(String salario) {
            this.salario = salario;
        }
    }
