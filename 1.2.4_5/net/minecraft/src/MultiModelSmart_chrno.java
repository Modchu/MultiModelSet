package net.minecraft.src;

import net.minecraft.move.render.ModelRotationRenderer;

import org.lwjgl.opengl.GL11;

public class MultiModelSmart_chrno extends MultiModelSmart
{

    public Modchu_ModelRotationRenderer RibonL;
    public Modchu_ModelRotationRenderer RibonR;
    public Modchu_ModelRotationRenderer CatEL;
    public Modchu_ModelRotationRenderer CatER;
    public Modchu_ModelRotationRenderer Icewing1;
    public Modchu_ModelRotationRenderer Icewing2;
    public Modchu_ModelRotationRenderer Icewing3;
    public Modchu_ModelRotationRenderer Icewing4;
    public Modchu_ModelRotationRenderer Icewing5;
    public Modchu_ModelRotationRenderer Icewing6;
    public Modchu_ModelRotationRenderer Prim;
    public Modchu_ModelRotationRenderer eyeL;
    public Modchu_ModelRotationRenderer eyeR;
    public Modchu_ModelRotationRenderer Rightarm1;
    public Modchu_ModelRotationRenderer Rightarm2;
    public Modchu_ModelRotationRenderer Leftarm1;
    public Modchu_ModelRotationRenderer Leftarm2;

    public MultiModelSmart_chrno(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_chrno(float var1, int var2, int var3)
    {
        super(var1, var2, var3);
        Skirt.addBox(-4F, -2F, -4F, 8, 8, 8, var1 - 0.2F);
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
        CatEL.addBox(1.0F, -4F, 7F, 3, 3, 1, var1);
        CatEL.setRotationPoint(0.0F, 0.0F, 0.0F);
        CatEL.rotateAngleX = -5.934119F;
        CatER = new Modchu_ModelRotationRenderer(this, 0, 4, bipedHead);
        CatER.addBox(-4F, -4F, 7F, 3, 3, 1, var1);
        CatER.setRotationPoint(0.0F, 0.0F, 0.0F);
        CatER.rotateAngleX = -5.934119F;
        Prim = new Modchu_ModelRotationRenderer(this, 24, 16, bipedHead);
        Prim.addBox(-2F, -8.7F, -3.5F, 4, 1, 0, var1);
        Prim.setRotationPoint(0.0F, 0.0F, 0.0F);
        Icewing1 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        Icewing1.setMirror(true);
        Icewing1.addBox(-1F, 5F, 4F, 2, 5, 1, var1);
        Icewing1.setRotationPoint(0.0F, 1.5F, 0.0F);
        Icewing2 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        Icewing2.setMirror(true);
        Icewing2.addBox(-1F, 5F, 4F, 2, 5, 1, var1);
        Icewing2.setRotationPoint(0.0F, 1.5F, 0.0F);
        Icewing3 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        Icewing3.addBox(-1F, 5F, 4F, 2, 5, 1, var1);
        Icewing3.setRotationPoint(0.0F, 1.5F, 0.0F);
        Icewing4 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        Icewing4.setMirror(true);
        Icewing4.addBox(-1F, 5F, 4F, 2, 5, 1, var1);
        Icewing4.setRotationPoint(0.0F, 1.5F, 0.0F);
        Icewing5 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        Icewing5.setMirror(true);
        Icewing5.addBox(-1F, 5F, 4F, 2, 5, 1, var1);
        Icewing5.setRotationPoint(0.0F, 1.5F, 0.0F);
        Icewing6 = new Modchu_ModelRotationRenderer(this, 0, 16, bipedBody);
        Icewing6.addBox(-1F, 5F, 4F, 2, 5, 1, var1);
        Icewing6.setRotationPoint(0.0F, 1.5F, 0.0F);
        eyeL = new Modchu_ModelRotationRenderer(this, 58, 16, bipedHead);
        eyeL.addBox(-1F, -1F, -4.001F, 2, 2, 1, var1 + 0.1F);
        eyeL.setRotationPoint(-2.0F, -2.5F + var2, 0.0F);
        eyeR = new Modchu_ModelRotationRenderer(this, 60, 16, bipedHead);
        eyeR.addBox(-1F, -1F, -4.001F, 2, 2, 1, var1 + 0.1F);
        eyeR.setRotationPoint(2.0F, -2.5F + var2, 0.0F);
        Rightarm1 = new Modchu_ModelRotationRenderer(this, 48, 0, bipedRightShoulder);
        Rightarm1.addBox(-2F, 2.8F, -1F, 2, 5, 2);
        Rightarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
        Rightarm2 = new Modchu_ModelRotationRenderer(this, 48, 5, bipedRightShoulder);
        Rightarm2.addBox(-6.8F, -3.8F, -0.98F, 2, 3, 2);
        Rightarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        Leftarm1 = new Modchu_ModelRotationRenderer(this, 56, 0, bipedLeftShoulder);
        Leftarm1.addBox(0.0F, 2.8F, -1F, 2, 5, 2);
        Leftarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
        Leftarm2 = new Modchu_ModelRotationRenderer(this, 56, 5, bipedLeftShoulder);
        Leftarm2.addBox(4.8F, -3.8F, -0.98F, 2, 3, 2);
        Leftarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        ((Modchu_ModelRotationRenderer) bipedRightArm).setVisible(true);
        Rightarm1.setVisible(false);
        Rightarm2.setVisible(false);
        ((Modchu_ModelRotationRenderer) bipedLeftArm).setVisible(true);
        Leftarm1.setVisible(false);
        Leftarm2.setVisible(false);
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
			eyeR.preRotateRender(f5);
			eyeL.preRotateRender(f5);
		}
		if (bipedBody.showModel) {
			Icewing1.preRotateRender(f5);
			Icewing2.preRotateRender(f5);
			Icewing3.preRotateRender(f5);
			Icewing4.preRotateRender(f5);
			Icewing5.preRotateRender(f5);
			Icewing6.preRotateRender(f5);
		}
		Rightarm1.preRotateRender(f5);
		Rightarm2.preRotateRender(f5);
		Leftarm1.preRotateRender(f5);
		Leftarm2.preRotateRender(f5);
    }

