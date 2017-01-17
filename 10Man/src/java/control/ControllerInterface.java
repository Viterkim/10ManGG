package control;

import entity.HistoryOverview;
import entity.Match;
import entity.Player;
import entity.PlayerOverview;

public interface ControllerInterface {

    public HistoryOverview getHistoryOverview(int matchId);

    /*
    bingomanden1
     */
    public Match getMatch(int matchId);

    public boolean isMatchDone();

    /*
    Bingomanden 2
    */

    public PlayerOverview getPlayerOverview(int matchId);

    public PlayerOverview getPlayersAvailable(int matchId);

    public Player getPlayer(int playerId);

}
