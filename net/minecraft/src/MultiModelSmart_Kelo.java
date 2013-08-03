package net.minecraft.src;

import net.minecraft.move.render.ModelRotationRenderer;

import org.lwjgl.opengl.GL11;

public class MultiModelSmart_Kelo extends MultiModelSmart
{
    public Modchu_ModelRotationRenderer bipedOuter;
    public Modchu_ModelRotationRenderer Body;
    public Modchu_ModelRotationRenderer bipedBreast;
    public Modchu_ModelRotationRenderer bipedNeck;
    public Modchu_ModelRotationRenderer Head;
    public Modchu_ModelRotationRenderer Headwear;
    public Modchu_ModelRotationRenderer bipedRightShoulder;
    public Modchu_ModelRotationRenderer RightArm;
    public Modchu_ModelRotationRenderer bipedLeftShoulder;
    public Modchu_ModelRotationRenderer LeftArm;
    public Modchu_ModelRotationRenderer bipedPelvic;
    public Modchu_ModelRotationRenderer RightLeg;
    public Modchu_ModelRotationRenderer LeftLeg;
	public Modchu_ModelRotationRenderer ChignonR;
	public Modchu_ModelRotationRenderer ChignonL;
	public Modchu_ModelRotationRenderer ChignonB;
	public Modchu_ModelRotationRenderer Tail;
	public Modchu_ModelRotationRenderer SideTailR;
	public Modchu_ModelRotationRenderer SideTailL;
	public Modchu_ModelRotationRenderer Skirt;

	public Modchu_ModelRotationRenderer tailL1;
	public Modchu_ModelRotationRenderer tailL2;
	public Modchu_ModelRotationRenderer tailR1;
	public Modchu_ModelRotationRenderer tailR2;
    public Modchu_ModelRotationRenderer BreastPocket;
    public Modchu_ModelRotationRenderer LsidePocket;
    public Modchu_ModelRotationRenderer RsidePocket;
    public Modchu_ModelRotationRenderer Backpack;
    public Modchu_ModelRotationRenderer BackpackPocket;
    public Modchu_ModelRotationRenderer Zipper;
    public Modchu_ModelRotationRenderer SleeveR;
    public Modchu_ModelRotationRenderer SleeveL;
    public Modchu_ModelRotationRenderer ShoesL;
    public Modchu_ModelRotationRenderer ShoesR;
    public Modchu_ModelRotationRenderer KeloEyeL1;
    public Modchu_ModelRotationRenderer KeloEyeR1;
    public Modchu_ModelRotationRenderer KeloEyeL2;
    public Modchu_ModelRotationRenderer KeloEyeR2;

    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer eyeR;

