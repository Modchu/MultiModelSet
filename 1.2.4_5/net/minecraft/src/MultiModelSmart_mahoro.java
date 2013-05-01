package net.minecraft.src;




public class MultiModelSmart_mahoro extends MultiModelSmart {

    public Modchu_ModelRotationRenderer Prim;
    public Modchu_ModelRotationRenderer RibonUR;
    public Modchu_ModelRotationRenderer RibonUL;
    public Modchu_ModelRotationRenderer RibonBR;
    public Modchu_ModelRotationRenderer RibonBL;
    public Modchu_ModelRotationRenderer SensorR;
    public Modchu_ModelRotationRenderer SensorL;
    public Modchu_ModelRotationRenderer DropTail;
    public Modchu_ModelRotationRenderer ShoulderR;
    public Modchu_ModelRotationRenderer ShoulderL;
	public Modchu_ModelRotationRenderer eyeR;
	public Modchu_ModelRotationRenderer eyeL;

    public MultiModelSmart_mahoro(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_mahoro(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        Prim = new Modchu_ModelRotationRenderer(this, 0, 1, bipedHead);
        Prim.addBoxLM(0F, -3F, -2F, 1, 6, 1, var1);
        Prim.setRotationPoint(0.0F, 0.0F, 0.0F);
        Prim.angleFirst = false;
        Prim.rotateAngleZ = 1.570796313F;
        Prim.rotationPointY = -9F;

        RibonUR = new Modchu_ModelRotationRenderer(this, 42, 19, bipedHead);
        RibonUR.addBox(-4.5F, -2F, 4F, 4, 2, 1, var1);
        RibonUR.setRotationPoint(0F, 0F, 0F);
        RibonUL = new Modchu_ModelRotationRenderer(this, 42, 19, bipedHead);
        RibonUL.setMirror(true);
        RibonUL.addBox(0.5F, -2F, 4F, 4, 2, 1, var1);
        RibonUL.setRotationPoint(0F, 0F, 0F);
        RibonBR = new Modchu_ModelRotationRenderer(this, 42, 19, bipedHead);
        RibonBR.addBox(-4.5F, -2F, 3.5F, 4, 2, 1, var1);
        RibonBR.setRotationPoint(0F, 0F, 0F);
        RibonBR.rotateAngleZ = -70F / 180F * 3.141526F;
        RibonBL = new Modchu_ModelRotationRenderer(this, 42, 19, bipedHead);
        RibonBL.setMirror(true);
        RibonBL.addBox(0.5F, -2F, 3.5F, 4, 2, 1, var1);
        RibonBL.setRotationPoint(0F, 0F, 0F);
        RibonBL.rotateAngleZ = 70F / 180F * 3.141526F;

        SensorR = new Modchu_ModelRotationRenderer(this, 24, 16, bipedHead);
        SensorR.addBox(-2.5F, -0.5F, -2F, 3, 1, 1, var1);
        SensorR.setRotationPoint(0F, 0F, 0F);
        SensorR.rotateAngleZ = -10F / 180F * 3.141526F;
        SensorR.rotationPointY = -3.5F;
        SensorR.rotationPointX = -4.0F;
        SensorL = new Modchu_ModelRotationRenderer(this, 24, 16, bipedHead);
        SensorL.setMirror(true);
        SensorL.addBox(-0.5F, -0.5F, -2F, 3, 1, 1, var1);
        SensorL.setRotationPoint(0F, 0F, 0F);
        SensorL.rotateAngleZ = 10F / 180F * 3.141526F;
        SensorL.rotationPointY = -3.5F;
        SensorL.rotationPointX = 4.0F;

        DropTail = new Modchu_ModelRotationRenderer(this, 46, 22, bipedHead);
        DropTail.addBox(-1.0F, -0.5F, 0.0F, 2, 9, 1, var1);
        DropTail.setRotationPoint(0F, 0F, 0F);
        DropTail.rotationPointY = -1.0F;
        DropTail.rotationPointZ = 3.7F;

		ShoulderR = new Modchu_ModelRotationRenderer(this, 52, 18, bipedBody);
		ShoulderR.addBox(-5.0F, -0.5F, -2F, 2, 3, 4, var1);
		ShoulderR.setRotationPoint(0F, 0F, 0F);
		ShoulderL = new Modchu_ModelRotationRenderer(this, 52, 25, bipedBody);
		ShoulderL.addBox(3.0F, -0.5F, -2F, 2, 3, 4, var1);
		ShoulderL.setRotationPoint(0F, 0F, 0F);

		// 目
		eyeR = new Modchu_ModelRotationRenderer(this, 0, 16, bipedHead);
		eyeR.addPlate(-4.0F, -5.0F, -4.001F, 4, 4, 0, var1);
		eyeR.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyeL = new Modchu_ModelRotationRenderer(this, 4, 16, bipedHead);
		eyeL.addPlate(0.0F, -5.0F, -4.001F, 4, 4, 0, var1);
		eyeL.setRotationPoint(0.0F, 0.0F, 0.0F);

        // 表示しない
		Tail.setVisible(false);
		SideTailR.setVisible(false);
		SideTailL.setVisible(false);

    }


	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
        if (bipedHead.showModel) {
    		// 増加パーツ
        	// 頭
        	Prim.preRotateRender(f5);
        	RibonUR.preRotateRender(f5);
        	RibonUL.preRotateRender(f5);
        	RibonBR.preRotateRender(f5);
        	RibonBL.preRotateRender(f5);
        	SensorR.preRotateRender(f5);
        	SensorL.preRotateRender(f5);
        	DropTail.preRotateRender(f5);
            eyeL.preRotateRender(f5);
            eyeR.preRotateRender(f5);
        }
        if (bipedBody.showModel) {
        	// 胴体
        	ShoulderR.preRotateRender(f5);
        	ShoulderL.preRotateRender(f5);
    	}
    }

    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5) {
    	super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);

    	// 特殊モーション
    	SensorR.rotateAngleZ = bipedRightArm.rotateAngleX * 0.3F + mh_sin(f2 * 0.067F) * 0.1F + (-10F / 180F * 3.141526F);
    	SensorL.rotateAngleZ = -SensorR.rotateAngleZ;
    	DropTail.rotateAngleX = 10F / 180F * 3.141526F - bipedHead.rotateAngleX;

		if (aimedBow) {
			eyeL.showModel = true;
			eyeR.showModel = false;
		} else {
			if (0.0D > (double) (mh_sin(f2 * 0.1F) * 0.3F)
				+ Math.random() * 0.10000000149011612D
				+ 0.18000000715255737D) {
				eyeL.showModel = true;
				eyeR.showModel = true;
			} else {
				eyeL.showModel = false;
				eyeR.showModel = false;
			}
		}
    }

    @Override
    public void defaultPartsSettingBefore() {
    	super.defaultPartsSettingBefore();
    	String[] s = {
    			"SideTailR", "SideTailL", "Tail"
    	};
    	showPartsHideListadd(s);
    }

}
