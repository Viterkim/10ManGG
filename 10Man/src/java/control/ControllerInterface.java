
package control;

import entity.HistoryOverview;
import entity.Match;
import entity.Player;
import entity.PlayerOverview;


public interface ControllerInterface {
    public HistoryOverview getHistoryOverview(int matchId);
    
    public Match getMatch(int matchId);
    
    public PlayerOverview getPlayerOverview(int matchId);
    public Player getPlayer(int playerId);
    
    
    
}
