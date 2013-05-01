package net.minecraft.src;

import net.minecraft.move.render.ModelRotationRenderer;

import org.lwjgl.opengl.GL11;

public class MultiModelSmart_Kagami extends MultiModelSmart
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

	public Modchu_ModelRotationRenderer eyeR;
    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer tailR;
    public Modchu_ModelRotationRenderer tailRFA;
    //public Modchu_ModelRotationRenderer tailRFB;
    public Modchu_ModelRotationRenderer tailRBA;
    public Modchu_ModelRotationRenderer tailRBB;
    public Modchu_ModelRotationRenderer kamidomeR;
    public Modchu_ModelRotationRenderer kamidomeRF;
    public Modchu_ModelRotationRenderer kamidomeRB;
    public Modchu_ModelRotationRenderer tailL;
    public Modchu_ModelRotationRenderer kamidomeL;
    public Modchu_ModelRotationRenderer kamidomeLF;
    public Modchu_ModelRotationRenderer kamidomeLB;
    public Modchu_ModelRotationRenderer tailLFA;
    //public Modchu_ModelRotationRenderer tailLFB;
    public Modchu_ModelRotationRenderer tailLBA;
    public Modchu_ModelRotationRenderer tailLBB;

    public MultiModelSmart_Kagami(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_Kagami(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        scaleArmType = var2;
        scaleLegType = var3;

        ((Modchu_ModelRotationRenderer) HeadMount).base = Head;
    }

	@Override
	public void initModel(float f, float f1) {
		textureWidth = 64;
		textureHeight = 64;
		super.initModel(f, f1);

        bipedOuter = new Modchu_ModelRotationRenderer(this, -1, -1, (Modchu_ModelRotationRenderer)null);
        bipedOuter.setRotationPoint(0.0F, 4.0F, 0.0F);
        bipedOuter.fadeEnabled = true;
        Body = new Modchu_ModelRotationRenderer(this, 32, 8, bipedOuter);
        Body.addBox(-3.0F, 0.0F, -2.0F, 6, 7, 4, f);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedBreast = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedBreast.setRotationPoint(0.0F, 4.0F, 0.0F);
        bipedNeck = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedNeck.setRotationPoint(0.0F, 4.0F, 0.0F);

        Head = new Modchu_ModelRotationRenderer(this, 0, 0, bipedNeck);
        Head.setTextureSize(64, 64);
        Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, f);
        Head.setRotationPoint(0.0F, 0.0F, 0.0F);

        Headwear = new Modchu_ModelRotationRenderer(this, 24, 0, Head);
        Headwear.addBox(-4.0F, 0.0F, 1.0F, 8, 4, 3, f);
        Headwear.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedRightShoulder = new Modchu_ModelRotationRenderer(this, 40, 16, bipedBreast);
        bipedRightShoulder.addBox(-3.0F, -2.0F, -2.0F, 8, 8, 8, f);
        bipedRightShoulder.setRotationPoint(-1.5F, 9.5F, 0.0F);

        RightArm = new Modchu_ModelRotationRenderer(this, 48, 0, bipedRightShoulder);
        RightArm.addBox(-2.0F, -1.0F, -1.0F, 2, 8, 2, f);
        RightArm.setRotationPoint(-3.0F, 1.5F, 0.0F);

        bipedLeftShoulder = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedLeftShoulder.mirror = true;
        bipedLeftShoulder.setRotationPoint(1.5F, 9.5F, 0.0F);

        LeftArm = new Modchu_ModelRotationRenderer(this, 56, 0, bipedLeftShoulder);
        LeftArm.addBox(0.0F, -1.0F, -1.0F, 2, 8, 2, f);
        LeftArm.setRotationPoint(3.0F, 1.5F, 0.0F);

        bipedPelvic = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedPelvic.setRotationPoint(0.0F, 10.0F, 0.0F);

        RightLeg = new Modchu_ModelRotationRenderer(this, 32, 19, bipedPelvic);
        RightLeg.addBox(-2.0F, 0.0F, -2.0F, 3, 9, 4, f);
        RightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);

        LeftLeg = new Modchu_ModelRotationRenderer(this, 32, 19, bipedPelvic);
        LeftLeg.mirror = true;
        LeftLeg.addBox(-1.0F, 0.0F, -2.0F, 3, 9, 4, f);
        LeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);

        Skirt = new Modchu_ModelRotationRenderer(this, 0, 16, Body);
        Skirt.addBox(-4.0F, -2.0F, -4.0F, 8, 8, 8, f);
        Skirt.setRotationPoint(0.0F, 7.0F, 0.0F);

        ChignonR = new Modchu_ModelRotationRenderer(this, 24, 18, Head);
        ChignonR.addBox(-5.0F, -7.0F, 0.2F, 1, 3, 3, f);
        ChignonR.setRotationPoint(0.0F, 0.0F, 0.0F);

        ChignonL = new Modchu_ModelRotationRenderer(this, 24, 18, Head);
        ChignonL.addBox(4.0F, -7.0F, 0.2F, 1, 3, 3, f);
        ChignonL.setRotationPoint(0.0F, 0.0F, 0.0F);

        ChignonB = new Modchu_ModelRotationRenderer(this, 52, 10, Head);
        ChignonB.addBox(-2.0F, -7.2F, 4.0F, 4, 4, 2, f);
        ChignonB.setRotationPoint(0.0F, 0.0F, 0.0F);

        Tail = new Modchu_ModelRotationRenderer(this, 46, 20, Head);
        Tail.addBox(-1.5F, -6.8F, 4F, 3, 9, 3, f);
        Tail.setRotationPoint(0.0F, 0.0F, 0.0F);

        SideTailR = new Modchu_ModelRotationRenderer(this, 58, 21, Head);
        SideTailR.addBox(-5.5F, -6.8F, 0.9F, 1, 8, 2, f);
        SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);

        SideTailL = new Modchu_ModelRotationRenderer(this, 58, 21, Head);
        SideTailL.mirror = true;
        SideTailL.addBox(4.5F, -6.8F, 0.9F, 1, 8, 2, f);
        SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);

        eyeR = new Modchu_ModelRotationRenderer(this, 32, 19, Head);
        eyeR.addPlate(-4F, -4.9F, -4.001F, 4, 4, 0, f);
        eyeR.setRotationPointLM(0.0F, 0.0F, 0.0F);
        eyeL = new Modchu_ModelRotationRenderer(this, 42, 19, Head);
        eyeL.addPlate(0.0F, -4.9F, -4.001F, 4, 4, 0, f);
        eyeL.setRotationPointLM(0.0F, 0.0F, 0.0F);
        tailR = new Modchu_ModelRotationRenderer(this, 8, 40, Head);
        tailR.addBox(3.4F, -6.5F, -0.5F, 1, 2, 2);
        tailR.setRotationPointLM(0F, 0F, 0F);
        //tailR.setTextureSize(64, 64);
        //tailR.mirror = true;
        //setRotation(tailR, 0F, 0F, 0F);
        //tailRFA.mirror = true;
        tailRFA = new Modchu_ModelRotationRenderer(this, 0, 40, Head);
        tailRFA.addBox(5F, -4F, -1.2F, 1, 7, 1);
        tailRFA.setRotationPointLM(0F, 0F, 0F);
        //tailRFA.setTextureSize(64, 64);
        //tailRFA.mirror = true;
        //setRotation(tailRFA, -0.296706F, 0F, -0.1745329F);
        //tailRFA.mirror = false;
       /* tailRFB = new Modchu_ModelRotationRenderer(this, 0, 48);
        tailRFB.addBox(5.35F, 1.4F, -2.02F, 1, 3, 1);
        tailRFB.setRotationPointLM(0F, 0F, 0F);
        tailRFB.parentModel = Head;
        //tailRFB.setTextureSize(64, 64);*/
        //tailRFB.mirror = true;
        //setRotation(tailRFB, 0F, 0F, 0F);
        tailRBA = new Modchu_ModelRotationRenderer(this, 14, 40, Head);
        tailRBA.addBox(4.8F, -4.2F, -2.266667F, 1, 8, 2);
        tailRBA.setRotationPointLM(0F, 0F, 0F);
        //tailRBA.setTextureSize(64, 64);
        //tailRBA.mirror = true;
        //setRotation(tailRBA, 0.1570796F, -0.6108652F, -0.2268928F);
        tailRBB = new Modchu_ModelRotationRenderer(this, 14, 50, Head);
        tailRBB.addBox(5.2F, 2.2F, -1.2F, 1, 4, 1);
        tailRBB.setRotationPointLM(0F, 0F, 0F);
        //tailRBB.setTextureSize(64, 64);
        //tailRBB.mirror = true;
        //setRotation(tailRBB, 0F, -0.6108652F, 0F);
        kamidomeR = new Modchu_ModelRotationRenderer(this, 8, 34, Head);
        kamidomeR.addBox(4.4F, -6F, 0F, 1, 1, 1);
        kamidomeR.setRotationPointLM(0F, 0F, 0F);
        //kamidomeR.setTextureSize(64, 64);
        //kamidomeR.mirror = true;
        //setRotation(kamidomeR, 0F, 0F, 0F);
        kamidomeRF = new Modchu_ModelRotationRenderer(this, 0, 34, Head);
        kamidomeRF.addBox(5F, -3.1F, -4.7F, 1, 2, 1);
        kamidomeRF.setRotationPointLM(0F, 0F, 0F);
        //kamidomeRF.setTextureSize(64, 64);
        //kamidomeRF.mirror = true;
        //setRotation(kamidomeRF, -0.7330383F, -0.1745329F, -0.122173F);
        kamidomeRB = new Modchu_ModelRotationRenderer(this, 0, 37, Head);
        kamidomeRB.addBox(5F, -2.5F, 4.5F, 1, 2, 1);
        kamidomeRB.setRotationPointLM(0F, 0F, 0F);
        //kamidomeRB.setTextureSize(64, 64);
        //kamidomeRB.mirror = true;
        //setRotation(kamidomeRB, 0.7330383F, 0.1745329F, -0.122173F);
        tailL = new Modchu_ModelRotationRenderer(this, 8, 44, Head);
        tailL.addBox(-4.4F, -6.5F, -0.5F, 1, 2, 2);
        tailL.setRotationPointLM(0F, 0F, 0F);
        //tailL.setTextureSize(64, 64);
        //tailL.mirror = true;
        //setRotation(tailL, 0F, 0F, 0F);
        kamidomeL = new Modchu_ModelRotationRenderer(this, 8, 36, Head);
        kamidomeL.addBox(-5.4F, -6F, 0F, 1, 1, 1);
        kamidomeL.setRotationPointLM(0F, 0F, 0F);
        //kamidomeL.setTextureSize(64, 64);
        //kamidomeL.mirror = true;
        //setRotation(kamidomeL, 0F, 0F, 0F);
        kamidomeLF = new Modchu_ModelRotationRenderer(this, 4, 34, Head);
        kamidomeLF.addBox(-6.1F, -3.1F, -4.7F, 1, 2, 1);
        kamidomeLF.setRotationPointLM(0F, 0F, 0F);
        //kamidomeLF.setTextureSize(64, 64);
        //kamidomeLF.mirror = true;
        //setRotation(kamidomeLF, -0.7330383F, 0.1745329F, 0.122173F);
        kamidomeLB = new Modchu_ModelRotationRenderer(this, 4, 37, Head);
        kamidomeLB.addBox(-6F, -2.533333F, 4.5F, 1, 2, 1);
        kamidomeLB.setRotationPointLM(0F, 0F, 0F);
        //kamidomeLB.setTextureSize(64, 64);
        //kamidomeLB.mirror = true;
        //setRotation(kamidomeLB, 0.7330383F, -0.1745329F, 0.122173F);
        tailLFA = new Modchu_ModelRotationRenderer(this, 4, 40, Head);
        tailLFA.addBox(-6F, -4F, -1.25F, 1, 7, 1);
        tailLFA.setRotationPointLM(0F, 0F, 0F);
        //tailLFA.setTextureSize(64, 64);
        //tailLFA.mirror = true;
        //setRotation(tailLFA, -0.296706F, 0F, 0.1745329F);
        /*tailLFB = new Modchu_ModelRotationRenderer(this, 4, 48);
        tailLFB.addBox(-6.35F, 1.4F, -2.02F, 1, 3, 1);
        tailLFB.setRotationPointLM(0F, 0F, 0F);
        tailLFB.parentModel = Head;*/
        //tailLFB.setTextureSize(64, 64);
        //tailLFB.mirror = true;
        //setRotation(tailLFB, 0F, 0F, 0F);
        tailLBA = new Modchu_ModelRotationRenderer(this, 20, 40, Head);
        tailLBA.addBox(-5.9F, -4.2F, -2.3F, 1, 8, 2);
        tailLBA.setRotationPointLM(0F, 0F, 0F);
        //tailLBA.setTextureSize(64, 64);
        //tailLBA.mirror = true;
        //setRotation(tailLBA, 0.1570796F, 0.6108652F, 0.2268928F);
        tailLBB = new Modchu_ModelRotationRenderer(this, 20, 50, Head);
        tailLBB.addBox(-6.35F, 2.2F, -1.2F, 1, 4, 1);
        tailLBB.setRotationPointLM(0F, 0F, 0F);
        //tailLBB.setTextureSize(64, 64);
        //tailLBB.mirror = true;
        //setRotation(tailLBB, 0F, 0.6108652F, 0F);

        tailRFA.rotateAngleX = tailLFA.rotateAngleX = -0.296706F;
        tailRFA.rotateAngleZ = kamidomeRF.rotateAngleY = kamidomeLB.rotateAngleY = -0.1745329F;
        tailRBA.rotateAngleX = tailLBA.rotateAngleX = 0.1570796F;
        tailRBA.rotateAngleY = tailRBB.rotateAngleY = -0.6108652F;
        tailRBA.rotateAngleZ = -0.2268928F;
        kamidomeRF.rotateAngleX = kamidomeLF.rotateAngleX = -0.7330383F;
        kamidomeRF.rotateAngleZ = kamidomeRB.rotateAngleZ = -0.122173F;
        kamidomeRB.rotateAngleX = kamidomeLB.rotateAngleX = 0.7330383F;
        kamidomeRB.rotateAngleY = kamidomeLF.rotateAngleY = tailLFA.rotateAngleZ = 0.1745329F;
        kamidomeLF.rotateAngleZ = kamidomeLB.rotateAngleZ = 0.122173F;
        tailLBA.rotateAngleY = tailLBB.rotateAngleY = 0.6108652F;
        tailLBA.rotateAngleZ = 0.2268928F;

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
			eyeR.preRotateRender(f5);
			eyeL.preRotateRender(f5);
	        tailR.preRotateRender(f5);
	        tailRFA.preRotateRender(f5);
	        //tailRFB.preRotateRender(f5);
	        tailRBA.preRotateRender(f5);
	        tailRBB.preRotateRender(f5);
	        kamidomeR.preRotateRender(f5);
	        kamidomeRF.preRotateRender(f5);
	        kamidomeRB.preRotateRender(f5);
	        tailL.preRotateRender(f5);
	        kamidomeL.preRotateRender(f5);
	        kamidomeLF.preRotateRender(f5);
	        kamidomeLB.preRotateRender(f5);
	        tailLFA.preRotateRender(f5);
	        //tailLFB.preRotateRender(f5);
	        tailLBA.preRotateRender(f5);
	        tailLBB.preRotateRender(f5);
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

    public void setLivingAnimationsLM(EntityLiving entityliving, float f, float f1, float f2)
    {
        super.setLivingAnimationsLM(entityliving, f, f1, f2);

        if ((entityliving instanceof EntityPlayer)
        		&& !aimedBow)
        {
        	EntityPlayer entityplayer = (EntityPlayer) entityliving;
            float f3 = (float)entityplayer.ticksExisted + f2 + ((float)entityplayer.entityId * 70);

            if (0.0F > mh_sin(f3 * 0.05F) + mh_sin(f3 * 0.13F) + mh_sin(f3 * 0.7F) + 2.55F)
            {
                eyeR.showModel = eyeL.showModel = true;
            }
            else
            {
                eyeR.showModel = eyeL.showModel = false;
            }
        }
    }

    public void setRotationAnglesLM(float var1, float var2, float var3, float var4, float var5, float var6)
    {
    	super.setRotationAnglesLM(var1, var2, var3, var4, var5, var6);
    	if (!firstPerson && !isInventory)
    	{
    		if (isSneak && !isAngleJumping) {
    			Skirt.rotationPointY = 6.5F;
    		} else {
    			Skirt.rotationPointY = 7.0F;
    		}
    	} else {
    		bipedRightLeg.setRotationPoint(-1.0F, 15.0F, 0.0F);
    		bipedLeftLeg.setRotationPoint(1.0F, 15.0F, 0.0F);
    	}
		if (aimedBow) {
			eyeL.showModel = true;
			eyeR.showModel = false;
		}
    }

    public void reset()
    {
    	super.reset();
        bipedPelvic.setRotationPoint(0.0F, 12.0F, 0.0F);
        RightLeg.setRotationPoint(-1.0F, -6.0F, 0.0F);
        LeftLeg.setRotationPoint(1.0F, -6.0F, 0.0F);
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
