package com.global.databinding;
import com.global.R;
import com.global.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityClipImageBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_back, 1);
        sViewsWithIds.put(R.id.stock_name, 2);
        sViewsWithIds.put(R.id.tv_ok, 3);
        sViewsWithIds.put(R.id.clipViewLayout1, 4);
        sViewsWithIds.put(R.id.clipViewLayout2, 5);
    }
    // views
    @NonNull
    public final com.global.takephoto.view.ClipViewLayout clipViewLayout1;
    @NonNull
    public final com.global.takephoto.view.ClipViewLayout clipViewLayout2;
    @NonNull
    public final android.widget.ImageView ivBack;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.widget.TextView stockName;
    @NonNull
    public final android.widget.TextView tvOk;
    // variables
    @Nullable
    private java.lang.String mContent;
    @Nullable
    private android.view.View.OnClickListener mClick;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityClipImageBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.clipViewLayout1 = (com.global.takephoto.view.ClipViewLayout) bindings[4];
        this.clipViewLayout2 = (com.global.takephoto.view.ClipViewLayout) bindings[5];
        this.ivBack = (android.widget.ImageView) bindings[1];
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.stockName = (android.widget.TextView) bindings[2];
        this.tvOk = (android.widget.TextView) bindings[3];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.content == variableId) {
            setContent((java.lang.String) variable);
        }
        else if (BR.click == variableId) {
            setClick((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContent(@Nullable java.lang.String Content) {
        this.mContent = Content;
    }
    @Nullable
    public java.lang.String getContent() {
        return mContent;
    }
    public void setClick(@Nullable android.view.View.OnClickListener Click) {
        this.mClick = Click;
    }
    @Nullable
    public android.view.View.OnClickListener getClick() {
        return mClick;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityClipImageBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClipImageBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityClipImageBinding>inflate(inflater, com.global.R.layout.activity_clip_image, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityClipImageBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClipImageBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.global.R.layout.activity_clip_image, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityClipImageBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClipImageBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_clip_image_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityClipImageBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): content
        flag 1 (0x2L): click
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}