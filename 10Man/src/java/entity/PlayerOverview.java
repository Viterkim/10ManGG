
package entity;

import java.util.ArrayList;


public class PlayerOverview {
    private ArrayList<Player> players;
    
     public PlayerOverview() {
        players = new ArrayList<>();
    }
    
    public PlayerOverview(ArrayList<Player> pArr) {
        players = pArr;
    }
}
