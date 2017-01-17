
package control;

import entity.HistoryOverview;
import entity.Match;
import entity.Player;
import entity.PlayerOverview;


/*
Forsvind
*/
public interface ControllerInterface {
    public HistoryOverview getHistoryOverview(int matchId);
    
    public Match getMatch(int matchId);
    public boolean isMatchDone();
    
    public PlayerOverview getPlayerOverview(int matchId);
    public PlayerOverview getPlayersAvailable(int matchId);
    public Player getPlayer(int playerId);
    
    
    
    
}
