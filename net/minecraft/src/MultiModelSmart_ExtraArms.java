package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class MultiModelSmart_ExtraArms extends MultiModelSmart
{

    public Modchu_ModelRotationRenderer Backpack;
    public Modchu_ModelRotationRenderer Antena;
    public Modchu_ModelRotationRenderer Cwave;
    public Modchu_ModelRotationRenderer FirstAidSet;
    public Modchu_ModelRotationRenderer FAstamp;
    public Modchu_ModelRotationRenderer Binoculars;
    public Modchu_ModelRotationRenderer BinocularsL1;
    public Modchu_ModelRotationRenderer BinocularsL2;
    public Modchu_ModelRotationRenderer BinocularsR1;
    public Modchu_ModelRotationRenderer BinocularsR2;
    public Modchu_ModelRotationRenderer Bullet1;
    public Modchu_ModelRotationRenderer Bullet2;
    public Modchu_ModelRotationRenderer Bullet3;
    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer eyeR;

    public MultiModelSmart_ExtraArms(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_ExtraArms(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        Backpack = new Modchu_ModelRotationRenderer(this, 24, 0, bipedBody);
        Backpack.addBox(-2.5F, -0.2F, 2.0F, 5, 5, 3, var1);
        Backpack.setRotationPoint(0.0F, 0.0F, 0.0F);
        Antena = new Modchu_ModelRotationRenderer(this, 40, 0, bipedBody);
        Antena.addBox(0.5F, -6.5F, 4.8F, 1, 7, 1, var1 - 0.2F);
        Antena.setRotationPoint(0.0F, 0.0F, 0.0F);
        Cwave = new Modchu_ModelRotationRenderer(this, 48, 10, bipedBody);
        Cwave.addBox(6.5F, -6.5F, 4.8F, 4, 2, 0, var1);
        Cwave.setRotationPoint(0.0F, 0.0F, 0.0F);
        FirstAidSet = new Modchu_ModelRotationRenderer(this, 52, 10, bipedBody);
        FirstAidSet.addBox(2.0F, 4F, 0.0F, 2, 3, 4, var1);
        FirstAidSet.setRotationPoint(0.0F, -1F, -1F);
        FAstamp = new Modchu_ModelRotationRenderer(this, 58, 11, bipedBody);
        FAstamp.addBox(1.5F, 3.01F, -3F, 3, 3, 0, var1 - 1.0F);
        FAstamp.setRotationPoint(0.0F, -1F, -1F);
        Binoculars = new Modchu_ModelRotationRenderer(this, 0, 2, bipedBody);
        Binoculars.addBox(-1.5F, 9F, 2.5F, 3, 2, 1, var1);
        Binoculars.setRotationPoint(0.0F, -1F, -1F);
        BinocularsL1 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        BinocularsL1.addBox(0.0F, 8F, 2.0F, 2, 2, 2, var1 - 0.5F);
        BinocularsL1.setRotationPoint(0.0F, -1F, -1F);
        BinocularsL2 = new Modchu_ModelRotationRenderer(this, 0, 0, bipedBody);
        BinocularsL2.addBox(0.0F, 9.5F, 2.0F, 2, 3, 2, var1);
        BinocularsL2.setRotationPoint(0.0F, -1F, -1F);
        BinocularsR1 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        BinocularsR1.addBox(1.5F, 8F, 1.0F, 2, 2, 2, var1 - 0.3F);
        BinocularsR1.setRotationPoint(0.0F, -1F, -1F);
        BinocularsR2 = new Modchu_ModelRotationRenderer(this, 0, 0, bipedBody);
        BinocularsR2.addBox(1.5F, 9.5F, 1.0F, 2, 3, 2, var1);
        BinocularsR2.setRotationPoint(0.0F, -1F, -1F);
        Bullet1 = new Modchu_ModelRotationRenderer(this, 0, 6, bipedBody);
        Bullet1.addBox(0.0F, -2F, -2F, 3, 1, 1, var1);
        Bullet1.setRotationPoint(0.0F, 0.0F, 0.0F);
        Bullet2 = new Modchu_ModelRotationRenderer(this, 0, 6, bipedBody);
        Bullet2.addBox(0.0F, -1F, -3F, 3, 1, 1, var1);
        Bullet2.setRotationPoint(0.0F, 0.0F, 0.0F);
        Bullet3 = new Modchu_ModelRotationRenderer(this, 0, 6, bipedBody);
        Bullet3.addBox(0.0F, 0.0F, -4F, 3, 1, 1, var1);
        Bullet3.setRotationPoint(0.0F, 0.0F, 0.0F);
        eyeR = new Modchu_ModelRotationRenderer(this, 32, 19, bipedHead);
        eyeR.addPlate(-4F, -5.0F, -4.001F, 4, 4, 0);
        eyeR.setRotationPointLM(0.0F, 0.0F, 0.0F);
        eyeL = new Modchu_ModelRotationRenderer(this, 42, 19, bipedHead);
        eyeL.addPlate(0.0F, -5.0F, -4.001F, 4, 4, 0);
        eyeL.setRotationPointLM(0.0F, 0.0F, 0.0F);
        ((Modchu_ModelRotationRenderer) bipedHeadwear).setVisible(false);
        ChignonB.setVisible(false);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
		if (bipedBody.showModel) {
			Cwave.preRotateRender(f5);
			FirstAidSet.preRotateRender(f5);
			FAstamp.preRotateRender(f5);
			Binoculars.preRotateRender(f5);
			BinocularsL1.preRotateRender(f5);
			BinocularsL2.preRotateRender(f5);
			BinocularsR1.preRotateRender(f5);
			BinocularsR2.preRotateRender(f5);
			Bullet1.preRotateRender(f5);
			Bullet2.preRotateRender(f5);
			Bullet3.preRotateRender(f5);
			Backpack.preRotateRender(f5);
			Antena.preRotateRender(f5);
		}
    	if (bipedHead.showModel) {
            eyeL.preRotateRender(f5);
            eyeR.preRotateRender(f5);
		}
    }

    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);
        Cwave.setVisible(false);

        if(getIsRiding())
        {

        }
        if(getOnGround() > -9990F && !aimedBow)
        {
            Antena.rotationPointY = 4F;
            Binoculars.setRotateAngleX(((Modchu_ModelRotationRenderer) bipedLeftArm).getRotateAngleX());
            BinocularsL1.setRotateAngleX(BinocularsL2.setRotateAngleX(((Modchu_ModelRotationRenderer) bipedLeftArm).getRotateAngleX()));
            BinocularsR1.setRotateAngleX(BinocularsR2.setRotateAngleX(((Modchu_ModelRotationRenderer) bipedLeftArm).getRotateAngleX()));
            Binoculars.setRotateAngleZ(((Modchu_ModelRotationRenderer) bipedLeftArm).getRotateAngleZ());
            BinocularsL1.setRotateAngleZ(BinocularsL2.setRotateAngleZ(((Modchu_ModelRotationRenderer) bipedLeftArm).getRotateAngleZ()));
            BinocularsR1.setRotateAngleZ(BinocularsR2.setRotateAngleZ(((Modchu_ModelRotationRenderer) bipedLeftArm).getRotateAngleZ()));
        }
        if(getIsSneak())
        {

        }
        if (isWait)
        {
            Antena.preRotationPointY = 0.0F;
            Binoculars.setRotateAngleX(0.0F);
            BinocularsL1.setRotateAngleX(BinocularsL2.setRotateAngleX(0.0F));
            BinocularsR1.setRotateAngleX(BinocularsR2.setRotateAngleX(0.0F));
            Binoculars.setRotateAngleZ(0.0F);
            BinocularsL1.setRotateAngleY(BinocularsL2.setRotateAngleY(0.0F));
            BinocularsR1.setRotateAngleY(BinocularsR2.setRotateAngleY(0.0F));
            Binoculars.setRotateAngleZ(0.0F);
            BinocularsL1.setRotateAngleZ(BinocularsL2.setRotateAngleZ(0.0F));
            BinocularsR1.setRotateAngleZ(BinocularsR2.setRotateAngleZ(0.0F));

            if (0.0D > (double)(mh_sin(f2 * 0.1F) * 0.3F) + Math.random() * 0.15000000596046448D + 0.10000000149011612D)
            {
                Cwave.preRotationPointX = (float)(int)(Math.random() * 4D) + 0.0F;
                Cwave.setVisible(true);
            }else
            {
                Cwave.setVisible(false);
            }
        }
        if(aimedBow)
        {
            eyeL.setVisible(true);
            eyeR.setVisible(false);
            Binoculars.setRotateAngleX(0.0F);
            BinocularsL1.setRotateAngleX(BinocularsL2.setRotateAngleX(0.0F));
            BinocularsR1.setRotateAngleX(BinocularsR2.setRotateAngleX(0.0F));
            Binoculars.setRotateAngleZ(0.0F);
            BinocularsL1.setRotateAngleY(BinocularsL2.setRotateAngleY(0.0F));
            BinocularsR1.setRotateAngleY(BinocularsR2.setRotateAngleY(0.0F));
            Binoculars.setRotateAngleZ(0.0F);
            BinocularsL1.setRotateAngleZ(BinocularsL2.setRotateAngleZ(0.0F));
            BinocularsR1.setRotateAngleZ(BinocularsR2.setRotateAngleZ(0.0F));
        } else
        {
            if(0.0D > (double)(mh_sin(f2 * 0.1F) * 0.3F) + Math.random() * 0.10000000149011612D + 0.10000000149011612D)
            {
                eyeL.setVisible(false);
                eyeR.setVisible(false);
            } else
            {
                eyeL.setVisible(true);
                eyeR.setVisible(true);
            }
        }
        FirstAidSet.rotateAngleX = 0.17453F;
        FAstamp.rotateAngleY = -1.5708F;
        FAstamp.rotateAngleZ = 0.0F;
        Cwave.rotateAngleZ = -0.2618F;
        Bullet1.rotateAngleX = Bullet2.rotateAngleX = Bullet3.rotateAngleX = 0.7854F;
        Bullet1.rotateAngleY = Bullet2.rotateAngleY = Bullet3.rotateAngleY = 0.0F;
        Bullet1.rotateAngleZ = Bullet2.rotateAngleZ = Bullet3.rotateAngleZ = 0.5236F;
        Binoculars.rotateAngleX = 0.0F;
        Binoculars.rotateAngleY = 1.6057F;
        Binoculars.rotateAngleZ = 0.0F;
        BinocularsL1.rotateAngleX = 0.05236F;
        BinocularsL1.rotateAngleY = 0.7854F;
        BinocularsL1.rotateAngleZ = 0.05236F;
        BinocularsL2.rotateAngleX = 0.05236F;
        BinocularsL2.rotateAngleY = 0.7854F;
        BinocularsL2.rotateAngleZ = 0.05236F;
        BinocularsR1.rotateAngleX = -0.05236F;
        BinocularsR1.rotateAngleY = 0.7854F;
        BinocularsR1.rotateAngleZ = -0.05236F;
        BinocularsR2.rotateAngleX = -0.05236F;
        BinocularsR2.rotateAngleY = 0.7854F;
        BinocularsR2.rotateAngleZ = -0.05236F;
		bipedOuter.rotateAngleY = 0.0F;
    }

    @Override
    public void defaultPartsSettingBefore() {
    	super.defaultPartsSettingBefore();
    	String[] s = {
    			"bipedHeadwear", "d"
    	};
    	showPartsHideListadd(s);
    	String[] s1 = {
    			"FirstAidSet" ,"Binoculars", "BinocularsL1", "BinocularsL2", "BinocularsR1",
    			"BinocularsR2", "BinocularsR1", "BinocularsR2"
    	};
    	String[] s2 = {
    			"FA_Set" ,"Bino", "BinoL1", "Bino_L2", "Bino_R1",
    			"Bino_R2", "Bino_R1", "Bino_R2"
    	};
    	addShowPartsReneme(s1, s2);
    }

    public float getWidth()
    {
        return 0.8F;
    }
}
