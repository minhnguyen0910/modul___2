package ss8_clean_code.com.codegym;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scoreOfFistPlayer, int scoreOfSecondPlayer) {
        String score = "";
        int tempScore = 0;
        boolean isBalancedPoint = scoreOfFistPlayer == scoreOfSecondPlayer;
        if (isBalancedPoint) {
            switch (scoreOfFistPlayer) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scoreOfFistPlayer >= 4 || scoreOfSecondPlayer >= 4) {
            int minusResult = scoreOfFistPlayer - scoreOfSecondPlayer;
            if (minusResult == 1) score = "Advantage " + player1Name;
            else if (minusResult == -1) score = "Advantage " + player2Name;
            else if (minusResult >= 2) score = "Win for " + player1Name;
            else score = "Win for " + player2Name;
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreOfFistPlayer;
                else {
                    score += "-";
                    tempScore = scoreOfSecondPlayer;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

}