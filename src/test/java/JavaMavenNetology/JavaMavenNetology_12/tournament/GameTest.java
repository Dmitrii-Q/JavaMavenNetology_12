package JavaMavenNetology.JavaMavenNetology_12.tournament;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    public void draw() {
        Game game = new Game();

        Player ivan = new Player(1, "Ivan", 20);
        Player evgen = new Player(2, "Evgen", 20);
        game.register(ivan);
        game.register(evgen);

        int expected = 0;
        int actual = game.round("Ivan", "Evgen");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void player1Win() {
        Game game = new Game();

        Player ivan = new Player(1, "Ivan", 30);
        Player evgen = new Player(2, "Evgen", 20);
        game.register(ivan);
        game.register(evgen);

        int expected = 1;
        int actual = game.round("Ivan", "Evgen");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void player2Win() {
        Game game = new Game();

        Player ivan = new Player(1, "Ivan", 30);
        Player evgen = new Player(2, "Evgen", 35);
        game.register(ivan);
        game.register(evgen);

        int expected = 2;
        int actual = game.round("Ivan", "Evgen");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notRegisteredPlayer() {
        Game game = new Game();

        Player ivan = new Player(1, "Ivan", 30);
        Player evgen = new Player(2, "Evgen", 35);
        game.register(ivan);
        game.register(evgen);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.register("alex")
        );
    }
}

