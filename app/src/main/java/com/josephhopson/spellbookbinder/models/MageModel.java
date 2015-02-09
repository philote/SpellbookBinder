package com.josephhopson.spellbookbinder.models;

import java.util.ArrayList;

/**
 * Created by joseph on 1/19/2015.
 */
public abstract class MageModel {
    int channeling;
    int life;
    int armor;
    String description;
    String name;
    ArrayList<String> special_abilities; // maybe map of name / desc

}
