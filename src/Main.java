
import java.util.*;
import static java.util.Map.*;

public class Main {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<3; i++) {
            String input = sc.nextLine();
            String[] values = input.split (" ");
            String name = values[0];
            int points = Integer.parseInt (values[1]);
            game.addPlayer (name, points);
        }
        game.getWinner();
    }
}
   class Bowling {

       LinkedHashMap <String, Integer> players;

       Bowling () {
           players = new LinkedHashMap<>();
       }

       public void addPlayer (String name, int player) {
           players.put (name, player);
       }

       public void getWinner() {

           int maxValue = 0;
           for (Integer points : players.values()) {

               if (maxValue < points) {
                   maxValue = points;
               }
           }

           for(Entry <String, Integer> entry: players.entrySet()){
              if(entry.getValue() == maxValue){
                  System.out.println (entry.getKey());
              }
          }
       }
   }








