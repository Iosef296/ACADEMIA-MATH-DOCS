/**
 * Patron Singleton - Academia Virtual de Matematicas
 */
public class Singleton {

    private static Singleton instancia;

    private String nombrePlataforma = "Academia Virtual de Matematicas";
    private String version = "1.0.0";
    private String urlBaseDatos = "jdbc:postgresql://localhost:5432/academia_math";
    private boolean modoMantenimiento = false;
    private int maximoEstudiantesPorClase = 50;
    private String apiKeyIA = "sk-math-ai-2026";

    private Singleton() {
        System.out.println("[Singleton] Creando instancia unica...");
        System.out.println("[Singleton] Plataforma: " + nombrePlataforma);
        System.out.println("[Singleton] Version: " + version);
    }

    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void mostrarConfiguracion() {
        System.out.println("========================================");
        System.out.println("  CONFIGURACION ACADEMIA VIRTUAL");
        System.out.println("========================================");
        System.out.println("Plataforma:  " + nombrePlataforma);
        System.out.println("Version:     " + version);
        System.out.println("Base Datos:  " + urlBaseDatos);
        System.out.println("Max/Clase:   " + maximoEstudiantesPorClase);
        System.out.println("Modo Mant.:  " + (modoMantenimiento ? "ACTIVO" : "Inactivo"));
        System.out.println("========================================");
    }

    public String getNombrePlataforma() { return nombrePlataforma; }
    public String getVersion() { return version; }
    public String getUrlBaseDatos() { return urlBaseDatos; }
    public boolean isModoMantenimiento() { return modoMantenimiento; }
    public void setModoMantenimiento(boolean modo) { this.modoMantenimiento = modo; }
    public int getMaximoEstudiantesPorClase() { return maximoEstudiantesPorClase; }
    public String getApiKeyIA() { return apiKeyIA; }
}