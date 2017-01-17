
package control;

import entity.HistoryOverview;
import entity.Match;
import entity.Player;
import entity.PlayerOverview;
import exception.GeneralException;
import model.HistoryMapper;
import model.MatchMapper;
import model.PlayerMapper;


public class Controller
{
    HistoryMapper hm;
    MatchMapper mm;
    PlayerMapper pm;

    public Controller() throws GeneralException
    {
        this.hm = new HistoryMapper();
        this.mm = new MatchMapper();
        this.pm = new PlayerMapper();
    }
    
    public Controller(HistoryMapper hm, MatchMapper mm, PlayerMapper pm) {
        this.hm = hm;
        this.mm = mm;
        this.pm = pm;
    }

    public HistoryOverview getHistoryOverview(int matchId) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Match getMatch(int matchId) throws GeneralException
    {
        return mm.getMatch(matchId);
    }

    public PlayerOverview getPlayerOverview(int matchId) throws GeneralException
    {
        return pm.getPlayerOverview(matchId);
    }

    public Player addPlayer(String name, int matchId) throws GeneralException
    {
        return pm.addPlayer(name, matchId);
    }
    
    public Player getPlayer(int playerId) throws GeneralException
    {
        return pm.getPlayer(playerId);
    }

    public PlayerOverview getPlayersAvailable(int matchId) throws GeneralException
    {
        return pm.getPlayerOverview(matchId).getAvailablePlayers();
    }

    public boolean isEveryoneOnATeam(int matchId) throws GeneralException
    {
        PlayerOverview players = getPlayerOverview(matchId);
        return players.isEveryoneOnATeam();
    }
    
}
