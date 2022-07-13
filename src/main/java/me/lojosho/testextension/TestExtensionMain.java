package me.lojosho.testextension;

import com.willfp.eco.core.EcoPlugin;
import com.willfp.eco.core.extensions.Extension;
import com.willfp.ecoenchants.enchantments.EcoEnchant;

public class TestExtensionMain extends Extension {
    public static final EcoEnchant TESTENCHANT = new TestEnchant();

    public TestExtensionMain(final EcoPlugin plugin) {
        super(plugin);
    }
    @Override
    protected void onEnable() {

    }

    @Override
    protected void onDisable() {

    }
}
