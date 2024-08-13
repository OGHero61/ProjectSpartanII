package net.hero61.projectspartan.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.hero61.projectspartan.entity.client.model.ModelCustomStand;
import net.hero61.projectspartan.entity.custom.CustomArmorStand;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.client.renderer.entity.layers.ElytraLayer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class CustomArmorStandRenderer extends LivingEntityRenderer<CustomArmorStand, ModelCustomStand> {

    public CustomArmorStandRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelCustomStand(context.bakeLayer(ModModelLayers.CUSTOM_ARMOR_STAND_LAYER)), 0.0F);
        //this.addLayer(new HumanoidArmorLayer<>(this, new ModModelLayers(context.bakeLayer(ModModelLayers.CUSTOM_ARMOR_STAND_LAYER)), new ModelCustomStand(context.bakeLayer(ModModelLayers.CUSTOM_ARMOR_STAND_LAYER)), context.getModelManager()));
        this.addLayer(new ItemInHandLayer<>(this, context.getItemInHandRenderer()));
        this.addLayer(new ElytraLayer<>(this, context.getModelSet()));
        this.addLayer(new CustomHeadLayer<>(this, context.getModelSet(), context.getItemInHandRenderer()));
    }

    @Override
    public ResourceLocation getTextureLocation(CustomArmorStand pEntity) {
        return new ResourceLocation("mcspartan","textures/models/entity/custom_armor_stand.png");
    }

    /**
     * Returns the location of an entity's texture.
     */

    protected void setupRotations(CustomArmorStand pEntityLiving, PoseStack pMatrixStack, float pAgeInTicks, float pRotationYaw, float pPartialTicks) {
        pMatrixStack.mulPose(Axis.YP.rotationDegrees(180.0F - pRotationYaw));
        float f = (float)(pEntityLiving.level().getGameTime() - pEntityLiving.lastHit) + pPartialTicks;
        if (f < 5.0F) {
            pMatrixStack.mulPose(Axis.YP.rotationDegrees(Mth.sin(f / 1.5F * (float)Math.PI) * 3.0F));
        }

    }

    protected boolean shouldShowName(CustomArmorStand pEntity) {
        double d0 = this.entityRenderDispatcher.distanceToSqr(pEntity);
        float f = pEntity.isCrouching() ? 32.0F : 64.0F;
        return d0 >= (double)(f * f) ? false : pEntity.isCustomNameVisible();
    }

    @Nullable
    @Override
    protected RenderType getRenderType(CustomArmorStand pLivingEntity, boolean pBodyVisible, boolean pTranslucent, boolean pGlowing) {
        ResourceLocation resourcelocation = this.getTextureLocation(pLivingEntity);
        if (pTranslucent) {
            return RenderType.entityTranslucent(resourcelocation);
        } else {
            return pBodyVisible ? RenderType.entityCutoutNoCull(resourcelocation) : null;
        }
    }

}
