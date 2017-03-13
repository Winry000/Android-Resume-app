package com.example.winryxie.myresume;

/**
 * Created by winryxie on 3/11/17.
 */
import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.InputStream;

import java.util.ArrayList;
public class User {
    private String item;
    private String detail;
    private String api;

    public String getVer() {
        return item;
    }

    public String getName() {
        return detail;
    }

//    public String getApi() {
//        return api;
//    }

    public static ArrayList<User> getUserFromFile(String filename, Context context) {

        final ArrayList<User> userList = new ArrayList<>();
        try {
            // Load data
            String jsonString = loadJsonFromAsset("recipes.json", context);
            JSONObject json = new JSONObject(jsonString);
            JSONArray user = json.getJSONArray("myinfo");

            // Get Recipe objects from data
            for (int i = 0; i < user.length(); i++) {
                User muser = new User();

                muser.item = user.getJSONObject(i).getString("item");
                muser.detail = user.getJSONObject(i).getString("detail");
                //muser.api = user.getJSONObject(i).getString("api");

                userList.add(muser);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return userList;
    }
    private static String loadJsonFromAsset(String filename, Context context) {
        String json = null;

        try {
            InputStream is = context.getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        }
        catch (java.io.IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return json;
    }

}

