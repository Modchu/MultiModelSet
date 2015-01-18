package modchu.model.multimodel;
import modchu.lib.characteristic.Modchu_ModelRenderer;
import modchu.model.ModchuModel_IEntityCaps;
	public Modchu_ModelRenderer RibonR;
	public Modchu_ModelRenderer CatEL;
	public Modchu_ModelRenderer CatER;
	public Modchu_ModelRenderer Prim;
	public Modchu_ModelRenderer Tuno1;
	public Modchu_ModelRenderer Tuno2;
	public Modchu_ModelRenderer Tuno3;
	public Modchu_ModelRenderer Tuno4;
	public Modchu_ModelRenderer Hyoutan1;
	public Modchu_ModelRenderer Hyoutan2;
	private boolean initAimedBow;
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
		ChignonR.addBox(-5F, -7F, 0.2F, 1, 3, 3, f);
		ChignonR.setRotationPoint(0.0F, 0.0F, 0.0F);
		ChignonL = new Modchu_ModelRenderer(this, 24, 18);
		ChignonL.addBox(4F, -7F, 0.2F, 1, 3, 3, f);
		ChignonL.setRotationPoint(0.0F, 0.0F, 0.0F);
		ChignonB = new Modchu_ModelRenderer(this, 0, 3);
		ChignonB.addBox(-1F, -7.2F, 3.5F, 2, 3, 2, f);
		ChignonB.setRotationPoint(0.0F, -1.0F, 0.0F);
		Tail.addBox(-2F, -4.5F, 3F, 4, 11, 2, f);
		Tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		SideTailR.addBox(-4.5F, -5F, -3F, 1, 8, 2, f);
		SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);
		SideTailL = new Modchu_ModelRenderer(this, 58, 21);
		SideTailL.setMirror(true);
		SideTailL.addBox(3.5F, -5F, -3F, 1, 8, 2, f);
		SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);
		RibonL.setMirror(true);
		RibonL.addBox(-5F, -10F, 3.5F, 4, 4, 2, f);
		RibonL.setRotationPoint(0.0F, -1.0F, 0.0F);
		RibonL.rotateAngleX = 6.108653F;
		RibonR = new Modchu_ModelRenderer(this, 52, 10);
		RibonR.setMirror(true);
		RibonR.addBox(1.0F, -10F, 3.5F, 4, 4, 2, f);
		RibonR.setRotationPoint(0.0F, -1.0F, 0.0F);
		RibonR.rotateAngleX = 6.108653F;
		CatEL = new Modchu_ModelRenderer(this, 0, 0);
		CatEL.addBox(1.0F, -3F, 6F, 3, 3, 1, f);
		CatEL.setRotationPoint(0.0F, -1.0F, 0.0F);
		CatEL.rotateAngleX = -5.934119F;
		CatER = new Modchu_ModelRenderer(this, 0, 4);
		CatER.addBox(-4F, -3F, 6F, 3, 3, 1, f);
		CatER.setRotationPoint(0.0F, -1.0F, 0.0F);
		CatER.rotateAngleX = -5.934119F;
		Prim = new Modchu_ModelRenderer(this, 24, 16);
		Prim.addBox(-2F, -8.7F, -3.5F, 4, 1, 0, f);
		Prim.setRotationPoint(0.0F, -1.0F, 0.0F);
		Tuno1 = new Modchu_ModelRenderer(this, 0, 16);
		Tuno1.addBox(-1F, 7F, 1.0F, 2, 4, 2, f);
		Tuno1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tuno2 = new Modchu_ModelRenderer(this, 60, 16);
		Tuno2.addBox(0.0F, 9F, 6F, 1, 4, 1, f);
		Tuno2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tuno3 = new Modchu_ModelRenderer(this, 0, 16);
		Tuno3.setMirror(true);
		Tuno3.addBox(-1F, 7F, -3F, 2, 4, 2, f);
		Tuno3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tuno4 = new Modchu_ModelRenderer(this, 56, 16);
		Tuno4.addBox(0.0F, 9F, -7F, 1, 4, 1, f);
		Tuno4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hyoutan1 = new Modchu_ModelRenderer(this, 0, 23);
		Hyoutan1.addBox(0.0F, 3F, 3F, 3, 3, 3, f);
		Hyoutan1.setRotationPoint(-1.0F, 1.0F, 0.0F);
		Hyoutan2 = new Modchu_ModelRenderer(this, 0, 24);
		Hyoutan2.addBox(-1F, 5F, 2.0F, 2, 2, 2, f);
		Hyoutan2.setRotationPoint(-1.0F, 1.0F, 0.0F);
		eyeL = new Modchu_ModelRenderer(this, 24, 0);
		eyeL.addBox(-1F, -1F, -4.001F, 2, 2, 1, f + 0.1F);
		eyeL.setRotationPoint(-2.0F, -3.0F, 0.0F);
		eyeR = new Modchu_ModelRenderer(this, 26, 0);
		eyeR.addBox(-1F, -1F, -4.001F, 2, 2, 1, f + 0.1F);
		eyeR.setRotationPoint(2.0F, -3.0F, 0.0F);
		if (isAfterInit) afterInit(f, f1);
	}
	public void defaultAddChildSetting() {
		super.defaultAddChildSetting();
		bipedHead.addChild(RibonL);
		bipedHead.addChild(RibonR);
		bipedHead.addChild(CatEL);
		bipedHead.addChild(CatER);
		bipedHead.addChild(Prim);
		bipedHead.addChild(Tuno1);
		bipedHead.addChild(Tuno2);
		bipedHead.addChild(Tuno3);
		bipedHead.addChild(Tuno4);
		bipedLeftArm.addChild(Hyoutan1);
		bipedLeftArm.addChild(Hyoutan2);
	}
	public void actionPartsAddChild() {
		super.actionPartsAddChild();
		bipedLeftArm.removeChild(Hyoutan1);
		bipedLeftArm.removeChild(Hyoutan2);
		Skirt.addChild(Hyoutan1);
		Skirt.addChild(Hyoutan2);
	}
	public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5, ModchuModel_IEntityCaps entityCaps) {
		super.setRotationAnglesLM(f, f1, f2, f3, f4, f5, entityCaps);
		Hyoutan1.rotateAngleX = Hyoutan2.rotateAngleX = Hyoutan1.rotateAngleY = Hyoutan2.rotateAngleY = -0.7853982F;
			if (!initAimedBow
					&& !Modchu_EntityCapsHelper.getCapsValueBoolean(this, entityCaps, caps_actionFlag)) {
				bipedLeftArm.removeChild(Hyoutan1);
				bipedLeftArm.removeChild(Hyoutan2);
				bipedBody.addChild(Hyoutan1);
				bipedBody.addChild(Hyoutan2);
				Hyoutan1.setRotationPoint(4.0F, -2.0F, 0.0F);
				Hyoutan2.setRotationPoint(4.0F, -2.0F, 0.0F);
				initAimedBow = true;
			}
		} else {
			if (initAimedBow
					&& !Modchu_EntityCapsHelper.getCapsValueBoolean(this, entityCaps, caps_actionFlag)) {
				initAimedBow = false;
				bipedBody.removeChild(Hyoutan1);
				bipedBody.removeChild(Hyoutan2);
				bipedLeftArm.addChild(Hyoutan1);
				bipedLeftArm.addChild(Hyoutan2);
				Hyoutan1.setRotationPoint(-1.0F, 1.0F, 0.0F);
				Hyoutan2.setRotationPoint(-1.0F, 1.0F, 0.0F);
			}
		}
		Prim.setRotateAngleX(bipedHead.getRotateAngleX());
		Tuno1.rotateAngleX = 2.356194F;
		Tuno2.rotateAngleX = 1.919862F;
		Tuno3.rotateAngleX = -2.356194F;
		Tuno4.rotateAngleX = -1.919862F;
		Tuno1.rotateAngleY = Tuno2.rotateAngleY = Tuno3.rotateAngleY = Tuno4.rotateAngleY = 1.570796F;
	}
	public float getWidth(ModchuModel_IEntityCaps entityCaps) {
		return 0.8F;
	}
	public void action1Reset(float f, float f1, float f2, float f3, float f4, float f5, ModchuModel_IEntityCaps entityCaps) {
		super.action1Reset(f, f1, f2, f3, f4, f5, entityCaps);
		Hyoutan1.setRotationPoint(4.0F, -7.0F, 0.0F);
		Hyoutan2.setRotationPoint(4.0F, -7.0F, 0.0F);
	}
	public void actionRelease1(ModchuModel_IEntityCaps entityCaps) {
		super.actionRelease1(entityCaps);
		Hyoutan1.setRotationPoint(-1.0F, 1.0F, 0.0F);
		Hyoutan2.setRotationPoint(-1.0F, 1.0F, 0.0F);
	}
	public String getUsingTexture() {
		return null;
	}
}