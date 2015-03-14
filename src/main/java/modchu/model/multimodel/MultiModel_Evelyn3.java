package modchu.model.multimodel;import modchu.lib.Modchu_AS;import modchu.lib.Modchu_EntityCapsHelper;import modchu.lib.Modchu_ModelPlateMaster;import modchu.lib.Modchu_Reflect;import modchu.model.ModchuModel_IEntityCaps;import modchu.model.ModchuModel_ModelRenderer;import modchu.model.multimodel.base.MultiModel_SR2;public class MultiModel_Evelyn3 extends MultiModel_SR2 {	//fields	public ModchuModel_ModelRenderer bipedHeadwear2;	public ModchuModel_ModelRenderer BodyC;	public ModchuModel_ModelRenderer BodyR;	public ModchuModel_ModelRenderer BodyL;	public ModchuModel_ModelRenderer Skirt1;	public ModchuModel_ModelRenderer Skirt2;	public ModchuModel_ModelRenderer Skirt3;	public ModchuModel_ModelRenderer Skirt4;	public ModchuModel_ModelRenderer backRightLeg;	public ModchuModel_ModelRenderer backLeftLeg;	protected boolean isRidingMaster = false;	public ModchuModel_ModelRenderer SkirtTopBack;	public ModchuModel_ModelRenderer SkirtTopL;	public ModchuModel_ModelRenderer SkirtTopBackL;	public ModchuModel_ModelRenderer SkirtFrontL;	public ModchuModel_ModelRenderer SkirtLeftFront;	public ModchuModel_ModelRenderer SkirtBackL;	public ModchuModel_ModelRenderer SkirtLeftBack;	public ModchuModel_ModelRenderer SkirtRightBack;	public ModchuModel_ModelRenderer SkirtRightFront;	public MultiModel_Evelyn3() {		this(0.0F);	}	public MultiModel_Evelyn3(float f) {		this(f, 0.0F);	}	public MultiModel_Evelyn3(float f, float f1) {		this(f, f1, 64, 64);	}	public MultiModel_Evelyn3(float f, float f1, int i, int j) {		super(f, f1, i < 0 ? 64 : i, j < 0 ? 64 : j);	}	@Override	public void initModel(float f, float f1, boolean isAfterInit) {		textureWidth = 64;		textureHeight = 64;		f1 = 0.0F;		/** HEAD : bipedHead **/		bipedHead = new ModchuModel_ModelRenderer(this, 0, 0);		bipedHead.setTextureOffset(0, 0).addBox(-4F, -7.5F, -4F, 8, 8, 8, f - 0.9F); // head		bipedHead.setTextureOffset(36, 14).addBox(-3F, -7.5F, -2F, 6, 2, 6, f + 0.2F); // cap		bipedHead.setRotationPoint(0F, 0F, 0F);		bipedHeadwear = new ModchuModel_ModelRenderer(this, 0, 16);		bipedHeadwear.addBox(-3F, 0.5F, -1F, 6, 5, 2, f);		bipedHeadwear.setRotationPoint(0F, -1F, 2F);		bipedHeadwear2 = new ModchuModel_ModelRenderer(this, 0, 23);		bipedHeadwear2.addBox(-3F, 0.5F, -1F, 6, 6, 2, f);		bipedHeadwear2.setRotationPoint(0F, 5F, 0F);		eyeR = new ModchuModel_ModelRenderer(this, 17, 1);		eyeR.addPlate(-1.9F, -4F, -3.11F, 1, 2, 0, f);		eyeR.setRotationPoint(0.0F, 0.0F, 0.0F);		eyeL = new ModchuModel_ModelRenderer(this, 22, 1);		eyeL.addPlate(0.9F, -4F, -3.11F, 1, 2, 0, f);		eyeL.setRotationPoint(0.0F, 0.0F, 0.0F);		ChignonB = new ModchuModel_ModelRenderer(this, 40, 0);		ChignonB.addBox(0F, 0F, 0F, 3, 3, 1, f);		ChignonB.setRotationPoint(-1.5F, -5.5F, 3F);		ChignonR = new ModchuModel_ModelRenderer(this, 0, 2);		ChignonR.addBox(0F, 0F, 0F, 1, 3, 3, f);		ChignonR.setRotationPoint(-4F, -6F, -0.5F);		ChignonL = new ModchuModel_ModelRenderer(this, 54, 14);		ChignonL.mirror = true;		ChignonL.addBox(0F, 0F, 0F, 1, 3, 3, f);		ChignonL.setRotationPoint(3F, -6F, -0.5F);		Tail = new ModchuModel_ModelRenderer(this, 28, 16);		Tail.addBox(-1F, -1F, -0.5F, 2, 8, 2, f);		Tail.setRotationPoint(0F, -4F, 4F);		SideTailR = new ModchuModel_ModelRenderer(this, 16, 16);		SideTailR.addBox(-1F, -1F, -1F, 1, 8, 2, f);		SideTailR.setRotationPoint(-3.5F, -4.5F, 1F);		SideTailL = new ModchuModel_ModelRenderer(this, 22, 16);		SideTailL.mirror = true;		SideTailL.addBox(0F, -1F, -1F, 1, 8, 2, f);		SideTailL.setRotationPoint(3.5F, -4.5F, 1F);		/** BODY & ARMS : bipedBody, bipedRightArm, bipedLeftArm **/		bipedBody = new ModchuModel_ModelRenderer(this, 24, 0);		bipedBody.addBox(-3F, 0F, -1.5F, 6, 3, 4, f);//hip		bipedBody.setRotationPoint(0F, 6F, 0F);		BodyC = new ModchuModel_ModelRenderer(this, 0, 0);		BodyC.setTextureOffset(16, 5).addBox(-1F, -7F, -1F, 2, 1, 2, f);//neck		BodyC.setTextureOffset(20, 31).addBox(-3F, -6F, -1.5F, 6, 2, 3, f + 0.1F);//body upper		BodyC.setTextureOffset(32, 7).addBox(-2.5F, -4F, -1.5F, 5, 4, 3, f);//body waist		BodyC.setRotationPoint(0F, 0F, 0F);		BodyC.rotateAngleX = -0.05F;		BodyR = new ModchuModel_ModelRenderer(this, 16, 26);		BodyR.addBox(-1.5F, -3F, 0F, 3, 3, 2, f);		BodyR.setRotationPoint(-1F, -1.5F, -1.6F);		BodyR.rotateAngleX = 0.4F;		BodyR.rotateAngleZ = -0.2F;		BodyL = new ModchuModel_ModelRenderer(this, 26, 26);		BodyL.mirror = true;		BodyL.addBox(-1.5F, -3F, 0F, 3, 3, 2, f);		BodyL.setRotationPoint(1F, -1.5F, -1.6F);		BodyL.rotateAngleX = 0.4F;		BodyL.rotateAngleZ = 0.2F;		bipedRightArm = new ModchuModel_ModelRenderer(this, 48, 0);		bipedRightArm.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, f);		bipedRightArm.setRotationPoint(-3F, 1.5F, 0F);		bipedLeftArm = new ModchuModel_ModelRenderer(this, 56, 0);		bipedLeftArm.mirror = true;		bipedLeftArm.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, f);		bipedLeftArm.setRotationPoint(3F, 1.5F, 0F);		/** LEGINS : Skirt **/		Skirt = new ModchuModel_ModelRenderer(this, 0, 31);		Skirt.addBox(-3.5F, 1F, -3F, 7, 3, 6, f + 0.2F);		Skirt.setRotationPoint(0F, 6F, 0F);		Skirt1 = new ModchuModel_ModelRenderer(this, 0, 40);		Skirt1.addBox(-3.2F, -1F, -3F, 5, 7, 5, f + 0.2F);		Skirt1.setRotationPoint(-1F, 4F, -1F);		Skirt1.rotateAngleX = -0.2F;		Skirt1.rotateAngleZ = 0.2F;		Skirt2 = new ModchuModel_ModelRenderer(this, 20, 40);		Skirt2.mirror = true;		Skirt2.addBox(-1.8F, -1F, -3F, 5, 7, 5, f + 0.2F);		Skirt2.setRotationPoint(1F, 4F, -1F);		Skirt2.rotateAngleX = -0.2F;		Skirt2.rotateAngleZ = -0.2F;		Skirt3 = new ModchuModel_ModelRenderer(this, 20, 52);		Skirt3.mirror = true;		Skirt3.addBox(-1.8F, -1F, -2F, 5, 7, 5, f + 0.2F);		Skirt3.setRotationPoint(1F, 4F, 1F);		Skirt3.rotateAngleX = 0.2F;		Skirt3.rotateAngleZ = -0.2F;		Skirt4 = new ModchuModel_ModelRenderer(this, 0, 52);		Skirt4.addBox(-3.2F, -1F, -2F, 5, 7, 5, f + 0.2F);		Skirt4.setRotationPoint(-1F, 4F, 1F);		Skirt4.rotateAngleX = 0.2F;		Skirt4.rotateAngleZ = 0.2F;		/** BOTTOMS : upperRightLeg, upperLeftLeg **/		rightLeg = new ModchuModel_ModelRenderer(this, 44, 33);		rightLeg.addBox(-1.2F, -1F, -2F, 2, 7, 3, f + 0.1F);		leftLeg = new ModchuModel_ModelRenderer(this, 54, 33);		leftLeg.mirror = true;		leftLeg.addBox(-0.8F, -1F, -2F, 2, 7, 3, f + 0.1F);		backRightLeg = new ModchuModel_ModelRenderer(this, 44, 43);		backRightLeg.addBox(-1F, -7.5F, -1.5F, 2, 7, 3, f + 0.2F);		backLeftLeg = new ModchuModel_ModelRenderer(this, 54, 43);		backLeftLeg.mirror = true;		backLeftLeg.addBox(-1F, -7.5F, -1.5F, 2, 7, 3, f + 0.2F);		rightLeg2 = new ModchuModel_ModelRenderer(this, 44, 53);		rightLeg2.addBox(-1F, 0.5F, -1.5F, 2, 8, 3, f + 0.2F);		leftLeg2 = new ModchuModel_ModelRenderer(this, 54, 53);		leftLeg2.mirror = true;		leftLeg2.addBox(-1F, 0.5F, -1.5F, 2, 8, 3, f + 0.2F);		mainFrame = new ModchuModel_ModelRenderer(this, 0, 0);		mainFrame.setRotationPoint(0F, 0F, 0F);		if (isAfterInit) afterInit(f, f1);	}	@Override	public void actionPartsInit(float f, float f1) {		rightArm = new ModchuModel_ModelRenderer(this, 48, 0);		rightArm.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, f);		rightArm.setRotationPoint(-3.0F, 9.5F, 0.0F);		rightArmPlus = new ModchuModel_ModelRenderer(this);		((ModchuModel_ModelRenderer) rightArmPlus.setTextureOffset(52, 0)).addPlate(-1.0F, -1.0F, -3.01F, 2, 2, 4, f);		rightArmPlus.rotateAngleX = 1.570796313F;		rightArm2 = new ModchuModel_ModelRenderer(this, 48, 6);		rightArm2.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, f);		rightArm2.setRotationPoint(0.0F, 3.0F, 0.0F);		rightArmPlus2 = new ModchuModel_ModelRenderer(this);		((ModchuModel_ModelRenderer) rightArmPlus2.setTextureOffset(52, 0)).addPlate(-1.0F, -1.0F, 0.01F, 2, 2, 4, f);		((ModchuModel_ModelRenderer) rightArmPlus2.setTextureOffset(52, 0)).addPlate(-1.0F, -1.0F, -3.01F, 2, 2, 4, f);		rightArmPlus2.rotateAngleX = 1.570796313F;		rightHand = new ModchuModel_ModelRenderer(this, 48, 10);		rightHand.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, f);		rightHand.setRotationPoint(0.0F, 4.0F, 0.0F);		leftArm = new ModchuModel_ModelRenderer(this, 56, 0);		leftArm.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, f);		leftArm.setRotationPoint(3.0F, 9.5F, 0.0F);		leftArmPlus = new ModchuModel_ModelRenderer(this);		((ModchuModel_ModelRenderer) leftArmPlus.setTextureOffset(60, 0)).addPlate(-1.0F, -1.0F, -3.01F, 2, 2, 4, f);		leftArmPlus.rotateAngleX = 1.570796313F;		leftArm2 = new ModchuModel_ModelRenderer(this, 56, 6);		leftArm2.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, f);		leftArm2.setRotationPoint(0.0F, 3.0F, 0.0F);		leftArmPlus2 = new ModchuModel_ModelRenderer(this);		((ModchuModel_ModelRenderer) leftArmPlus2.setTextureOffset(60, 0)).addPlate(-1.0F, -1.0F, 0.01F, 2, 2, 4, f);		((ModchuModel_ModelRenderer) leftArmPlus2.setTextureOffset(60, 0)).addPlate(-1.0F, -1.0F, -3.01F, 2, 2, 4, f);		leftArmPlus2.rotateAngleX = 1.570796313F;		leftHand = new ModchuModel_ModelRenderer(this, 56, 10);		leftHand.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, f);		leftHand.setRotationPoint(0.0F, 4.0F, 0.0F);		bipedRightLeg = new ModchuModel_ModelRenderer(this);		bipedLeftLeg = new ModchuModel_ModelRenderer(this);		rightHand.showModel = leftHand.showModel = rightArm.showModel =				leftArm.showModel = rightArm2.showModel = leftArm2.showModel =				rightArmPlus.showModel = rightArmPlus2.showModel = leftArmPlus.showModel =				leftArmPlus2.showModel = false;	}	@Override	public void skirtFloatsInit(float f, float f1) {		if (Modchu_EntityCapsHelper.getCapsValueInt(this, null, caps_skirtFloats) < 2) return;		textureWidth = 64;		textureHeight = 64;		//SkirtR 上		SkirtTop = new ModchuModel_ModelRenderer(this, 5, 40);		SkirtTop.addPlate(0.0F, 0.0F, 0.0F, 5, 5, Modchu_ModelPlateMaster.planeXZTop);		SkirtTop.setRotationPoint(-3.0F, -2.5F, -2.5F);		//SkirtR 前		SkirtFront = new ModchuModel_ModelRenderer(this, 5, 45);		SkirtFront.addPlate(0.0F, 0.0F, 0.0F, 5, 7, Modchu_ModelPlateMaster.planeXYFront);		SkirtFront.setRotationPoint(0.0F, 0.0F, 0.0F);		//SkirtR 右前		SkirtRightFront = new ModchuModel_ModelRenderer(this, 0, 45);		SkirtRightFront.addPlate(0.0F, 0.0F, 0.0F, 5, 7, Modchu_ModelPlateMaster.planeZYRight);		SkirtRightFront.setRotationPoint(0.0F, 0.0F, 0.0F);		//SkirtR 上後		SkirtTopBack = new ModchuModel_ModelRenderer(this, 5, 52);		SkirtTopBack.addPlate(0.0F, 0.0F, 0.0F, 5, 5, Modchu_ModelPlateMaster.planeXZTop);		SkirtTopBack.setRotationPoint(-5.0F, -2.5F, -1.0F);		//SkirtR 右後		SkirtRightBack = new ModchuModel_ModelRenderer(this, 0, 57);		SkirtRightBack.addPlate(0.0F, 0.0F, 0.0F, 5, 7, Modchu_ModelPlateMaster.planeZYRight);		SkirtRightBack.setRotationPoint(0.0F, 0.0F, 0.0F);		//SkirtR 後ろ		SkirtBack = new ModchuModel_ModelRenderer(this, 15, 57);		SkirtBack.addPlate(0.0F, 0.0F, 0.0F, 5, 7, Modchu_ModelPlateMaster.planeXYBack);		SkirtBack.setRotationPoint(0.0F, 0.0F, 5.0F);		//SkirtL 上前		SkirtTopL = new ModchuModel_ModelRenderer(this, 25, 40);		SkirtTopL.mirror = true;		SkirtTopL.addPlate(0.0F, 0.0F, 0.0F, 5, 5, Modchu_ModelPlateMaster.planeXZTop);		SkirtTopL.setRotationPoint(-1.0F, -2.5F, -2.5F);		//SkirtL 前		SkirtFrontL = new ModchuModel_ModelRenderer(this, 25, 45);		SkirtFrontL.mirror = true;		SkirtFrontL.addPlate(0.0F, 0.0F, 0.0F, 5, 7, Modchu_ModelPlateMaster.planeXYFront);		SkirtFrontL.setRotationPoint(0.0F, 0.0F, 0.0F);		//SkirtL 左前		SkirtLeftFront = new ModchuModel_ModelRenderer(this, 20, 45);		SkirtLeftFront.mirror = true;		SkirtLeftFront.addPlate(0.0F, 0.0F, 0.0F, 5, 7, Modchu_ModelPlateMaster.planeZYLeft);		SkirtLeftFront.setRotationPoint(5.0F, 0.0F, 0.0F);		//SkirtL 上後		SkirtTopBackL = new ModchuModel_ModelRenderer(this, 25, 52);		SkirtTopBackL.mirror = true;		SkirtTopBackL.addPlate(0.0F, 0.0F, 0.0F, 5, 5, Modchu_ModelPlateMaster.planeXZTop);		SkirtTopBackL.setRotationPoint(0.0F, -2.5F, -1.0F);		//SkirtL 左後		SkirtLeftBack = new ModchuModel_ModelRenderer(this, 20, 57);		SkirtLeftBack.mirror = true;		SkirtLeftBack.addPlate(0.0F, 0.0F, 0.0F, 5, 7, Modchu_ModelPlateMaster.planeZYLeft);		SkirtLeftBack.setRotationPoint(5.0F, 0.0F, 0.0F);		//SkirtL 後ろ		SkirtBackL = new ModchuModel_ModelRenderer(this, 35, 57);		SkirtBackL.mirror = true;		SkirtBackL.addPlate(0.0F, 0.0F, 0.0F, 5, 7, Modchu_ModelPlateMaster.planeXYBack);		SkirtBackL.setRotationPoint(0.0F, 0.0F, 5.0F);		setCapsValue(null, caps_visible, Skirt1, false);		setCapsValue(null, caps_visible, Skirt2, false);		setCapsValue(null, caps_visible, Skirt3, false);		setCapsValue(null, caps_visible, Skirt4, false);	}	@Override	public void defaultAddChildSetting() {		super.defaultAddChildSetting();		bipedHeadwear.addChild(bipedHeadwear2);		bipedBody.addChild(BodyC);		BodyC.addChild(BodyR);		BodyC.addChild(BodyL);		Skirt.addChild(Skirt1);		Skirt.addChild(Skirt2);		Skirt.addChild(Skirt3);		Skirt.addChild(Skirt4);		bipedBody.addChild(rightLeg);		bipedBody.addChild(leftLeg);		rightLeg.addChild(backRightLeg);		leftLeg.addChild(backLeftLeg);		rightLeg.addChild(rightLeg2);		leftLeg.addChild(leftLeg2);	}	@Override	public void defaultSkirtFloatsAddChild() {		if (Modchu_EntityCapsHelper.getCapsValueInt(this, null, caps_skirtFloats) < 2) return;		Skirt1.addChild(SkirtTop);		SkirtTop.addChild(SkirtFront);		SkirtTop.addChild(SkirtRightFront);		Skirt3.addChild(SkirtTopBack);		SkirtTopBack.addChild(SkirtRightBack);		SkirtTopBack.addChild(SkirtBack);		Skirt2.addChild(SkirtTopL);		SkirtTopL.addChild(SkirtFrontL);		SkirtTopL.addChild(SkirtLeftFront);		Skirt4.addChild(SkirtTopBackL);		SkirtTopBackL.addChild(SkirtLeftBack);		SkirtTopBackL.addChild(SkirtBackL);	}	@Override	public void setLivingAnimationsLM(ModchuModel_IEntityCaps entityCaps, float f, float f1, float f2) {		super.setLivingAnimationsLM(entityCaps, f, f1, f2);		Object entityliving = entityCaps.getCapsValue(entityCaps.caps_Entity);		if (entityliving != null); else return;		// 村人繁殖		if (Modchu_Reflect.loadClass("EntityVillager").isInstance(entityliving)) {			if ((Boolean) Modchu_Reflect.getFieldObject("EntityVillager", "getIsMatingFlag", entityliving))			//if(ev.getIsMatingFlag())			{				bipedHead.rotateAngleZ = 0.3F;			} else {				bipedHead.rotateAngleZ = 0.3F;			}		}		// 背負われ		isRidingMaster = Modchu_Reflect.loadClass("EntityPlayer").isInstance(Modchu_Reflect.getFieldObject("Entity", "field_70154_o", "ridingEntity", entityliving));	}	@Override	public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5, ModchuModel_IEntityCaps entityCaps) {		setDefaultPause(f, f1, f2, f3, f4, f5, entityCaps);		//heading		bipedHead.rotateAngleY = f3 / 57.29578F;		bipedHead.rotateAngleX = f4 / 57.29578F;		bipedHeadwear.rotateAngleX = -bipedHead.rotateAngleX;		bipedHeadwear2.rotateAngleX = Math.abs(bipedHead.rotateAngleX) * 0.9F + Math.abs(bipedHead.rotateAngleY) * 0.2F + 0.2F;		//walk		float wav0 = Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f * 0.5F); //waving for angles of arms and legs		float wav1 = Modchu_AS.getFloat(Modchu_AS.mathHelperSin, f * 0.5F); //delayed waving		float wav2 = wav0 > wav1 ? wav0 : wav1; //+upper		float wav3 = wav0 < wav1 ? -wav0 : -wav1; //-lower		bipedRightArm.rotateAngleX = -wav0 * f1;		bipedLeftArm.rotateAngleX = wav0 * f1;		bipedRightArm.rotateAngleZ = 0.2F;		bipedLeftArm.rotateAngleZ = -0.2F;		bipedRightArm.rotateAngleY = 0.0F;		bipedLeftArm.rotateAngleY = 0.0F;		rightLeg.rotateAngleX = wav0 * f1 * 0.8F - 0.1F;		leftLeg.rotateAngleX = -wav0 * f1 * 0.8F;		rightLeg2.rotateAngleX = wav2 * f1 * 0.9F + 0.2F;		leftLeg2.rotateAngleX = wav3 * f1 * 0.9F;		rightLeg.rotateAngleY = -0.05F;		leftLeg.rotateAngleY = 0.05F;		float shiftY = 0F;		bipedHead.rotationPointY = -6.0F;		bipedBody.rotationPointY = 6F;		bipedRightArm.rotationPointY = -6.5F;		bipedLeftArm.rotationPointY = -6.5F;		Skirt.rotationPointY = 2.0F;		rightLeg.rotationPointY = 4.0F;		leftLeg.rotationPointY = 4.0F;		// アイテム持ってるときの腕振りを抑える		if (heldItem[1] != 0 && !Modchu_EntityCapsHelper.getCapsValueBoolean(this, entityCaps, caps_oldwalking)) {			bipedLeftArm.rotateAngleX = bipedLeftArm.rotateAngleX * 0.5F - 0.3141593F * heldItem[1];		}		if (heldItem[0] != 0 && !Modchu_EntityCapsHelper.getCapsValueBoolean(this, entityCaps, caps_oldwalking)) {			bipedRightArm.rotateAngleX = bipedRightArm.rotateAngleX * 0.5F - 0.3141593F * heldItem[0];		}		setRotationAnglesGulliverBefore(f, f1, f2, f3, f4, f5, entityCaps);		boolean isRiding = Modchu_EntityCapsHelper.getCapsValueBoolean(this, entityCaps, caps_getIsRiding);		if (isRiding) {			shiftY = 3.0F;			if (isRidingMaster) {				rightLeg.rotateAngleY = 0.6F;				leftLeg.rotateAngleY = -0.6F;				rightLeg.rotateAngleX = -1.45F;				leftLeg.rotateAngleX = -1.45F;				rightLeg2.rotateAngleX = (Modchu_AS.getFloat(Modchu_AS.mathHelperSin, f2 * 0.3F) + 1F) * 0.2F;				leftLeg2.rotateAngleX = (-Modchu_AS.getFloat(Modchu_AS.mathHelperSin, f2 * 0.3F) + 1F) * 0.2F;			} else {				rightLeg.rotateAngleY = -0.05F;				leftLeg.rotateAngleY = 0.05F;				rightLeg.rotateAngleX = -0.8F;				leftLeg.rotateAngleX = -0.8F;				rightLeg2.rotateAngleX = 2.4F;				leftLeg2.rotateAngleX = 2.4F;			}		}		BodyR.rotateAngleX = BodyL.rotateAngleX = 0.4F;		BodyR.rotateAngleZ = -0.25F;		BodyL.rotateAngleZ = 0.25F;		armSwing(f, f1, f2, f3, f4, f5, entityCaps);		Skirt.rotateAngleX = 0.0F;		bipedBody.rotateAngleX = -0.05F;		if (Modchu_EntityCapsHelper.getCapsValueBoolean(this, entityCaps, caps_getIsSneak)) {			// しゃがみ			upperBody.rotateAngleX = -0.05F + 0.4F;			bipedHead.rotateAngleX -= upperBody.rotateAngleX;			BodyR.rotateAngleX = BodyL.rotateAngleX = 0.55F;			if (Modchu_EntityCapsHelper.getCapsValueBoolean(this, entityCaps, caps_getIsWait)) {				bipedRightArm.rotateAngleX += 0.5F;				bipedLeftArm.rotateAngleX += 0.5F;			}			if (Modchu_EntityCapsHelper.getCapsValueBoolean(this, entityCaps, caps_getIsRiding)) {				shiftY = 2F;				rightLeg2.rotateAngleX += 1F;				leftLeg2.rotateAngleX += 1F;			}			Skirt.rotateAngleX -= 0.2F;			//Skirt.rotationPointY = -1.0F;			Skirt.rotationPointZ = 0.5F;			rightLeg.rotateAngleX = -upperBody.rotateAngleX;			leftLeg.rotateAngleX = -upperBody.rotateAngleX;			//rightLeg.rotationPointZ = 0F + 1.5F;			//leftLeg.rotationPointZ = 0F + 1.5F;			//bipedHead.rotationPointZ = 0F - 2.5F;			//bipedHead.rotationPointY += 0.5F;			bipedHeadwear.rotateAngleX += 0.5F;		} else {			// 通常立ち			upperBody.rotateAngleX = 0.0F;			rightLeg.rotationPointZ = 0F;			leftLeg.rotationPointZ = 0F;			bipedHead.rotationPointZ = 0F;		}		if (Modchu_EntityCapsHelper.getCapsValueBoolean(this, entityCaps, caps_getIsWait) && !Modchu_EntityCapsHelper.getCapsValueBoolean(this, entityCaps, caps_aimedBow)) {			//待機状態の特別表示			bipedRightArm.rotateAngleX -= 0.5F - Modchu_AS.getFloat(Modchu_AS.mathHelperSin, f2 * 0.067F) * 0.05F;			bipedRightArm.rotateAngleY = 0.0F;			bipedRightArm.rotateAngleZ = -0.4F;			bipedLeftArm.rotateAngleX -= 0.5F - Modchu_AS.getFloat(Modchu_AS.mathHelperSin, f2 * 0.067F) * 0.05F;			bipedLeftArm.rotateAngleY = 0.0F;			bipedLeftArm.rotateAngleZ = 0.4F;			BodyR.rotateAngleZ = -0.2F;			BodyL.rotateAngleZ = 0.2F;			Arms[0].rotationPointX -= 2.0F;			Arms[0].rotateAngleZ -= 1.5F;			Arms[0].rotateAngleX -= 0.5F;			Arms[0].rotateAngleY += 1.5F;			Arms[1].rotationPointX += 2.0F;			Arms[1].rotateAngleZ += 1.5F;			Arms[1].rotateAngleX -= 0.5F;			Arms[1].rotateAngleY -= 1.5F;		} else {			if (Modchu_EntityCapsHelper.getCapsValueBoolean(this, entityCaps, caps_aimedBow)) {				// 弓構え				float f6 = Modchu_AS.getFloat(Modchu_AS.mathHelperSin, onGrounds[dominantArm] * 3.141593F);				float f7 = Modchu_AS.getFloat(Modchu_AS.mathHelperSin, (1.0F - (1.0F - onGrounds[dominantArm]) * (1.0F - onGrounds[dominantArm])) * 3.141593F);				bipedRightArm.rotateAngleZ = Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.09F) * 0.05F + 0.05F;				bipedLeftArm.rotateAngleZ = -Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.09F) * 0.05F + 0.05F;				bipedRightArm.rotateAngleY = f6 * 0.6F - 0.1F + bipedHead.rotateAngleY;				bipedLeftArm.rotateAngleY = -f6 * 0.6F + 0.1F + bipedHead.rotateAngleY;				bipedRightArm.rotateAngleX = bipedLeftArm.rotateAngleX = bipedHead.rotateAngleX + Modchu_AS.getFloat(Modchu_AS.mathHelperSin, f2 * 0.067F) * 0.05F - 1.5F - f6 * 1.2F + f7 * 0.4F;				bipedLeftArm.rotateAngleX = bipedRightArm.rotateAngleX + 0.4F;			} else {				// 通常				bipedRightArm.rotateAngleZ += Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.09F) * 0.05F;				bipedLeftArm.rotateAngleZ -= Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.09F) * 0.05F;				bipedRightArm.rotateAngleX += Modchu_AS.getFloat(Modchu_AS.mathHelperSin, f2 * 0.067F) * 0.05F;				bipedLeftArm.rotateAngleX -= Modchu_AS.getFloat(Modchu_AS.mathHelperSin, f2 * 0.067F) * 0.05F;			}		}		//全体の上下		//bipedHead.rotationPointY += shiftY;		bipedBody.rotationPointY += shiftY;		//スカート follow Legs		Skirt1.rotateAngleX = rightLeg.rotateAngleX;		Skirt2.rotateAngleX = leftLeg.rotateAngleX;		Skirt3.rotateAngleX = leftLeg.rotateAngleX * 0.7F + 0.2F;		Skirt4.rotateAngleX = rightLeg.rotateAngleX * 0.7F + 0.2F;		Skirt1.rotateAngleY = rightLeg.rotateAngleY * 0.9F;		Skirt2.rotateAngleY = leftLeg.rotateAngleY * 0.9F;		Skirt1.rotateAngleZ = rightLeg.rotateAngleZ * 0.8F + 0.1F;		Skirt2.rotateAngleZ = leftLeg.rotateAngleZ * 0.8F - 0.1F;		Skirt3.rotateAngleZ = leftLeg.rotateAngleZ * 0.8F - 0.1F;		Skirt4.rotateAngleZ = rightLeg.rotateAngleZ * 0.8F + 0.1F;		Skirt1.rotateAngleX += Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.101F) * 0.01F;		Skirt2.rotateAngleX += Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.102F) * 0.01F;		Skirt3.rotateAngleX -= Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.103F) * 0.01F;		Skirt4.rotateAngleX -= Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.104F) * 0.01F;		Skirt1.rotateAngleZ -= Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.108F) * 0.02F;		Skirt2.rotateAngleZ += Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.107F) * 0.02F;		Skirt3.rotateAngleZ += Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.106F) * 0.02F;		Skirt4.rotateAngleZ -= Modchu_AS.getFloat(Modchu_AS.mathHelperCos, f2 * 0.105F) * 0.02F;		//モモウラ		backRightLeg.rotateAngleX = rightLeg.rotateAngleX < 0 ? rightLeg.rotateAngleX * -0.3F - 0.2F : -0.2F;		backLeftLeg.rotateAngleX = leftLeg.rotateAngleX < 0 ? leftLeg.rotateAngleX * -0.3F - 0.2F : -0.2F;		backRightLeg.rotateAngleX = backRightLeg.rotateAngleX > -0.05F ? -0.05F : backRightLeg.rotateAngleX;		backLeftLeg.rotateAngleX = backLeftLeg.rotateAngleX > -0.05F ? -0.05F : backLeftLeg.rotateAngleX;		//息		BodyR.rotateAngleX = BodyL.rotateAngleX -= Modchu_AS.getFloat(Modchu_AS.mathHelperSin, f2 * 0.067F) * 0.03F;		//ポニテツインテ follow Gravity		Tail.rotateAngleX = SideTailR.rotateAngleX = SideTailL.rotateAngleX = -bipedHead.rotateAngleX;		Tail.rotateAngleZ = -bipedHead.rotateAngleZ;		Tail.rotateAngleX += 0.05F;		SideTailR.rotateAngleZ = 0.05F;		SideTailL.rotateAngleZ = -0.05F;		setRotationAnglesGulliverAfter(f, f1, f2, f3, f4, f5, entityCaps);		breastFloats(f, f1, f2, f3, f4, f5, entityCaps);		skirtFloats(f, f1, f2, f3, f4, f5, entityCaps);	}	@Override	public void skirtFloats(float f, float f1, float f2, float f3, float f4, float f5, ModchuModel_IEntityCaps entityCaps) {		if (Modchu_EntityCapsHelper.getCapsValueInt(this, entityCaps, caps_skirtFloats) < 2) return;		float motionY = (float) Modchu_EntityCapsHelper.getCapsValueDouble(this, entityCaps, caps_skirtFloatsMotionY);;		SkirtFront.rotationPointX = motionY * 4.0F;		SkirtBack.rotationPointX = motionY * 4.0F;		SkirtRightFront.rotationPointZ = motionY * 4.0F;		SkirtRightBack.rotationPointZ = motionY * 4.0F;		SkirtFrontL.rotationPointX = motionY * 4.0F;		SkirtBackL.rotationPointX = motionY * 4.0F;		SkirtLeftFront.rotationPointZ = motionY * 4.0F;		SkirtLeftBack.rotationPointZ = motionY * 4.0F;		SkirtFront.rotateAngleX = motionY;		SkirtRightFront.rotateAngleZ = -motionY;		SkirtRightBack.rotateAngleZ = -motionY;		SkirtBack.rotateAngleX = -motionY;		SkirtFrontL.rotateAngleX = motionY;		SkirtLeftFront.rotateAngleZ = motionY;		SkirtLeftBack.rotateAngleZ = motionY;		SkirtBackL.rotateAngleX = -motionY;		SkirtFront.scaleX = SkirtBack.scaleX = SkirtFrontL.scaleX = SkirtBackL.scaleX = 1.0F - (motionY * 1.2F);		SkirtLeftFront.scaleZ = SkirtLeftBack.scaleZ = SkirtRightFront.scaleZ = SkirtRightBack.scaleZ = 1.0F - (motionY * 1.5F);	}	@Override	public void defaultPartsSettingBefore(ModchuModel_IEntityCaps entityCaps) {		super.defaultPartsSettingBefore(entityCaps);		String[] s = {				"SkirtTopBack", "SkirtTopL", "SkirtTopBackL", "SkirtFrontL", "SkirtLeftFront",				"SkirtBackL", "SkirtLeftBack", "SkirtRightBack", "SkirtRightFront", "Skirt1",				"Skirt2", "Skirt3", "Skirt4"				};		setCapsValue(entityCaps, caps_showPartsHideList, (Object) s);		String[] s1 = {				"bipedHeadwear2", "backRightLeg", "backLeftLeg"				};		String[] s2 = {				"Headwear2", "b_RightLeg", "b_LeftLeg"				};		setCapsValue(entityCaps, caps_showPartsRenemeMap, s1, s2);	}	@Override	public void showModelSettingReflects(ModchuModel_IEntityCaps entityCaps) {		super.showModelSettingReflects(entityCaps);		if (Modchu_EntityCapsHelper.getCapsValueInt(this, entityCaps, caps_skirtFloats) == 2) {			setCapsValue(entityCaps, caps_visible, Skirt1, false);			setCapsValue(entityCaps, caps_visible, Skirt2, false);			setCapsValue(entityCaps, caps_visible, Skirt3, false);			setCapsValue(entityCaps, caps_visible, Skirt4, false);		}	}	@Override	public void setDefaultPause(float f, float f1, float f2, float f3, float f4, float f5, ModchuModel_IEntityCaps entityCaps) {		bipedHead.setRotationPoint(0.0F, -4.0F, 0.0F);		bipedHeadwear.setRotationPoint(0.0F, -1.0F, 2.0F);		bipedHeadwear2.setRotationPoint(0.0F, 5.0F, 0.0F);		ChignonB.setRotationPoint(-1.5F, -5.5F, 3F);		ChignonR.setRotationPoint(-4.0F, -6.0F, -0.5F);		ChignonL.setRotationPoint(3.0F, -6.0F, -0.5F);		Tail.setRotationPoint(0.0F, -4.0F, 4.0F);		SideTailR.setRotationPoint(-3.5F, -4.5F, 1.0F);		SideTailL.setRotationPoint(3.5F, -4.5F, 1.0F);		bipedBody.setRotationPoint(0.0F, 6.0F, 0.0F);		BodyC.setRotationPoint(0.0F, 0.0F, 0.0F);		BodyR.setRotationPoint(-0.9F, -1.5F, -1.6F);		BodyL.setRotationPoint(0.9F, -1.5F, -1.6F);		bipedRightArm.setRotationPoint(-3.0F, 1.5F, 0.0F);		bipedLeftArm.setRotationPoint(3.0F, 1.5F, 0.0F);		Skirt.setRotationPoint(0.0F, 2.0F, 0.0F);		Skirt1.setRotationPoint(-1.0F, 4.0F, -1.0F);		Skirt2.setRotationPoint(1.0F, 4.0F, -1.0F);		Skirt3.setRotationPoint(1.0F, 4.0F, 1.0F);		Skirt4.setRotationPoint(-1.0F, 4.0F, 1.0F);		rightLeg.setRotationPoint(-2.0F, 10.0F, 0.0F);		leftLeg.setRotationPoint(2.0F, 10.0F, 0.0F);		backRightLeg.setRotationPoint(0.0F, 6.0F, 0.0F);		backLeftLeg.setRotationPoint(0.0F, 6.0F, 0.0F);		rightLeg2.setRotationPoint(0.0F, 5.5F, 0.0F);		leftLeg2.setRotationPoint(0.0F, 5.5F, 0.0F);		rightLeg.setRotationPoint(-2F, 10F, 0F);		Arms[0].setRotationPoint(0.5F, 11.0F, 0F);		Arms[1].setRotationPoint(-0.5F, 11.0F, 0F);		rightLeg.rotateAngleZ = -0.15F;		leftLeg.rotateAngleZ = 0.15F;		backRightLeg.rotateAngleX = -0.2F;		backRightLeg.rotateAngleZ = 0.1F;		backLeftLeg.rotateAngleX = -0.2F;		backLeftLeg.rotateAngleZ = -0.1F;		rightLeg2.rotateAngleZ = 0.15F;		leftLeg2.rotateAngleZ = -0.15F;		Arms[0].rotateAngleX = 0F;		Arms[0].rotateAngleY = 0F;		Arms[0].rotateAngleZ = 0F;		Arms[1].rotateAngleX = 0F;		Arms[1].rotateAngleY = 0F;		Arms[1].rotateAngleZ = 0F;		HeadMount.setRotationPoint(0F, 1.5F, 0F);		Arms[0].setRotationPoint(0.5F, 11.0F, 0F);		Arms[1].setRotationPoint(-0.5F, 11.0F, 0F);		mainFrame.setRotationPoint(0F, 0F, 0F);	}	@Override	public void actionPartsAddChild() {		boolean b = false;		if (bipedLeftArm != null) setCapsValue(null, caps_visible, bipedLeftArm, b);		if (bipedRightArm != null) setCapsValue(null, caps_visible, bipedRightArm, b);		b = true;		if (rightArm != null) setCapsValue(null, caps_visible, rightArm, b);		if (rightArm2 != null) setCapsValue(null, caps_visible, rightArm2, b);		if (rightHand != null) setCapsValue(null, caps_visible, rightHand, b);		if (leftArm != null) setCapsValue(null, caps_visible, leftArm, b);		if (leftArm2 != null) setCapsValue(null, caps_visible, leftArm2, b);		if (leftHand != null) setCapsValue(null, caps_visible, leftHand, b);		if (bipedRightArm != null && bipedRightArm instanceof ModchuModel_ModelRenderer) {			bipedRightArm.removeChild((ModchuModel_ModelRenderer) Arms[0]);		}		if (bipedLeftArm != null && bipedLeftArm instanceof ModchuModel_ModelRenderer) {			bipedLeftArm.removeChild((ModchuModel_ModelRenderer) Arms[1]);		}		if (rightArm != null) {			if (rightArmPlus != null) rightArm.addChild(rightArmPlus);			if (rightArm2 != null) {				rightArm.addChild(rightArm2);				if (rightHand != null) {					rightArm2.addChild(rightHand);					if (Arms[0] != null) rightHand.addChild(Arms[0]);				}				if (rightArmPlus2 != null) rightArm2.addChild(rightArmPlus2);			}		}		if (leftArm != null) {			if (leftArmPlus != null) leftArm.addChild(leftArmPlus);			if (leftArm2 != null) {				leftArm.addChild(leftArm2);				if (leftHand != null) {					leftArm2.addChild(leftHand);					if (Arms[1] != null) leftHand.addChild(Arms[1]);				}				if (leftArmPlus2 != null) leftArm2.addChild(leftArmPlus2);			}		}		if (bipedBody != null) {			if (rightArm != null) bipedBody.addChild(rightArm);			if (leftArm != null) bipedBody.addChild(leftArm);		}	}	@Override	public void actionRelease1(ModchuModel_IEntityCaps entityCaps) {		super.actionRelease1(entityCaps);		boolean b = true;		if (rightLeg != null) setCapsValue(entityCaps, caps_visible, rightLeg, b);		if (rightLeg2 != null) setCapsValue(entityCaps, caps_visible, rightLeg2, b);		if (leftLeg != null) setCapsValue(entityCaps, caps_visible, leftLeg, b);		if (leftLeg2 != null) setCapsValue(entityCaps, caps_visible, leftLeg2, b);		rightLeg.rotateAngleX = 0.0F;		rightLeg.rotateAngleY = 0.0F;		rightLeg.rotateAngleZ = 0.0F;		rightLeg2.rotateAngleX = 0.0F;		rightLeg2.rotateAngleY = 0.0F;		rightLeg2.rotateAngleZ = 0.0F;		leftLeg.rotateAngleX = 0.0F;		leftLeg.rotateAngleY = 0.0F;		leftLeg.rotateAngleZ = 0.0F;		leftLeg2.rotateAngleX = 0.0F;		leftLeg2.rotateAngleY = 0.0F;		leftLeg2.rotateAngleZ = 0.0F;	}	@Override	public void action1(float f, float f1, float f2, float f3, float f4, float f5, ModchuModel_IEntityCaps entityCaps) {		super.action1(f, f1, f2, f3, f4, f5, entityCaps);		hip.rotateAngleZ = 0.0F;/*		float f6 = hip.rotateAngleZ;		if (f6 > 0.0F) {			bipedHead.rotationPointY = bipedBody.rotationPointY - 6.5F + (f6 * 1.30889264F);			bipedHead.rotationPointX = f6 * 4.10447914F;		} else {			bipedHead.rotationPointY = bipedBody.rotationPointY - 6.5F - (f6 * 1.30889264F);			bipedHead.rotationPointX = f6 * 4.10447914F;		}*/		rightLeg.rotationPointX = -1.0F;		leftLeg.rotationPointX = 1.0F;		rightLeg.rotationPointY = leftLeg.rotationPointY = 4.0F;		rightLeg2.rotationPointY = leftLeg2.rotationPointY = 4.0F;		rightArm2.rotationPointY = leftArm2.rotationPointY = 6.0F;		rightHand.rotationPointY = leftHand.rotationPointY = 6.0F;		rightArm.rotationPointY = leftArm.rotationPointY = -5.5F;		Arms[0].setRotationPoint(0.5F, 0.0F, 0F);		Arms[1].setRotationPoint(-0.5F, 0.0F, 0F);	}	@Override	public void motionModelCorrectionAfter(float f, float f1, float f2, float f3, float f4, float f5, ModchuModel_IEntityCaps entityCaps) {		bipedHead.rotationPointY -= 2.0F;		bipedBody.rotationPointY += 2.0F;		rightArm.rotationPointY += 2.0F;		leftArm.rotationPointY += 2.0F;		rightHand.rotationPointY =				leftHand.rotationPointY = 5.0F;		rightLeg.rotationPointY -= 6.0F;		leftLeg.rotationPointY -= 6.0F;		Arms[0].setRotationPoint(0.5F, 0.0F, 0F);		Arms[1].setRotationPoint(-0.5F, 0.0F, 0F);	}	@Override	public float getHeight(ModchuModel_IEntityCaps entityCaps) {		return 1.99F;	}	@Override	public float getWidth(ModchuModel_IEntityCaps entityCaps) {		return 0.5F;	}	@Override	public float getRidingHeight(ModchuModel_IEntityCaps entityCaps) {		return 0.99F;	}	@Override	public float getYOffset(ModchuModel_IEntityCaps entityCaps) {		return 1.6F;	}	@Override	public float getRidingYOffset(ModchuModel_IEntityCaps entityCaps) {		return 1.61F;	}	@Override	public float getMountedYOffset(ModchuModel_IEntityCaps entityCaps) {		return 0.7F;	}	@Override	public double getSittingYOffset(ModchuModel_IEntityCaps entityCaps) {		return -0.5D;	}	@Override	public void setArmorBipedBodyShowModel(ModchuModel_IEntityCaps entityCaps, boolean b) {		super.setArmorBipedBodyShowModel(entityCaps, b);		setCapsValue(entityCaps, caps_visible, BodyC, b);		setCapsValue(entityCaps, caps_visible, BodyR, b);		setCapsValue(entityCaps, caps_visible, BodyL, b);	}	@Override	public void setArmorBipedHeadShowModel(ModchuModel_IEntityCaps entityCaps, boolean b) {		super.setArmorBipedHeadShowModel(entityCaps, b);		setCapsValue(entityCaps, caps_visible, bipedHeadwear2, b);	}	@Override	public void setArmorSkirtShowModel(ModchuModel_IEntityCaps entityCaps, boolean b) {		super.setArmorSkirtShowModel(entityCaps, b);		setCapsValue(entityCaps, caps_visible, Skirt1, b);		setCapsValue(entityCaps, caps_visible, Skirt2, b);		setCapsValue(entityCaps, caps_visible, Skirt3, b);		setCapsValue(entityCaps, caps_visible, Skirt4, b);		setCapsValue(entityCaps, caps_visible, SkirtTopBack, b);		setCapsValue(entityCaps, caps_visible, SkirtTopL, b);		setCapsValue(entityCaps, caps_visible, SkirtTopBackL, b);		setCapsValue(entityCaps, caps_visible, SkirtFrontL, b);		setCapsValue(entityCaps, caps_visible, SkirtLeftFront, b);		setCapsValue(entityCaps, caps_visible, SkirtBackL, b);		setCapsValue(entityCaps, caps_visible, SkirtLeftBack, b);		setCapsValue(entityCaps, caps_visible, SkirtRightBack, b);		setCapsValue(entityCaps, caps_visible, SkirtRightFront, b);	}	@Override	public void setArmorBipedRightLegShowModel(ModchuModel_IEntityCaps entityCaps, boolean b) {		super.setArmorBipedRightLegShowModel(entityCaps, b);		setCapsValue(entityCaps, caps_visible, backRightLeg, b);	}	@Override	public void setArmorBipedLeftLegShowModel(ModchuModel_IEntityCaps entityCaps, boolean b) {		super.setArmorBipedLeftLegShowModel(entityCaps, b);		setCapsValue(entityCaps, caps_visible, backLeftLeg, b);	}	@Override	public String[] getBreastName() {		return new String[]{ "bodyr", "bodyl" };	}	@Override	public ModchuModel_ModelRenderer getBipedRightLeg(ModchuModel_IEntityCaps entityCaps) {		return rightLeg;	}	@Override	public ModchuModel_ModelRenderer getBipedLeftLeg(ModchuModel_IEntityCaps entityCaps) {		return leftLeg;	}}