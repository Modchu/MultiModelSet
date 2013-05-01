package net.minecraft.src;

import net.minecraft.move.render.ModelRotationRenderer;

import org.lwjgl.opengl.GL11;

public class MultiModelSmart_DogAngel extends MultiModelSmart {

    public Modchu_ModelRotationRenderer bipedOuter;
    public Modchu_ModelRotationRenderer Body;
    public Modchu_ModelRotationRenderer bipedBreast;
    public Modchu_ModelRotationRenderer bipedNeck;
    public Modchu_ModelRotationRenderer Head;
    public Modchu_ModelRotationRenderer Headwear;
    public Modchu_ModelRotationRenderer bipedRightShoulder;
    public Modchu_ModelRotationRenderer RightArm;
    public Modchu_ModelRotationRenderer bipedLeftShoulder;
    public Modchu_ModelRotationRenderer LeftArm;
    public Modchu_ModelRotationRenderer bipedPelvic;
    public Modchu_ModelRotationRenderer RightLeg;
    public Modchu_ModelRotationRenderer LeftLeg;
	public Modchu_ModelRotationRenderer ChignonR;
	public Modchu_ModelRotationRenderer ChignonL;
	public Modchu_ModelRotationRenderer ChignonB;
	public Modchu_ModelRotationRenderer Tail;
	public Modchu_ModelRotationRenderer SideTailR;
	public Modchu_ModelRotationRenderer SideTailL;
	public Modchu_ModelRotationRenderer Skirt;

	public Modchu_ModelRotationRenderer eyeR;
	public Modchu_ModelRotationRenderer eyeL;
	public Modchu_ModelRotationRenderer EarL1;
	public Modchu_ModelRotationRenderer EarL2;
	public Modchu_ModelRotationRenderer EarR1;
	public Modchu_ModelRotationRenderer EarR2;
	public Modchu_ModelRotationRenderer WingLroot;
	public Modchu_ModelRotationRenderer WingL2;
	public Modchu_ModelRotationRenderer WingL3;
	public Modchu_ModelRotationRenderer WingL4;
	public Modchu_ModelRotationRenderer WingL5;
	public Modchu_ModelRotationRenderer WingL6;
	public Modchu_ModelRotationRenderer WingRroot;
	public Modchu_ModelRotationRenderer WingR2;
	public Modchu_ModelRotationRenderer WingR3;
	public Modchu_ModelRotationRenderer WingR4;
	public Modchu_ModelRotationRenderer WingR5;
	public Modchu_ModelRotationRenderer WingR6;
	public Modchu_ModelRotationRenderer SideTailL2;
	public Modchu_ModelRotationRenderer SideTailR2;
	public Modchu_ModelRotationRenderer Tail2;
	public Modchu_ModelRotationRenderer Bust1;
	public Modchu_ModelRotationRenderer Bust2;
	public Modchu_ModelRotationRenderer Ahoge;
	public Modchu_ModelRotationRenderer Skirt1;
	public Modchu_ModelRotationRenderer Skirt2;
	public Modchu_ModelRotationRenderer Skirt3;
	public Modchu_ModelRotationRenderer Skirt4;
	public Modchu_ModelRotationRenderer Skirt5;
	public Modchu_ModelRotationRenderer Skirt6;
	public Modchu_ModelRotationRenderer Skirt7;
	public Modchu_ModelRotationRenderer Skirt8;
	public Modchu_ModelRotationRenderer Skirt9;
	public Modchu_ModelRotationRenderer Skirt10;
	public Modchu_ModelRotationRenderer Skirt11;
	public Modchu_ModelRotationRenderer Skirt12;
	public Modchu_ModelRotationRenderer Prim;

    public MultiModelSmart_DogAngel(float var1)
    {
        this(var1, Scale, Scale);
    }

