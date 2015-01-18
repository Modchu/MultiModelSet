package modchu.model.multimodel;
		this(0.0F);
	}
		this(f, 0.0F);
	}
		this(f, f1, 64, 32);
	}
		super(f, f1, i < 0 ? 64 : i, j < 0 ? 32 : j);
	}
	public void initModel(float f, float f1, boolean isAfterInit) {
		super.initModel(f, f1, false);
		bipedHeadwear.setTextureOffset(42, -3);
		bipedHeadwear.addBox(-4F, 0F, 1F, 8, 4, 3, f);
		bipedHeadwear.setRotationPoint(0F, 0F, 0F);
		bipedRightArm.setTextureOffset(52, 8);
		bipedRightArm.addBox(-2F, -1F, -1F, 2, 10, 2, f);
		bipedRightArm.setRotationPoint(-3F, 1.0F, 0F);
		bipedLeftArm.setTextureOffset(52, 8);
		bipedLeftArm.mirror = true;
		bipedLeftArm.addBox(0F, -1F, -1F, 2, 10, 2, f);
		bipedLeftArm.setRotationPoint(3F, 1.0F, 0F);
		Tail.setTextureOffset(43, 17);
		Tail.addBox(-1.5F, -6.8F, 4F, 3, 9, 3, f);
		Tail.setRotationPoint(0F, 0F, 0F);
		eyeL.cubeList.clear();
		if (isAfterInit) afterInit(f, f1);
	}
	public void actionPartsInit(float f, float f1) {
		super.actionPartsInit(f, f1);
		rightArm = new Modchu_ModelRenderer(this, 52, 8);
		rightArm.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, f);
		rightArm.setRotationPoint(-3.0F, 9.5F, 0.0F);
		rightArm2.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, f);
		rightArm2.setRotationPoint(0.0F, 5.0F, 0.0F);
		rightHand.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, f);
		rightHand.setRotationPoint(0.0F, 3.0F, 0.0F);
		leftArm.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, f);
		leftArm.setRotationPoint(3.0F, 9.5F, 0.0F);
		leftArm2.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, f);
		leftArm2.setRotationPoint(0.0F, 2.0F, 0.0F);
		leftHand.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, f);
		leftHand.setRotationPoint(0.0F, 3.0F, 0.0F);
				leftArm.showModel = rightArm2.showModel = leftArm2.showModel = false;
	}
	public void defaultAddChildSetting() {
		super.defaultAddChildSetting();
		bipedHead.removeChild(eyeR);
		bipedHead.removeChild(eyeL);
	}
}