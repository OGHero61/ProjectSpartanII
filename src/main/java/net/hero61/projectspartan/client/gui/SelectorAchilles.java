package net.hero61.projectspartan.client.gui;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.resources.ResourceLocation;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;

public class SelectorAchilles extends Screen {
    private static final ResourceLocation GUI_TEXTURE = new ResourceLocation("mcspartan", "textures/gui/selector_achilles.png");

    public SelectorAchilles(Component title) {
        super(title);
    }

    @Override
    protected void init() {
        // Initialize GUI components here
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        renderBackground(guiGraphics); // Render the background
        RenderSystem.setShaderTexture(0, GUI_TEXTURE); // Bind the texture
        guiGraphics.blit(GUI_TEXTURE, this.width /2 -128, this.height / 2 - 128, 0, 0, 256, 256); // Draw the texture
        super.render(guiGraphics, mouseX, mouseY, partialTicks); // Call the superclass's render method
    }

    @Override
    public boolean isPauseScreen() {
        return false; // GUI does not pause the game
    }
}
