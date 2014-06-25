package modchu.model.multimodel;import modchu.lib.characteristic.recompileonly.Modchu_ModelRenderer;public class MultiModel_Beverly2 extends MultiModel_Beverly3 {	public MultiModel_Beverly2() {		this(0.0F);	}	public MultiModel_Beverly2(float f) {		this(f, 0.0F);	}	public MultiModel_Beverly2(float f, float f1) {		this(f, f1, 64, 64);	}	public MultiModel_Beverly2(float f, float f1, int i, int j) {		super(f, f1, i, j);	}	@Override	public void initModel(float f, float f1, boolean isAfterInit) {		super.initModel(f, f1, false);		eyeR = new Modchu_ModelRenderer(this);		eyeL = new Modchu_ModelRenderer(this);		shield = new Modchu_ModelRenderer(this);		if (isAfterInit) afterInit(f, f1);	}	@Override	public void defaultAddChildSetting() {		super.defaultAddChildSetting();		bipedHead.removeChild(eyeR);		bipedHead.removeChild(eyeL);		leftArm2.removeChild(shield);	}}