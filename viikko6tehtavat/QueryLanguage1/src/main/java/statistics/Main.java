package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));
          
//        Matcher m = new And( new HasAtLeast(10, "goals"),
//                             new HasAtLeast(10, "assists"),
//                             new PlaysIn("PHI")
//        );
//
//        Matcher n = new And( new HasFewerThan(10, "goals"),
//                new HasFewerThan(10, "assists"),
//                new PlaysIn("PHI")
//        );
//
//        Matcher o = new Not( new HasFewerThan(10, "goals"),
//                new HasFewerThan(10, "assists"),
//                new PlaysIn("PHI")
//        );
//
//        Matcher p = new Or( new HasFewerThan(10, "goals"),
//                new HasFewerThan(10, "assists"),
//                new PlaysIn("PHI")
//        );
//
//        for (Player player : stats.matches(m)) {
//            System.out.println( player );
//        }
//
//        System.out.println("--------");
//
//        for (Player player : stats.matches(n)) {
//            System.out.println( player );
//        }
//
//        System.out.println("--------");
//
//        for (Player player : stats.matches(o)) {
//            System.out.println( player );
//        }
//
//        System.out.println("--------");
//
//        for (Player player : stats.matches(p)) {
//            System.out.println( player );
//        }
//
//        System.out.println("********");

        QueryBuilder query = new QueryBuilder();

        Matcher q = query.playsIn("NYR")
                .hasAtLeast(10, "goals")
                .hasFewerThan(25, "assists").build();

        System.out.println(q);

        for (Player player : stats.matches(q)) {
            System.out.println( player );
        }
    }
}
