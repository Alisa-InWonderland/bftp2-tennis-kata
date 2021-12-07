import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TennisTest {
    @Test
    void cuandoElJuegoEmpiezaElMarcadorEstaEn0() {
        TennisGame juego = new TennisGame();
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("love - love"));
    }

    @Test
    void cuandoElJugador1MarcaUnPunto() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("fifteen - love"));
    }

    @Test
    void cuandoLosDosJugadoresMarcanUnPunto() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("fifteen - fifteen"));
    }
    @Test
    void cuandoElJugador1Marca2PuntosYElJugador2Marca1Punto() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("thirty - fifteen"));
    }

    @Test
    void cuandoElJugador1Marca1PuntoYElJugador2Marca2Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("fifteen - thirty"));
    }

    @Test
    void cuandoLosDosJugadoresMarcan2Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("thirty - thirty"));
    }

    @Test
    void cuandoElJugador1Marca3PuntosYElJugador2Marca2Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("forty - thirty"));
    }

    @Test
    void cuandoElJugador1Marca2PuntosYElJugador2Marca3Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("thirty - forty"));
    }
    @Test
    void cuandoElJugador1Marca4PuntosYElJugador2Marca2Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("Win for player1"));
    }
    @Test
    void cuandoElJugador1Marca4PuntosYElJugador2Marca1Punto() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("Win for player1"));
    }

    @Test
    void cuandoElJugador1Marca4Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("Win for player1"));
    }

    @Test
    void cuandoElJugador1Marca2PuntosYElJugador2Marca4Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("Win for player2"));
    }

    @Test
    void cuandoElJugador1Marca1PuntoYElJugador2Marca4Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("Win for player2"));
    }

    @Test
    void cuandoElJugador2Marca4Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("Win for player2"));
    }

    @Test
    void cuandoLosDosJugadoresMarcan3Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("Deuce"));
    }
    @Test
    void cuandoElJugador1Marca4PuntosYElJugador2Marca3Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("Advantage player1"));
    }

    @Test
    void cuandoElJugador1Marca3PuntosYElJugador2Marca4Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("Advantage player2"));
    }

    @Test
    void cuandoElJugador1Marca5PuntosYElJugador2Marca3Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("Win for player1"));
    }

    @Test
    void cuandoElJugador1Marca3PuntosYElJugador2Marca5Puntos() {
        TennisGame juego = new TennisGame();
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player1");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        juego.wonPoint("player2");
        String resultado = juego.getScore();
        assertThat(resultado, equalTo("Win for player2"));
    }
}
