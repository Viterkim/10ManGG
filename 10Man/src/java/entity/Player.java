
package entity;


public class Player {
    private int playerId;
    private String name;
    private String team;
    private int fk_matchId;

    public Player(int playerId, String name, String team, int fk_matchId) {
        this.playerId = playerId;
        this.name = name;
        this.team = team;
        this.fk_matchId = fk_matchId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getFk_matchId() {
        return fk_matchId;
    }
    
}
