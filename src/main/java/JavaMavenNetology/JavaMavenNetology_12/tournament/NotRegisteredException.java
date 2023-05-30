package JavaMavenNetology.JavaMavenNetology_12.tournament;

public class NotRegisteredException extends RuntimeException {

    public NotRegisteredException(String name) {
        super("Player " + name + " is not exist");
    }

}
