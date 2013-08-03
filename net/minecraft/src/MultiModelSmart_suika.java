package net.minecraft.src;

public class MultiModelSmart_suika extends MultiModelSmart
{

    public Modchu_ModelRotationRenderer RibonL;
    public Modchu_ModelRotationRenderer RibonR;
    public Modchu_ModelRotationRenderer CatEL;
    public Modchu_ModelRotationRenderer CatER;
    public Modchu_ModelRotationRenderer Prim;
    public Modchu_ModelRotationRenderer Tuno1;
    public Modchu_ModelRotationRenderer Tuno2;
    public Modchu_ModelRotationRenderer Tuno3;
    public Modchu_ModelRotationRenderer Tuno4;
    public Modchu_ModelRotationRenderer Hyoutan1;
    public Modchu_ModelRotationRenderer Hyoutan2;
    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer eyeR;

    public MultiModelSmart_suika(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_suika(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        ChignonR = new Modchu_ModelRotationRenderer(this, 24, 18, bipedHead);
        ChignonR.addBox(-5F, -7F, 0.2F, 1, 3, 3, var1);
        ChignonR.setRotationPoint(0.0F, 0.0F, 0.0F);
        ChignonL = new Modchu_ModelRotationRenderer(this, 24, 18, bipedHead);
        ChignonL.addBox(4F, -7F, 0.2F, 1, 3, 3, var1);
        ChignonL.setRotationPoint(0.0F, 0.0F, 0.0F);
        ChignonB = new Modchu_ModelRotationRenderer(this, 0, 3, bipedHead);
        ChignonB.addBox(-1F, -7.2F, 3.5F, 2, 3, 2, var1);
        ChignonB.setRotationPoint(0.0F, 0.0F, 0.0F);
        Tail = new Modchu_ModelRotationRenderer(this, 46, 19, bipedHead);
        Tail.addBox(-2F, -4.5F, 3F, 4, 11, 2, var1);
        Tail.setRotationPoint(0.0F, 0.0F, 0.0F);
        SideTailR = new Modchu_ModelRotationRenderer(this, 58, 21, bipedHead);
        SideTailR.addBox(-4.5F, -5F, -3F, 1, 8, 2, var1);
        SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);
        SideTailL = new Modchu_ModelRotationRenderer(this, 58, 21, bipedHead);
        SideTailL.setMirror(true);
        SideTailL.addBox(3.5F, -5F, -3F, 1, 8, 2, var1);
        SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);
        RibonL = new Modchu_ModelRotationRenderer(this, 52, 10, bipedHead);
        RibonL.setMirror(true);
        RibonL.addBox(-5F, -10F, 3.5F, 4, 4, 2, var1);
        RibonL.setRotationPoint(0.0F, 0.0F, 0.0F);
        RibonL.rotateAngleX = 6.108653F;
        RibonR = new Modchu_ModelRotationRenderer(this, 52, 10, bipedHead);
        RibonR.setMirror(true);
        RibonR.addBox(1.0F, -10F, 3.5F, 4, 4, 2, var1);
        RibonR.setRotationPoint(0.0F, 0.0F, 0.0F);
        RibonR.rotateAngleX = 6.108653F;
        CatEL = new Modchu_ModelRotationRenderer(this, 0, 0, bipedHead);
        CatEL.addBox(1.0F, -3F, 6F, 3, 3, 1, var1);
        CatEL.setRotationPoint(0.0F, 0.0F, 0.0F);
        CatEL.rotateAngleX = -5.934119F;
        CatER = new Modchu_ModelRotationRenderer(this, 0, 4, bipedHead);
        CatER.addBox(-4F, -3F, 6F, 3, 3, 1, var1);
        CatER.setRotationPoint(0.0F, 0.0F, 0.0F);
        CatER.rotateAngleX = -5.934119F;
        Prim = new Modchu_ModelRotationRenderer(this, 24, 16, bipedHead);
        Prim.addBox(-2F, -8.7F, -3.5F, 4, 1, 0, var1);
        Prim.setRotationPoint(0.0F, 0.0F, 0.0F);
        Tuno1 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedHead);
        Tuno1.addBox(-1F, 7F, 1.0F, 2, 4, 2, var1);
        Tuno1.setRotationPoint(0.0F, 0.0F, 0.0F);
        Tuno2 = new Modchu_ModelRotationRenderer(this, 60, 16, bipedHead);
        Tuno2.addBox(0.0F, 9F, 6F, 1, 4, 1, var1);
        Tuno2.setRotationPoint(0.0F, 0.0F, 0.0F);
        Tuno3 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedHead);
        Tuno3.setMirror(true);
        Tuno3.addBox(-1F, 7F, -3F, 2, 4, 2, var1);
        Tuno3.setRotationPoint(0.0F, 0.0F, 0.0F);
        Tuno4 = new Modchu_ModelRotationRenderer(this, 56, 16, bipedHead);
        Tuno4.addBox(0.0F, 9F, -7F, 1, 4, 1, var1);
        Tuno4.setRotationPoint(0.0F, 0.0F, 0.0F);
        Hyoutan1 = new Modchu_ModelRotationRenderer(this, 0, 23, bipedLeftArm);
        Hyoutan1.addBox(0.0F, 3F, 3F, 3, 3, 3, var1);
        Hyoutan1.setRotationPoint(-5F, 1.5F, 0F);
        Hyoutan2 = new Modchu_ModelRotationRenderer(this, 0, 24, bipedLeftArm);
        Hyoutan2.addBox(-1F, 5F, 2.0F, 2, 2, 2, var1);
        Hyoutan2.setRotationPoint(-5F, 1.5F, 0F);
        eyeL = new Modchu_ModelRotationRenderer(this, 24, 0, bipedHead);
        eyeL.addBox(-1F, -1F, -4.001F, 2, 2, 1, var1 + 0.1F);
        eyeL.setRotationPoint(-2.0F, -2.5F, 0.0F);
        eyeR = new Modchu_ModelRotationRenderer(this, 26, 0, bipedHead);
        eyeR.addBox(-1F, -1F, -4.001F, 2, 2, 1, var1 + 0.1F);
        eyeR.setRotationPoint(2.0F, -2.5F, 0.0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
    	if (bipedHead.showModel) {
    		RibonL.preRotateRender(f5);
        	RibonR.preRotateRender(f5);
        	CatEL.preRotateRender(f5);
        	CatER.preRotateRender(f5);
        	Prim.preRotateRender(f5);
        	Tuno1.preRotateRender(f5);
        	Tuno2.preRotateRender(f5);
        	Tuno3.preRotateRender(f5);
        	Tuno4.preRotateRender(f5);
        	eyeR.preRotateRender(f5);
        	eyeL.preRotateRender(f5);
    	}
    	if (bipedBody.showModel) {
    		Hyoutan1.preRotateRender(f5);
        	Hyoutan2.preRotateRender(f5);
    	}
    }

    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);

        Hyoutan1.rotateAngleX = Hyoutan2.rotateAngleX = Hyoutan1.rotateAngleY = Hyoutan2.rotateAngleY = -0.7853982F;
        if(getOnGround() > -9990F && !aimedBow)
        {
            //Hyoutan1.setRotateAngleZ(Hyoutan2.setRotateAngleZ(((Modchu_ModelRotationRenderer) bipedLeftArm).getRotateAngleZ()));
            //Hyoutan1.setRotateAngleX(Hyoutan2.setRotateAngleX(((Modchu_ModelRotationRenderer) bipedLeftArm).getRotateAngleX()));
        }
        if(aimedBow)
        {
        	Hyoutan1.setBase(bipedBody);
        	Hyoutan2.setBase(bipedBody);
        	Hyoutan1.rotationPointX = Hyoutan2.rotationPointX = 3.0F;
        	Hyoutan1.rotationPointZ = Hyoutan2.rotationPointZ = 0.0F;
        	eyeL.setVisible(true);
            eyeR.setVisible(false);
        } else
        {
        	Hyoutan1.setBase(bipedLeftArm);
        	Hyoutan2.setBase(bipedLeftArm);
        	Hyoutan1.rotationPointX = Hyoutan2.rotationPointX = 0.0F;
        	Hyoutan1.rotationPointZ = Hyoutan2.rotationPointZ = 0.0F;
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
        Prim.setRotateAngleX(((Modchu_ModelRotationRenderer) bipedHead).getRotateAngleX());
        Tuno1.rotateAngleX = 2.356194F;
        Tuno2.rotateAngleX = 1.919862F;
        Tuno3.rotateAngleX = -2.356194F;
        Tuno4.rotateAngleX = -1.919862F;
        Tuno1.rotateAngleY = Tuno2.rotateAngleY = Tuno3.rotateAngleY = Tuno4.rotateAngleY = 1.570796F;
        bipedOuter.rotateAngleY = 0.0F;
    }

    public float getWidth()
    {
        return 0.8F;
    }
}
