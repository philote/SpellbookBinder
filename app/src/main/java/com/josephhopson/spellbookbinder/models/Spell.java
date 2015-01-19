package com.josephhopson.spellbookbinder.models;

import java.util.ArrayList;
import java.util.Map;

import io.realm.RealmObject;

/**
 * Created by joseph on 1/19/2015.
 */
public class Spell extends RealmObject {
    String name;
    ArrayList<String> types;
    ArrayList<String> subTypes;
    int castingCost;
    String actionType;
    int minRange;
    int maxRange;
    ArrayList<String> targets;
    Map<String, Integer> schoolLevel;
    String effect;

    // Attack
    /*
    ArrayList<Attack> attacks;
    */

    // creature
    /*
    ArrayList<Attack> attacks;
    ArrayList<String> traits;
    int armor;
    int life;
    int channeling;
     */

    // conjurations
    /*
    ArrayList<Attack> attacks;
    ArrayList<String> traits;
    int armor;
    int life;
    int channeling;
    //all conjurations have the following traits: Nonliving, Psychic Immunity, and Unmovable
     */

    // Enchantments
    /*
    int revielCost;
    ArrayList<String> traits;
     */

    // Equipment
    /*
    String location;
    ArrayList<Attack> attacks;
    ArrayList<String> traits;
     */

    public class Attack {
        String name;
        String actionRequired;
        ArrayList<String> attackTypes;
        int minRange;
        int maxRange;
        String damageType;
        int attackDice;
        ArrayList<String> additionalEffects;
        ArrayList<String> traits;
    }

    public class Defence {
        String usesPerRound;
        String attackType;
        int baseRoll;
    }
}
/*
enum of schools
enum of types
     attacks, incantations, creatures, conjurations, enchantments, and equipment
enum of subtypes
enum of equipment locations
    helmet, amulet, cloak, ring, chestPiece, belt, gloves, shield, boots, weapon, weaponOrShield, weaponAndShield
enum actionRequired
    quick, full
enum actionType
    melee, ranged, zone
 */