    public MultiModelSmart_Kelo(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_Kelo(float var1, int var2, int var3)
    {
        super(var1, var2, var3);

        bipedOuter = new Modchu_ModelRotationRenderer(this, -1, -1, (Modchu_ModelRotationRenderer)null);
        bipedOuter.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedOuter.fadeEnabled = true;

        Body = new Modchu_ModelRotationRenderer(this, 12, 19, bipedOuter);
        Body.addBox(-3F, 0.0F, -2F, 6, 10, 3, var1 + 0.3F);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedBreast = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedBreast.setRotationPoint(0.0F, 4.0F, 0.0F);
        bipedNeck = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedNeck.setRotationPoint(0.0F, 1.0F, 0.0F);

        Head = new Modchu_ModelRotationRenderer(this, 0, 0, bipedNeck);
        Head.addBox(-4F, -8F, -4F, 8, 8, 8, var1);
        Head.setRotationPoint(0.0F, 0.0F, 0.0F);

        Headwear = new Modchu_ModelRotationRenderer(this, 32, 0, Head);
        Headwear.addBox(-4F, -8F, -4.5F, 8, 4, 8, var1 + 0.5F);
        Headwear.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedRightShoulder = new Modchu_ModelRotationRenderer(this, 40, 16, bipedBreast);
        bipedRightShoulder.addBox(-3.0F, -2.0F, -2.0F, 8, 8, 8, var1);
        bipedRightShoulder.setRotationPoint(0.0F, 0.0F, 0.0F);

        RightArm = new Modchu_ModelRotationRenderer(this, 36, 19, bipedRightShoulder);
        RightArm.addBox(-3F, -2F, -2F, 3, 10, 3, var1 - 0.3F);
        RightArm.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedLeftShoulder = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedLeftShoulder.mirror = true;
        bipedLeftShoulder.setRotationPoint(0.0F, 0.0F, 0.0F);

        LeftArm = new Modchu_ModelRotationRenderer(this, 36, 19, bipedLeftShoulder);
        LeftArm.mirror = true;
        LeftArm.addBox(0F, -2F, -2F, 3, 10, 3, var1 - 0.3F);
        LeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedPelvic = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedPelvic.setRotationPoint(0.0F, 0.0F, 0.0F);

        RightLeg = new Modchu_ModelRotationRenderer(this, 0, 19, bipedPelvic);
        RightLeg.addBox(-2F, 0.0F, -2F, 3, 10, 3, var1);
        RightLeg.setRotationPoint(0F, 0.0F, 0.0F);

        LeftLeg = new Modchu_ModelRotationRenderer(this, 0, 19, bipedPelvic);
        LeftLeg.mirror = true;
        LeftLeg.addBox(-2F, 0.0F, -2F, 3, 10, 3, var1);
        LeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);

        scaleArmType = var2;
        scaleLegType = var3;

        Skirt = new Modchu_ModelRotationRenderer(this, 46, 12, Body);
        Skirt.addBox(-3F, -2F, -2F, 6, 2, 3, var1 + 0.8F);
        Skirt.setRotationPoint(0.0F, 0F, 0.0F);

        ChignonR = new Modchu_ModelRotationRenderer(this, 24, 2, Head);
        ChignonR.addBox(-5F, -11F, -2.5F, 4, 3, 3, var1);
        ChignonR.setRotationPoint(0.0F, 0.0F, 0.0F);

        ChignonL = new Modchu_ModelRotationRenderer(this, 24, 2, Head);
        ChignonL.addBox(1F, -11F, -2.5F, 4, 3, 3, var1);
        ChignonL.setRotationPoint(0.0F, 0.0F, 0.0F);

        SideTailR = new Modchu_ModelRotationRenderer(this, 60, 3, Head);
        SideTailR.addBox(-4.1F, -4.1F, -3.5F, 1, 4, 1, var1);
        SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);

