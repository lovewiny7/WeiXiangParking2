package com.global.databinding;
import com.global.R;
import com.global.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PopSeldateBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.optionspicker, 3);
        sViewsWithIds.put(R.id.options1, 4);
        sViewsWithIds.put(R.id.options2, 5);
        sViewsWithIds.put(R.id.options3, 6);
    }
    // views
    @NonNull
    public final android.widget.TextView btnCancel;
    @NonNull
    public final android.widget.TextView btnSubmit;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final com.waterbase.widget.pickerview.lib.WheelView options1;
    @NonNull
    public final com.waterbase.widget.pickerview.lib.WheelView options2;
    @NonNull
    public final com.waterbase.widget.pickerview.lib.WheelView options3;
    @NonNull
    public final android.widget.LinearLayout optionspicker;
    // variables
    @Nullable
    private android.view.View.OnClickListener mClick;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PopSeldateBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.btnCancel = (android.widget.TextView) bindings[1];
        this.btnCancel.setTag(null);
        this.btnSubmit = (android.widget.TextView) bindings[2];
        this.btnSubmit.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.options1 = (com.waterbase.widget.pickerview.lib.WheelView) bindings[4];
        this.options2 = (com.waterbase.widget.pickerview.lib.WheelView) bindings[5];
        this.options3 = (com.waterbase.widget.pickerview.lib.WheelView) bindings[6];
        this.optionspicker = (android.widget.LinearLayout) bindings[3];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.click == variableId) {
            setClick((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClick(@Nullable android.view.View.OnClickListener Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
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
        android.view.View.OnClickListener click = mClick;

        if ((dirtyFlags & 0x3L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.btnCancel.setOnClickListener(click);
            this.btnSubmit.setOnClickListener(click);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static PopSeldateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PopSeldateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<PopSeldateBinding>inflate(inflater, com.global.R.layout.pop_seldate, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static PopSeldateBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PopSeldateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.global.R.layout.pop_seldate, null, false), bindingComponent);
    }
    @NonNull
    public static PopSeldateBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PopSeldateBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/pop_seldate_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new PopSeldateBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): click
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}