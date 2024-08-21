package com.ioc;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "User Details form the DB";
    }
}
