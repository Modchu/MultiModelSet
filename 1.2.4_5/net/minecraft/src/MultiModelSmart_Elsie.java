package net.minecraft.src;

import net.minecraft.move.render.ModelRotationRenderer;

import org.lwjgl.opengl.GL11;

public class MultiModelSmart_Elsie extends MultiModelSmart
{

    public Modchu_ModelRotationRenderer bipedOuter;
    public Modchu_ModelRotationRenderer Body;
    public Modchu_ModelRotationRenderer bipedBreast;
    public Modchu_ModelRotationRenderer bipedNeck;
    public Modchu_ModelRotationRenderer Head;
    public Modchu_ModelRotationRenderer bipedRightShoulder;
    public Modchu_ModelRotationRenderer RightArm;
    public Modchu_ModelRotationRenderer bipedLeftShoulder;
    public Modchu_ModelRotationRenderer LeftArm;
    public Modchu_ModelRotationRenderer bipedPelvic;
    public Modchu_ModelRotationRenderer RightLeg;
    public Modchu_ModelRotationRenderer LeftLeg;
	public Modchu_ModelRotationRenderer ChignonR;
	public Modchu_ModelRotationRenderer ChignonL;
	public Modchu_ModelRotationRenderer SideTailR;
	public Modchu_ModelRotationRenderer SideTailL;
	public Modchu_ModelRotationRenderer Skirt;

    public Modchu_ModelRotationRenderer RightSkirt;
    public Modchu_ModelRotationRenderer LeftSkirt;
    public Modchu_ModelRotationRenderer bipedHeadwearB;

    public MultiModelSmart_Elsie(float f)
    {
        this(f, Scale, Scale);
    }

    public MultiModelSmart_Elsie(float f, int f1, int f2)
    {
        super(f, f1, f2);

        bipedOuter = new Modchu_ModelRotationRenderer(this, -1, -1, (Modchu_ModelRotationRenderer)null);
        bipedOuter.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedOuter.fadeEnabled = true;

        Body = new Modchu_ModelRotationRenderer(this, 36, 20, bipedOuter);
        Body.addBox(-3.0F, 0.0F, -2.0F, 6, 8, 4, f);
        Body.setRotationPoint(0.0F, 4.0F, 0.0F);

        bipedBreast = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedBreast.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedNeck = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedNeck.setRotationPoint(0.0F, 0.0F, 0.0F);

        Head = new Modchu_ModelRotationRenderer(this, 0, 0, bipedNeck);
        Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, f);
        Head.setRotationPoint(0.0F, 4.0F + f1, 0.0F);

        bipedHeadwearB = new Modchu_ModelRotationRenderer(this, 42, 0, Head);
        bipedHeadwearB.addBox(-4.0F, -1.5F, 1.0F, 8, 6, 3, f);
        bipedHeadwearB.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedRightShoulder = new Modchu_ModelRotationRenderer(this, 40, 16, bipedBreast);
        bipedRightShoulder.addBox(-3.0F, -2.0F, -2.0F, 8, 8, 8, f);
        bipedRightShoulder.setRotationPoint(-1.5F, 9.5F + f1, 0.0F);

        RightArm = new Modchu_ModelRotationRenderer(this, 56, 20, bipedRightShoulder);
        RightArm.addBox(-2.0F, -1.0F, -1.0F, 2, 10, 2, f);
        RightArm.setRotationPoint(-3.0F, 5F, 0.0F);

        bipedLeftShoulder = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedLeftShoulder.mirror = true;
        bipedLeftShoulder.setRotationPoint(1.5F, 9.5F + f1, 0.0F);

        LeftArm = new Modchu_ModelRotationRenderer(this, 56, 20, bipedLeftShoulder);
        LeftArm.mirror = true;
        LeftArm.addBox(0.0F, -1.0F, -1.0F, 2, 10, 2, f);
        LeftArm.setRotationPoint(3F, 5F, 0.0F);

        bipedPelvic = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedPelvic.setRotationPoint(0.0F, 10.0F + f1, 0.0F);

