
package entity;

import java.util.ArrayList;
//hallo

public class HistoryOverview {
    private ArrayList<History> moves;

    public HistoryOverview() {
        moves = new ArrayList<>();
    }
    
    public HistoryOverview(ArrayList<History> hArr) {
        moves = hArr;
    }
    
    public void addHistory(History h){
        moves.add(h);
    }
}
