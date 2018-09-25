package com.jetpackexample.roomsample;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface LocalDataBaseAccessObject {

    @Query("SELECT * FROM user")
    List<User> getAll();

    @Insert
    void insert(User users);
}
