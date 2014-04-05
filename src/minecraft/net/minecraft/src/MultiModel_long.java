package net.minecraft.src;import modchu.lib.characteristic.Modchu_ModelRenderer;import modchu.model.ModchuModel_IModelCaps;public class MultiModel_long extends MultiModel_SR2 {	public Modchu_ModelRenderer longhear;	public Modchu_ModelRenderer kamidome;	public MultiModel_long() {		this(0.0F);	}	public MultiModel_long(float f) {		this(f, 0.0F);	}	public MultiModel_long(float f, float f1) {		this(f, f1, 64, 32);	}	public MultiModel_long(float f, float f1, int i, int j) {		super(f, f1, i, j);	}	@Override	public void initModel(float f, float f1, boolean isAfterInit) {		super.initModel(f, f1, false);		longhear = new Modchu_ModelRenderer(this, 52, 12);		longhear.addBox(-1.5F, -9F, 7F, 3, 17, 3);		longhear.setRotationPoint(0F, 0F, 0F);		kamidome = new Modchu_ModelRenderer(this, 46, 19);		kamidome.addBox(-1F, -7F, 6F, 2, 2, 1);		kamidome.setRotationPoint(0F, 0F, 0F);		kamidome.rotateAngleX = 0.2974289F;		longhear.rotateAngleX = 0.2974289F;		setCapsValue(caps_visible, Tail, false);		setCapsValue(caps_visible, SideTailL, false);		setCapsValue(caps_visible, SideTailR, false);		setCapsValue(caps_visible, ChignonB, false);		if (isAfterInit) afterInit(f, f1);	}	@Override	public void defaultAddChildSetting() {		super.defaultAddChildSetting();		bipedHead.addChild(longhear);		bipedHead.addChild(kamidome);	}	@Override	public void defaultPartsSettingBefore(ModchuModel_IModelCaps entityCaps) {		super.defaultPartsSettingBefore(entityCaps);		String[] s = {				"Tail", "SideTailL", "SideTailR", "ChignonB"		};		setCapsValue(entityCaps, caps_showPartsHideList, (Object) s);	}	@Override	public void showModelSettingReflects(ModchuModel_IModelCaps entityCaps) {		super.showModelSettingReflects(entityCaps);		setCapsValue(caps_visible, Tail, false);		setCapsValue(caps_visible, SideTailL, false);		setCapsValue(caps_visible, SideTailR, false);		setCapsValue(caps_visible, ChignonB, false);	}}