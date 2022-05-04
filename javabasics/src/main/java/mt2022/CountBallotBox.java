package mt2022;

import java.util.ArrayList;
import java.util.Collections;

public class CountBallotBox {

    private ArrayList<BallotPaper> ballots;

    CountBallotBox() {
        ballots = new ArrayList<>();
    }

    public void addBallot(BallotPaper ballotPaper) {
        ballots.add(ballotPaper);
    }

    public int getVotesFor(String candidate) {
        int ans = 0;
        for (BallotPaper b: ballots) {
            if (b.getFirstChoice().equals(candidate)) {
                ans += 1;
            }
        }
        return ans;
    }

    private void sortBallots() {
        Collections.sort(ballots);
    }

    public void eliminateCandidate(String candidate) {
        for (BallotPaper b: ballots) {
            if (b.getFirstChoice().equals(candidate)) {
                b.transferVotes();
            }
        }
    }

    public void transferCandidate(BallotPaper sampleBallotPaper, int numberOfVotes) {
        int c = numberOfVotes;
        for (BallotPaper b: ballots) {
            if (b.equals(sampleBallotPaper) && c > 0) {
                b.transferVotes();
                c -= 1;
            }
        }
    }

    @Override
    public String toString() {
        sortBallots();
        StringBuilder sb = new StringBuilder();
        for (BallotPaper b: ballots) {
            sb.append("1: " + b.getFirstChoice() + " 2: " + b.getSecondChoice() + "\n");
        }
        return sb.toString();
    }
}
