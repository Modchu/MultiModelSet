package net.minecraft.src;

import net.minecraft.move.render.ModelRotationRenderer;

import org.lwjgl.opengl.GL11;

public class MultiModelSmart_Mabel extends MultiModelSmart
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
	public Modchu_ModelRotationRenderer ChignonB;
	public Modchu_ModelRotationRenderer Tail;
	public Modchu_ModelRotationRenderer SideTailR;
	public Modchu_ModelRotationRenderer SideTailL;
	public Modchu_ModelRotationRenderer Skirt;

    public Modchu_ModelRotationRenderer aboveHeadwear;
    public Modchu_ModelRotationRenderer innerBody;
    public Modchu_ModelRotationRenderer innerRightLeg;
    public Modchu_ModelRotationRenderer innerLeftLeg;
    public Modchu_ModelRotationRenderer innerSkirt;
    public Modchu_ModelRotationRenderer bipedHeadwearB;

    public MultiModelSmart_Mabel(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_Mabel(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        bipedOuter = new Modchu_ModelRotationRenderer(this, -1, -1, (Modchu_ModelRotationRenderer)null);
        bipedOuter.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedOuter.fadeEnabled = true;

        Body = new Modchu_ModelRotationRenderer(this, 16, 0, bipedOuter);
        Body.addBox(-3F, 0.0F, -2F, 6, 7, 4, var1);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedBreast = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedBreast.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedNeck = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedNeck.setRotationPoint(0.0F, 0.0F, 0.0F);

        Head = new Modchu_ModelRotationRenderer(this, 0, 0, bipedNeck);
        Head.addBox(-2F, -6F, -2F, 4, 4, 4, var1 + 2.0F);
        Head.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedRightShoulder = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedRightShoulder.setRotationPoint(0.0F, 0.0F, 0.0F);

        RightArm = new Modchu_ModelRotationRenderer(this, 28, 22, bipedRightShoulder);
        RightArm.addBox(-2F, -1F, -1F, 2, 8, 2, var1);
        RightArm.setRotationPoint(-3F, 1.5F, 0.0F);

        bipedLeftShoulder = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedLeftShoulder.mirror = true;
        bipedLeftShoulder.setRotationPoint(1.5F, 9.5F, 0.0F);

        LeftArm = new Modchu_ModelRotationRenderer(this, 36, 22, bipedLeftShoulder);
        LeftArm.setMirror(true);
        LeftArm.addBox(0.0F, -1F, -1F, 2, 8, 2, var1);
        LeftArm.setRotationPoint(3F, 1.5F, 0.0F);

        bipedPelvic = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedPelvic.setRotationPoint(0.0F, 10.0F, 0.0F);

        RightLeg = new Modchu_ModelRotationRenderer(this, 36, 0, bipedPelvic);
        RightLeg.addBox(-2F, 0.0F, -2F, 3, 9, 4, var1);
        RightLeg.setRotationPoint(-1F, 7F, 0.0F);

        LeftLeg = new Modchu_ModelRotationRenderer(this, 36, 0, bipedPelvic);
        LeftLeg.setMirror(true);
        LeftLeg.addBox(-1F, 0.0F, -2F, 3, 9, 4, var1);
        LeftLeg.setRotationPoint(1.0F, 7F, 0.0F);

        scaleArmType = var2;
        scaleLegType = var3;

        aboveHeadwear = new Modchu_ModelRotationRenderer(this, 0, 8, Head);
        aboveHeadwear.addBox(-2F, -7F, -2F, 4, 4, 4, var1 + 2.2F);
        aboveHeadwear.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedHeadwearB = new Modchu_ModelRotationRenderer(this, 0, 16, Head);
        bipedHeadwearB.addBox(-2F, 2.0F, -2F, 4, 4, 4, var1 + 2.0F);
        bipedHeadwearB.setRotationPoint(0.0F, 0.0F, 0.0F);

        innerBody = new Modchu_ModelRotationRenderer(this, 16, 11, Body);
        innerBody.addBox(-3F, 0.0F, -2F, 6, 7, 4, var1 - 0.3F);
        innerBody.setRotationPoint(0.0F, 0.0F, -0.2F);

        innerRightLeg = new Modchu_ModelRotationRenderer(this, 50, 0, RightLeg);
        innerRightLeg.addBox(-2F, 0.0F, -2F, 3, 9, 4, var1 - 0.3F);
        innerRightLeg.setRotationPoint(0.0F, 0.0F, -0.2F);

        innerLeftLeg = new Modchu_ModelRotationRenderer(this, 50, 0, LeftLeg);
        innerLeftLeg.setMirror(true);
        innerLeftLeg.addBox(-1F, 0.0F, -2F, 3, 9, 4, var1 - 0.3F);
        innerLeftLeg.setRotationPoint(0.0F, 0.0F, -0.2F);

        Skirt = new Modchu_ModelRotationRenderer(this, 0, 24, Body);
        Skirt.addBox(-2F, 0.0F, -2F, 4, 4, 4, var1 + 2.0F);
        Skirt.setRotationPoint(0.0F, 7F, 0.0F);

        innerSkirt = new Modchu_ModelRotationRenderer(this, 16, 26, Skirt);
        innerSkirt.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, var1 + 1.6F);
        innerSkirt.setRotationPoint(0.0F, 0.0F, 0.0F);

        ChignonB = new Modchu_ModelRotationRenderer(this, 32, 0, Head);
        ChignonB.addBox(-1F, -6.2F, 3F, 2, 2, 2, var1 + 1.0F);
        ChignonB.setRotationPoint(0.0F, 0.0F, 0.0F);

        ChignonR = new Modchu_ModelRotationRenderer(this, 12, 0, Head);
        ChignonR.addBox(-5F, -6F, 0.2F, 2, 2, 2, var1 + 1.0F);
        ChignonR.setRotationPoint(0.0F, 0.0F, 0.0F);

        ChignonL = new Modchu_ModelRotationRenderer(this, 12, 0, Head);
        ChignonL.addBox(3F, -6F, 0.2F, 2, 2, 2, var1 + 1.0F);
        ChignonL.setRotationPoint(0.0F, 0.0F, 0.0F);

        Tail = new Modchu_ModelRotationRenderer(this, 44, 13, Head);
        Tail.addBox(-1.5F, -6.8F, 4F, 3, 16, 3, var1);
        Tail.setRotationPoint(0.0F, 0.0F, 0.0F);

        SideTailR = new Modchu_ModelRotationRenderer(this, 56, 13, Head);
        SideTailR.addBox(-2F, -0.5F, 0.25F, 2, 17, 2, var1);
        SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);
        SideTailR.rotationPointX = -5F;
        SideTailR.rotationPointY = -6F;

        SideTailL = new Modchu_ModelRotationRenderer(this, 56, 13, Head);
        SideTailL.setMirror(true);
        SideTailL.addBox(0.0F, -0.5F, 0.25F, 2, 17, 2, var1);
        SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);
        SideTailL.rotationPointX = 5F;
        SideTailL.rotationPointY = -6F;

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
			aboveHeadwear.preRotateRender(f5);
			bipedHeadwearB.preRotateRender(f5);
		}
		if (Skirt.showModel) {
			Skirt.render(f5);
		}
		if (Body.showModel) {
			innerBody.preRotateRender(f5);
		}
		if (RightLeg.showModel) {
			innerRightLeg.preRotateRender(f5);
		}
		if (LeftLeg.showModel) {
			innerLeftLeg.preRotateRender(f5);
		}
		if (RightLeg.showModel
				&& LeftLeg.showModel) {
			innerSkirt.preRotateRender(f5);
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
        	bipedOuter.rotationPointY = 0.0F;
        	Body.rotationPointY = 8.0F;
			Head.rotationPointY = 6.0F;
    		Skirt.rotationPointY = 7.0F;
    		Skirt.rotateAngleX = 0.0F;

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

                bipedOuter.rotateAngleX += 0.1F;
				Body.rotateAngleX += 0.1F;
				Body.rotationPointZ = -3.5F;
            	Head.rotationPointZ = 1.0F;
                bipedRightArm.rotationPointZ = bipedLeftArm.rotationPointZ = 1.0F;

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
                bipedOuter.rotationPointY = -3.0F;
            }
            else if (isDive)
            {
                //Modchu_Debug.mDebug("isDive");

            }
            else if (isCrawl)
            {
                Modchu_Debug.mDebug("isCrawl bipedBody.rotateAngleZ = "+bipedBody.rotateAngleZ);
                //
                bipedOuter.rotationPointY = -3.0F;
                //bipedBody.rotateAngleZ = 1.374447F;
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
                Head.rotationPointY = 6.0F;
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
                    bipedOuter.rotationPointY = -1.0F;
					Head.rotationPointY = 5.0F;
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
					Head.rotationPointY = 3.5F;
                    bipedOuter.rotationPointY = -2.0F;
                    bipedBody.rotationPointY = 5.0F;
                    bipedRightLeg.rotationPointY = bipedLeftLeg.rotationPointY = -4.0F;
                    if (isRiding)
                    {
                        //
                        bipedOuter.rotationPointY = -1.0F;
    					Head.rotationPointY = 4.0F;
                        Skirt.rotationPointY = 4.0F;
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
			bipedRightArm.setRotationPoint(-3.5F, 10.0F, 0.0F);
			bipedLeftArm.setRotationPoint(3.5F, 10.0F, 0.0F);
			bipedRightLeg.setRotationPoint(-1.0F, 14.0F, 0.0F);
			bipedLeftLeg.setRotationPoint(1.0F, 14.0F, 0.0F);
        }

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
        bipedOuter.setRotationPoint(0.0F, 8.0F, 0.0F);
        bipedNeck.setRotationPoint(0.0F, 2.0F, 0.0F);
        bipedRightShoulder.setRotationPoint(-3.0F, 1.0F, 0.0F);
        bipedLeftShoulder.setRotationPoint(3.0F, 1.0F, 0.0F);
        bipedPelvic.setRotationPoint(0.0F, 12.0F, 0.0F);
        Head.setRotationPoint(0.0F, -2.0F, 0.0F);
        Skirt.setRotationPoint(0.0F, 6.0F, 0.1F);
        RightLeg.setRotationPoint(-1.0F, -5.0F, 0.0F);
        LeftLeg.setRotationPoint(1.0F, -5.0F, 0.0F);
        innerLeftLeg.setRotationPoint(0.0F, 0.0F, -0.2F);
        innerRightLeg.setRotationPoint(0.0F, 0.0F, -0.2F);
    }

    public float getHeight()
    {
        return 1.35F;
    }

    public float getWidth()
    {
        return 0.6F;
    }

    public void equippedBlockPosition()
    {
        GL11.glTranslatef(0.0F, 0.1275F, -0.3125F);
    }

    public void equippedItemPosition3D()
    {
        GL11.glTranslatef(0.02F, 0.13F, 0.0F);
    }

    public void equippedItemPosition()
    {
        GL11.glTranslatef(0.2F, 0.08F, -0.0875F);
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
