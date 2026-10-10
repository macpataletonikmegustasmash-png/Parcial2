import java.util.Objects;

public class Fighter {

    private final String name;
    private final String personaje;

    public Fighter(String name, String perosnaje) {
        this.name = name;
        this.personaje = perosnaje;
    }

    @Override
    public String toString() {
        return name + ", main " + personaje;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return Objects.equals(name, fighter.name) && Objects.equals(personaje, fighter.personaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, personaje);
    }
}
