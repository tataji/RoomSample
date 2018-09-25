package com.jetpackexample.roomsample;

import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new roomdatabas().execute();
     }
     public class roomdatabas extends AsyncTask<Void,Void,Void>{

         @Override
         protected Void doInBackground(Void... voids) {
             AppDataBase db = Room.databaseBuilder(getApplicationContext(),
                     AppDataBase.class, "database-name").build();
             LocalDataBaseAccessObject localDataBaseAccessObject=db.localDataBaseAccessObject();
             User user=new User();
             user.setId("1");
             user.setName("mahesh");
             user.setMobilenumber("9999999999");
             localDataBaseAccessObject.insert(user);
             List<User> users= localDataBaseAccessObject.getAll();
             Log.d("user data",users.get(0).getId()+user.getName()+user.getMobilenumber());
             return null;
         }
     }
}
