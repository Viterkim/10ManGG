
package control;

import entity.HistoryOverview;
import entity.Match;
import entity.Player;
import entity.PlayerOverview;
import model.HistoryMapper;
import model.MatchMapper;
import model.PlayerMapper;


public class Controller implements ControllerInterface{
    HistoryMapper hm;
    MatchMapper mm;
    PlayerMapper pm;

    public Controller(HistoryMapper hm, MatchMapper mm, PlayerMapper pm) {
        this.hm = hm;
        this.mm = mm;
        this.pm = pm;
    }

    @Override
    public HistoryOverview getHistoryOverview(int matchId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Match getMatch(int matchId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlayerOverview getPlayerOverview(int matchId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Player getPlayer(int playerId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlayerOverview getPlayersAvailable(int matchId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isMatchDone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
