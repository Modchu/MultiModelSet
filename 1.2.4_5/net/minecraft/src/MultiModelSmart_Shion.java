package net.minecraft.src;



public class MultiModelSmart_Shion extends MultiModelSmart
{

    public Modchu_ModelRotationRenderer longtail;
    public Modchu_ModelRotationRenderer Headwear;
    public Modchu_ModelRotationRenderer HeadwearR;
    public Modchu_ModelRotationRenderer HeadwearL;
    public Modchu_ModelRotationRenderer SkirtR;
    public Modchu_ModelRotationRenderer SkirtL;
    public Modchu_ModelRotationRenderer obi;
    public Modchu_ModelRotationRenderer sodeR;
    public Modchu_ModelRotationRenderer sodeL;
    public Modchu_ModelRotationRenderer WsodeR;
    public Modchu_ModelRotationRenderer WsodeL;
    public Modchu_ModelRotationRenderer kanzasi;
    public Modchu_ModelRotationRenderer osageL1;
    public Modchu_ModelRotationRenderer osageL2;
    public Modchu_ModelRotationRenderer osageL3;
    public Modchu_ModelRotationRenderer osageL4;
    public Modchu_ModelRotationRenderer osageR1;
    public Modchu_ModelRotationRenderer osageR2;
    public Modchu_ModelRotationRenderer osageR3;
    public Modchu_ModelRotationRenderer osageR4;
    public Modchu_ModelRotationRenderer osageLRib;
    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer eyeR;

