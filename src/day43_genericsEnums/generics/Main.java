package day43_genericsEnums.generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();  //ArrayList only accepts objects belongs to Integer class

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//      items.add("Apple");

        printDoubled(items);


        System.out.println("--------------------------------------------");

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        //Team liverpool = new Team("Liverpool"); //Team accepting any object
        Team<SoccerPlayer> liverpool = new Team("Liverpool"); //Team accepting any object from SoccerTeam


        //liverpool.addPlayer(joe);
        //liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);


      //  Team<String> brokenTeam = new Team<>("What kind of team is this?");
      //  brokenTeam.addPlayer(String.valueOf(joe));
        // Team<Integer> team2 = new Team<>("Very Weird");

    }

    private static void printDoubled(ArrayList<Integer> items) {
        for(Integer i : items){
            System.out.println(i*2);
        }
    }
}
