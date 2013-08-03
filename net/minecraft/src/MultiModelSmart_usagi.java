package net.minecraft.src;

public class MultiModelSmart_usagi extends MultiModelSmart
{

    public Modchu_ModelRotationRenderer WTail;
    public Modchu_ModelRotationRenderer CatEL;
    public Modchu_ModelRotationRenderer CatER;
    public Modchu_ModelRotationRenderer Prim;
    public Modchu_ModelRotationRenderer Usasippo;
    public Modchu_ModelRotationRenderer UsaEL;
    public Modchu_ModelRotationRenderer UsaER;
    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer eyeR;
	private boolean isTaremimi = false;
	private boolean isTareRightmimi;

    public MultiModelSmart_usagi(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_usagi(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        ChignonR = new Modchu_ModelRotationRenderer(this, 24, 18, bipedHead);
        ChignonR.addBox(-5F, -7F, 0.2F, 1, 3, 3, var1);
        ChignonR.setRotationPoint(0.0F, 0.0F, 0.0F);
        ChignonL = new Modchu_ModelRotationRenderer(this, 24, 18, bipedHead);
        ChignonL.addBox(4F, -7F, 0.2F, 1, 3, 3, var1);
        ChignonL.setRotationPoint(0.0F, 0.0F, 0.0F);
        ChignonB = new Modchu_ModelRotationRenderer(this, 52, 10, bipedHead);
        ChignonB.addBox(-2F, -7.2F, 4F, 4, 4, 2, var1);
        ChignonB.setRotationPoint(0.0F, 0.0F, 0.0F);
        WTail = new Modchu_ModelRotationRenderer(this, 46, 19, bipedHead);
        WTail.addBox(-2F, -7.1F, 3F, 4, 11, 2, var1);
        WTail.setRotationPoint(0.0F, 0.0F, 0.0F);
        SideTailR = new Modchu_ModelRotationRenderer(this, 58, 21, bipedHead);
        SideTailR.addBox(-4.2F, -5.8F, -3F, 1, 8, 2, var1);
        SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);
        SideTailL = new Modchu_ModelRotationRenderer(this, 58, 21, bipedHead);
        SideTailL.mirror = true;
        SideTailL.addBox(3.2F, -5.8F, -3F, 1, 8, 2, var1);
        SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);
        CatEL = new Modchu_ModelRotationRenderer(this, 0, 1, bipedHead);
        CatEL.mirror = true;
        CatEL.addBox(0.5F, -11F, 1.0F, 3, 5, 1, var1);
        CatEL.setRotationPoint(0.0F, 0.0F, 0.0F);
        CatER = new Modchu_ModelRotationRenderer(this, 0, 1, bipedHead);
        CatER.addBox(-3.5F, -11F, 1.0F, 3, 5, 1, var1);
        CatER.setRotationPoint(0.0F, 0.0F, 0.0F);
        Prim = new Modchu_ModelRotationRenderer(this, 24, 16, bipedHead);
        Prim.addBox(-2F, -8.7F, -3.5F, 4, 1, 0, var1);
        Prim.setRotationPoint(0.0F, 0.0F, 0.0F);
        Usasippo = new Modchu_ModelRotationRenderer(this, 20, 8, bipedBody);
        Usasippo.addBox(-1.5F, -0.1F, 0.0F, 3, 3, 3, var1);
        Usasippo.setRotationPoint(0.0F, 5F, 0.0F);
        UsaER = new Modchu_ModelRotationRenderer(this, 0, 0, bipedHead);
        UsaER.addBox(-3.4F, -15.5F, 4.5F, 3, 6, 1, var1);
        UsaER.setRotationPoint(0.0F, 0.0F, 0.0F);
        UsaEL = new Modchu_ModelRotationRenderer(this, 0, 0, bipedHead);
        UsaEL.mirror = true;
        UsaEL.addBox(0.5F, -15.5F, 4.5F, 3, 6, 1, var1);
        UsaEL.setRotationPoint(0.0F, 0.0F, 0.0F);
        eyeL = new Modchu_ModelRotationRenderer(this, 58, 16, bipedHead);
        eyeL.addBox(-1F, -1F, -4.001F, 2, 2, 1, var1 + 0.1F);
        eyeL.setRotationPoint(-2.0F, -2.5F, 0.0F);
        eyeR = new Modchu_ModelRotationRenderer(this, 60, 16, bipedHead);
        eyeR.addBox(-1F, -1F, -4.001F, 2, 2, 1, var1 + 0.1F);
        eyeR.setRotationPoint(2.0F, -2.5F, 0.0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
    	if (bipedHead.showModel) {
    		ChignonB.preRotateRender(f5);
    		WTail.preRotateRender(f5);
    		CatEL.preRotateRender(f5);
    		CatER.preRotateRender(f5);
    		Prim.preRotateRender(f5);
    		UsaER.preRotateRender(f5);
    		UsaEL.preRotateRender(f5);
    		eyeR.preRotateRender(f5);
    		eyeL.preRotateRender(f5);
    	}
    	if (bipedBody.showModel) {
    		Usasippo.preRotateRender(f5);
    	}
    }

    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);
        UsaER.rotateAngleX = UsaEL.rotateAngleX = 0.6981317F;
        UsaEL.rotationPointX = 0.0F;
        UsaER.rotationPointX = -0.1F;
        UsaEL.rotationPointY = UsaER.rotationPointY = 0.0F;
        UsaEL.rotationPointZ = UsaER.rotationPointZ = mh_cos(f2 * 0.05F) * 0.5F - 0.2F;
        CatEL.rotationPointZ = CatER.rotationPointZ = mh_cos(f2 * 0.05F) * 0.5F;
        Usasippo.setRotateAngleY(mh_sin(f * 0.6662F) * 0.3F);
        if(isRiding)
        {
            UsaER.rotateAngleX = UsaEL.rotateAngleX = 2.094F;
            UsaEL.rotationPointX = -2F;
            UsaER.rotationPointX = 2.0F;
            UsaEL.rotationPointY = UsaER.rotationPointY = -11.2F;
            UsaEL.rotationPointZ = UsaER.rotationPointZ = mh_cos(f2 * 0.05F) * 0.5F + 8F;
        }
        if(getOnGround() > -9990F && !aimedBow)
        {
            Usasippo.rotateAngleY = mh_sin(f * 0.2F) * 0.5F;
        }
        Usasippo.setRotationPointZ(2.0F);
        if(isWait && !aimedBow)
        {
            Usasippo.setRotateAngleY(mh_cos(f2 * 0.2F) * 0.5F);
            UsaER.rotateAngleX = UsaEL.rotateAngleX = 2.268928F;
            UsaEL.rotationPointX = -2F;
            UsaER.rotationPointX = 2.0F;
            UsaEL.rotationPointY = UsaER.rotationPointY = -13.3F;
            UsaEL.rotationPointZ = UsaER.rotationPointZ = mh_cos(f2 * 0.05F) * 0.5F + 7.8F;
        }
        if(aimedBow)
        {
            eyeR.setVisible(false);
            eyeL.setVisible(true);
            Usasippo.setRotateAngleY(0.0F);
        } else
        {
            if(0.0D > (double)(mh_sin(f2 * 0.1F) * 0.3F) + Math.random() * 0.10000000149011612D + 0.18000000715255737D)
            {
                eyeL.setVisible(false);
                eyeR.setVisible(false);
            } else
            {
                eyeL.setVisible(true);
                eyeR.setVisible(true);
            }
        }
        WTail.rotationPointX = mh_sin(f2 * 0.05F) * 0.03F;
        CatER.rotateAngleX = CatEL.rotateAngleX = 0.3839724F;
        CatER.rotateAngleY = 0.2617994F;
        CatEL.rotateAngleY = -0.2617994F;
        UsaER.rotateAngleY = 0.2617994F;
        UsaEL.rotateAngleY = -0.2617994F;
        if (mod_Modchu_ModchuLib.modchuRemodelingModel) {
        	if (isSneak) {
        		UsaER.rotateAngleX = UsaEL.rotateAngleX = 2.268928F;
        		UsaEL.rotationPointX = -2F;
        		UsaER.rotationPointX = 2.0F;
        		UsaEL.rotationPointY = UsaER.rotationPointY = -13.3F;
        		UsaEL.rotationPointZ = UsaER.rotationPointZ = mh_cos(f2 * 0.05F) * 0.5F + 7.8F;
        	}
        	if (isWait) {
        		if(!isTaremimi
        				&& 0.0D > (double)(mh_sin(f2 * 0.1F) * 0.2F) + Math.random() * 0.10000000149011612D + 0.18000000715255737D) {
        			isTaremimi = true;
        		}
        		if(!isTareRightmimi
        				&& 0.0D > (double)(mh_sin(f2 * 0.1F) * 0.2F) + Math.random() * 0.10000000149011612D + 0.18000000715255737D) {
        			isTareRightmimi = true;
        		}
        		if (isTaremimi) {
        			UsaER.rotateAngleX = 2.268928F;
        			if (!isTareRightmimi) {
        				UsaEL.rotateAngleX = 2.268928F;
        				UsaEL.rotationPointX = -2F;
        				UsaEL.rotationPointY = -13.3F;
        				UsaEL.rotationPointZ = mh_cos(f2 * 0.05F) * 0.5F + 7.8F;
        			} else {
        				UsaEL.rotateAngleX = 0.6981317F;
        				UsaEL.rotationPointX = 0.0F;
        				UsaEL.rotationPointY = 0.0F;
        				UsaEL.rotationPointZ = mh_cos(f2 * 0.05F) * 0.5F - 0.2F;
        			}
        			UsaER.rotationPointX = 2.0F;
        			UsaER.rotationPointY = -13.3F;
        			UsaER.rotationPointZ = mh_cos(f2 * 0.05F) * 0.5F + 7.8F;
        		} else {
        			UsaER.rotateAngleX = UsaEL.rotateAngleX = 0.6981317F;
        			UsaEL.rotationPointX = 0.0F;
        			UsaER.rotationPointX = -0.1F;
        			UsaEL.rotationPointY = UsaER.rotationPointY = 0.0F;
        			UsaEL.rotationPointZ = UsaER.rotationPointZ = mh_cos(f2 * 0.05F) * 0.5F - 0.2F;
        		}
        		if(isTaremimi
        				&& 0.0D > (double)(mh_sin(f2 * 0.1F) * 0.2F) + Math.random() * 0.10000000149011612D + 0.18000000715255737D) {
        			isTaremimi = false;
        		}
        		if(isTareRightmimi
        				&& 0.0D > (double)(mh_sin(f2 * 0.1F) * 0.2F) + Math.random() * 0.10000000149011612D + 0.08000000715255737D) {
        			isTareRightmimi = false;
        		}
        	}
        }
        bipedOuter.rotateAngleY = 0.0F;
    }
}
