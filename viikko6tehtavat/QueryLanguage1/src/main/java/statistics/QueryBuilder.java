package statistics;

import statistics.matcher.*;

/**
 * Created by iilumme.
 */
public class QueryBuilder {

    Matcher matcher;

    public QueryBuilder() {
        this.matcher = new And();
    }

    public Matcher build() {
        return matcher;
    }

    QueryBuilder playsIn(String team) {
        this.matcher = new PlaysIn(team);
        return this;
    }

    QueryBuilder hasAtLeast(int value, String category) {
        this.matcher = new HasAtLeast(value,category);
        return this;
    }

    QueryBuilder hasFewerThan(int value, String category) {
        this.matcher = new HasFewerThan(value, category);
        return this;
    }

    QueryBuilder oneOf(Matcher matcher, Matcher matcher2) {
        this.matcher = new Or(matcher, matcher2);
        return this;
    }
}
