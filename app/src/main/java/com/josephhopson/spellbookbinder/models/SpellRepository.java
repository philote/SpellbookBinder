package com.josephhopson.spellbookbinder.models;

import android.content.Context;

import com.josephhopson.spellbookbinder.SpellBookBinderApplication;

import java.util.List;

import spelllist.SpellDao;
import spelllist.Spell;

/**
 * Created by joseph on 2/8/2015.
 */
public class SpellRepository {

    public static void insertOrUpdate(Context context, Spell spell) {
        getSpellDao(context).insertOrReplace(spell);
    }

    public static void clearSpelles(Context context) {
        getSpellDao(context).deleteAll();
    }

    public static void deleteSpellWithId(Context context, long id) {
        getSpellDao(context).delete(getSpellForId(context, id));
    }

    public static List<Spell> getAllSpelles(Context context) {
        return getSpellDao(context).loadAll();
    }

    public static Spell getSpellForId(Context context, long id) {
        return getSpellDao(context).load(id);
    }

    private static SpellDao getSpellDao(Context c) {
        return ((SpellBookBinderApplication) c.getApplicationContext()).getDaoSession().getSpellDao();
    }
}
