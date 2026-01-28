import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.util.logging.Logger;
import java.util.logging.Level;

import data.User;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    static String filePath = "/tmpp/user.txt";
    static FileOutputStream fileOutputStream;
    static ObjectOutputStream objectOutputStream;

    /**
     * @param args
     */
    public static void main(String[] args) {
        logger.log(Level.INFO, "Program started!");
        logger.log(Level.INFO, "Logger instance : {0}", logger);
        User user = new User(1, "Fritz");

        try {
            logger.log(Level.INFO, "Serialize object and write it to : {0} ", filePath);
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Write to file : {0} ", filePath);
        }
        logger.log(Level.INFO, "Logger instance : {0}", logger);
        logger.log(Level.INFO, "Class {0} : {1}", new Object[] { "User", user });
        logger.log(Level.WARNING, "logging: ", new Exception("Exception"));
        logger.log(Level.INFO, "{0}", user.showUser());
    }

}
