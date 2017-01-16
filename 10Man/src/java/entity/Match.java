
package entity;


public class Match {
    private int matchId;
    private String captainA;
    private String captainB;

    public Match(int matchId, String captainA, String captainB) {
        this.matchId = matchId;
        this.captainA = captainA;
        this.captainB = captainB;
    }

    public int getMatchId() {
        return matchId;
    }

    public String getCaptainA() {
        return captainA;
    }

    public String getCaptainB() {
        return captainB;
    }
    
}
