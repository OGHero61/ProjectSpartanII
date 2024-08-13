package net.hero61.projectspartan.entity.custom;

import net.hero61.projectspartan.item.armor.SpartanArmorItem;
import net.hero61.projectspartan.item.armor.SpartanArmorMaterial;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;

public class CustomArmorStand extends ArmorStand {

    // Constructor
    public CustomArmorStand(EntityType<? extends ArmorStand> type, Level level) {
        super(type, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.ARMOR, 5.0D);
    }

    // Override to enforce custom armor rules
    @Override
    public void setItemSlot(EquipmentSlot slot, ItemStack stack) {
        if (isValidArmor(slot, stack)) {
            super.setItemSlot(slot, stack); // Set the item if valid
        } else {
            // Optionally, drop the invalid item or handle it differently
            this.spawnAtLocation(stack);
        }
    }

    // Check if the armor item is valid based on SpartanArmorMaterial.MJOLNIR and slot compatibility
    private boolean isValidArmor(EquipmentSlot slot, ItemStack stack) {
        Item item = stack.getItem();
        if (item instanceof SpartanArmorItem) {
            SpartanArmorItem armorItem = (SpartanArmorItem) item;
            // Ensure the ArmorMaterial of the item is SpartanArmorMaterial.MJOLNIR and check slot compatibility
            return armorItem.getMaterial() == SpartanArmorMaterial.MJOLNIR && armorItem.getEquipmentSlot() == slot;
        }
        return false;
    }
}


