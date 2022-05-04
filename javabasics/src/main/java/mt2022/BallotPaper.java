package mt2022;

public class BallotPaper implements Comparable<BallotPaper>
{
    private String firstChoice;
    private String secondChoice;

    BallotPaper(String firstChoice, String secondChoice){
        this.firstChoice = firstChoice;
        this.secondChoice = secondChoice;
    }
    public String getFirstChoice() {
        return firstChoice;
    }

    public String getSecondChoice() {
        return secondChoice;
    }

    public void transferVotes() {
        firstChoice = secondChoice;
        secondChoice = null;
    }

    @Override
    public String toString() {
        return "1:" + firstChoice +
            " 2:" + secondChoice;
    }

    @Override
    public boolean equals(Object o) {
        return (o == this) || (
            (o instanceof BallotPaper) &&
            ((BallotPaper) o).firstChoice.equals(firstChoice) &&
            (
                (((BallotPaper) o).secondChoice == null && secondChoice == null) ||
                (((BallotPaper) o).secondChoice.equals(secondChoice))
            )
        );
    }

    @Override
    public int compareTo(BallotPaper ballotPaper) {
        return firstChoice.compareTo(ballotPaper.firstChoice);
    }
}
