package com.bensoft.look4service;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Helper class for application use.
 * Created by yeang-shing.then on 11/13/2014.
 */
public class Helper {

    /**
     * Set username and password under setting. This will be use for next app launching.
     * @param context
     * @param email
     * @param password
     */
    public static void storeCredential(Context context, String email, String password) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", email);
        editor.putString("password", password);
        editor.commit();
    }
}