package net.minecraft.src;



public class MultiModelSmart_tareusa extends
MultiModelSmart {

	public Modchu_ModelRotationRenderer ChignonR;
	public Modchu_ModelRotationRenderer ChignonL;
	public Modchu_ModelRotationRenderer ChignonB;
	public Modchu_ModelRotationRenderer SideTailR;
	public Modchu_ModelRotationRenderer SideTailL;
	public Modchu_ModelRotationRenderer Prim;
	public Modchu_ModelRotationRenderer UsaEL;
	public Modchu_ModelRotationRenderer UsaER;
	public Modchu_ModelRotationRenderer UsaEL1;
	public Modchu_ModelRotationRenderer UsaER1;
	public Modchu_ModelRotationRenderer Usasippo;

	public Modchu_ModelRotationRenderer eyeL;
	public Modchu_ModelRotationRenderer eyeR;

    public MultiModelSmart_tareusa(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_tareusa(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
		Prim = new Modchu_ModelRotationRenderer(this, 24, 16, bipedHead);
		Prim.addBoxLM(-2F, -8.7F, -3.5F, 4, 1, 0, var1);
		Prim.setRotationPointLM(0.0F, 0.0F, 0.0F);
		UsaEL = new Modchu_ModelRotationRenderer(this, 0, 0, bipedHead);
		UsaEL.setMirror(true);
		UsaEL.addBoxLM(-1.5F, 0F, 2F, 3, 6, 1, var1 + 0.1F);
		UsaEL.setRotationPointLM(0F, 0F, 0F);
		UsaER = new Modchu_ModelRotationRenderer(this, 0, 0, bipedHead);
		UsaER.addBoxLM(-1.5F, 0F, 2F, 3, 6, 1, var1 + 0.1F);
		UsaER.setRotationPointLM(0.0F, 0.0F, 0.0F);
		UsaEL1 = new Modchu_ModelRotationRenderer(this, 0, 0, bipedHead);
		UsaEL1.setMirror(true);
		UsaEL1.addBoxLM(-1.5F, 0F, -1F, 3, 3, 1, var1 + 0.1F);
		UsaEL1.setRotationPointLM(0F, 0F, 0F);
		UsaER1 = new Modchu_ModelRotationRenderer(this, 0, 0, bipedHead);
		UsaER1.addBoxLM(-1.5F, 0F, -1F, 3, 3, 1, var1 + 0.1F);
		UsaER1.setRotationPointLM(0.0F, 0.0F, 0.0F);

		Usasippo = new Modchu_ModelRotationRenderer(this, 24, 0, bipedBody);
		Usasippo.addBox(-1.5F, -0.1F, 0.0F, 3, 3, 3, var1);
		Usasippo.setRotationPoint(0.0F, 5F, 0.0F);
        eyeR = new Modchu_ModelRotationRenderer(this, 32, 19, bipedHead);
        eyeR.addPlate(-4F, -5.0F, -4.001F, 4, 4, 0);
        eyeR.setRotationPointLM(0.0F, 0.0F, 0.0F);
        eyeL = new Modchu_ModelRotationRenderer(this, 42, 19, bipedHead);
        eyeL.addPlate(0.0F, -5.0F, -4.001F, 4, 4, 0);
        eyeL.setRotationPointLM(0.0F, 0.0F, 0.0F);

		((Modchu_ModelRotationRenderer) bipedHeadwear).setVisible(false);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		if (bipedHead.showModel) {
			Prim.preRotateRender(f5);
			UsaEL.preRotateRender(f5);
			UsaER.preRotateRender(f5);
			UsaEL1.preRotateRender(f5);
			UsaER1.preRotateRender(f5);
			eyeR.preRotateRender(f5);
			eyeL.preRotateRender(f5);
		}
		if (bipedBody.showModel) {
			Usasippo.preRotateRender(f5);
		}
	}

	public void setRotationAnglesLM(float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);
		Usasippo.setRotateAngleY(mh_sin(f * 0.6662F) * 0.3F);
		UsaER.rotateAngleX = UsaEL.rotateAngleX = mh_sin(f2 * 0.2F) * 0.1F + 0.2F;
		if (isRiding) {
			Usasippo.setRotateAngleY(mh_sin(f * 0.6662F) * 0.5F);
		}
		if (onGround > -9990F && !aimedBow) {
			Usasippo.rotateAngleY = mh_sin(f2 * 0.2F) * 0.2F;
			Usasippo.setRotateAngleX(0.0F);
		}
		Usasippo.setRotationPointZ(2.0F);
        if(isWait && !aimedBow)
        {
            Usasippo.setRotateAngleY(0.0F);
            Usasippo.setRotateAngleX(mh_sin(f2 * 0.3F) * 0.1F);
            UsaER.preRotateAngleX = UsaEL.preRotateAngleX = mh_sin(f2 * 0.1F) * 0.06F + 0.2F;
        }
		if (aimedBow) {
            eyeL.setVisible(true);
            eyeR.setVisible(false);
			Usasippo.setRotateAngleY(0.0F);
		} else {
       		if (0.0D > (double) (mh_sin(f2 * 0.1F) * 0.3F) + Math.random()
        			* 0.10000000149011612D + 0.18000000715255737D) {
                eyeL.setVisible(false);
                eyeR.setVisible(false);
            } else
            {
                eyeL.setVisible(true);
                eyeR.setVisible(true);
            }
		}
		UsaEL.rotationPointX = UsaEL1.rotationPointX = 2.5F;
		UsaER.rotationPointX = UsaER1.rotationPointX = -2.5F;
		UsaEL.rotationPointY = UsaER.rotationPointY = UsaEL1.rotationPointY = UsaER1.rotationPointY = -8F;
        UsaEL.rotationPointZ = UsaER.rotationPointZ = UsaEL1.rotationPointZ = UsaER1.rotationPointZ = -0.5F;

		UsaEL1.rotateAngleX = UsaEL.rotateAngleX + 1.5708F;
		UsaER1.rotateAngleX = UsaER.rotateAngleX + 1.5708F;

		UsaER.rotateAngleY = UsaER1.rotateAngleY = mh_sin(f2 * 0.1F) * 0.06F - 1.920F;
		UsaEL.rotateAngleY = UsaEL1.rotateAngleY = mh_sin(f2 * 0.1F)
				* -0.06F + 1.920F;
        bipedOuter.rotateAngleY = 0.0F;
	}

    @Override
    public void defaultPartsSettingBefore() {
    	super.defaultPartsSettingBefore();
    	String[] s = {
    			"bipedHeadwear", "d"
    	};
    	showPartsHideListadd(s);
    }

    @Override
    public void showModelSettingReflects() {
    	super.showModelSettingReflects();
    	setVisible(bipedHeadwear, false);
    }
}