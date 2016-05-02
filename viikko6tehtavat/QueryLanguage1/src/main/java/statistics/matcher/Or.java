package statistics.matcher;

import statistics.Player;

/**
 * Created by iilumme.
 */
public class Or implements Matcher {

    private Matcher[] matchers;

    public Or(Matcher... matchers) {
        this.matchers = matchers;
    }

    @Override
    public boolean matches(Player p) {
        int notMatching = 0;
        for (Matcher matcher : matchers) {
            if (!matcher.matches(p)) {
                notMatching++;
            }
        }

        if (notMatching == matchers.length) {
            return false;
        } else {
            return true;
        }

    }
}