    public void setLivingAnimationsLM(EntityLiving entityliving, float f, float f1, float f2)
    {
        super.setLivingAnimationsLM(entityliving, f, f1, f2);
        Icewing1.setRotateAngleZ(0.8726646F);
        Icewing2.setRotateAngleZ(1.570796F);
        Icewing3.setRotateAngleZ(2.094395F);
        Icewing4.setRotateAngleZ(5.235988F);
        Icewing5.setRotateAngleZ(4.712389F);
        Icewing6.setRotateAngleZ(4.18879F);
        Rightarm1.rotateAngleZ = 1.047F;
        Rightarm2.rotateAngleZ = -1.047F;
        Leftarm1.rotateAngleZ = -1.047F;
        Leftarm2.rotateAngleZ = 1.047F;
        bipedRightArm.setVisible(true);
        Rightarm1.setVisible(false);
        Rightarm2.setVisible(false);
        bipedLeftArm.setVisible(true);
        Leftarm1.setVisible(false);
        Leftarm2.setVisible(false);
    }

    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAnglesLM(f, f1, f2, f3, f4, f5);
        if(31.41593F >= mh_abs(f2))
        {
            f2 %= 31.41593F;
        }
        Icewing1.setRotateAngleX(Icewing2.setRotateAngleX(Icewing3.setRotateAngleX(mh_sin(f * f * 0.6662F) * 0.15F)));
        Icewing4.setRotateAngleX(Icewing5.setRotateAngleX(Icewing6.setRotateAngleX(mh_sin(f * f * 0.6662F) * 0.15F)));
        //eyeL.rotationPointY = eyeR.rotationPointY = -2.5F;
        //if(getIsRiding())
        //{
            //eyeL.rotationPointY = eyeR.rotationPointY = -2.9F;
        //}
        if(getOnGround() > -9990F && !aimedBow)
        {
            Icewing1.setRotateAngleY(Icewing2.setRotateAngleY(Icewing3.setRotateAngleY(((Modchu_ModelRotationRenderer) bipedBody).getRotateAngleY())));
            Icewing4.setRotateAngleY(Icewing5.setRotateAngleY(Icewing6.setRotateAngleY(((Modchu_ModelRotationRenderer) bipedBody).getRotateAngleY())));
        }
        if(getIsSneak())
        {
            Icewing1.setRotateAngleX(Icewing1.getRotateAngleX() + 0.6F);
            Icewing2.setRotateAngleX(Icewing2.getRotateAngleX() + 0.4F);
            Icewing3.setRotateAngleX(Icewing3.getRotateAngleX() + 0.2F);
            Icewing4.setRotateAngleX(Icewing4.getRotateAngleX() + 0.6F);
            Icewing5.setRotateAngleX(Icewing5.getRotateAngleX() + 0.4F);
            Icewing6.setRotateAngleX(Icewing6.getRotateAngleX() + 0.2F);
            Icewing1.setRotateAngleY(Icewing1.getRotateAngleY() - 0.1F);
            Icewing2.setRotateAngleY(Icewing2.getRotateAngleY() - 0.3F);
            Icewing3.setRotateAngleY(Icewing3.getRotateAngleY() - 0.5F);
            Icewing4.setRotateAngleY(Icewing4.getRotateAngleY() + 0.1F);
            Icewing5.setRotateAngleY(Icewing5.getRotateAngleY() + 0.3F);
            Icewing6.setRotateAngleY(Icewing6.getRotateAngleY() + 0.5F);
            Icewing1.setRotateAngleZ(Icewing1.getRotateAngleZ() + 0.1F);
            Icewing2.setRotateAngleZ(Icewing2.getRotateAngleZ() - 0.0F);
            Icewing3.setRotateAngleZ(Icewing3.getRotateAngleZ() - 0.1F);
            Icewing4.setRotateAngleZ(Icewing4.getRotateAngleZ() - 0.1F);
            Icewing5.setRotateAngleZ(Icewing5.getRotateAngleZ() + 0.0F);
            Icewing6.setRotateAngleZ(Icewing6.getRotateAngleZ() + 0.1F);
            Icewing1.rotationPointY = Icewing2.rotationPointY = Icewing3.rotationPointY = Icewing4.rotationPointY = Icewing5.rotationPointY = Icewing6.rotationPointY = 6.0F;
            //eyeL.rotationPointY = eyeR.rotationPointY = -2F;
        } else {
            Icewing1.rotationPointY = Icewing2.rotationPointY = Icewing3.rotationPointY = Icewing4.rotationPointY = Icewing5.rotationPointY = Icewing6.rotationPointY = 1.5F;
        }
        if(isWait && !aimedBow)
        {
            Icewing3.setRotateAngleX(Icewing6.setRotateAngleX(mh_sin(f2 * f2 * 0.6662F) * 0.2F));
            bipedRightArm.rotationPointX = -1F;
            bipedRightArm.setRotateAngleX(0.0F);
            bipedRightArm.setRotateAngleY(0.0F);
            bipedRightArm.setRotateAngleZ(0.0F);
            bipedRightArm.setVisible(false);
            Rightarm1.setVisible(true);
            Rightarm2.setVisible(true);
            Rightarm1.rotationPointX = Rightarm2.rotationPointX = 3.0F;
            Rightarm1.rotationPointY = Rightarm2.rotationPointY = mh_sin(f2 * 0.05F) * 0.2F - 1.0F;
            bipedLeftArm.setVisible(false);
            Leftarm1.setVisible(true);
            Leftarm2.setVisible(true);
            Leftarm1.rotationPointX = Leftarm2.rotationPointX = -3.0F;
            Leftarm1.rotationPointY = Leftarm2.rotationPointY = mh_sin(f2 * 0.05F) * 0.2F - 1.0F;
        }
        bipedOuter.rotateAngleY = 0.0F;
        if(aimedBow)
        {
            eyeR.setVisible(false);
        } else
        {
            eyeR.setVisible(true);
            //eyeL.rotationPointY = eyeR.rotationPointY = -2.5F;
        }
        //eyeL.rotationPointX = -2F;
        //eyeR.rotationPointX = 2.0F;
        //eyeL.rotationPointZ = eyeR.rotationPointZ = 0.0F;
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

