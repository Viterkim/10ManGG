
package model;

import db.DBConnection;
import entity.Match;
import exception.GeneralException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MatchMapper 
{
    private Connection con;
    
    public MatchMapper() throws GeneralException 
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
        
    public Match getMatch(int matchId) throws GeneralException
    {
        try
        {
            Match m = null;
            String sql = "SELECT * FROM match WHERE matchId=?";
            PreparedStatement prepared = con.prepareStatement(sql);
            prepared.setInt(1, matchId);
            ResultSet RS = prepared.executeQuery();
            if (RS.next())
            {
                m = new Match(RS.getInt("matchId"), RS.getString("captainA"), RS.getString("captainB"));
            }
            return m;
        }
        catch(SQLException e)
        {
            throw new GeneralException("Error getting Match object");
        }
    }
}
