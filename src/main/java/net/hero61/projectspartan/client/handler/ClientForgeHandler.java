package net.hero61.projectspartan.client.handler;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.client.Keybindings;
import net.hero61.projectspartan.client.gui.SelectorAchilles;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ProjectSpartan.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {
    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event) {
        Minecraft mc = Minecraft.getInstance();

        // Check if the key has been pressed
        if (Keybindings.INSTANCE.selectorKey.isDown()) {
            if (mc.screen instanceof SelectorAchilles) {
                // Close the GUI by setting the screen to null
                Keybindings.INSTANCE.selectorKey.consumeClick();
                mc.setScreen(null);  // Close the current GUI
            } else {
                // Open the GUI if no GUI is open
                Keybindings.INSTANCE.selectorKey.consumeClick();
                mc.setScreen(new SelectorAchilles(Component.translatable("screen.mcspartan.selectorachilles")));
            }
        }
    }

}

