package net.hero61.projectspartan.entity.client.model;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.hero61.projectspartan.entity.custom.CustomArmorStand;
import net.hero61.projectspartan.util.ModelUtils;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class ModelCustomStand extends HumanoidModel<CustomArmorStand> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public ModelCustomStand(ModelPart modelPart) {
        super(modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();

		 PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(70, 0).addBox(-4.0F, -33.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		 PartDefinition body =root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(70, 16).addBox(-4.0F, -25.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(94, 16).addBox(-8.0F, -25.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		 PartDefinition left_arm =root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(88, 66).addBox(4.0F, -25.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		 PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(82, 82).addBox(-4.0F, -14.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(70, 70).addBox(0.0F, -14.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		left_leg.addOrReplaceChild("cube1", CubeListBuilder.create().texOffs(56, 68).addBox(-3.0F, -36.02F, -1.0F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 2.0F, -8.2321F));

		 left_leg.addOrReplaceChild("cube24", CubeListBuilder.create().texOffs(0, 15).addBox(-3.0F, -4.02F, -1.0F, 5.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 2.0F, -8.2321F));

		 left_leg.addOrReplaceChild("cube25", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.02F, -1.0F, 5.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -32.0F, -8.2321F));

		left_leg.addOrReplaceChild("cube2", CubeListBuilder.create().texOffs(98, 83).addBox(-6.049F, -4.0F, -3.183F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 0.5236F, 0.0F));

		 left_leg.addOrReplaceChild("cube36", CubeListBuilder.create().texOffs(85, 58).addBox(-6.049F, -4.0F, -3.183F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 0.5236F, 0.0F));

		 left_leg.addOrReplaceChild("cube13", CubeListBuilder.create().texOffs(42, 68).addBox(-6.049F, -34.0F, -3.183F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 0.5236F, 0.0F));

		 left_leg.addOrReplaceChild("cube14", CubeListBuilder.create().texOffs(28, 64).addBox(-8.6471F, -34.0F, -5.7811F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 1.0472F, 0.0F));

		 left_leg.addOrReplaceChild("cube15", CubeListBuilder.create().texOffs(0, 30).addBox(-9.5981F, -34.0F, -9.3301F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 1.5708F, 0.0F));

		 left_leg.addOrReplaceChild("cube16", CubeListBuilder.create().texOffs(14, 64).addBox(-8.6471F, -34.0F, -12.8792F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 2.0944F, 0.0F));

		 left_leg.addOrReplaceChild("cube17", CubeListBuilder.create().texOffs(0, 64).addBox(-6.049F, -34.0F, -15.4772F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 2.618F, 0.0F));

		 left_leg.addOrReplaceChild("cube18", CubeListBuilder.create().texOffs(56, 34).addBox(-2.5F, -34.0F, -16.4282F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 3.1416F, 0.0F));

		 left_leg.addOrReplaceChild("cube19", CubeListBuilder.create().texOffs(56, 0).addBox(1.049F, -34.0F, -15.4772F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -2.618F, 0.0F));

		 left_leg.addOrReplaceChild("cube20", CubeListBuilder.create().texOffs(42, 34).addBox(3.6471F, -34.0F, -12.8792F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -2.0944F, 0.0F));

		 left_leg.addOrReplaceChild("cube21", CubeListBuilder.create().texOffs(42, 0).addBox(4.5981F, -34.0F, -9.3301F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -1.5708F, 0.0F));

		 left_leg.addOrReplaceChild("cube22", CubeListBuilder.create().texOffs(28, 30).addBox(3.6471F, -34.0F, -5.7811F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -1.0472F, 0.0F));

		 left_leg.addOrReplaceChild("cube23", CubeListBuilder.create().texOffs(14, 30).addBox(1.049F, -34.0F, -3.183F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -0.5236F, 0.0F));

		left_leg.addOrReplaceChild("cube3", CubeListBuilder.create().texOffs(104, 42).addBox(-8.6471F, -4.01F, -5.7811F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 1.0472F, 0.0F));

		 left_leg.addOrReplaceChild("cube35", CubeListBuilder.create().texOffs(101, 100).addBox(-8.6471F, -4.01F, -5.7811F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 1.0472F, 0.0F));

		left_leg.addOrReplaceChild("cube4", CubeListBuilder.create().texOffs(70, 49).addBox(-9.5981F, -4.02F, -9.3301F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 1.5708F, 0.0F));

		 left_leg.addOrReplaceChild("cube34", CubeListBuilder.create().texOffs(68, 61).addBox(-9.5981F, -4.02F, -9.3301F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 1.5708F, 0.0F));

		left_leg.addOrReplaceChild("cube5", CubeListBuilder.create().texOffs(81, 100).addBox(3.6471F, -4.01F, 7.8792F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, -1.0472F, 0.0F));

		 left_leg.addOrReplaceChild("cube33", CubeListBuilder.create().texOffs(94, 51).addBox(3.6471F, -4.01F, 7.8792F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, -1.0472F, 0.0F));

		left_leg.addOrReplaceChild("cube6", CubeListBuilder.create().texOffs(98, 75).addBox(1.049F, -4.0F, 9.4772F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, -0.5236F, 0.0F));

		 left_leg.addOrReplaceChild("cube32", CubeListBuilder.create().texOffs(88, 34).addBox(1.049F, -4.0F, 9.4772F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, -0.5236F, 0.0F));

		left_leg.addOrReplaceChild("cube7", CubeListBuilder.create().texOffs(22, 98).addBox(-2.5F, -4.02F, 10.4282F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -7.0F));

		 left_leg.addOrReplaceChild("cube31", CubeListBuilder.create().texOffs(88, 43).addBox(-2.5F, -4.02F, 10.4282F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -32.0F, -7.0F));

		left_leg.addOrReplaceChild("cube8", CubeListBuilder.create().texOffs(104, 31).addBox(1.049F, -4.0F, -3.183F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, -0.5236F, 0.0F));

		 left_leg.addOrReplaceChild("cube26", CubeListBuilder.create().texOffs(39, 102).addBox(1.049F, -4.0F, -3.183F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, -0.5236F, 0.0F));

		left_leg.addOrReplaceChild("cube9", CubeListBuilder.create().texOffs(0, 98).addBox(3.6471F, -4.01F, -5.7811F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, -1.0472F, 0.0F));

		 left_leg.addOrReplaceChild("cube27", CubeListBuilder.create().texOffs(94, 0).addBox(3.6471F, -4.01F, -5.7811F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, -1.0472F, 0.0F));

		 left_leg.addOrReplaceChild("cube10", CubeListBuilder.create().texOffs(70, 40).addBox(-9.5981F, -4.02F, 2.3301F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 1.5708F, 0.0F));

		 left_leg.addOrReplaceChild("cube28", CubeListBuilder.create().texOffs(70, 31).addBox(-9.5981F, -4.02F, 2.3301F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 1.5708F, 0.0F));

		 left_leg.addOrReplaceChild("cube11", CubeListBuilder.create().texOffs(102, 61).addBox(-8.6471F, -4.01F, 7.8792F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 1.0472F, 0.0F));

		 left_leg.addOrReplaceChild("cube29", CubeListBuilder.create().texOffs(102, 8).addBox(-8.6471F, -4.01F, 7.8792F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 1.0472F, 0.0F));

		 left_leg.addOrReplaceChild("cube12", CubeListBuilder.create().texOffs(64, 96).addBox(-6.049F, -4.0F, 9.4772F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 0.5236F, 0.0F));

		 left_leg.addOrReplaceChild("cube30", CubeListBuilder.create().texOffs(92, 92).addBox(-6.049F, -4.0F, 9.4772F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 0.5236F, 0.0F));

		return LayerDefinition.create(definition, 128, 128);
	}


	@Override
	public void setupAnim(CustomArmorStand pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {

	}
}