    public MultiModelSmart_Shion(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_Shion(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        longtail = new Modchu_ModelRotationRenderer(this, 46, 19, bipedHead);
        longtail.addBox(-1F, 0.0F, 2.0F, 2, 12, 1, var1 + 0.2F);
        longtail.setRotationPoint(0.0F, -6.5F, 5F);
        SideTailR = new Modchu_ModelRotationRenderer(this, 24, 0, bipedHead);
        SideTailR.addBox(-4.2F, -5.5F, -4.1F, 1, 6, 2, var1);
        SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);
        SideTailL = new Modchu_ModelRotationRenderer(this, 24, 0, bipedHead);
        SideTailL.mirror = true;
        SideTailL.addBox(3.2F, -5.5F, -4.1F, 1, 6, 2, var1);
        SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);
        Headwear = new Modchu_ModelRotationRenderer(this, 52, 16, bipedHead);
        Headwear.addBox(-1.5F, 0.0F, -3F, 3, 8, 3, var1);
        Headwear.setRotationPoint(0.0F, -1F, 4F);
        HeadwearR = new Modchu_ModelRotationRenderer(this, 52, 16, bipedHead);
        HeadwearR.addBox(-4F, 0.0F, -3F, 3, 6, 3, var1);
        HeadwearR.setRotationPoint(0.0F, -1F, 4F);
        HeadwearL = new Modchu_ModelRotationRenderer(this, 52, 16, bipedHead);
        HeadwearL.addBox(1.0F, 0.0F, -3F, 3, 6, 3, var1);
        HeadwearL.setRotationPoint(0.0F, -1F, 4F);
        SkirtR = new Modchu_ModelRotationRenderer(this, 0, 18, bipedRightLeg);
        SkirtR.addBox(-3F, -1F, -3F, 4, 8, 6, var1 + 0.01F);
        SkirtR.setRotationPoint(1.0F, 0.0F, 0.0F);
        SkirtL = new Modchu_ModelRotationRenderer(this, 12, 18, bipedLeftLeg);
        SkirtL.addBox(-1F, -1F, -3F, 4, 8, 6, var1 + 0.01F);
        SkirtL.setRotationPoint(-1.0F, 0.0F, 0.0F);
        obi = new Modchu_ModelRotationRenderer(this, 52, 27, bipedBody);
        obi.addBox(-2.5F, 2.0F, 1.5F, 5, 4, 1, var1);
        obi.setRotationPoint(0.0F, 0.0F, 0.0F);
        sodeR = new Modchu_ModelRotationRenderer(this, 36, 0, bipedRightArm);
        sodeR.addBox(-2F, -1F, -1F, 4, 6, 2, var1 + 0.1F);
        sodeR.setRotationPoint(0.0F, 0.0F, 0.0F);
        sodeL = new Modchu_ModelRotationRenderer(this, 36, 0, bipedLeftArm);
        sodeL.addBox(-2F, -1F, -1F, 4, 6, 2, var1 + 0.1F);
        sodeL.setRotationPoint(0.0F, 0.0F, 0.0F);
        WsodeR = new Modchu_ModelRotationRenderer(this, 36, 0, bipedRightArm);
        WsodeR.addBox(-2F, -1F, 1.0F, 2, 6, 2, var1);
        WsodeR.setRotationPoint(0.0F, 0.0F, 0.0F);
        WsodeL = new Modchu_ModelRotationRenderer(this, 36, 0, bipedLeftArm);
        WsodeL.addBox(0.0F, -1F, 1.0F, 2, 6, 2, var1);
        WsodeL.setRotationPoint(0.0F, 0.0F, 0.0F);
        kanzasi = new Modchu_ModelRotationRenderer(this, 0, 16, bipedHead);
        kanzasi.addBox(-7F, -8F, 5F, 1, 7, 1, var1);
        kanzasi.setRotationPoint(2.0F, 0.0F, 0.0F);
        eyeR = new Modchu_ModelRotationRenderer(this, 32, 19, bipedHead);
        eyeR.addPlate(-4F, -4.9F, -4.001F, 4, 4, 0);
        eyeR.setRotationPoint(0.0F, 0.0F, 0.0F);
        eyeL = new Modchu_ModelRotationRenderer(this, 42, 19, bipedHead);
        eyeL.addPlate(0.0F, -4.9F, -4.001F, 4, 4, 0);
        eyeL.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHeadwear.setVisible(false);
        Tail.setVisible(false);
        Skirt.setVisible(false);
        ChignonR.setVisible(false);
        ChignonL.setVisible(false);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
    	if (bipedHead.showModel) {
			longtail.preRotateRender(f5);
			Headwear.preRotateRender(f5);
			HeadwearR.preRotateRender(f5);
			HeadwearL.preRotateRender(f5);
			kanzasi.preRotateRender(f5);
			eyeR.preRotateRender(f5);
			eyeL.preRotateRender(f5);
		}
		if (bipedRightLeg.showModel
				&& bipedLeftLeg.showModel) {
			SkirtR.preRotateRender(f5);
			SkirtL.preRotateRender(f5);
		}
		if (bipedRightLeg.showModel) {
			sodeR.preRotateRender(f5);
			WsodeR.preRotateRender(f5);
		}
		if (bipedLeftLeg.showModel) {
			sodeL.preRotateRender(f5);
			WsodeL.preRotateRender(f5);
		}
		if (bipedBody.showModel) {
			obi.preRotateRender(f5);
		}
    }

    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);
        sodeL.showModel = true;
        sodeR.showModel = true;
        WsodeL.showModel = false;
        WsodeR.showModel = false;

        if(getIsRiding())
        {
            bipedRightLeg.rotateAngleY = 0.0F;
            bipedLeftLeg.rotateAngleY = 0.0F;
        }
        if(getIsSneak())
        {
            sodeL.showModel = false;
            sodeR.showModel = false;
            WsodeL.showModel = true;
            WsodeR.showModel = true;
        }

        if(isWait && !aimedBow)
        {
            sodeL.showModel = false;
            sodeR.showModel = false;
            WsodeL.showModel = true;
            WsodeR.showModel = true;
        }
        if(aimedBow)
        {
            eyeL.showModel = true;
			eyeR.showModel = false;
        } else {
    		if (0.0D > (double) (mh_sin(f2 * 0.1F) * 0.3F)
    				+ Math.random() * 0.10000000149011612D
    				+ 0.18000000715255737D) {
    				eyeL.showModel = false;
    				eyeR.showModel = false;
    		} else {
    				eyeL.showModel = true;
    				eyeR.showModel = true;
    		}
        }
        ChignonB.rotateAngleX = 0.0873F;
        Headwear.rotationPointY = -1F;
        Headwear.rotationPointZ = 4F;
        HeadwearR.rotationPointY = HeadwearL.rotationPointY = -2F;
        HeadwearR.rotationPointZ = HeadwearL.rotationPointZ = 4F;
        longtail.rotationPointY = -6F;
        longtail.rotationPointZ = 3.5F;
        Headwear.rotateAngleX = HeadwearR.rotateAngleX = longtail.rotateAngleX = HeadwearL.rotateAngleX = bipedHead.rotateAngleX <= 0.0F ? -bipedHead.rotateAngleX : -bipedHead.rotateAngleX / 2.0F;
        longtail.rotateAngleY = mh_sin(f2 * 0.05F) * 0.06F;
        kanzasi.rotateAngleX = -0.175F;
        kanzasi.rotateAngleY = -0.175F;
        kanzasi.rotateAngleZ = 1.396F;
        obi.rotateAngleX = 0.0873F;
        if (mod_Modchu_ModchuLib.modchuRemodelingModel) {
        	if (isSneak && !isAngleJumping) {
        		bipedRightArm.rotateAngleX = 0.0F;
        		bipedLeftArm.rotateAngleX = 0.0F;
        		bipedPelvic.offsetY = 0.0F;
        		bipedPelvic.offsetZ = 0.0F;
        		bipedBreast.offsetY = 0.0F;
        		bipedBreast.offsetZ = 0.0F;
        		bipedNeck.offsetY = 0.0F;
        		SkirtL.rotationPointY = SkirtR.rotationPointY = -2.0F;
        		bipedLeftLeg.rotateAngleX = bipedLeftLeg.rotateAngleX * 0.5F + 0.5F;
        		bipedRightLeg.rotateAngleX = bipedRightLeg.rotateAngleX * 0.5F + 0.5F;
        		SkirtL.rotateAngleX = -bipedLeftLeg.rotateAngleX;
        		SkirtR.rotateAngleX = -bipedRightLeg.rotateAngleX;
        		bipedBody.rotateAngleX = 0.0F;
        		bipedHead.rotationPointZ = 0.0F;
        		bipedBody.rotationPointZ = 0.0F;
        		bipedRightLeg.rotationPointZ = 0.0F;
        		bipedLeftLeg.rotationPointZ = 0.0F;
        		sodeL.rotationPointZ = 0.0F;
        		sodeR.rotationPointZ = 0.0F;
        		SkirtL.rotationPointZ = 0.0F;
        		SkirtR.rotationPointZ = 0.0F;
        		if (!aimedBow) {
        			bipedRightArm.rotateAngleX = MathHelper.sin(f2 * 0.067F) * 0.05F - 0.7F;
        			bipedRightArm.rotateAngleY = 0.0F;
        			bipedRightArm.rotateAngleZ = -0.4F;
        			bipedLeftArm.rotateAngleX = MathHelper.sin(f2 * 0.067F) * 0.05F - 0.7F;
        			bipedLeftArm.rotateAngleY = 0.0F;
        			bipedLeftArm.rotateAngleZ = 0.4F;
        			bipedRightArm.rotationPointZ = 0.0F;
        			bipedLeftArm.rotationPointZ = 0.0F;
        			sodeL.showModel = false;
        			sodeR.showModel = false;
        			WsodeL.showModel = true;
        			WsodeR.showModel = true;
        		}
        	} else {
        		SkirtL.rotationPointY = SkirtR.rotationPointY = 0.0F;
        		bipedHead.rotationPointZ = 0.0F;
        		bipedBody.rotationPointZ = 0.0F;
        		bipedRightArm.rotationPointZ = 0.0F;
        		bipedLeftArm.rotationPointZ = 0.0F;
        	}
        	if (isRiding) {
        		bipedRightLeg.rotateAngleX = bipedLeftLeg.rotateAngleX = 1.570796313F;
        		bipedRightLeg.rotationPointY = bipedLeftLeg.rotationPointY = -4.0F;
        		bipedRightLeg.rotationPointZ = bipedLeftLeg.rotationPointZ = -2.0F;
        	} else {
        		if (!isSneak) {
        			SkirtL.rotateAngleX = SkirtR.rotateAngleX = 0.0F;
        			SkirtL.rotationPointZ = SkirtR.rotationPointZ =
        			bipedRightLeg.rotationPointZ = bipedLeftLeg.rotationPointZ = 0.0F;
        		}
        	}
        }
    }
}
