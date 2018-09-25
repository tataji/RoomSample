package com.jetpackexample.roomsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "user")
public class User {
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    @PrimaryKey @NonNull
    public String id;

    public String name;

    public String mobilenumber;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }
}
