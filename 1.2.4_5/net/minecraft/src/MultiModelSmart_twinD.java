
package net.minecraft.src;



import org.lwjgl.opengl.GL11;

public class MultiModelSmart_twinD extends MultiModelSmart {

	public Modchu_ModelRotationRenderer eyeR;
    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer longhearR;
    public Modchu_ModelRotationRenderer longhearL;
    public Modchu_ModelRotationRenderer kamidomeR;
    public Modchu_ModelRotationRenderer kamidomeL;

    public MultiModelSmart_twinD(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_twinD(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        eyeR = new Modchu_ModelRotationRenderer(this, 32, 19, bipedHead);
        eyeR.addPlate(-4F, -5.0F, -4.001F, 4, 4, 0, var1);
        eyeR.setRotationPointLM(0.0F, 0.0F, 0.0F);
        eyeL = new Modchu_ModelRotationRenderer(this, 42, 19, bipedHead);
        eyeL.addPlate(0.0F, -5.0F, -4.001F, 4, 4, 0, var1);
        eyeL.setRotationPointLM(0.0F, 0.0F, 0.0F);

        longhearR = new Modchu_ModelRotationRenderer(this, 52, 13, bipedHead);
        longhearR.addBox(2.5F, -8F, 7.4F, 2, 18, 1);
        longhearR.setRotationPointLM(0F, 0F, 0F);
        longhearR.setTextureSize(64, 32);
        //longhearR.mirror = true;
        //setRotation(longhearR, 0.296706F, 0.296706F, -0.1745329F);
        longhearL = new Modchu_ModelRotationRenderer(this, 58, 13, bipedHead);
        longhearL.addBox(-4.5F, -8F, 7.4F, 2, 18, 1);
        longhearL.setRotationPointLM(0F, 0F, 0F);
        longhearL.setTextureSize(64, 32);
        //longhearL.mirror = true;
        //setRotation(longhearL, 0.296706F, -0.296706F, 0.1745329F);
        kamidomeR = new Modchu_ModelRotationRenderer(this, 46, 19, bipedHead);
        kamidomeR.addBox(1F, -7F, 6.5F, 2, 2, 1);
        kamidomeR.setRotationPointLM(0F, 0F, 0F);
        kamidomeR.setTextureSize(64, 32);
        //kamidomeR.mirror = true;
        //setRotation(kamidomeR, 0.296706F, 0.296706F, 0F);
        kamidomeL = new Modchu_ModelRotationRenderer(this, 46, 22, bipedHead);
        kamidomeL.addBox(-3F, -7F, 6.5F, 2, 2, 1);
        kamidomeL.setRotationPointLM(0F, 0F, 0F);
        kamidomeL.setTextureSize(64, 32);
        //kamidomeL.mirror = true;
        //setRotation(kamidomeL, 0.296706F, -0.296706F, 0F);
        Tail.setVisible(false);
        SideTailL.setVisible(false);
        SideTailR.setVisible(false);
        ChignonB.setVisible(false);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);

        if (bipedHead.showModel)
        {
			eyeR.preRotateRender(f5);
			eyeL.preRotateRender(f5);
        }
        longhearR.preRotateRender(f5);
        longhearL.preRotateRender(f5);
        kamidomeR.preRotateRender(f5);
        kamidomeL.preRotateRender(f5);
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

    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);
        longhearR.rotateAngleX=longhearL.rotateAngleX=kamidomeR.rotateAngleX=kamidomeL.rotateAngleX=0.296706F;
        longhearR.rotateAngleY=kamidomeR.rotateAngleY=0.296706F;
        longhearL.rotateAngleY=kamidomeL.rotateAngleY=-0.296706F;
        longhearR.rotateAngleZ=-0.1745329F;
        longhearL.rotateAngleZ=0.1745329F;
		if (aimedBow) {
			eyeL.showModel = true;
			eyeR.showModel = false;
		}
        bipedOuter.rotateAngleY = 0.0F;
    }

    @Override
    public void defaultPartsSettingBefore() {
    	super.defaultPartsSettingBefore();
    	String[] s = {
    			"Tail", "SideTailL", "SideTailR", "ChignonB"
    	};
    	showPartsHideListadd(s);
    }

    @Override
    public void showModelSettingReflects() {
    	super.showModelSettingReflects();
    	setVisible(Tail, false);
    	setVisible(SideTailL, false);
    	setVisible(SideTailR, false);
    	setVisible(ChignonB, false);
    }
}