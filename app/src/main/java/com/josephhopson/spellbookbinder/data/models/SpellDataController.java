package com.josephhopson.spellbookbinder.data.models;

import android.content.Context;
import android.content.SharedPreferences;

import com.josephhopson.spellbookbinder.R;

/**
 * Created by joseph on 2/1/2015.
 */
public class SpellDataController {

    private Context mContext;
    SharedPreferences dataSharedPref;

    public static final String SPELL_LIST_VERSION_KEY = "com.josephhopson.spellbookbinder.data.models.SPELL_LIST_VERSION_KEY";

    public SpellDataController(Context mContext) {
        this.mContext = mContext;
        dataSharedPref = mContext.getSharedPreferences(mContext.getString(R.string.data_preference_file_key), Context.MODE_PRIVATE);
    }

    public void sync() {
        int version = dataSharedPref.getInt(SPELL_LIST_VERSION_KEY, 0);
        if(version < 1) {
            // 1st time run, just get the latest data
            // for now just pull from json file in assets

        } else {
            // no check version numbers
            // USE RETROFIT for the rest bits
            /*
            get latest version from the service
            if servVersion > version
                get spell list from the server
                process list
             */
        }
    }
    /*
    data check
    data sync
        - local
        - remote
     */

}
