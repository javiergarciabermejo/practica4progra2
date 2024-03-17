package aplicacion;

import mates.Matematicas;



public class Principal {
    public static void main(String[] args) {


        if (args.length == 0) {

            System.out.println("Pon el número de pasos como argumento.");
            return;
        }

        
        long pasos = Long.parseLong(args[0]);
        System.out.println("El número PI es " + Matematicas.generarNumeroPi(pasos));
    }
}