        RightLeg = new Modchu_ModelRotationRenderer(this, 0, 16, bipedPelvic);
        RightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 12, 4, f);
        RightLeg.setRotationPoint(-1.5F, 6.0F, 0.0F);

        LeftLeg = new Modchu_ModelRotationRenderer(this, 0, 16, bipedPelvic);
        LeftLeg.mirror = true;
        LeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 12, 4, f);
        LeftLeg.setRotationPoint(1.5F, 6.0F, 0.0F);

        scaleArmType = f1;
        scaleLegType = f2;

        Skirt = new Modchu_ModelRotationRenderer(this, 36, 10, Body);
        Skirt.addBox(-4.0F, 0.0F, -3.0F, 8, 4, 6, f);
        Skirt.setRotationPoint(0.0F, 6.0F, 0.01F);

        RightSkirt = new Modchu_ModelRotationRenderer(this, 14, 16, RightLeg);
        RightSkirt.addBox(-2.5F, 0.0F, -3.0F, 5, 10, 6, f);
        RightSkirt.setRotationPoint(-1.51F, 0.0F, 0.0F);

        LeftSkirt = new Modchu_ModelRotationRenderer(this, 14, 16, LeftLeg);
        LeftSkirt.mirror = true;
        LeftSkirt.addBox(-2.5F, 0.0F, -3.0F, 5, 10, 6, f);
        LeftSkirt.setRotationPoint(1.51F, 0.0F, 0.0F);

        ChignonR = new Modchu_ModelRotationRenderer(this, 24, 2, Head);
        ChignonR.addBox(-5.0F, -7.0F, 0.2F, 1, 3, 3, f);
        ChignonR.setRotationPoint(0.0F, 0.0F, 0.0F);

        ChignonL = new Modchu_ModelRotationRenderer(this, 24, 2, Head);
        ChignonL.mirror = true;
        ChignonL.addBox(4.0F, -7.0F, 0.2F, 1, 3, 3, f);
        ChignonL.setRotationPoint(0.0F, 0.0F, 0.0F);

        SideTailR = new Modchu_ModelRotationRenderer(this, 32, 0, Head);
        SideTailR.addBox(-6.5F, -6.8F, 0.9F, 2, 13, 3, f);
        SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);

        SideTailL = new Modchu_ModelRotationRenderer(this, 32, 0, Head);
        SideTailL.mirror = true;
        SideTailL.addBox(4.5F, -6.8F, 0.9F, 2, 13, 3, f);
        SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedRightArm = RightArm;
        bipedLeftArm = LeftArm;
        bipedRightLeg = RightLeg;
        bipedLeftLeg = LeftLeg;
        bipedBody = Body;
        bipedHead = Head;
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
		if (Head.showModel) {
			ChignonR.render(f5);
			ChignonL.render(f5);
			SideTailR.render(f5);
			SideTailL.render(f5);
        	bipedHeadwearB.render(f5);
		}
		if (Skirt.showModel) {
			Skirt.render(f5);
            RightSkirt.render(f5);
            LeftSkirt.render(f5);
		}
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

    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);
        if (!firstPerson && !isInventory)
        {
        	//
        	bipedOuter.rotationPointY = -2.0F;
        	Body.rotationPointY = 6.0F;
    		Skirt.rotationPointY = 6.0F;
    		Skirt.rotateAngleX = 0.0F;
            bipedPelvic.rotationPointY = 12.0F;

            if (isSleeping)
            {
            }

            boolean flag = false;
            boolean flag1 = onGround > 0.0F;

            //
        	Head.rotationPointY = -2.0F;
        	Head.rotationPointZ = 0.0F;
        	if (isClimb || isCrawlClimb)
            {
                bipedHead.rotateAngleX = f4 / RadiantToAngle;
            	Head.rotationPointZ = -3.0F;
                int i = handsClimbType;

                if (isHandsVineClimbing && i == 2)
                {
                    i = 1;
                }

                float f6;
                float f17;
                float f27;
                float f50;
                float f52;
                float f53;

                switch (i)
                {
                }

                float f36;
                float f43;
                float f47;
                float f54;
                float f55;
                float f56;

                switch (feetClimbType)
                {
                }

                if (isHandsVineClimbing)
                {
                    //Modchu_Debug.mDebug("isHandsVineClimbing");
                }

                if (!isFeetVineClimbing)
                {
                    //Modchu_Debug.mDebug("!isFeetVineClimbing");
                }

                if (isFeetVineClimbing)
                {
                    //Modchu_Debug.mDebug("isFeetVineClimbing");
                }

                if (isCrawlClimb)
                {
                    //Modchu_Debug.mDebug("isCrawlClimb");

                }

                if (i == 0 && feetClimbType != 0)
                {
                }
            }
            else if (isClimbJump)
            {
                //Modchu_Debug.mDebug("isClimbJump");
            }
            else if (isCeilingClimb)
            {
                //Modchu_Debug.mDebug("isCeilingClimb");
            }
            else if (isSwim)
            {
                //Modchu_Debug.mDebug("isSwim");
                //
                bipedOuter.rotationPointY = 0.0F;
            }
            else if (isDive)
            {
                //Modchu_Debug.mDebug("isDive");

            }
            else if (isCrawl)
            {
                //Modchu_Debug.mDebug("isCrawl");
                //
                bipedOuter.rotationPointY = 0.0F;
            }
            else if (isSlide)
            {
                //Modchu_Debug.mDebug("isSlide");
            }
            else if (isFlying)
            {
                //Modchu_Debug.mDebug("isFlying");
            }
            else if (isHeadJump)
            {
                //Modchu_Debug.mDebug("isHeadJump");

                if (overGroundBlockId > 0 && Block.blocksList[overGroundBlockId].blockMaterial.isSolid())
                {
                }
            }
            else if (isFalling)
            {
                //Modchu_Debug.mDebug("isFalling");
            }
            else
            {
                flag = true;
                //
                Head.rotationPointY = 2.0F;
            }

            if (flag)
            {

                if (isSleeping)
                {
                }

                if (isAngleJumping)
                {
                    //Modchu_Debug.mDebug("isAngleJumping");
                }
                else
                {
                }

                if (isRiding)
                {
                    //
                    bipedOuter.rotationPointY = 0.0F;
					Head.rotationPointY = 4.0F;
                }

                if (heldItemLeft != 0)
                {
                }

                if (heldItemRight != 0)
                {
                }
            }

            if (onGround > -9990F)
            {

                if (flag)
                {
                }
                else if (flag1)
                {
                }

                if (flag || flag1)
                {
                }
            }

            if (flag)
            {
            	if (isSneak && !isAngleJumping)
                {
            		Body.rotateAngleX = 0.5F;
					Head.rotationPointY = 0.5F;
                    bipedOuter.rotationPointY = -2.0F;
                    bipedBody.rotationPointY = 5.0F;
                    bipedRightLeg.rotationPointY = bipedLeftLeg.rotationPointY = -4.0F;
                    Skirt.rotateAngleX = -0.5F;
                    if (isRiding)
                    {
                        //
                        bipedOuter.rotationPointY = 0.0F;
    					Head.rotationPointY = 2.0F;
                        Skirt.rotationPointY = 7.0F;
                    }
                }

                if (aimedBow)
                {
                }
            }

            if (bipedOuter.previous != null && !bipedOuter.fadeRotateAngleX)
            {
            }

            if (bipedOuter.previous != null && !bipedOuter.fadeRotateAngleY)
            {
            }

            if (dependentModel != null)
            {
            }
			if (flag) {
				Head.rotateAngleY = 0.0F;
				bipedOuter.rotateAngleY = 0.0F;
			} else {
				bipedOuter.rotateAngleY = 0.0F;
			}
        } else {
        	Head.setRotationPoint(0.0F, 4.0F, 0.0F);
        	Body.setRotationPoint(0.0F, 4.0F, 0.0F);
			bipedRightArm.setRotationPoint(-3.5F, 4.0F, 0.0F);
			bipedLeftArm.setRotationPoint(3.5F, 4.0F, 0.0F);
			bipedRightLeg.setRotationPoint(-1.5F, 12.0F, 0.0F);
			bipedLeftLeg.setRotationPoint(1.5F, 12.0F, 0.0F);
			superSetRotationAngles(f, f1, f2, f3, f4, f5);
        }
    }

    public void superSetRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.superSetRotationAngles(f, f1, f2, f3, f4, f5);
		bipedHead.rotationPointY = 5.0F;
		bipedBody.rotationPointY = 5.0F;

		//bipedHeadwearB.rotationPointY = 0.0F;
        //RightSkirt.rotationPointZ = 0.0F;
        //LeftSkirt.rotationPointZ = 0.0F;
        RightSkirt.rotateAngleX = mh_cos(f * 0.6662F - 0.1F) * 1.5F * f1;
        LeftSkirt.rotateAngleX = mh_cos((f * 0.6662F + 3.141593F) - 0.1F) * 1.5F * f1;
        RightSkirt.rotateAngleY = 0.0F;
        LeftSkirt.rotateAngleY = 0.0F;
        RightSkirt.rotateAngleZ = 0.0F;
        LeftSkirt.rotateAngleZ = 0.0F;
        if(isSneak)
        {
            //RightSkirt.rotationPointY = 0F;
            //LeftSkirt.rotationPointY = 0F;
            //RightSkirt.rotationPointZ = 3F;
            //LeftSkirt.rotationPointZ = 3F;
            bipedRightArm.rotationPointY = bipedLeftArm.rotationPointY = 7F;
            bipedRightLeg.rotationPointY = bipedLeftLeg.rotationPointY = 11.5F;
            bipedRightLeg.rotationPointZ = bipedLeftLeg.rotationPointZ = 4.0F;
        } else
        {
            //RightSkirt.rotationPointY = 0F;
            //LeftSkirt.rotationPointY = 0F;
            bipedRightArm.rotationPointY = bipedLeftArm.rotationPointY = 6.5F;
            bipedRightLeg.rotationPointY = bipedLeftLeg.rotationPointY = 12F;
            bipedRightLeg.rotationPointZ = bipedLeftLeg.rotationPointZ = 0.0F;
        }
        if(isRiding)
        {
/*
        	RightSkirt.rotationPointY = 1F;
            LeftSkirt.rotationPointY = 1F;
            RightSkirt.rotateAngleX = -1.35F;
            LeftSkirt.rotateAngleX = -1.35F;
            RightSkirt.rotateAngleY = 0.12F;
            LeftSkirt.rotateAngleY = -0.12F;
*/
        }
        if(isWait)
        {
            bipedRightArm.rotateAngleX = MathHelper.sin(f2 * 0.067F) * 0.05F - 0.7F;
            bipedRightArm.rotateAngleY = 0.0F;
            bipedRightArm.rotateAngleZ = -0.4F;
            bipedLeftArm.rotateAngleX = MathHelper.sin(f2 * 0.067F) * 0.05F - 0.7F;
            bipedLeftArm.rotateAngleY = 0.0F;
            bipedLeftArm.rotateAngleZ = 0.4F;
        }
        RightSkirt.rotateAngleZ += mh_cos(f2 * 0.06F) * 0.03F + 0.03F;
        LeftSkirt.rotateAngleZ -= mh_cos(f2 * 0.06F) * 0.03F + 0.03F;
        RightSkirt.rotateAngleX += mh_sin(f2 * 0.04F) * 0.03F;
        LeftSkirt.rotateAngleX -= mh_sin(f2 * 0.04F) * 0.03F;
        SideTailR.rotateAngleZ = mh_sin(f2 * 0.08F) * 0.03F + 0.03F;
        SideTailL.rotateAngleZ = -(mh_sin(f2 * 0.08F) * 0.03F + 0.03F);
        SideTailR.rotateAngleX = mh_cos(f2 * 0.05F) * 0.03F;
        SideTailL.rotateAngleX = mh_cos(f2 * 0.05F) * 0.03F;
    }

    public void reset()
    {
        bipedOuter.reset();
        Body.reset();
        bipedBreast.reset();
        bipedNeck.reset();
        Head.reset();
        bipedRightShoulder.reset();
        RightArm.reset();
        bipedLeftShoulder.reset();
        LeftArm.reset();
        bipedPelvic.reset();
        RightLeg.reset();
        LeftLeg.reset();
        RightSkirt.reset();
        LeftSkirt.reset();
        bipedOuter.setRotationPoint(0.0F, 6.0F, 0.0F);
        bipedNeck.setRotationPoint(0.0F, 2.0F, 0.0F);
        bipedRightShoulder.setRotationPoint(-3.0F, 1.0F, 0.0F);
        bipedLeftShoulder.setRotationPoint(3.0F, 1.0F, 0.0F);
        bipedPelvic.setRotationPoint(0.0F, 12.0F, 0.0F);
        Head.setRotationPoint(0.0F, -2.0F, 0.0F);
        Skirt.setRotationPoint(0.0F, 6.0F, 0.1F);
        RightSkirt.setRotationPoint(-0.01F, -1.0F, 0.0F);
        LeftSkirt.setRotationPoint(0.01F, -1.0F, 0.0F);
        RightLeg.setRotationPoint(-1.5F, 0.0F, 0.0F);
        LeftLeg.setRotationPoint(1.5F, 0.0F, 0.0F);
        LeftArm.setRotationPoint(0.0F, 1.0F, 0.0F);
        RightArm.setRotationPoint(0.0F, 1.0F, 0.0F);
        Arms[0].setRotationPoint(0.0F, 6.5F, 0.0F);
        Arms[1].setRotationPoint(0.0F, 6.5F, 0.0F);
    }

    public float getHeight()
    {
        return 1.58F;
    }

    public float getWidth()
    {
        return 0.55F;
    }

	public float getyOffset() {
		return 1.4F;
	}

	public double getMountedYOffset() {
		return 0.85D;
	}

	public float firstPersonY() {
	    return -2.0F;
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
