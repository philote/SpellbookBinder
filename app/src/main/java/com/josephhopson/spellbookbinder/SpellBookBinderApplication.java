package com.josephhopson.spellbookbinder;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import spelllist.DaoMaster;
import spelllist.DaoSession;

/**
 * Created by joseph on 2/8/2015.
 */
public class SpellBookBinderApplication extends Application {

    public DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDatabase();
    }

    private void setupDatabase() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "spellbookbinder-db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
