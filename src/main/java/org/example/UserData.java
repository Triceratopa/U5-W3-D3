package org.example;

import javax.sql.DataSource;

public class UserData {
    private String completeName;
    private int age;
    public void getData(DataSource ds){
        completeName= ds.getCompleteName();
        age=ds.getAge();
    }
}
