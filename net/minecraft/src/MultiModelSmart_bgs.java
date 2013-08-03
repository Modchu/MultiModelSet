package net.minecraft.src;

import net.minecraft.move.render.ModelRotationRenderer;

import org.lwjgl.opengl.GL11;

public class MultiModelSmart_bgs extends MultiModelSmart
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

    public Modchu_ModelRotationRenderer Headwear;
    public Modchu_ModelRotationRenderer HornR1;
    public Modchu_ModelRotationRenderer HornR2;
    public Modchu_ModelRotationRenderer HornR3;
    public Modchu_ModelRotationRenderer HornR4;
    public Modchu_ModelRotationRenderer HeadwearR;
    public Modchu_ModelRotationRenderer HornL1;
    public Modchu_ModelRotationRenderer HornL2;
    public Modchu_ModelRotationRenderer HornL3;
    public Modchu_ModelRotationRenderer HornL4;
    public Modchu_ModelRotationRenderer HeadwearL;
    public Modchu_ModelRotationRenderer ArmR1;
    public Modchu_ModelRotationRenderer ArmL1;
    public Modchu_ModelRotationRenderer HandR1;
    public Modchu_ModelRotationRenderer HandR2;
    public Modchu_ModelRotationRenderer HandL1;
    public Modchu_ModelRotationRenderer HandL2;
    public Modchu_ModelRotationRenderer LegR1;
    public Modchu_ModelRotationRenderer LegR2;
    public Modchu_ModelRotationRenderer LegR3;
    public Modchu_ModelRotationRenderer LegR4;
    public Modchu_ModelRotationRenderer LegR5;
    public Modchu_ModelRotationRenderer LegL1;
    public Modchu_ModelRotationRenderer LegL2;
    public Modchu_ModelRotationRenderer LegL3;
    public Modchu_ModelRotationRenderer LegL4;
    public Modchu_ModelRotationRenderer LegL5;
    public Modchu_ModelRotationRenderer bootR1;
    public Modchu_ModelRotationRenderer bootR2;
    public Modchu_ModelRotationRenderer bootL1;
    public Modchu_ModelRotationRenderer bootL2;
    public Modchu_ModelRotationRenderer eyeR;
    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer Breast;

    public MultiModelSmart_bgs(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_bgs(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        textureWidth = 64;
        textureHeight = 64;

        bipedOuter = new Modchu_ModelRotationRenderer(this, -1, -1, (Modchu_ModelRotationRenderer)null);
        bipedOuter.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedOuter.fadeEnabled = true;

        Body = new Modchu_ModelRotationRenderer(this, 32, 0, bipedOuter);
        Body.addBox(-3F, 0.0F, -2F, 6, 9, 4, var1);
        Body.setRotationPoint(0.0F, 4F, 0.0F);

        bipedBreast = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedBreast.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedNeck = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedNeck.setRotationPoint(0.0F, 0.0F, 0.0F);

        Head = new Modchu_ModelRotationRenderer(this, 0, 0, bipedNeck);
        Head.addBox(-4F, -8F, -4F, 8, 8, 8, var1);
        Head.setRotationPoint(0.0F, 4F, 0.0F);

        bipedRightShoulder = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedRightShoulder.setRotationPoint(0.0F, 0.0F, 0.0F);

        RightArm = new Modchu_ModelRotationRenderer(this, 0, 16, bipedRightShoulder);
        RightArm.addBox(-2F, -1F, -1F, 2, 10, 2, var1);
        RightArm.setRotationPoint(-3F, 5.5F, 0.0F);

        bipedLeftShoulder = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedLeftShoulder.mirror = true;
        bipedLeftShoulder.setRotationPoint(1.5F, 9.5F, 0.0F);

        LeftArm = new Modchu_ModelRotationRenderer(this, 8, 16, bipedLeftShoulder);
        LeftArm.mirror = true;
        LeftArm.addBox(0.0F, -1F, -1F, 2, 10, 2, var1);
        LeftArm.setRotationPoint(3F, 5.5F, 0.0F);

        bipedPelvic = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedPelvic.setRotationPoint(0.0F, 10.0F, 0.0F);

        RightLeg = new Modchu_ModelRotationRenderer(this, 32, 13, bipedPelvic);
        RightLeg.addBox(-2F, 0.0F, -2F, 3, 11, 4, var1);
        RightLeg.setRotationPoint(-1F, 13F, 0.0F);

        LeftLeg = new Modchu_ModelRotationRenderer(this, 32, 13, bipedPelvic);
        LeftLeg.mirror = true;
        LeftLeg.addBox(-1F, 0.0F, -2F, 3, 11, 4, var1);
        LeftLeg.setRotationPoint(1.0F, 13F, 0.0F);

        scaleArmType = var2;
        scaleLegType = var3;

        Headwear = new Modchu_ModelRotationRenderer(this, 0, 28, Head);
        Headwear.addBox(-4F, 0.0F, 1.0F, 8, 12, 3, var1);
        Headwear.setRotationPoint(0.0F, 0.0F, 0.0F);
        Headwear.setRotateAngleX(0.2094395F);

        Skirt = new Modchu_ModelRotationRenderer(this, 0, 16, Body);
        Skirt.addBox(-4F, -3F, -3F, 8, 10, 6, var1);
        Skirt.setRotationPoint(0.0F, 13F, 0.0F);

        ChignonR = new Modchu_ModelRotationRenderer(this, 0, 2, Head);
        ChignonR.addBox(-5F, -7F, 0.2F, 1, 3, 3, var1);
        ChignonR.setRotationPoint(0.0F, 0F, 0.0F);

        ChignonL = new Modchu_ModelRotationRenderer(this, 0, 2, Head);
        ChignonL.mirror = true;
        ChignonL.addBox(4F, -7F, 0.2F, 1, 3, 3, var1);
        ChignonL.setRotationPoint(0.0F, 0F, 0.0F);

        ChignonB = new Modchu_ModelRotationRenderer(this, 24, 2, Head);
        ChignonB.addBox(-2F, -7.2F, 4F, 4, 4, 2, var1);
        ChignonB.setRotationPoint(0.0F, 0F, 0.0F);

        Tail = new Modchu_ModelRotationRenderer(this, 52, 5, Head);
        Tail.addBox(-1.5F, -1.5F, -1F, 3, 9, 3, var1);
        Tail.setRotationPoint(0.0F, 0.0F, 5F);
        //Head.addChild(Tail);

        SideTailR = new Modchu_ModelRotationRenderer(this, 58, 18, Head);
        SideTailR.addBox(-1F, -1.3F, -0.8F, 1, 9, 2, var1);
        SideTailR.setRotationPoint(-4.5F, 0.0F, 1.7F);
        //Head.addChild(SideTailR);

        SideTailL = new Modchu_ModelRotationRenderer(this, 58, 18, Head);
        SideTailL.mirror = true;
        SideTailL.addBox(0.0F, -1.3F, -0.8F, 1, 9, 2, var1);
        SideTailL.setRotationPoint(4.5F, 0.0F, 1.7F);
        //Head.addChild(SideTailL);

        HornR1 = new Modchu_ModelRotationRenderer(this, 52, 28, Head);
        HornR1.addBox(-1F, -10F, 0.0F, 2, 2, 1, var1);
        HornR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        HornR1.setRotateAngleZ(-0.3839724F);

        HornR2 = new Modchu_ModelRotationRenderer(this, 58, 18, Head);
        HornR2.addBox(-6.9F, -11.3F, 0.0F, 1, 4, 1, var1);
        HornR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        HornR2.setRotateAngleZ(0.2792527F);

        HornR3 = new Modchu_ModelRotationRenderer(this, 52, 22, Head);
        HornR3.addBox(-4.2F, -13F, 0.0F, 1, 4, 1, var1);
        HornR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        HornR3.setRotateAngleZ(0.0523599F);

        HornR4 = new Modchu_ModelRotationRenderer(this, 53, 18, Head);
        HornR4.addBox(-2.4F, -15.2F, 0.0F, 1, 2, 1, var1);
        HornR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        HornR4.setRotateAngleZ(-0.0872665F);

        HeadwearR = new Modchu_ModelRotationRenderer(this, 0, 0, Head);
        HeadwearR.addBox(-4F, 0.0F, -4F, 1, 4, 2, var1);
        HeadwearR.setRotationPoint(0.0F, 0.0F, 0.0F);

        ArmR1 = new Modchu_ModelRotationRenderer(this, 28, 29, RightArm);
        ArmR1.addBox(-1F, 4F, -1.5F, 2, 5, 3, var1);
        ArmR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        ArmR1.setRotateAngleZ(0.2617994F);

        HandR1 = new Modchu_ModelRotationRenderer(this, 18, 24, RightArm);
        HandR1.addBox(-1F, 7.5F, -1.5F, 1, 2, 1, var1);
        HandR1.setRotationPoint(0.0F, 0.0F, 0.0F);

        HandR2 = new Modchu_ModelRotationRenderer(this, 17, 20, RightArm);
        HandR2.addBox(-2F, 8.5F, -1F, 1, 1, 2, var1);
        HandR2.setRotationPoint(0.0F, 0.0F, 0.0F);

        LegR1 = new Modchu_ModelRotationRenderer(this, 0, 47, RightLeg);
        LegR1.addBox(-2.5F, 2.0F, -2F, 1, 2, 4, var1);
        LegR1.setRotationPoint(0.0F, 0.0F, 0.0F);

        LegR2 = new Modchu_ModelRotationRenderer(this, 0, 43, RightLeg);
        LegR2.addBox(-2F, 2.4F, -3F, 3, 2, 1, var1);
        LegR2.setRotationPoint(0.0F, 0.0F, 0.0F);

        LegR3 = new Modchu_ModelRotationRenderer(this, 11, 44, RightLeg);
        LegR3.addBox(-2F, 5F, 0.0F, 3, 1, 3, var1);
        LegR3.setRotationPoint(0.0F, 0.0F, 0.0F);

        LegR4 = new Modchu_ModelRotationRenderer(this, 5, 53, RightLeg);
        LegR4.addBox(-1F, 2.7F, -5F, 1, 1, 2, var1);
        LegR4.setRotationPoint(0.0F, 0.0F, 0.0F);

        LegR5 = new Modchu_ModelRotationRenderer(this, 0, 53, RightLeg);
        LegR5.addBox(-1F, 2.7F, -3.5F, 1, 2, 1, var1);
        LegR5.setRotationPoint(0.0F, 0.0F, 0.0F);

        bootR1 = new Modchu_ModelRotationRenderer(this, 0, 57, RightLeg);
        bootR1.addBox(-1.5F, 10F, -3F, 2, 1, 1, var1);
        bootR1.setRotationPoint(0.0F, 0.0F, 0.0F);

        bootR2 = new Modchu_ModelRotationRenderer(this, 0, 53, RightLeg);
        bootR2.addBox(-1F, 8F, -6F, 1, 2, 1, var1);
        bootR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        bootR2.setRotateAngleX(0.2792527F);

        HornL1 = new Modchu_ModelRotationRenderer(this, 52, 28, Head);
        HornL1.addBox(-1F, -10F, 0.0F, 2, 2, 1, var1);
        HornL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        HornL1.setRotateAngleZ(0.3839724F);

        HornL2 = new Modchu_ModelRotationRenderer(this, 58, 18, Head);
        HornL2.addBox(5.9F, -11.3F, 0.0F, 1, 4, 1, var1);
        HornL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        HornL2.setRotateAngleZ(-0.2792527F);

        HornL3 = new Modchu_ModelRotationRenderer(this, 52, 22, Head);
        HornL3.addBox(3.2F, -13F, 0.0F, 1, 4, 1, var1);
        HornL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        HornL3.setRotateAngleZ(-0.0523599F);

        HornL4 = new Modchu_ModelRotationRenderer(this, 53, 18, Head);
        HornL4.addBox(1.4F, -15.2F, 0.0F, 1, 2, 1, var1);
        HornL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        HornL4.setRotateAngleZ(0.0872665F);

        HeadwearL = new Modchu_ModelRotationRenderer(this, 24, 0, Head);
        HeadwearL.addBox(3F, 0.0F, -4F, 1, 4, 2, var1);
        HeadwearL.setRotationPoint(0.0F, 0.0F, 0.0F);

        ArmL1 = new Modchu_ModelRotationRenderer(this, 41, 29, LeftArm);
        ArmL1.addBox(-1F, 4F, -1.5F, 2, 5, 3, var1);
        ArmL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        ArmL1.setRotateAngleZ(-0.2617994F);
        HandL1 = new Modchu_ModelRotationRenderer(this, 18, 24, LeftArm);
        HandL1.addBox(0.0F, 7.5F, -1.5F, 1, 2, 1, var1);
        HandL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        HandL2 = new Modchu_ModelRotationRenderer(this, 17, 20, LeftArm);
        HandL2.addBox(1.0F, 8.5F, -1F, 1, 1, 2, var1);
        HandL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        LegL1 = new Modchu_ModelRotationRenderer(this, 0, 47, LeftLeg);
        LegL1.addBox(1.5F, 2.0F, -2F, 1, 2, 4, var1);
        LegL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        LegL2 = new Modchu_ModelRotationRenderer(this, 0, 43, LeftLeg);
        LegL2.addBox(-1F, 2.4F, -3F, 3, 2, 1, var1);
        LegL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        LegL3 = new Modchu_ModelRotationRenderer(this, 11, 44, LeftLeg);
        LegL3.addBox(-1F, 5F, 0.0F, 3, 1, 3, var1);
        LegL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        LegL4 = new Modchu_ModelRotationRenderer(this, 5, 53, LeftLeg);
        LegL4.addBox(0.0F, 2.7F, -5F, 1, 1, 2, var1);
        LegL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        LegL5 = new Modchu_ModelRotationRenderer(this, 0, 53, LeftLeg);
        LegL5.addBox(0.0F, 2.7F, -3.5F, 1, 2, 1, var1);
        LegL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        bootL1 = new Modchu_ModelRotationRenderer(this, 0, 57, LeftLeg);
        bootL1.addBox(-0.5F, 10F, -3F, 2, 1, 1, var1);
        bootL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        bootL2 = new Modchu_ModelRotationRenderer(this, 0, 53, LeftLeg);
        bootL2.addBox(0.0F, 8F, -6F, 1, 2, 1, var1);
        bootL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        bootL2.setRotateAngleX(0.2792527F);
        Breast = new Modchu_ModelRotationRenderer(this, 53, 0, Body);
        Breast.addBoxLM(0.0F, -2.5F, 0.0F, 3, 5, 2, var1);
        Breast.setRotationPointLM(0.0F, 0.0F, -2.0F);
        Breast.setRotateAngleZ(((float)Math.PI / 2F));
        Breast.setRotateAngleY(((float)Math.PI * 2F / 9F));
        eyeR = new Modchu_ModelRotationRenderer(this, 32, 0, Head);
        eyeR.addPlate(-4F, -4F, -4.001F, 4, 4, 0, var1);
        eyeR.setRotationPointLM(0.0F, 0.0F, 0.0F);
        eyeL = new Modchu_ModelRotationRenderer(this, 47, 0, Head);
        eyeL.addPlate(0.0F, -4F, -4.001F, 4, 4, 0, var1);
        eyeL.setRotationPointLM(0.0F, 0.0F, 0.0F);
/*
        Head.addChild(Headwear);
        Head.addChild(eyeR);
        Head.addChild(eyeL);
        Head.addChild(HornR1);
        Head.addChild(HornR2);
        Head.addChild(HornR3);
        Head.addChild(HornR4);
        Head.addChild(HeadwearR);
        Head.addChild(HornL1);
        Head.addChild(HornL2);
        Head.addChild(HornL3);
        Head.addChild(HornL4);
        Head.addChild(HornL4);
        Head.addChild(HeadwearL);
        Body.addChild(Breast);
        RightArm.addChild(ArmR1);
        RightArm.addChild(HandR1);
        RightArm.addChild(HandR2);
        LeftArm.addChild(ArmL1);
        LeftArm.addChild(HandL1);
        LeftArm.addChild(HandL2);
        RightLeg.addChild(LegR1);
        RightLeg.addChild(LegR2);
        RightLeg.addChild(LegR3);
        RightLeg.addChild(LegR4);
        RightLeg.addChild(LegR5);
        RightLeg.addChild(bootR1);
        RightLeg.addChild(bootR2);
        LeftLeg.addChild(LegL1);
        LeftLeg.addChild(LegL2);
        LeftLeg.addChild(LegL3);
        LeftLeg.addChild(LegL4);
        LeftLeg.addChild(LegL5);
        LeftLeg.addChild(bootL1);
        LeftLeg.addChild(bootL2);
        bipedHeadwear.setVisible(false);
        Skirt.setVisible(false);
        Tail.setVisible(false);
        SideTailR.setVisible(false);
        SideTailL.setVisible(false);
        ChignonR.setVisible(false);
        ChignonL.setVisible(false);
        ChignonB.setVisible(false);
*/
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
        Headwear.render(f5);
        HornR1.render(f5);
        HornR2.render(f5);
        HornR3.render(f5);
        HornR4.render(f5);
        HeadwearR.render(f5);
        HornL1.render(f5);
        HornL2.render(f5);
        HornL3.render(f5);
        HornL4.render(f5);
        HeadwearL.render(f5);
        ArmR1.render(f5);
        ArmL1.render(f5);
        HandR1.render(f5);
        HandR2.render(f5);
        HandL1.render(f5);
        HandL2.render(f5);
        LegR1.render(f5);
        LegR2.render(f5);
        LegR3.render(f5);
        LegR4.render(f5);
        LegR5.render(f5);
        LegL1.render(f5);
        LegL2.render(f5);
        LegL3.render(f5);
        LegL4.render(f5);
        LegL5.render(f5);
        bootR1.render(f5);
        bootR2.render(f5);
        bootL1.render(f5);
        bootL2.render(f5);
        eyeR.render(f5);
        eyeL.render(f5);
        Breast.render(f5);
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

    public void setLivingAnimationsLM(EntityLiving entityliving, float f, float f1, float f2)
    {
        super.setLivingAnimationsLM(entityliving, f, f1, f2);
        if ((entityliving instanceof EntityPlayer)
        		&& !aimedBow)
        {
        	EntityPlayer entityplayer = (EntityPlayer) entityliving;
            float f3 = (float)entityplayer.ticksExisted + f2 + ((float)entityplayer.entityId * 70);

            if (mh_sin(f3 * 0.05F) + mh_sin(f3 * 0.13F) + mh_sin(f3 * 0.7F) + 2.55F < 0.0F)
            {
                eyeR.showModel = eyeL.showModel = true;
            }
            else
            {
                eyeR.showModel = eyeL.showModel = false;
            }
        }
    }

    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);

		if (!firstPerson) {
			if (aimedBow) {
				eyeL.showModel = true;
				eyeR.showModel = false;
			}
			Head.rotationPointY -= 3.0F;
			Body.rotationPointY -= 3.0F;
			RightLeg.rotationPointY += 2.0F;
			LeftLeg.rotationPointY += 2.0F;
			if (isClimb || isCrawlClimb || isCrawlClimb || isFlying || isSwim || isDive || isCeilingClimb || isFalling)
			{
				Head.rotationPointY = 0.0F;
			}
			if (isHeadJump || isAngleJumping)
			{
				RightLeg.rotationPointX = -2.5F;
				LeftLeg.rotationPointX = -RightLeg.rotationPointX;
			}
		}
		if (isInventory) {
			RightArm.setRotationPoint(-2.0F, 6.0F, 0.0F);
			LeftArm.setRotationPoint(2.0F, 6.0F, 0.0F);
			RightLeg.setRotationPoint(-1.0F, 14.0F, 0.0F);
			LeftLeg.setRotationPoint(1.0F, 14.0F, 0.0F);
		}
		bipedOuter.rotateAngleY = 0.0F;
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
        bipedNeck.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightShoulder.setRotationPoint(-3.0F, 1.0F, 0.0F);
        bipedLeftShoulder.setRotationPoint(3.0F, 1.0F, 0.0F);
        bipedPelvic.setRotationPoint(0.0F, 12.0F, 0.0F);
        Skirt.setRotationPoint(0.0F, 6.0F, 0.1F);
        RightLeg.setRotationPoint(-1.0F, 0.0F, 0.0F);
        LeftLeg.setRotationPoint(1.0F, 0.0F, 0.0F);
    }

    public void equippedItemPosition3D()
    {
    	if (isWait && !aimedBow)
    	{
    		GL11.glRotatef(-60F, 0.0F, 0.0F, 1.0F);
    		GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
    		GL11.glRotatef(150F, 1.0F, 0.0F, 0.0F);
    	}
    	else
    	{
    		GL11.glTranslatef(0.02F, 0.13F, 0.0F);
    	}
    }

    public void equippedItemBow()
    {
    	equippedItemPosition3D();
    	GL11.glTranslatef(-0.09F, -0.125F, 0.3F);
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
