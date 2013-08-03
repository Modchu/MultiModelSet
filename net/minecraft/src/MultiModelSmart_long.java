
package net.minecraft.src;



import org.lwjgl.opengl.GL11;

public class MultiModelSmart_long extends MultiModelSmart
{
    public Modchu_ModelRotationRenderer eyeR;
    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer longhear;
	public Modchu_ModelRotationRenderer kamidome;

    public MultiModelSmart_long(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_long(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        eyeR = new Modchu_ModelRotationRenderer(this, 32, 19, bipedHead);
        eyeR.addPlate(-4F, -4.9F, -4.001F, 4, 4, 0, var1);
        eyeR.setRotationPointLM(0.0F, 0.0F, 0.0F);
        eyeL = new Modchu_ModelRotationRenderer(this, 42, 19, bipedHead);
        eyeL.addPlate(0.0F, -4.9F, -4.001F, 4, 4, 0, var1);
        eyeL.setRotationPointLM(0.0F, 0.0F, 0.0F);
        longhear = new Modchu_ModelRotationRenderer(this, 52, 12, bipedHead);
        longhear.addBox(-1.5F, -9F, 7F, 3, 17, 3);
        longhear.setRotationPointLM(0F, 0F, 0F);
        longhear.setTextureSize(64, 32);
        kamidome = new Modchu_ModelRotationRenderer(this, 46, 19, bipedHead);
        kamidome.addBox(-1F, -7F, 6F, 2, 2, 1);
        kamidome.setRotationPointLM(0F, 0F, 0F);
        kamidome.setTextureSize(64, 32);

        Tail.setVisible(false);
        SideTailL.setVisible(false);
        SideTailR.setVisible(false);
        ChignonB.setVisible(false);
        //ChignonR.setVisible(false);
        //ChignonL.setVisible(false);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);

        if (bipedHead.showModel)
        {
			eyeR.preRotateRender(f5);
			eyeL.preRotateRender(f5);
        }
        longhear.preRotateRender(f5);
        kamidome.preRotateRender(f5);
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
        kamidome.rotateAngleX=0.2974289F;
        longhear.rotateAngleX=0.2974289F;

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