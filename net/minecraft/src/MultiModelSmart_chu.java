package net.minecraft.src;



public class MultiModelSmart_chu extends MultiModelSmart
{

    public Modchu_ModelRotationRenderer CatEL;
    public Modchu_ModelRotationRenderer CatER;
    public Modchu_ModelRotationRenderer CatTail;
    public Modchu_ModelRotationRenderer Prim;
    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer eyeR;

    public MultiModelSmart_chu(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_chu(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        //var2 += 8F;
        CatEL = new Modchu_ModelRotationRenderer(this, 0, 4, bipedHead);
        CatEL.addBox(1.0F, -11F, -2F, 3, 3, 1, var1);
        CatEL.setRotationPoint(0.0F, 0.0F, 0.0F);
        CatER = new Modchu_ModelRotationRenderer(this, 0, 0, bipedHead);
        CatER.addBox(-4F, -11F, -2F, 3, 3, 1, var1);
        CatER.setRotationPoint(0.0F, 0.0F, 0.0F);
        CatTail = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        CatTail.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 1, var1);
        CatTail.setRotationPoint(0.0F, 6F, 0.0F);
        Prim = new Modchu_ModelRotationRenderer(this, 24, 16, bipedHead);
        Prim.addBox(-2F, -8.7F, -3.5F, 4, 1, 0, var1);
        Prim.setRotationPoint(0.0F, 0.0F, 0.0F);
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
    		CatEL.preRotateRender(f5);
    		CatER.preRotateRender(f5);
    		CatTail.preRotateRender(f5);
    		Prim.preRotateRender(f5);
    		eyeR.preRotateRender(f5);
    		eyeL.preRotateRender(f5);
    	}
    }

    public void setLivingAnimationsLM(EntityLiving entityliving, float f, float f1, float f2)
    {
        super.setLivingAnimationsLM(entityliving, f, f1, f2);
        CatTail.setRotationPointZ(2.0F);
        CatTail.setRotateAngleX(-4.363323F);
    }

    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);
        CatTail.setRotateAngleX(mh_sin(f * 0.6662F) * 0.5F - 4.363323F);
        if(getOnGround() > -9990F && !aimedBow)
        {
            CatTail.setRotateAngleY(((Modchu_ModelRotationRenderer) bipedBody).getRotateAngleY());
        }
        if(getIsSneak())
        {
            //CatTail.setRotateAngleX(CatTail.getRotateAngleX() + 0.2F);
            //CatTail.setRotationPointZ(5F);
            CatTail.rotationPointY = 7.5F;
        } else
        {
            //CatTail.setRotationPointZ(2.0F);
            CatTail.rotationPointY = 6.0F;
        }
        if(isWait && !aimedBow)
        {
            CatTail.setRotateAngleX(mh_sin(f2 * 0.6662F) * 0.1F - 4.363323F);
        }
        if(aimedBow)
        {
            eyeR.setVisible(false);
        } else
        {
            eyeR.setVisible(true);
        }
        if(0.0D > (double)(mh_sin(f2 * 0.1F) * 0.3F) + Math.random() * 0.10000000149011612D + 0.18000000715255737D)
        {
            eyeL.setVisible(false);
            eyeR.setVisible(false);
        } else
        {
            eyeL.setVisible(true);
            eyeR.setVisible(true);
        }
        bipedOuter.rotateAngleY = 0.0F;
    }
}
