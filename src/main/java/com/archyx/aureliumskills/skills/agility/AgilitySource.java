package com.archyx.aureliumskills.skills.agility;

import com.archyx.aureliumskills.skills.Skill;
import com.archyx.aureliumskills.skills.Skills;
import com.archyx.aureliumskills.source.Source;
import com.archyx.aureliumskills.util.item.ItemUtils;
import org.bukkit.inventory.ItemStack;

import java.util.Locale;

public enum AgilitySource implements Source {

    JUMP_PER_100("FEATHER", "100_jumps"),
    FALL_DAMAGE("DIAMOND_BOOTS", "damage");

    private final String material;
    private final String unitName;

    AgilitySource(String material, String unitName) {
        this.material = material.toUpperCase(Locale.ROOT);
        this.unitName = unitName;
    }

    @Override
    public Skill getSkill() {
        return Skills.AGILITY;
    }

    @Override
    public String getUnitName() {
        return unitName;
    }

    @Override
    public ItemStack getMenuItem() {
        return ItemUtils.parseItem(material);
    }
}
