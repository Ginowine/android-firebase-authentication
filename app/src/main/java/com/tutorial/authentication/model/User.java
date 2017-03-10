package com.tutorial.authentication.model;

import java.util.HashMap;

/**
 * Created by Gino Osahon on 04/03/2017.
 */

public class User {

    private String fullName;
    private String photo;
    private String email;
    private HashMap<String,Object> timestampJoined;

    public User() {
    }

    /**
     * Use this constructor to create new User.
     * Takes user name, email and timestampJoined as params
     *
     * @param timestampJoined
     */
    public User(String mFullName, String mPhoneNo, String mEmail, HashMap<String, Object> timestampJoined) {
        this.fullName = mFullName;
        this.photo = mPhoneNo;
        this.email = mEmail;
        this.timestampJoined = timestampJoined;
    }


    public String getFullName() {
        return fullName;
    }

    public String getPhoto() {
        return photo;
    }

    public String getEmail() {
        return email;
    }

    public HashMap<String, Object> getTimestampJoined() {
        return timestampJoined;
    }
}
