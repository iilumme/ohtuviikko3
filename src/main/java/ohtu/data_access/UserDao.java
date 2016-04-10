
package ohtu.data_access;

import java.io.IOException;
import java.util.List;
import ohtu.domain.User;

public interface UserDao {
    List<User> listAll() throws IOException;
    User findByName(String name) throws IOException;
    void add(User user) throws IOException;
}
