package Elecciones;

public class Partidos {
    private String name;
    private int percentage;

//    CONSTRUCTOR
    public Partidos(String name, int percentage) {
        this.name = name;
        this.percentage = percentage;
    }
//GETTERS&SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

//    VISUALIZACIÓN

    @Override
    public String toString() {
        return "\n" +
                "Partido: " + name + '\n' +
                "Porcentaje de voto: " + percentage +"%" +'\n' +
                "_________________________________________"
                ;
    }
}
