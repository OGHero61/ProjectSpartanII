package net.hero61.projectspartan.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.hero61.projectspartan.ProjectSpartan;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;

public final class Keybindings {
    public static final Keybindings INSTANCE = new Keybindings();

    private Keybindings() {}

    // Define the category for your keybindings
    public static final String CATEGORY = "key.categories." + ProjectSpartan.MOD_ID;

    // Define the keybinding for the selector
    public final KeyMapping selectorKey = new KeyMapping(
            "key." + ProjectSpartan.MOD_ID + ".selector_key",  // The translation key
            KeyConflictContext.IN_GAME,  // Set to IN_GAME to allow the keybinding to work in-game
            InputConstants.getKey(InputConstants.KEY_K, 0),  // Keybinding default is "K" with no modifiers
            CATEGORY  // Keybinding category
    );
}
