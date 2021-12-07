public class TennisGame {

    int player1Score = 0;
    int player2Score = 0;


    public TennisGame() {
    }

    public void wonPoint(String player) {

        if (player == "player1") {
            player1Score += 1;
        } else if (player == "player2") {
            player2Score += 1;
        }
    };

    public String getScore() {

        String puntuacionPlayer1 = representation(player1Score);
        String puntuacionPlayer2 = representation(player2Score);

        if (player1Score == 3 && player2Score == 3) {
            return "Deuce";
        }
        else if (player1Score == 4 && player2Score == 3) {
            return "Advantage player1";
        }

        else if (player1Score == 3 && player2Score == 4) {
            return "Advantage player2";
        }

        else if (player1Score == 5 && player2Score == 3 || player1Score >= 4  && player2Score <= 2) {
            return "Win for player1";
        }

        else if (player1Score == 3 && player2Score == 5 || player1Score <= 2  && player2Score >= 4) {
            return "Win for player2";
        }
        return puntuacionPlayer1 + " - " + puntuacionPlayer2;
    }

    private String representation(int score) {
        switch (score){
            case 0:
                return "love";
            case 1:
                return "fifteen";
            case 2:
                return "thirty";
            default:
                return "forty";
        }
    }
}






/**switch(player1Score, player2Score) {
        case 5:
        System.out.println("Habitación 1");
        break;
        case 10:
        System.out.println("Habitación 2");
        break;
        case 15:
        System.out.println("Habitación 3");
        break;
        case 20:
        System.out.println("Habitación 4");
        break;
default:
        System.out.println("Habitación 5");
        }

        System.out.println("Fuera del switch (y de las habitaciones)");
        }
 **/