
package entity;


public class History {
    private String historyId;
    private int fk_matchId;
    private String captainName;
    private int fk_playerId;

    public History(String historyId, int fk_matchId, String captainName, int fk_playerId) {
        this.historyId = historyId;
        this.fk_matchId = fk_matchId;
        this.captainName = captainName;
        this.fk_playerId = fk_playerId;
    }

    public String getHistoryId() {
        return historyId;
    }

    public int getFk_matchId() {
        return fk_matchId;
    }

    public String getCaptainName() {
        return captainName;
    }

    public int getFk_playerId() {
        return fk_playerId;
    }
    
}