    public float getWidth()
    {
        return 0.8F;
    }

	public Modchu_ModelRotationRenderer getBipedRightArm() {
		if (getHandedness() == 0) {
			if(isWait && !aimedBow) {
				return Rightarm1;
			} else {
				return bipedRightArm;
			}
		} else {
			if(isWait && !aimedBow) {
				return Leftarm1;
			} else {
				return bipedLeftArm;
			}
		}
	}

    public Modchu_ModelRotationRenderer getNotDominantArm() {
		if (getHandedness() == 1) {
			if(isWait && !aimedBow) {
				return Rightarm1;
			} else {
				return bipedRightArm;
			}
		} else {
			if(isWait && !aimedBow) {
				return Leftarm1;
			} else {
				return bipedLeftArm;
			}
		}
    }

	public void equippedBlockPosition() {
		if(isWait && !aimedBow)
		{
			GL11.glTranslatef(0.3F, 0.0F, -0.2F);
		} else {
			GL11.glTranslatef(0.0F, 0.25F, -0.2F);
		}
	}

    public void equippedItemPosition3D() {
		if(isWait && !aimedBow)
		{
			//GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
			//GL11.glRotatef(-20F, 0.0F, 1.0F, 0.0F);
			GL11.glTranslatef(0.2F, 0.0F, 0.0F);
		} else {
			GL11.glTranslatef(0.02F, 0.13F, 0.0F);
		}
	}

	public void equippedItemPosition() {
		if(isWait && !aimedBow)
		{
			GL11.glTranslatef(0.3F, 0.0F, -0.0875F);
		} else {
			GL11.glTranslatef(0.2F, 0.08F, -0.0875F);
		}
	}

	public void equippedItemBow() {
		//equippedItemPosition3D();
		if(isWait && !aimedBow)
		{
			GL11.glTranslatef(-0.05F, 0.1F, 0.3125F);
		} else {
			GL11.glTranslatef(-0.05F, 0.1F, 0.3125F);
		}
	}
}
