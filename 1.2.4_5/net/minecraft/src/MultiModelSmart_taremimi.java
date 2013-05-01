package net.minecraft.src;

public class MultiModelSmart_taremimi extends MultiModelSmart
{

    public Modchu_ModelRotationRenderer ChignonR;
    public Modchu_ModelRotationRenderer ChignonL;
    public Modchu_ModelRotationRenderer ChignonB;
    public Modchu_ModelRotationRenderer WTail;
    public Modchu_ModelRotationRenderer SideTailR;
    public Modchu_ModelRotationRenderer SideTailL;
    public Modchu_ModelRotationRenderer Prim;
    public Modchu_ModelRotationRenderer DogEL;
    public Modchu_ModelRotationRenderer DogER;
    public Modchu_ModelRotationRenderer Wansippo1;
    public Modchu_ModelRotationRenderer Wansippo2;
    public Modchu_ModelRotationRenderer Wansippo3;
    public Modchu_ModelRotationRenderer Wansippo4;
    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer eyeR;

    public MultiModelSmart_taremimi(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_taremimi(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        WTail = new Modchu_ModelRotationRenderer(this, 46, 19, bipedHead);
        WTail.addBox(-2F, -7.1F, 3F, 4, 11, 2, var1);
        WTail.setRotationPoint(0.0F, 0.0F, 0.0F);
        Prim = new Modchu_ModelRotationRenderer(this, 24, 16, bipedHead);
        Prim.addBox(-2F, -8.7F, -3.5F, 4, 1, 0, var1);
        Prim.setRotationPoint(0.0F, 0.0F, 0.0F);
        DogEL = new Modchu_ModelRotationRenderer(this, 0, 0, bipedHead);
        DogEL.setMirror(true);
        DogEL.addBox(0.0F, -7F, 5F, 3, 6, 1, var1 + 0.1F);
        DogEL.setRotationPoint(0.0F, 0.0F, 0.0F);
        DogER = new Modchu_ModelRotationRenderer(this, 0, 0, bipedHead);
        DogER.addBox(-3F, -7F, 5F, 3, 6, 1, var1 + 0.1F);
        DogER.setRotationPoint(0.0F, 0.0F, 0.0F);
        Wansippo1 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        Wansippo1.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 3, var1 + 0.2F);
        Wansippo1.setRotationPoint(0.0F, 6F, 2.0F);
        Wansippo2 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        Wansippo2.addBox(-0.5F, -1F, 2.0F, 1, 2, 3, var1 + 0.3F);
        Wansippo2.setRotationPoint(0.0F, 6F, 2.0F);
        Wansippo3 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        Wansippo3.addBox(-0.5F, -4F, 4F, 1, 4, 3, var1 + 0.3F);
        Wansippo3.setRotationPoint(0.0F, 6F, 2.0F);
        Wansippo4 = new Modchu_ModelRotationRenderer(this, 1, 17, bipedBody);
        Wansippo4.addBox(-0.5F, -4.5F, 3F, 1, 1, 2, var1 + 0.3F);
        Wansippo4.setRotationPoint(0.0F, 6F, 2.0F);
        eyeL = new Modchu_ModelRotationRenderer(this, 58, 16, bipedHead);
        eyeL.addBox(-1F, -1F, -4.001F, 2, 2, 1, var1 + 0.1F);
        eyeL.setRotationPoint(-2.0F, -2.5F, 0.0F);
        eyeR = new Modchu_ModelRotationRenderer(this, 60, 16, bipedHead);
        eyeR.addBox(-1F, -1F, -4.001F, 2, 2, 1, var1 + 0.1F);
        eyeR.setRotationPoint(2.0F, -2.5F, 0.0F);

        Wansippo1.setRotateAngleX(Wansippo2.setRotateAngleX(Wansippo3.setRotateAngleX(Wansippo4.setRotateAngleX(-0.275F))));
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
    	if (bipedHead.showModel) {
    		WTail.preRotateRender(f5);
    		Prim.preRotateRender(f5);
    		DogEL.preRotateRender(f5);
    		DogER.preRotateRender(f5);
    		eyeR.preRotateRender(f5);
    		eyeL.preRotateRender(f5);
    	}
    	if (bipedBody.showModel) {
    		Wansippo1.preRotateRender(f5);
    		Wansippo2.preRotateRender(f5);
    		Wansippo3.preRotateRender(f5);
    		Wansippo4.preRotateRender(f5);
    	}
    }

    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);
        Wansippo1.setRotateAngleY(Wansippo2.setRotateAngleY(Wansippo3.setRotateAngleY(Wansippo4.setRotateAngleY(mh_cos(f2 * 0.2F) * 0.05F))));
        Wansippo1.setRotateAngleZ(Wansippo2.setRotateAngleZ(Wansippo3.setRotateAngleZ(Wansippo4.setRotateAngleZ(mh_sin(f2 * 0.2F) * 0.5F))));
        if(isWait && !aimedBow)
        {
            Wansippo1.setRotateAngleZ(Wansippo2.setRotateAngleZ(Wansippo3.setRotateAngleZ(Wansippo4.setRotateAngleZ(mh_sin(f2 * 0.5F) * 1.0F))));
            Wansippo1.setRotateAngleY(Wansippo2.setRotateAngleY(Wansippo3.setRotateAngleY(Wansippo4.setRotateAngleY(mh_cos(f2 * 0.5F) * 1.0F))));
        }
        if(aimedBow)
        {
            eyeR.setVisible(true);
            eyeR.setVisible(false);
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
        DogER.rotateAngleX = DogEL.rotateAngleX = mh_sin(f2 * 0.05F) * 0.06F + 0.2F;
        DogER.rotateAngleY = -1.5708F;
        DogEL.rotateAngleY = 1.5708F;
        bipedOuter.rotateAngleY = 0.0F;
    }
}