        SideTailL = new Modchu_ModelRotationRenderer(this, 56, 3, Head);
        SideTailL.mirror = true;
        SideTailL.addBox(3.1F, -4.1F, -3.5F, 1, 4, 1, var1);
        SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);

        tailL1 = new Modchu_ModelRotationRenderer(this, 0, 0, Head);
        tailL1.addBox(1.5F, -2.5F, 3.5F, 2, 2, 2, var1);
        tailL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        tailL2 = new Modchu_ModelRotationRenderer(this, 27, 16, Head);
        tailL2.addBox(2F, -1F, 4.5F, 3, 3, 3, var1);
        tailL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        tailR1 = new Modchu_ModelRotationRenderer(this, 0, 4, Head);
        tailR1.addBox(-3.5F, -2.5F, 3.5F, 2, 2, 2, var1);
        tailR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        tailR2 = new Modchu_ModelRotationRenderer(this, 48, 19, Head);
        tailR2.addBox(-5F, -1F, 4.5F, 3, 3, 3, var1);
        tailR2.setRotationPoint(0.0F, 0.0F, 0.0F);

        KeloEyeL1 = new Modchu_ModelRotationRenderer(this, 28, 0, Head);
        KeloEyeL1.addBox(2F, -10F, -2.5F, 2, 2, 0, var1 - 0.2F);
        KeloEyeL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        KeloEyeR1 = new Modchu_ModelRotationRenderer(this, 24, 0, Head);
        KeloEyeR1.addBox(-4F, -10F, -2.5F, 2, 2, 0, var1 -0.2F);
        KeloEyeR1.setRotationPoint(0.0F, 0.0F, 0.0F);

        KeloEyeL2 = new Modchu_ModelRotationRenderer(this, 36, 0, Head);
        KeloEyeL2.addBox(2F, -9.5F, -2.5F, 2, 1, 0, var1 - 0.2F);
        KeloEyeL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        KeloEyeR2 = new Modchu_ModelRotationRenderer(this, 32, 0, Head);
        KeloEyeR2.addBox(-4F, -9.5F, -2.5F, 2, 1, 0, var1 - 0.2F);
        KeloEyeR2.setRotationPoint(0.0F, 0.0F, 0.0F);

        Backpack = new Modchu_ModelRotationRenderer(this, 48, 25, Body);
        Backpack.addBox(-2F, 1F, 1F, 4, 5, 2, var1 + 0.3F);
        Backpack.setRotationPoint(0.0F, 0.0F, 0.0F);
        BackpackPocket = new Modchu_ModelRotationRenderer(this, 48, 27, Body);
        BackpackPocket.addBox(-2F, 3.2F, 0.5F, 4, 2, 2, var1 + 0.6F);
        BackpackPocket.setRotationPoint(0.0F, 0.0F, 0.0F);
        BreastPocket = new Modchu_ModelRotationRenderer(this, 24, 16, Body);
        BreastPocket.addBox(1F, 2F, -2.5F, 2, 2, 1, var1);
        BreastPocket.setRotationPoint(0.0F, 0.0F, 0.0F);
        LsidePocket = new Modchu_ModelRotationRenderer(this, 32, 12, Body);
        LsidePocket.addBox(2.5F, 6F, -2.5F, 1, 2, 2, var1);
        LsidePocket.setRotationPoint(0.0F, 0.0F, 0.0F);
        RsidePocket = new Modchu_ModelRotationRenderer(this, 32, 12, Body);
        RsidePocket.addBox(-3.5F, 6F, -2.5F, 1, 2, 2, var1);
        RsidePocket.setRotationPoint(0.0F, 0.0F, 0.0F);
        Zipper = new Modchu_ModelRotationRenderer(this, 30, 22, Body);
        Zipper.addBox(-1.5F, -1F, -1.5F, 3, 10, 0, var1 - 1F);
        Zipper.setRotationPoint(0.0F, 0.0F, 0.0F);

        SleeveR = new Modchu_ModelRotationRenderer(this, 36, 14, RightArm);
        SleeveR.addBox(-3F, 3.5F, -2F, 3, 2, 3, var1 + 0.1F);
        SleeveR.setRotationPoint(0.0F, 1.0F, 0.0F);

        SleeveL = new Modchu_ModelRotationRenderer(this, 36, 14, LeftArm);
        SleeveL.mirror = true;
        SleeveL.addBox(0F, 3.5F, -2F, 3, 2, 3, var1 + 0.1F);
        SleeveL.setRotationPoint(0.0F, 1.0F, 0.0F);

        ShoesR = new Modchu_ModelRotationRenderer(this, 0, 16, RightLeg);
        ShoesR.addBox(-2F, 8F, -3F, 3, 2, 1, var1);
        ShoesR.setRotationPoint(0.0F, 0.0F, 0.0F);
        ShoesL = new Modchu_ModelRotationRenderer(this, 0, 16, LeftLeg);
        ShoesL.mirror = true;
        ShoesL.addBox(-2F, 8F, -3F, 3, 2, 1, var1);
        ShoesL.setRotationPoint(0.0F, 0.0F, 0.0F);

        eyeL = new Modchu_ModelRotationRenderer(this, 16, 16, Head);
        eyeL.addBoxLM(0F, -4F, -4.001F, 4, 3, 0, var1 + 0.001F);
        eyeL.setRotationPoint(0.0F, 0.0F, 0.0F);
        eyeR = new Modchu_ModelRotationRenderer(this, 8, 16, Head);
        eyeR.addBoxLM(-4F, -4F, -4.001F, 4, 3, 0, var1 + 0.001F);
        eyeR.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedRightArm = RightArm;
        bipedLeftArm = LeftArm;
        bipedRightLeg = RightLeg;
        bipedLeftLeg = LeftLeg;
        bipedBody = Body;
        bipedHead = Head;
        bipedHeadwear = Headwear;
        super.bipedOuter = bipedOuter;
        super.bipedBreast = bipedBreast;
        super.bipedNeck = bipedNeck;
        super.bipedRightShoulder = bipedRightShoulder;
        super.bipedLeftShoulder = bipedLeftShoulder;
        super.bipedPelvic = bipedPelvic;

        ((Modchu_ModelRotationRenderer) HeadMount).base = Head;
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        setRotationAngles(f, f1, f2, f3, f4, f5);
        Head.render(f5);
        Body.render(f5);
        RightArm.render(f5);
        LeftArm.render(f5);
        RightLeg.render(f5);
        LeftLeg.render(f5);
        Headwear.render(f5);
		if (Head.showModel) {
			ChignonR.render(f5);
			ChignonL.render(f5);
			SideTailR.render(f5);
			SideTailL.render(f5);
			eyeR.preRotateRender(f5);
			eyeL.preRotateRender(f5);
		}
		if (Skirt.showModel) {
			Skirt.render(f5);
		}
        tailL1.preRotateRender(f5);
        tailL2.preRotateRender(f5);
        tailR1.preRotateRender(f5);
        tailR2.preRotateRender(f5);
        SleeveL.preRotateRender(f5);
        SleeveR.preRotateRender(f5);
        KeloEyeR1.preRotateRender(f5);
        KeloEyeL1.preRotateRender(f5);
        KeloEyeR2.preRotateRender(f5);
        KeloEyeL2.preRotateRender(f5);
        ShoesL.preRotateRender(f5);
        ShoesR.preRotateRender(f5);
        BreastPocket.preRotateRender(f5);
        LsidePocket.preRotateRender(f5);
        RsidePocket.preRotateRender(f5);
        Backpack.preRotateRender(f5);
        BackpackPocket.preRotateRender(f5);
        Zipper.preRotateRender(f5);
		GL11.glPushMatrix();
		HeadMount.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		for(int i = 0; i < Arms.length
				&& Arms[i] != null; i++) {
			((Modchu_ModelRotationRenderer) Arms[i]).base = getBipedRightArm();
			Arms[i].render(f5);
		}
		GL11.glPopMatrix();
    }

	public void setRotationAnglesLM(float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);

		Headwear.rotateAngleX = -0.087F;
		Skirt.rotateAngleX = 0.0F;

		if (!firstPerson && !isInventory) {
			//
			bipedOuter.rotationPointY = 1.0F;
			Body.rotationPointY = 8.0F;
			Head.rotationPointY = 7.0F;
			Skirt.rotationPointY = 7.0F;
			Skirt.rotateAngleX = 0.0F;

			if (isSleeping) {
			}

			boolean flag = false;
			boolean flag1 = onGround > 0.0F;

			//
			Head.rotationPointY = 0.0F;
			Head.rotationPointZ = 0.0F;
			if (isClimb || isCrawlClimb) {
				bipedHead.rotateAngleX = f4 / RadiantToAngle;
				Head.rotationPointY = 0.0F;
				Head.rotationPointZ = -3.0F;
				bipedRightArm.rotationPointY = bipedLeftArm.rotationPointY = 0.0F;
				int i = handsClimbType;

				if (isHandsVineClimbing && i == 2) {
					i = 1;
				}

				float f6;
				float f17;
				float f27;
				float f50;
				float f52;
				float f53;

				switch (i) {
				}

				float f36;
				float f43;
				float f47;
				float f54;
				float f55;
				float f56;

				switch (feetClimbType) {
				}

				if (isHandsVineClimbing) {
					// Modchu_Debug.mDebug("isHandsVineClimbing");
				}

				if (!isFeetVineClimbing) {
					// Modchu_Debug.mDebug("!isFeetVineClimbing");
				}

				if (isFeetVineClimbing) {
					// Modchu_Debug.mDebug("isFeetVineClimbing");
				}

				if (isCrawlClimb) {
					// Modchu_Debug.mDebug("isCrawlClimb");

				}

				if (i == 0 && feetClimbType != 0) {
				}
			} else if (isClimbJump) {
				// Modchu_Debug.mDebug("isClimbJump");
			} else if (isCeilingClimb) {
				// Modchu_Debug.mDebug("isCeilingClimb");
			} else if (isSwim) {
				// Modchu_Debug.mDebug("isSwim");
				//
				bipedOuter.rotationPointY = -3.0F;
			} else if (isDive) {
				// Modchu_Debug.mDebug("isDive");

			} else if (isCrawl) {
				// Modchu_Debug.mDebug("isCrawl");
				//
				bipedOuter.rotationPointY = -3.0F;
			} else if (isSlide) {
				// Modchu_Debug.mDebug("isSlide");
			} else if (isFlying) {
				// Modchu_Debug.mDebug("isFlying");
			} else if (isHeadJump) {
				// Modchu_Debug.mDebug("isHeadJump");

				if (overGroundBlockId > 0
						&& Block.blocksList[overGroundBlockId].blockMaterial
								.isSolid()) {
				}
			} else if (isFalling) {
				// Modchu_Debug.mDebug("isFalling");
			} else {
				flag = true;
				//
				Head.rotationPointY = 8.0F;
			}

			if (flag) {

				if (isSleeping) {
				}

				if (isAngleJumping) {
					// Modchu_Debug.mDebug("isAngleJumping");
				} else {
				}

				if (isRiding) {
					//
					bipedOuter.rotationPointY = 0.0F;
					Head.rotationPointY = 8.0F;
				}

				if (heldItemLeft != 0) {
				}

				if (heldItemRight != 0) {
				}
			}

			if (onGround > -9990F) {

				if (flag) {
				} else if (flag1) {
				}

				if (flag || flag1) {
				}
			}

			if (flag) {
				if (isSneak && !isAngleJumping) {
					Body.rotateAngleX = 0.3F;
					Head.rotationPointY = 4.5F;
					bipedOuter.rotationPointY = 1.0F;
					bipedBody.rotationPointY = 5.0F;
					bipedRightLeg.rotateAngleX += 0.2F;
					bipedLeftLeg.rotateAngleX += 0.2F;
					bipedRightLeg.rotationPointY = bipedLeftLeg.rotationPointY = -3.0F;
					bipedRightLeg.rotationPointZ = bipedLeftLeg.rotationPointZ = 2.5F;
					Skirt.rotationPointY = 7.0F;
					Skirt.rotationPointZ = 2.5F;
					Skirt.rotateAngleX = 0.1F;
					if (isRiding) {
						//
						bipedOuter.rotationPointY = 0.0F;
						Head.rotationPointY = 5.0F;
						Skirt.rotationPointY = 5.0F;
					}
				}
		        if(isWait && !aimedBow)
		        {
		        	KeloEyeL1.setVisible(false);
		        	KeloEyeR1.setVisible(false);
		        	KeloEyeL2.setVisible(true);
		        	KeloEyeR2.setVisible(true);
		        }
				if (aimedBow) {
				}
			}

			if (bipedOuter.previous != null && !bipedOuter.fadeRotateAngleX) {
			}

			if (bipedOuter.previous != null && !bipedOuter.fadeRotateAngleY) {
			}

			if (dependentModel != null) {
			}
			if (flag) {
				Head.rotateAngleY = 0.0F;
				bipedOuter.rotateAngleY = 0.0F;
			} else {
				bipedOuter.rotateAngleY = 0.0F;
			}

			KeloEyeL1.setVisible(true);
			KeloEyeR1.setVisible(true);
			KeloEyeL2.setVisible(false);
			KeloEyeR2.setVisible(false);

			if (aimedBow) {
				eyeL.showModel = true;
				eyeR.showModel = false;
			} else {
				if (0.0D > (double) (mh_sin(f2 * 0.1F) * 0.3F) + Math.random()
						* 0.10000000149011612D + 0.18000000715255737D) {
					eyeL.showModel = true;
					eyeR.showModel = true;
				} else {
					eyeL.showModel = false;
					eyeR.showModel = false;
				}
			}
		} else {
			bipedRightLeg.setRotationPoint(-1.0F, 15.0F, 0.0F);
			bipedLeftLeg.setRotationPoint(2.0F, 15.0F, 0.0F);
			RightArm.setRotationPoint(0.0F, 9.0F, 0.0F);
			LeftArm.setRotationPoint(0.0F, 9.0F, 0.0F);
			superSetRotationAngles(f, f1, f2, f3, f4, f5);
		}

	}

	public void reset() {
		super.reset();
		bipedOuter.setRotationPoint(0.0F, 12.0F, 0.0F);
		bipedBreast.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedNeck.setRotationPoint(0.0F, 1.0F, 0.0F);
		bipedRightShoulder.setRotationPoint(-2.5F, 1.0F, 0.0F);
		bipedLeftShoulder.setRotationPoint(2.5F, 1.0F, 0.0F);
		bipedPelvic.setRotationPoint(0.0F, 10.0F, 0.0F);
		RightArm.setRotationPoint(0.0F, 2.0F, 0.0F);
		LeftArm.setRotationPoint(0.0F, 2.0F, 0.0F);
		RightLeg.setRotationPoint(-1.0F, 0.0F, 0.0F);
		LeftLeg.setRotationPoint(2.0F, 0.0F, 0.0F);
		Body.setRotationPoint(0.0F, -4.0F, 0.0F);
		Head.setRotationPoint(0.0F, 1.0F, 0.0F);
		Skirt.setRotationPoint(0.0F, 4.0F, 0.0F);
	}

    public float getHeight()
    {
        return 1.6F;
    }

    public float getWidth()
    {
        return 0.7F;
    }

	public float getyOffset() {
		return 1.2F;
	}

	public double getMountedYOffset() {
		double d = 0.85D;
	    return d;
	}

	public double getSittingyOffset() {
	    return -0.5D;
	}

	public double getSleepingyOffset() {
	    return -0.95D;
	}

	public float ridingViewCorrection() {
		return -0.75F;
	}

    public ModelRotationRenderer getBipedRightArm() {
    	if (getHandedness() == 0) return RightArm;
    	return LeftArm;
    }

    public ModelRotationRenderer getNotDominantArm() {
    	if (getHandedness() == 0) return LeftArm;
    	return RightArm;
    }

}

