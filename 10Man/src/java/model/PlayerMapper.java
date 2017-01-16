
package model;

import db.DBConnection;
import entity.Player;
import exception.GeneralException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


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
                String sql = "";
                PreparedStatement prepared = con.prepareStatement(sql);
                ResultSet RS = prepared.executeQuery();
                if (RS.next())
                {
                    p = new Player(RS.getInt("playerId"), RS.getString("name"), RS.getString("team"), RS.getInt("fk_matchId"));
                }
                return p;
            }
            catch(SQLException e)
            {
                throw new GeneralException("Error inserting data into database");
            }
        }
    }
