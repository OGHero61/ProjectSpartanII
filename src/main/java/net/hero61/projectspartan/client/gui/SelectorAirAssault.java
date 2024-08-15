package net.hero61.projectspartan.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class SelectorAirAssault extends Screen {
    private static final ResourceLocation GUI_TEXTURE = new ResourceLocation("mcspartan", "textures/gui/selector_airassault.png");

    public SelectorAirAssault(Component title) {
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
