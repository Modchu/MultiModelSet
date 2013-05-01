package net.minecraft.src;

import net.minecraft.move.render.ModelRotationRenderer;

import org.lwjgl.opengl.GL11;

public class MultiModelSmart_Petit extends MultiModelSmart
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

    public Modchu_ModelRotationRenderer Prim;
	public Modchu_ModelRotationRenderer eyeR;
	public Modchu_ModelRotationRenderer eyeL;
	public Modchu_ModelRotationRenderer FaceR;
	public Modchu_ModelRotationRenderer FaceL;

    public MultiModelSmart_Petit(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_Petit(float var1, int var2, int var3)
    {
        super(var1, var2, var3);

        bipedOuter = new Modchu_ModelRotationRenderer(this, -1, -1, (Modchu_ModelRotationRenderer)null);
        bipedOuter.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedOuter.fadeEnabled = true;

        Body = new Modchu_ModelRotationRenderer(this, 32, 8, bipedOuter);
        Body.addBox(-3F, 0F, -2F, 6, 7, 4, var1 - 1.25F);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedBreast = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedBreast.setRotationPoint(0.0F, 4.0F, 0.0F);
        bipedNeck = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedNeck.setRotationPoint(0.0F, 0.0F, 0.0F);

        Head = new Modchu_ModelRotationRenderer(this, 0, 0, bipedNeck);
        Head.addBox(-4F, -6F, -4F, 8, 8, 8, var1 - 2F);
        Head.setRotationPoint(0.0F, 0.0F, 0.0F);

        Headwear = new Modchu_ModelRotationRenderer(this, 24, 0, Head);
        Headwear.addBox(-2F, 0F, -1F, 4, 5, 3, var1);
        Headwear.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedRightShoulder = new Modchu_ModelRotationRenderer(this, 40, 16, bipedBreast);
        bipedRightShoulder.addBox(-3.0F, -2.0F, -2.0F, 8, 8, 8, var1);
        bipedRightShoulder.setRotationPoint(0.0F, 0.0F, 0.0F);

        RightArm = new Modchu_ModelRotationRenderer(this, 48, 0, bipedRightShoulder);
        RightArm.addBox(-1F, -1F, -1F, 2, 5, 2, var1 - 0.5F);
        RightArm.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedLeftShoulder = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedLeftShoulder.mirror = true;
        bipedLeftShoulder.setRotationPoint(0.0F, 0.0F, 0.0F);

        LeftArm = new Modchu_ModelRotationRenderer(this, 56, 0, bipedLeftShoulder);
        LeftArm.addBox(-1F, -1F, -1F, 2, 5, 2, var1 - 0.5F);
        LeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedPelvic = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedPelvic.setRotationPoint(0.0F, 0.0F, 0.0F);

        RightLeg = new Modchu_ModelRotationRenderer(this, 33, 20, bipedPelvic);
        RightLeg.addBox(-2F, 0.0F, -1.5F, 3, 6, 3, var1 - 0.5F);
        RightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);

        LeftLeg = new Modchu_ModelRotationRenderer(this, 33, 20, bipedPelvic);
        LeftLeg.mirror = true;
        LeftLeg.addBox(-1F, 0.0F, -1.5F, 3, 6, 3, var1 - 0.5F);
        LeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);

        scaleArmType = var2;
        scaleLegType = var3;

        Skirt = new Modchu_ModelRotationRenderer(this, 0, 16, Body);
        Skirt.addBox(-4F, -2F, -4F, 8, 8, 8, var1 - 1.9F);
        Skirt.setRotationPoint(0.0F, 0.0F, 0.0F);

        ChignonR = new Modchu_ModelRotationRenderer(this, 25, 19, Head);
        ChignonR.addBox(-2.55F, -3.8F, -0.5F, 1, 2, 2, var1 - 0.3F);
        ChignonR.setRotationPoint(0.0F, 0.0F, 0.0F);

        ChignonL = new Modchu_ModelRotationRenderer(this, 25, 19, Head);
        ChignonL.addBox(1.6F, -3.8F, -0.5F, 1, 2, 2, var1 - 0.3F);
        ChignonL.setRotationPoint(0.0F, 0.0F, 0.0F);

        ChignonB = new Modchu_ModelRotationRenderer(this, 52, 10, Head);
        ChignonB.addBox(-1.5F, -4.2F, 0.9F, 3, 3, 2, var1 - 0.4F);
        ChignonB.setRotationPoint(0.0F, 0.0F, 0.0F);

        Tail = new Modchu_ModelRotationRenderer(this, 46, 20, Head);
        Tail.addBox(-1.5F, -3.9F, 1F, 3, 9, 3, var1 - 0.8F);
        Tail.setRotationPoint(0.0F, 0.0F, 0.0F);

        SideTailR = new Modchu_ModelRotationRenderer(this, 59, 22, Head);
        SideTailR.addBox(-2.8F, -3.3F, 0.2F, 1, 4, 1, var1 - 0.1F);
        SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);

        SideTailL = new Modchu_ModelRotationRenderer(this, 59, 22, Head);
        SideTailL.mirror = true;
        SideTailL.addBox(1.7F, -3.3F, 0.2F, 1, 4, 1, var1 - 0.1F);
        SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);

        Prim = new Modchu_ModelRotationRenderer(this, 24, 17, Head);
        Prim.addPlate(-1.5F, -4.7F, -2.1F, 3, 1, 0, var1 - 0.3F);
        Prim.setRotationPoint(0.0F, 0.0F, 0.0F);

        FaceR = new Modchu_ModelRotationRenderer(this, 29, 16, Head);
		FaceR.addBox(-2.99F, -3.5F, -3.001F, 4, 4, 3, var1 - 1F);
		FaceR.setRotationPoint(0.0F, 0.0F, 0.0F);

		FaceL = new Modchu_ModelRotationRenderer(this, 39, 16, Head);
		FaceL.addBox(-0.99F, -3.5F, -3.001F, 4, 4, 3, var1 - 1F);
		FaceL.setRotationPoint(0.0F, 0.0F, 0.0F);

        eyeL = new Modchu_ModelRotationRenderer(this, 0, 16, Head);
        eyeL.addBox(-1F, 0F, -2.602F, 2, 2, 2, var1 - 0.6F);
        eyeL.setRotationPoint(-1.0F, -2.5F, 0.0F);

        eyeR = new Modchu_ModelRotationRenderer(this, 0, 20, Head);
        eyeR.addBox(-1F, 0F, -2.602F, 2, 2, 2, var1 - 0.6F);
        eyeR.setRotationPoint(1.0F, -2.5F, 0.0F);

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
			ChignonB.render(f5);
			ChignonR.render(f5);
			ChignonL.render(f5);
			SideTailR.render(f5);
			SideTailL.render(f5);
			Tail.render(f5);
			Prim.render(f5);
    		FaceR.preRotateRender(f5);
    		FaceL.preRotateRender(f5);
			eyeR.preRotateRender(f5);
			eyeL.preRotateRender(f5);
		}
		if (Skirt.showModel) {
			Skirt.render(f5);
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
        	bipedOuter.rotationPointY = 14.0F;
        	Head.rotationPointY = 15.0F;
        	RightArm.rotationPointY = LeftArm.rotationPointY = 7.0F;
    		Skirt.rotateAngleX = 0.0F;

            if (isSleeping)
            {
            }

            boolean flag = false;
            boolean flag1 = onGround > 0.0F;

            //
            bipedOuter.rotationPointY = -1.0F;
            Head.rotationPointY = 1.0F;
        	if (isClimb || isCrawlClimb)
            {
                bipedHead.rotateAngleX = f4 / RadiantToAngle;
                int i = handsClimbType;
            	bipedOuter.rotationPointY = 14.0F;

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
                    //mod_PFLM_PlayerFormLittleMaid.mDebug("isHandsVineClimbing");
                }

                if (!isFeetVineClimbing)
                {
                    //mod_PFLM_PlayerFormLittleMaid.mDebug("!isFeetVineClimbing");
                }

                if (isFeetVineClimbing)
                {
                    //mod_PFLM_PlayerFormLittleMaid.mDebug("isFeetVineClimbing");
                }

                if (isCrawlClimb)
                {
                    //mod_PFLM_PlayerFormLittleMaid.mDebug("isCrawlClimb");

                }

                if (i == 0 && feetClimbType != 0)
                {
                }
            }
            else if (isClimbJump)
            {
                //mod_PFLM_PlayerFormLittleMaid.mDebug("isClimbJump");
            }
            else if (isCeilingClimb)
            {
                //mod_PFLM_PlayerFormLittleMaid.mDebug("isCeilingClimb");
            }
            else if (isSwim)
            {
                //mod_PFLM_PlayerFormLittleMaid.mDebug("isSwim");
                //
                Head.rotationPointY = 1.0F;
                Head.rotationPointZ = 0.0F;
            }
            else if (isDive)
            {
                //mod_PFLM_PlayerFormLittleMaid.mDebug("isDive");

            }
            else if (isCrawl)
            {
                //mod_PFLM_PlayerFormLittleMaid.mDebug("isCrawl");
                //
                bipedOuter.rotationPointY = 2.0F;
            }
            else if (isSlide)
            {
                //mod_PFLM_PlayerFormLittleMaid.mDebug("isSlide");
            }
            else if (isFlying)
            {
                //mod_PFLM_PlayerFormLittleMaid.mDebug("isFlying");
            }
            else if (isHeadJump)
            {
                //mod_PFLM_PlayerFormLittleMaid.mDebug("isHeadJump");

                if (overGroundBlockId > 0 && Block.blocksList[overGroundBlockId].blockMaterial.isSolid())
                {
                }
            }
            else if (isFalling)
            {
                //mod_PFLM_PlayerFormLittleMaid.mDebug("isFalling");
            }
            else
            {
                flag = true;
                //
            	bipedOuter.rotationPointY = 14.0F;
                Head.rotationPointY = 15.0F;
            }

            if (flag)
            {

                if (isSleeping)
                {
                }

                if (isAngleJumping)
                {
                    //mod_PFLM_PlayerFormLittleMaid.mDebug("isAngleJumping");
                }
                else
                {
                }

                if (isRiding)
                {
                    //
                    bipedOuter.rotationPointY = 10.0F;
					Head.rotationPointY = 11.5F;
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
                	bipedOuter.rotationPointY = 5.3F;
                	Head.rotationPointY = 12.0F;
            		Skirt.rotationPointY = 3.7F;
            		Skirt.rotateAngleX = -0.2F;
                    if (isRiding)
                    {
                        //
                        bipedOuter.rotationPointY = 4.0F;
    					Head.rotationPointY = 10.0F;
                        Skirt.rotationPointY = 2.8F;
                    }
                }

                if (aimedBow)
                {
        			eyeR.setVisible(false);
        			FaceR.setVisible(false);
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

        if( 0 > mh_sin(f2 * 0.1F) * 0.3F + (Math.random() * 0.1F) + 0.18F)
        {
        	eyeL.setVisible(false);
        	eyeR.setVisible(false);
        	FaceL.setVisible(false);
        	FaceR.setVisible(false);

        } else
        {
        	eyeL.setVisible(true);
        	eyeR.setVisible(true);
        	FaceL.setVisible(true);
        	FaceR.setVisible(true);
        }
        } else {
            Body.setRotationPoint(0.0F, 10.0F, 0.0F);
            Head.setRotationPoint(0.0F, 12.0F, 0.0F);
            RightArm.setRotationPoint(-2.0F, 12.0F, 0.0F);
            LeftArm.setRotationPoint(2.0F, 12.0F, 0.0F);
        	bipedRightLeg.setRotationPoint(0.0F, 15.0F, 0.0F);
        	bipedLeftLeg.setRotationPoint(0.0F, 15.0F, 0.0F);
        }
    }

    public void reset()
    {
    	super.reset();
    	bipedOuter.setRotationPoint(0.0F, 15.0F, 0.0F);
    	bipedBreast.setRotationPoint(0.0F, 0.0F, 0.0F);
    	bipedNeck.setRotationPoint(0.0F, 0.0F, 0.0F);
    	bipedRightShoulder.setRotationPoint(-1.5F, -5.0F, 0.0F);
    	bipedLeftShoulder.setRotationPoint(1.5F, -5.0F, 0.0F);
        bipedPelvic.setRotationPoint(0.0F, 10.0F, 0.0F);
        RightArm.setRotationPoint(0.0F, 6.0F, 0.0F);
        LeftArm.setRotationPoint(0.0F, 6.0F, 0.0F);
        RightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        LeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        Head.setRotationPoint(0.0F, 1.0F, 0.0F);
        Skirt.setRotationPoint(0.0F, 4.0F, 0.0F);
		HeadMount.setRotationPoint(0.0F, -14.0F, 0.0F);
    }

	public float getHeight()
    {
        return 0.9F;
    }

    public float getWidth()
    {
    	return 0.5F;
    }

	public float getyOffset() {
	    return 0.7F;
	}

	public float getRidingyOffset() {
	    return getyOffset() + 0.4F;
	}

	public double getMountedYOffset() {
		double d = 1.6D;
	    return d;
	}

	public float firstPersonY() {
	    return -6.5F;
	}

    public void equippedBlockPosition()
    {
    	GL11.glTranslatef(0F, -0.15F, -0.1F);
    }

    public void equippedItemPosition3D()
    {
    	GL11.glTranslatef(0.05F, -0.15F, 0.01F);
    }

    public void equippedItemPosition()
    {
    	GL11.glTranslatef(0.1F, -0.15F, -0.1F);
    }

    public void equippedItemPositionBlockLeaves()
    {
    	GL11.glTranslatef(0.05F, -0.15F, 0.01F);
    }

    public void equippedItemPositionFlower()
    {
    	GL11.glTranslatef(0.0F, 0.7F, 0.0F);
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
