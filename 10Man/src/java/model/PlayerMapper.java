
package model;

import db.DBConnection;
import entity.Player;
import entity.PlayerOverview;
import exception.GeneralException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class PlayerMapper 
{
    private Connection con;
    
    public PlayerMapper() throws GeneralException 
    {
        try
        {
            this.con = DBConnection.getConnection();
        }
        catch(Exception e)
        {
            throw new GeneralException("Can't connect do database");
        }
    }

    public Player getPlayer(int playerId) throws GeneralException
    {
        try
        {
            Player p = null;
            String sql = "SELECT * FROM player WHERE playerId=?";
            PreparedStatement prepared = con.prepareStatement(sql);
            prepared.setInt(1, playerId);
            ResultSet RS = prepared.executeQuery();
            if (RS.next())
            {
                p = new Player(RS.getInt("playerId"), RS.getString("name"), RS.getString("team"), RS.getInt("fk_matchId"));
            }
            return p;
        }
        catch(SQLException e)
        {
            throw new GeneralException("Error getting Player object");
        }
    }

    public PlayerOverview getPlayerOverview(int matchId) throws GeneralException
    {
        try
        {
            PlayerOverview pov = new PlayerOverview();
            String sql = "SELECT * FROM player WHERE fk_matchId=(SELECT matchId FROM match where matchId=?)";
            PreparedStatement prepared = con.prepareStatement(sql);
            ResultSet RS = prepared.executeQuery();
            if (RS.next())
            {
                Player p = new Player(RS.getInt("playerId"), RS.getString("name"), RS.getString("team"), RS.getInt("fk_matchId"));
                pov.addPlayer(p);
            }
            return pov;
        }
        catch(SQLException e)
        {
            throw new GeneralException("Error getting PlayerOverview object");
        }
    }
    
    public Player addPlayer(String name, int matchId) //throws GeneralException
    {
        try
        {
            String sql = "INSERT INTO player (name, fk_matchId) VALUES (?, (SELECT matchId FROM match where matchId=?))";
            PreparedStatement prepared = con.prepareStatement(sql);
            prepared.setString(1, name);
            prepared.setInt(2, matchId);
            int primaryKey = prepared.executeUpdate();
            Player p = new Player(primaryKey, name, "", matchId);
            return p;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
//            throw new GeneralException("Error adding a new player to the database");
        }
        return null;
    }
        
}
