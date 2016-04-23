package ohtu;

public class TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) throws Exception {
        if (!playerName.equals(player1Name) && !playerName.equals(player2Name)) {
            throw new Exception("Check player name");
        } else if (playerName.equals(player1Name)) {
            player1Score += 1;
        } else {
            player2Score += 1;
        }
    }

    public String getScore() {
        if (player1Score == player2Score) {
            return deuce();
        } else if (player1Score >= 4 || player2Score >= 4) {
            return advantageOrWin();
        } else {
            return otherSituations();
        }

    }

    private String deuce() {
        switch (player1Score) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private String advantageOrWin() {
        int result = player1Score - player2Score;

        if (result == 1) {
            return "Advantage " + player1Name;
        } else if (result == -1) {
            return "Advantage " + player2Name;
        } else if (result > 1) {
            return "Win for " + player1Name;
        } else {
            return "Win for " + player2Name;
        }
    }

    private String otherSituations() {
        return scoreInTennisTerm(player1Score) + "-" + scoreInTennisTerm(player2Score);
    }

    private String scoreInTennisTerm(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "";
        }

    }
}