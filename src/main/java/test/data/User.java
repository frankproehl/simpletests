package data;

import java.io.Serializable;
import java.util.logging.Logger;

import java.util.logging.Logger;
import java.util.logging.Level;

public class User implements Serializable {

    private static final Logger logger = Logger.getLogger(User.class.getName());

    //.getLogger(User.class.getName());

    private static final long serialVersionUID = 1L;
    //fields and methods
    private int id;
    private String name;

    public User (int id, String name) {
        logger.log(Level.INFO, "New User object instanciated");
        logger.log(Level.INFO,"Logger instance : {0}", logger);

        this.id = id;
        this.name = name;
    }

    public String showUser(){
        return "I'm " + this.name + "!";
    }

    public void setId(int id ) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "ID:" + id + "\nName:" + name ;
    }

}
