package pl.surecase.eu;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyDaoGenerator {

    public static void main(String args[]) throws Exception {
        Schema schema = new Schema(1, "spelllist");
        Entity spell = schema.addEntity("Spell");
        spell.addIdProperty();
        spell.addStringProperty("name");
        spell.addIntProperty("castingCost");
        spell.addStringProperty("actionType");
        spell.addIntProperty("minRange");
        spell.addIntProperty("maxRange");
        spell.addStringProperty("effect");
        new DaoGenerator().generateAll(schema, args[0]);
    }
}
