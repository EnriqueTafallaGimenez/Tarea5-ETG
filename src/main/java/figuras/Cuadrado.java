package figuras;

/**
 * Implementación de una figura geométrica de tipo Cuadrado.
 * @author Enrique Tafalla
 */
public class Cuadrado implements Figura {

    private int lado;

    /**
     * Constructor
     * @param lado longitud del lado
     */
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    /* Getters and Setters */
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    /* Implementación de la interfaz Figura */
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
