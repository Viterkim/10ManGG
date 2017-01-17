
package entity;

import java.util.ArrayList;


public class PlayerOverview 
{
    private ArrayList<Player> players;
    
    public PlayerOverview() 
    {
        players = new ArrayList<>();
    }
    
    public PlayerOverview(ArrayList<Player> pArr) 
    {
        players = pArr;
    }
    
    public void addPlayer(Player p)
    {
        players.add(p);
    }
    
    public boolean isEveryoneOnATeam()
    {
        boolean status = true;
        
        for(Player p:players)
        {
            if (p.getTeam().isEmpty())
            {
                status = false;
            }
        }
        return status;
    }
    
    public PlayerOverview getAvailablePlayers()
    {
        PlayerOverview pov = new PlayerOverview();
        for(Player p:players)
        {
            if(p.getTeam().isEmpty())
            {
                pov.addPlayer(p);
            }
        }
        return pov;
    }
}