    public MultiModelSmart_DogAngel(float var1, int var2, int var3)
    {
        super(var1, var2, var3);

		textureHeight=64;
		textureWidth=64;

        bipedOuter = new Modchu_ModelRotationRenderer(this, -1, -1, (Modchu_ModelRotationRenderer)null);
        bipedOuter.setRotationPoint(0.0F, 4.0F, 0.0F);
        bipedOuter.fadeEnabled = true;

        Body = new Modchu_ModelRotationRenderer(this, 32, 8, bipedOuter);
        Body.addBox(-3F, 0F, -2F, 6, 7, 4, var1);
        Body.setRotationPoint(0F, 0F, 0F);

        bipedBreast = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedBreast.setRotationPoint(0.0F, 4.0F, 0.0F);
        bipedNeck = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedNeck.setRotationPoint(0.0F, 4.0F, 0.0F);

        Head = new Modchu_ModelRotationRenderer(this, 0, 0, bipedNeck);
        Head.setTextureSize(64, 64);
        Head.addBox(-4F, -8F, -4F, 8, 8, 8, var1);
        Head.setRotationPoint(0F, 0F, 0F);

        Headwear = new Modchu_ModelRotationRenderer(this, 24, 0, Head);
        Headwear.addBox(-4F, 0F, 1F, 8, 4, 3, var1);
        Headwear.setRotationPoint(0F, 0F, 0F);

        bipedRightShoulder = new Modchu_ModelRotationRenderer(this, 40, 16, bipedBreast);
        bipedRightShoulder.addBox(-3.0F, -2.0F, -2.0F, 8, 8, 8, var1);
        bipedRightShoulder.setRotationPoint(-1.5F, 9.5F, 0.0F);

        RightArm = new Modchu_ModelRotationRenderer(this, 48, 0, bipedRightShoulder);
        RightArm.addBox(-2.0F, -1F, -1F, 2, 8, 2, var1);
        RightArm.setRotationPoint(-3.0F, 1.5F, 0F);

        bipedLeftShoulder = new Modchu_ModelRotationRenderer(this, -1, -1, bipedBreast);
        bipedLeftShoulder.mirror = true;
        bipedLeftShoulder.setRotationPoint(1.5F, 9.5F, 0.0F);

        LeftArm = new Modchu_ModelRotationRenderer(this, 56, 0, bipedLeftShoulder);
        LeftArm.addBox(0.0F, -1F, -1F, 2, 8, 2, var1);
        LeftArm.setRotationPoint(3.0F, 1.5F, 0F);

        bipedPelvic = new Modchu_ModelRotationRenderer(this, -1, -1, Body);
        bipedPelvic.setRotationPoint(0.0F, 10.0F, 0.0F);

        RightLeg = new Modchu_ModelRotationRenderer(this, 32, 19, bipedPelvic);
        RightLeg.addBox(-2F, 0F, -2F, 3, 9, 4, var1);
        RightLeg.setRotationPoint(-1F, 7F, 0F);

        LeftLeg = new Modchu_ModelRotationRenderer(this, 32, 19, bipedPelvic);
        LeftLeg.mirror = true;
        LeftLeg.addBox(-1F, 0F, -2F, 3, 9, 4, var1);
        LeftLeg.setRotationPoint(1F, 7F, 0F);

        scaleArmType = var2;
        scaleLegType = var3;

        Skirt = new Modchu_ModelRotationRenderer(this, 0, 16, Body);
        Skirt.setRotationPoint(0F, 7F, 0F);

        ChignonR = new Modchu_ModelRotationRenderer(this, 24, 18, Head);
        ChignonR.addBox(-5F, -7F, 0.2F, 1, 3, 3, var1);
        ChignonR.setRotationPoint(0F, 0F, 0F);

        ChignonL = new Modchu_ModelRotationRenderer(this, 24, 18, Head);
        ChignonL.addBox(4F, -7F, 0.2F, 1, 3, 3, var1);
        ChignonL.setRotationPoint(0F, 0F, 0F);

        ChignonB = new Modchu_ModelRotationRenderer(this, 52, 10, Head);
        ChignonB.addBox(-2F, -7.2F, 4F, 4, 4, 2, var1);
        ChignonB.setRotationPoint(0F, 0F, 0F);

        Tail = new Modchu_ModelRotationRenderer(this, 46, 20, Head);
        Tail.addBox(-1.5F, -6.8F, 4F, 3, 9, 3, var1);
        Tail.setRotationPoint(0F, 0F, 0F);

		eyeR = new Modchu_ModelRotationRenderer(this, 32, 19, Head);
		eyeR.addPlate(-4.0F, -5.0F, -4.001F, 4, 4, 0, var1);
		eyeR.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyeL = new Modchu_ModelRotationRenderer(this, 42, 19, Head);
		eyeL.addPlate(0.0F, -5.0F, -4.001F, 4, 4, 0, var1);
		eyeL.setRotationPoint(0.0F, 0.0F, 0.0F);

		Prim = new Modchu_ModelRotationRenderer(this, 24, 16, Head);
        Prim.addBoxLM(-2F, -8.7F, -3.5F, 4, 1, 0, var1);
        Prim.setRotationPoint(0.0F, 0.0F, 0.0F);

		ChignonR = new Modchu_ModelRotationRenderer(this, 24, 18, Head);
		ChignonR.addBoxLM(-5F, -7F, 0.2F, 1, 3, 3, var1);
		ChignonR.setRotationPoint(0F, 0F, 0F);

		ChignonL = new Modchu_ModelRotationRenderer(this, 24, 24, Head);
		ChignonL.addBoxLM(4F, -7F, 0.2F, 1, 3, 3,var1);
		ChignonL.setRotationPoint(0F, 0F, 0F);

		ChignonB = new Modchu_ModelRotationRenderer(this, 52, 10, Head);
		ChignonB.addBoxLM(-2F, -7.2F, 4F, 4, 4, 2,var1);
		ChignonB.setRotationPoint(0F, 0F, 0F);

		EarL1 = new Modchu_ModelRotationRenderer(this, 0, 20, Head);
		EarL1.addBoxLM(-0.9F, 0.5F, -4.5F, 5, 4, 4,var1);
		EarL1.setRotationPoint(0F, 0F, 0F);
		EarL1.setRotationPointLM(0F,0F,0F);

		EarL2 = new Modchu_ModelRotationRenderer(this, 0, 28, Head);
		EarL2.addBoxLM(2.7F, -3.2F, 2.2F, 1, 3, 1,var1);
		EarL2.setRotationPoint(0F, 0F, 0F);

		EarR1 = new Modchu_ModelRotationRenderer(this, 0, 20, Head);
		EarR1.addBoxLM(-0.8F, 0.5F, -4.5F, 5, 4, 4,var1);
		EarR1.setRotationPoint(0F, 0F, 0F);
		EarR1.mirror=true;

		EarR2 = new Modchu_ModelRotationRenderer(this, 0, 28, Head);
		EarR2.addBoxLM(-3.5F, -3.2F, -3.5F, 1, 3, 1,var1);
		EarR2.setRotationPoint(0F, 0F, 0F);

		WingLroot = new Modchu_ModelRotationRenderer(this, 0, 0, Body);
		WingLroot.addBoxLM(-0.5F, 0F, -0.5F, 1, 3, 1,var1);
		WingLroot.setRotationPoint(0.4F, 2.5F, 1.2F);
		WingLroot.setTextureSize(64,48);

		WingL2 = new Modchu_ModelRotationRenderer(this, 0, 0, WingLroot);
		WingL2.addBoxLM(-2.4F, 2F, -0.4F, 1, 4, 1,var1);
		WingL2.setRotationPointLM(4.2F, 7.1F, -0.17F);

		WingL3 = new Modchu_ModelRotationRenderer(this, 0, 0, WingLroot);
		WingL3.addBoxLM(4.5F, 2.5F, 1.3F, 1, 3, 1,var1);
		WingL3.setRotationPointLM(-1.1F, 0.1F, 0.0F);

		WingL4 = new Modchu_ModelRotationRenderer(this, 0, 0, WingLroot);
		WingL4.addBoxLM(3.5F, 2F, 1.3F, 1, 3, 1,var1);
		WingL4.setRotationPointLM(-1.1F, 0.1F, 0.0F);

		WingL5 = new Modchu_ModelRotationRenderer(this, 0, 0, WingLroot);
		WingL5.addBoxLM(2.5F, 2F, 1.3F, 1, 2, 1,var1);
		WingL5.setRotationPointLM(-1.1F, 0.1F, 0.0F);

		WingL6 = new Modchu_ModelRotationRenderer(this, 0, 0, WingLroot);
		WingL6.addBoxLM(1.8F, 1.5F, 1.3F, 1, 1, 1,var1);
		WingL6.setRotationPointLM(-1.1F, 0.1F, 0.0F);

		WingRroot = new Modchu_ModelRotationRenderer(this, 0, 0, Body);
		WingRroot.addBoxLM(-0.5F, 0F, -0.5F, 1, 3, 1,var1);
		WingRroot.setRotationPoint(-0.5F, 2.5F, 1.2F);

		WingR2 = new Modchu_ModelRotationRenderer(this, 0, 0, WingRroot);
		WingR2.addBoxLM(1.4F, 2F, -0.4F, 1, 4, 1,var1);
		WingR2.setRotationPointLM(2.9F, 3.3F, 0.13F);

		WingR3 = new Modchu_ModelRotationRenderer(this, 0, 0, WingRroot);
		WingR3.addBoxLM(-5.5F, 2.5F, 1.3F, 1, 3, 1,var1);
		WingR3.setRotationPointLM(1.15F, 0.1F, 0.17F);

		WingR4 = new Modchu_ModelRotationRenderer(this, 0, 0, WingRroot);
		WingR4.addBoxLM(-4.5F, 2F, 1.3F, 1, 3, 1,var1);
		WingR4.setRotationPointLM(1.15F, 0.1F, 0.17F);

		WingR5 = new Modchu_ModelRotationRenderer(this, 0, 0, WingRroot);
		WingR5.addBoxLM(-3.5F, 2F, 1.3F, 1, 2, 1,var1);
		WingR5.setRotationPointLM(1.15F, 0.1F, 0.17F);

		WingR6 = new Modchu_ModelRotationRenderer(this, 0, 0, WingRroot);
		WingR6.addBoxLM(-2.8F, 1.5F, 1.3F, 1, 1, 1,var1);
		WingR6.setRotationPointLM(1.15F, 0.1F, 0.17F);

		SideTailL = new Modchu_ModelRotationRenderer(this, 46, 26, Head);
		SideTailL.addBoxLM(4.7F, -6F, 1F, 1, 1, 1,var1+0.2F);
		SideTailL.setRotationPoint(0F, 0F, 0F);

		SideTailL2 = new Modchu_ModelRotationRenderer(this, 46, 26, Head);
		SideTailL2.addBoxLM(5.1F, -6F, 1F, 1, 5, 1,var1);
		SideTailL2.setRotationPoint(0F, 0F, 0F);

		SideTailR = new Modchu_ModelRotationRenderer(this, 50, 26, Head);
		SideTailR.addBoxLM(-5.7F, -6F, 1F, 1, 1, 1,var1+0.2F);
		SideTailR.setRotationPoint(0F, 0F, 0F);

		SideTailR2 = new Modchu_ModelRotationRenderer(this, 50, 26, Head);
		SideTailR2.addBoxLM(-6.1F, -6F, 1F, 1, 5, 1,var1);
		SideTailR2.setRotationPoint(0F, 0F, 0F);

		Tail = new Modchu_ModelRotationRenderer(this, 46, 19, Head);
		Tail.addBoxLM(-1F, -6F, 6.F, 2, 2, 2,var1+0.1F);
		Tail.setRotationPoint(0F, 0F, 0F);

		Tail2 = new Modchu_ModelRotationRenderer(this, 46, 19, Head);
		Tail2.addBoxLM(-1F, -4F, 6.1F, 2, 5, 2,var1);
		Tail2.setRotationPoint(0F, 0F, 0F);

		Bust1 = new Modchu_ModelRotationRenderer(this, 54, 28, Body);
		Bust1.addBoxLM(0F, 0F, 0F, 4, 2, 2,var1);
		Bust1.setRotationPoint(-2F, 0F, -1.5F);
		setRotation(Bust1, -0.4363323F, 0F, 0F);

		Bust2 = new Modchu_ModelRotationRenderer(this, 54, 28, Body);
		Bust2.addBoxLM(0F, 0F, 0F, 4, 2, 2,var1);
		Bust2.setRotationPoint(-2F, 0.9F, -0.5F);
		setRotation(Bust2, -1.134464F, 0F, 0F);

		Ahoge = new Modchu_ModelRotationRenderer(this, 0, 1, Head);
		Ahoge.addBoxLM(0F, 0F, 0F, 0, 3, 4,var1);
		Ahoge.setRotationPoint(0F, -8F, -4F);

		Skirt.isHidden=true;

		Skirt1 = new Modchu_ModelRotationRenderer(this, -1, 16, Skirt);
		Skirt1.addBoxLM(0F, 0F, 0F, 6, 2, 2,var1);
		Skirt1.setRotationPoint(2.4F,-3F,-0.6F);

		Skirt2 = new Modchu_ModelRotationRenderer(this, -1, 16, Skirt);
		Skirt2.addBoxLM(0F, 0F, 0F, 6, 2, 2,var1);
		Skirt2.setRotationPoint(2F,-3F,-1.2F);

		Skirt3 = new Modchu_ModelRotationRenderer(this, -3, 16, Skirt);
		Skirt3.addBoxLM(0F, 0F, 0F, 8, 2, 2,var1);
		Skirt3.setRotationPoint(0F,-4F,0F);

		Skirt4 = new Modchu_ModelRotationRenderer(this, -3, 16, Skirt);
		Skirt4.addBoxLM(0F, 0F, 0F, 8, 2, 2,var1);
		Skirt4.setRotationPoint(0F,-4F,0F);

		Skirt5 = new Modchu_ModelRotationRenderer(this, -1, 16, Skirt);
		Skirt5.addBoxLM(0F, 0F, 0F, 6, 2, 2,var1);
		Skirt5.setRotationPoint(-2F,-3F,-1.2F);

		Skirt6 = new Modchu_ModelRotationRenderer(this, -1, 16, Skirt);
		Skirt6.addBoxLM(0F, 0F, 0F, 6, 2, 2,var1);
		Skirt6.setRotationPoint(-2.4F, -3F, -0.6F);

		Skirt7 = new Modchu_ModelRotationRenderer(this, -1, 16, Skirt);
		Skirt7.addBoxLM(0F, 0F, 0F, 6, 2, 2,var1);
		Skirt7.setRotationPoint(-2.4F,-3F,0.6F);

		Skirt8 = new Modchu_ModelRotationRenderer(this, -1, 16, Skirt);
		Skirt8.addBoxLM(0F, 0F, 0F, 6, 2, 2,var1);
		Skirt8.setRotationPoint(-2F,-3F,1.2F);

		Skirt9 = new Modchu_ModelRotationRenderer(this,-3, 16, Skirt);
		Skirt9.addBoxLM(0F, 0F, 0F, 8, 2, 2,var1);
		Skirt9.setRotationPoint(0F,-4F,0F);

		Skirt10 = new Modchu_ModelRotationRenderer(this, -3, 16, Skirt);
		Skirt10.addBoxLM(0F, 0F, 0F, 8, 2, 2,var1);
		Skirt10.setRotationPoint(0F,-4F,0F);

		Skirt11 = new Modchu_ModelRotationRenderer(this, -1, 16, Skirt);
		Skirt11.addBoxLM(0F, 0F, 0F, 6, 2, 2,var1);
		Skirt11.setRotationPoint(2F,-3F,1.2F);

		Skirt12 = new Modchu_ModelRotationRenderer(this, -1, 16, Skirt);
		Skirt12.addBoxLM(0F, 0F, 0F,  6, 2, 2,var1);
		Skirt12.setRotationPoint(2.4F,-3F,0.6F);

		Skirt1.rotationOrder = Modchu_ModelRotationRenderer.XZY;
		Skirt2.rotationOrder = Modchu_ModelRotationRenderer.XZY;
		Skirt3.rotationOrder = Modchu_ModelRotationRenderer.XZY;
		Skirt4.rotationOrder = Modchu_ModelRotationRenderer.XZY;
		Skirt5.rotationOrder = Modchu_ModelRotationRenderer.XZY;
		Skirt6.rotationOrder = Modchu_ModelRotationRenderer.XZY;
		Skirt7.rotationOrder = Modchu_ModelRotationRenderer.XZY;
		Skirt8.rotationOrder = Modchu_ModelRotationRenderer.XZY;
		Skirt9.rotationOrder = Modchu_ModelRotationRenderer.XZY;
		Skirt10.rotationOrder = Modchu_ModelRotationRenderer.XZY;
		Skirt11.rotationOrder = Modchu_ModelRotationRenderer.XZY;
		Skirt12.rotationOrder = Modchu_ModelRotationRenderer.XZY;

		setRotation(EarL1, 0.7853982F, 0F, -2.1293016F);
		setRotation(EarL2, 0.1570796F, 0.7853982F, -0.1570796F);
		setRotation(EarR1, 0.7853982F, 3.174172F, 2.1293016F);
		setRotation(EarR2, -0.1570796F, 0.7853982F, 0.1570796F);

		WingR2.rotateAngleX = 3.141593F;
		WingR2.rotateAngleY = 0.0F;
		WingR2.rotateAngleZ = -2.0644969F;
		WingR3.rotateAngleX = 4.697096F;
		WingR3.rotateAngleY = 0.495F;
		WingR3.rotateAngleZ = -0.495F;
		WingR6.rotateAngleX = WingR5.rotateAngleX = WingR4.rotateAngleX = WingR3.rotateAngleX;
		WingR6.rotateAngleY = WingR5.rotateAngleY = WingR4.rotateAngleY = WingR3.rotateAngleY;
		WingR6.rotateAngleZ = WingR5.rotateAngleZ = WingR4.rotateAngleZ = WingR3.rotateAngleZ;

		WingL2.rotateAngleX = 0.0F;
		WingL2.rotateAngleY = 0.0F;
		WingL2.rotateAngleZ = 2.0644969F;
		WingL3.rotateAngleX = 4.697096F;
		WingL3.rotateAngleY = -0.495F;
		WingL3.rotateAngleZ = 0.495F;
		WingL6.rotateAngleX = WingL5.rotateAngleX = WingL4.rotateAngleX = WingL3.rotateAngleX;
		WingL6.rotateAngleY = WingL5.rotateAngleY = WingL4.rotateAngleY = WingL3.rotateAngleY;
		WingL6.rotateAngleZ = WingL5.rotateAngleZ = WingL4.rotateAngleZ = WingL3.rotateAngleZ;

		setRotation(Skirt1, -0.7853982F, 0.2268928F, 0.8203047F);
		setRotation(Skirt2, -0.7853982F, 0.9075712F, 0.8203047F);
      	setRotation(Skirt3, -0.7853982F, 1.308997F, 0.715585F);
      	setRotation(Skirt4, -0.7853982F, 1.832596F, 0.715585F);
      	setRotation(Skirt5, -0.7853982F, 2.181662F, 0.8203047F);
      	setRotation(Skirt6, -0.7853982F, 2.844887F, 0.8203047F);
     	setRotation(Skirt7, -0.7853982F, -2.941752F, 0.8203047F);
      	setRotation(Skirt8, -0.7853982F, -2.275037F, 0.8203047F);
      	setRotation(Skirt9, -0.7853982F, -1.885828F, 0.715585F);
      	setRotation(Skirt10, -0.7853982F, -1.33954F, 0.715585F);
      	setRotation(Skirt11, -0.7853982F, -0.9677851F, 0.8203047F);
      	setRotation(Skirt12, -0.7853982F, -0.299324F, 0.8203047F);

        bipedRightArm = RightArm;
        bipedLeftArm = LeftArm;
        bipedRightLeg = RightLeg;
        bipedLeftLeg = LeftLeg;
        bipedBody = Body;
        bipedHead = Head;
        bipedHeadwear = Headwear;
        super.bipedOuter = bipedOuter;
        super.bipedBreast = bipedBreast;
        super.bipedNeck = bipedNeck;
        super.bipedRightShoulder = bipedRightShoulder;
        super.bipedLeftShoulder = bipedLeftShoulder;
        super.bipedPelvic = bipedPelvic;

        ((Modchu_ModelRotationRenderer) HeadMount).base = Head;
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
        setRotationAngles(f, f1, f2, f3, f4, f5);
        Head.render(f5);
        Body.render(f5);
        RightArm.render(f5);
        LeftArm.render(f5);
        RightLeg.render(f5);
        LeftLeg.render(f5);
        Headwear.render(f5);
		if (Head.showModel) {
			ChignonB.render(f5);
			ChignonR.render(f5);
			ChignonL.render(f5);
			SideTailR.render(f5);
			SideTailL.render(f5);
			Tail.render(f5);
			Ahoge.render(f5);
			EarL1.render(f5);
			EarL2.render(f5);
			EarR1.render(f5);
			EarR2.render(f5);
			Prim.render(f5);
			SideTailL2.render(f5);
			SideTailR2.render(f5);
			Tail2.render(f5);
			eyeR.preRotateRender(f5);
			eyeL.preRotateRender(f5);
		}
		if (Body.showModel) {
			Bust1.render(f5);
			WingLroot.render(f5);
			WingL2.render(f5);
			WingL3.render(f5);
			WingL4.render(f5);
			WingL5.render(f5);
			WingL6.render(f5);
			WingRroot.render(f5);
			WingR2.render(f5);
			WingR3.render(f5);
			WingR4.render(f5);
			WingR5.render(f5);
			WingR6.render(f5);
		}
		if (Skirt.showModel) {
			Skirt.render(f5);
			Skirt1.render(f5);
			Skirt2.render(f5);
			Skirt3.render(f5);
			Skirt4.render(f5);
			Skirt5.render(f5);
			Skirt6.render(f5);
			Skirt7.render(f5);
			Skirt8.render(f5);
			Skirt9.render(f5);
			Skirt10.render(f5);
			Skirt11.render(f5);
			Skirt12.render(f5);
		}
		GL11.glPushMatrix();
		HeadMount.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		for(int i = 0; i < Arms.length
				&& Arms[i] != null; i++) {
			((Modchu_ModelRotationRenderer) Arms[i]).base = getBipedRightArm();
			Arms[i].render(f5);
		}
		GL11.glPopMatrix();
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
        if (!firstPerson && !isInventory)
        {
		WingLroot.rotateAngleX=2.070796313F;
		WingRroot.rotateAngleX=2.070796313F;
		WingLroot.rotateAngleY=MathHelper.cos(f2 * 0.5F) * 0.22F + 0.35F;
		WingRroot.rotateAngleY=-WingLroot.rotateAngleY;

		Ahoge.rotateAngleY=MathHelper.cos(f2 * 0.2F + MathHelper.cos(f2*0.05F) * 1.0F) * 0.2F;
		Ahoge.rotateAngleX=2.9F;
    	Skirt.rotationPointY = 7.0F;
		if (isCrawl)
        {
            //Modchu_Debug.mDebug("isCrawl");
        	Skirt.rotationPointY = 4.8F;
        	Skirt.rotateAngleX = -0.3F;
        } else {
        	Skirt.rotateAngleX = 0.0F;
        }
		if (aimedBow) {
			eyeL.showModel = true;
			eyeR.showModel = false;
			WingLroot.rotateAngleX= 0.5F;
			WingRroot.rotateAngleX= 0.5F;
			WingLroot.rotateAngleY= -0.65F;
			WingRroot.rotateAngleY= 0.65F;
		}
    	if (isSneak && !isAngleJumping) {
        	Skirt.rotateAngleX = -0.3F;
            Skirt.rotationPointY = 6.5F;
            Skirt.rotationPointZ = -1.0F;
            if (isRiding)
            {
                //
                bipedOuter.rotationPointY = 1.0F;
                Head.rotationPointY = 7.0F;
                Skirt.rotationPointY = 5.0F;
            }
    	} else {
            if (isRiding)
            {
                //
                bipedOuter.rotationPointY = 7.0F;
                Head.rotationPointY = 7.0F;
                Skirt.rotationPointY = 6.0F;
            }
        }
        } else {
    		bipedRightLeg.setRotationPoint(-1.0F, 15.0F, 0.0F);
    		bipedLeftLeg.setRotationPoint(1.0F, 15.0F, 0.0F);
    	}
	}

	private void setRotation(Modchu_ModelRotationRenderer model, float x, float y, float z)
  	{
		model.rotateAngleX=x;
		model.rotateAngleY=y;
		model.rotateAngleZ=z;
  	}

    public void reset()
    {
    	super.reset();
        bipedPelvic.setRotationPoint(0.0F, 12.0F, 0.0F);
        RightLeg.setRotationPoint(-1.0F, -6.0F, 0.0F);
        LeftLeg.setRotationPoint(1.0F, -6.0F, 0.0F);
    }

    @Override
    public void defaultPartsSettingBefore() {
    	super.defaultPartsSettingBefore();
    	String[] s = {
    			"Skirt1", "Skirt2", "Skirt3", "Skirt4", "Skirt5",
    			"Skirt6", "Skirt7", "Skirt8", "Skirt9", "Skirt10",
    			"Skirt11", "Skirt12"
    	};
    	showPartsHideListadd(s);
    }

    public ModelRotationRenderer getBipedRightArm() {
    	if (getHandedness() == 0) return RightArm;
    	return LeftArm;
    }

    public ModelRotationRenderer getNotDominantArm() {
    	if (getHandedness() == 0) return LeftArm;
    	return RightArm;
    }

}
