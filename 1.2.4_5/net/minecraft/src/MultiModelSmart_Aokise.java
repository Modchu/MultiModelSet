package net.minecraft.src;

import net.minecraft.move.render.ModelRotationRenderer;

import org.lwjgl.opengl.GL11;

public class MultiModelSmart_Aokise extends MultiModelSmart
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
    public Modchu_ModelRotationRenderer sideR;
    public Modchu_ModelRotationRenderer sideL;
    public Modchu_ModelRotationRenderer mune;
    public Modchu_ModelRotationRenderer long1;
    public Modchu_ModelRotationRenderer long2;
    public Modchu_ModelRotationRenderer longSL1;
    public Modchu_ModelRotationRenderer longSL2;
    public Modchu_ModelRotationRenderer longSL3;
    public Modchu_ModelRotationRenderer longSR1;
    public Modchu_ModelRotationRenderer longSR2;
    public Modchu_ModelRotationRenderer longSR3;
    public Modchu_ModelRotationRenderer kamidome1;
    public Modchu_ModelRotationRenderer ribon1;
    public Modchu_ModelRotationRenderer ribon2;
    public Modchu_ModelRotationRenderer ribon3;
    public Modchu_ModelRotationRenderer ribon4;
    //public Modchu_ModelRotationRenderer akuse1;
    //public Modchu_ModelRotationRenderer akuse2;
    public Modchu_ModelRotationRenderer kataR;
    public Modchu_ModelRotationRenderer kataL;

    public MultiModelSmart_Aokise(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_Aokise(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        textureWidth = 64;
        textureHeight = 64;

        bipedOuter = new Modchu_ModelRotationRenderer(this, -1, -1, (Modchu_ModelRotationRenderer)null);
        bipedOuter.setRotationPoint(0.0F, 4.0F, 0.0F);
        bipedOuter.fadeEnabled = true;

        Body = new Modchu_ModelRotationRenderer(this, 32, 8, bipedOuter);
        Body.addBox(-3F, 0F, -2F, 6, 7, 4, var1);
        Body.setRotationPoint(0F, 0F, 0F);

        bipedBreast = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedBreast.setRotationPoint(0.0F, 4.0F, 0.0F);
        bipedNeck = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedNeck.setRotationPoint(0.0F, 4.0F, 0.0F);

        Head = new Modchu_ModelRotationRenderer(this, 0, 0, bipedNeck);
        Head.setTextureSize(64, 64);
        Head.addBox(-4F, -8F, -4F, 8, 8, 8, var1);
        Head.setRotationPoint(0F, 0F, 0F);

        Headwear = new Modchu_ModelRotationRenderer(this, 24, 0, Head);
        Headwear.addBox(-4F, 0F, 1F, 8, 4, 3, var1);
        Headwear.setRotationPoint(0F, 0F, 0F);

        bipedRightShoulder = new Modchu_ModelRotationRenderer(this, 40, 16, bipedBreast);
        bipedRightShoulder.addBox(-3.0F, -2.0F, -2.0F, 8, 8, 8, var1);
        bipedRightShoulder.setRotationPoint(-1.5F, 9.5F, 0.0F);

        RightArm = new Modchu_ModelRotationRenderer(this, 48, 0, bipedRightShoulder);
        RightArm.addBox(-2.0F, -1F, -1F, 2, 8, 2, var1);
        RightArm.setRotationPoint(-3.0F, 1.5F, 0F);

        bipedLeftShoulder = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedLeftShoulder.mirror = true;
        bipedLeftShoulder.setRotationPoint(1.5F, 9.5F, 0.0F);

        LeftArm = new Modchu_ModelRotationRenderer(this, 56, 0, bipedLeftShoulder);
        LeftArm.addBox(0.0F, -1F, -1F, 2, 8, 2, var1);
        LeftArm.setRotationPoint(3.0F, 1.5F, 0F);

        bipedPelvic = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedPelvic.setRotationPoint(0.0F, 10.0F, 0.0F);

        RightLeg = new Modchu_ModelRotationRenderer(this, 32, 19, bipedPelvic);
        RightLeg.addBox(-2F, 0F, -2F, 3, 9, 4, var1);
        RightLeg.setRotationPoint(-1F, 7F, 0F);

        LeftLeg = new Modchu_ModelRotationRenderer(this, 32, 19, bipedPelvic);
        LeftLeg.mirror = true;
        LeftLeg.addBox(-1F, 0F, -2F, 3, 9, 4, var1);
        LeftLeg.setRotationPoint(1F, 7F, 0F);

        scaleArmType = var2;
        scaleLegType = var3;

        Skirt = new Modchu_ModelRotationRenderer(this, 0, 16, Body);
        Skirt.addBox(-4F, -2F, -4F, 8, 8, 8, var1);
        Skirt.setRotationPoint(0F, 7F, 0F);

        ChignonR = new Modchu_ModelRotationRenderer(this, 24, 18, Head);
        ChignonR.addBox(-5F, -7F, 0.2F, 1, 3, 3, var1);
        ChignonR.setRotationPoint(0F, 0F, 0F);

        ChignonL = new Modchu_ModelRotationRenderer(this, 24, 18, Head);
        ChignonL.addBox(4F, -7F, 0.2F, 1, 3, 3, var1);
        ChignonL.setRotationPoint(0F, 0F, 0F);

        ChignonB = new Modchu_ModelRotationRenderer(this, 52, 10, Head);
        ChignonB.addBox(-2F, -7.2F, 4F, 4, 4, 2, var1);
        ChignonB.setRotationPoint(0F, 0F, 0F);

        Tail = new Modchu_ModelRotationRenderer(this, 46, 20, Head);
        Tail.addBox(-1.5F, -6.8F, 4F, 3, 9, 3, var1);
        Tail.setRotationPoint(0F, 0F, 0F);

        SideTailR = new Modchu_ModelRotationRenderer(this, 58, 21, Head);
        SideTailR.addBox(-5.5F, -6.8F, 0.9F, 1, 8, 2, var1);
        SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);

        SideTailL = new Modchu_ModelRotationRenderer(this, 58, 21, Head);
        SideTailL.mirror = true;
        SideTailL.addBox(4.5F, -6.8F, 0.9F, 1, 8, 2, var1);
        SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);

        sideR = new Modchu_ModelRotationRenderer(this, 0, 35, Body);
        sideR.addBox(-3.2F, -0.8F, -1.5F, 1, 6, 3, var1);
        sideR.setRotationPointLM(0F, 7F, 0F);

        sideL = new Modchu_ModelRotationRenderer(this, 0, 35, Body);
        sideL.mirror = true;
        sideL.addBox(2.2F, -0.8F, -1.5F, 1, 6, 3, var1);
        sideL.setRotationPointLM(0F, 7F, 0F);

        mune = new Modchu_ModelRotationRenderer(this, 0, 33, Body);
        mune.addBox(-2F, -0.4F, -2.8F, 4, 1, 1);
        mune.setRotationPointLM(0F, 0F, 0F);

        long1 = new Modchu_ModelRotationRenderer(this, 0, 44, Head);
        long1.addBox(-3F, -6F, 4.2F, 6, 11, 1);
        long1.setRotationPointLM(0F, 0F, 0F);

        long2 = new Modchu_ModelRotationRenderer(this, 0, 56, Head);
        long2.addBox(-3F, 4F, 5F, 6, 7, 1);
        long2.setRotationPointLM(0F, 0F, 0F);

        longSL1 = new Modchu_ModelRotationRenderer(this, 14, 35, Head);
        longSL1.addBox(-2F, -5F, 4.5F, 2, 11, 1);
        longSL1.setRotationPointLM(0F, 0F, 0F);

        longSL2 = new Modchu_ModelRotationRenderer(this, 8, 37, Head);
        longSL2.addBox(-2.9F, 3.5F, 5.5F, 2, 6, 1);
        longSL2.setRotationPointLM(0F, 0F, 0F);

        longSL3 = new Modchu_ModelRotationRenderer(this, 14, 45, Head);
        longSL3.addBox(3.5F, 0F, 1.6F, 1, 10, 2);
        longSL3.setRotationPointLM(0F, 0F, 0F);

        longSR1 = new Modchu_ModelRotationRenderer(this, 14, 35, Head);
        longSR1.mirror = true;
        longSR1.addBox(0F, -5F, 4.5F, 2, 11, 1);
        longSR1.setRotationPointLM(0F, 0F, 0F);

        longSR2 = new Modchu_ModelRotationRenderer(this, 8, 37, Head);
        longSR2.mirror = true;
        longSR2.addBox(1F, 3.5F, 5.5F, 2, 6, 1);
        longSR2.setRotationPointLM(0F, 0F, 0F);

        longSR3 = new Modchu_ModelRotationRenderer(this, 14, 45, Head);
        longSR3.mirror = true;
        longSR3.addBox(-4.5F, 0F, 1.6F, 1, 10, 2);
        longSR3.setRotationPointLM(0F, 0F, 0F);

        kamidome1 = new Modchu_ModelRotationRenderer(this, 8, 35, Head);
        kamidome1.addBox(-0.5F, -5F, 5F, 1, 1, 1);
        kamidome1.setRotationPointLM(0F, 0F, 0F);

        ribon1 = new Modchu_ModelRotationRenderer(this, 10, 33, Head);
        ribon1.addBox(-2.5F, -4.7F, 4.8F, 2, 1, 1);
        ribon1.setRotationPointLM(0F, 0F, 0F);

        ribon2 = new Modchu_ModelRotationRenderer(this, 10, 33, Head);
        ribon2.addBox(0.5F, -4.7F, 4.8F, 2, 1, 1);
        ribon2.setRotationPointLM(0F, 0F, 0F);

        ribon3 = new Modchu_ModelRotationRenderer(this, 0, 16, Head);
        ribon3.addBox(2F, -3.5F, 4.8F, 2, 7, 1);
        ribon3.setRotationPointLM(0F, 0F, 0F);

        ribon4 = new Modchu_ModelRotationRenderer(this, 0, 16, Head);
        ribon4.mirror = true;
        ribon4.addBox(-4F, -3.5F, 4.8F, 2, 7, 1);
        ribon4.setRotationPointLM(0F, 0F, 0F);

        /*
        akuse1 = new Modchu_ModelRotationRenderer(this, 0, 0, bipedHead);
        akuse1.addBox(-1.5F, 0F, -3F, 3, 1, 1);
        akuse1.setRotationPoint(0F, 0F, 0F);

        akuse2 = new Modchu_ModelRotationRenderer(this, 0, 2, bipedHead);
        akuse2.addBox(0F, 0F, 0F, 2, 1, 1);
        akuse2.setRotationPoint(-1F, 1F, -3F);
		*/
		eyeR = new Modchu_ModelRotationRenderer(this, 32, 19, Head);
		eyeR.addPlate(-4.0F, -5.0F, -4.001F, 4, 4, 0);
		eyeR.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyeL = new Modchu_ModelRotationRenderer(this, 42, 19, Head);
		eyeL.addPlate(0.0F, -5.0F, -4.001F, 4, 4, 0);
		eyeL.setRotationPoint(0.0F, 0.0F, 0.0F);

        sideR.rotateAngleZ = 0.2094395F;
        sideL.rotateAngleZ = longSL3.rotateAngleY = -0.1745329F;
        long1.rotateAngleX =ribon1.rotateAngleX=ribon2.rotateAngleX=ribon3.rotateAngleX=ribon4.rotateAngleX=kamidome1.rotateAngleX= 0.2443461F;
        long2.rotateAngleX = 0.0872665F;
        longSL1.rotateAngleX = longSL1.rotateAngleZ = longSL3.rotateAngleX = longSR1.rotateAngleX = longSR3.rotateAngleX = longSR3.rotateAngleY = 0.1745329F;
        longSL1.rotateAngleY = longSL2.rotateAngleY = ((float)Math.PI / 4F);
        longSL3.rotateAngleZ = -0.1570796F;
        longSR1.rotateAngleY = longSR2.rotateAngleY = -((float)Math.PI / 4F);
        longSR1.rotateAngleZ = -0.185895F;
        longSR3.rotateAngleZ = 0.1570796F;
        mune.rotateAngleX=ribon1.rotateAngleZ=0.5235988F;
        ribon2.rotateAngleZ=-0.5235988F;
        ribon3.rotateAngleZ=-0.4363323F;
        ribon4.rotateAngleZ=0.4363323F;

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
            eyeL.preRotateRender(f5);
            eyeR.preRotateRender(f5);
            long1.preRotateRender(f5);
            long2.preRotateRender(f5);
            longSL1.preRotateRender(f5);
            longSL2.preRotateRender(f5);
            longSL3.preRotateRender(f5);
            longSR1.preRotateRender(f5);
            longSR2.preRotateRender(f5);
            longSR3.preRotateRender(f5);
            kamidome1.preRotateRender(f5);
            ribon1.preRotateRender(f5);
            ribon2.preRotateRender(f5);
            ribon3.preRotateRender(f5);
            ribon4.preRotateRender(f5);
		}
		if (Skirt.showModel) {
			Skirt.render(f5);
		}
		if (Body.showModel) {
			mune.preRotateRender(f5);
            sideR.preRotateRender(f5);
            sideL.preRotateRender(f5);
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
    		if (aimedBow) {
    			eyeL.showModel = true;
    			eyeR.showModel = false;
    		}
        } else {
        	bipedRightLeg.setRotationPoint(-1.0F, 15.0F, 0.0F);
        	bipedLeftLeg.setRotationPoint(1.0F, 15.0F, 0.0F);
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
