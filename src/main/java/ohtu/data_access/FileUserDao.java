package ohtu.data_access;

import ohtu.domain.User;
import org.json.JSONObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by iilumme.
 */

public class FileUserDao implements UserDao {

    private String filename;

    public FileUserDao(String filen) throws IOException {
        this.filename = filen;
    }

    @Override
    public List<User> listAll() throws IOException {
        List<User> list = new ArrayList<User>();
        Scanner scanner = getScanner();
        while (scanner.hasNextLine()){
            JSONObject u = new JSONObject(scanner.nextLine());
            list.add(new User(u.getString("username"), u.getString("password")));
        }
        scanner.close();
        return list;
    }

    @Override
    public User findByName(String name) throws IOException {
        Scanner scanner = getScanner();
        User user = null;
        while(scanner.hasNextLine()) {
            JSONObject u = new JSONObject(scanner.nextLine());
            if (u.getString("username").equals(name)) {
                user = new User(u.getString("username"), u.getString("password"));
                break;
            }
        }
        scanner.close();
        return user;
    }

    @Override
    public void add(User user) throws IOException {
        FileWriter fileWriter = new FileWriter(filename, true);
        JSONObject jsonUser = new JSONObject();
        jsonUser.put("username", user.getUsername());
        jsonUser.put("password", user.getPassword());

        fileWriter.write(jsonUser.toString() + "\n");
        fileWriter.flush();
        fileWriter.close();
    }

    private Scanner getScanner() throws IOException {
        return new Scanner(new File(filename));
    }
}
