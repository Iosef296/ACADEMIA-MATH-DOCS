public class Main {
    public static void main(String[] args) {
        System.out.println("=== Probando Singleton: Configuracion Academia Virtual de Matematicas ===\n");

        Singleton config1 = Singleton.getInstance();
        config1.mostrarConfiguracion();

        System.out.println("\n--- Intentando crear segunda referencia ---\n");

        Singleton config2 = Singleton.getInstance();
        config2.mostrarConfiguracion();

        System.out.println("\n--- Verificacion de instancia unica ---");
        if (config1 == config2) {
            System.out.println("OK: Ambas referencias apuntan a la MISMA instancia");
        } else {
            System.out.println("ERROR: Se crearon instancias diferentes");
        }

        System.out.println("\n--- Actualizando configuracion desde config2 ---");
        config2.setModoMantenimiento(true);

        System.out.println("\n--- Leyendo desde config1 ---");
        System.out.println("Modo mantenimiento (config1): " + config1.isModoMantenimiento());
    }
}