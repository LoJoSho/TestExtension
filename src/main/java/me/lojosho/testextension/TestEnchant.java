package me.lojosho.testextension;

import com.willfp.ecoenchants.enchantments.EcoEnchant;
import com.willfp.ecoenchants.enchantments.EcoEnchants;
import com.willfp.ecoenchants.enchantments.meta.EnchantmentType;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class TestEnchant extends EcoEnchant {

    public TestEnchant() {
        super("testenchant", EnchantmentType.NORMAL);
    }

    @Override
    public void onMeleeAttack(final LivingEntity attacker,
                              final LivingEntity victim,
                              int level,
                              final EntityDamageByEntityEvent event) {
        if (!victim.getType().equals(EntityType.CREEPER)) return;

        double multiplier = this.getConfig().getDouble(EcoEnchants.CONFIG_LOCATION + "bonus-per-level");

        event.setDamage(event.getDamage() + (level * multiplier));
    }
}
