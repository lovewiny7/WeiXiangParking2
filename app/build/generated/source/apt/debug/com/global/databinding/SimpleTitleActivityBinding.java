package com.global.databinding;
import com.global.R;
import com.global.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SimpleTitleActivityBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_title_bar, 4);
        sViewsWithIds.put(R.id.tv_left_one, 5);
        sViewsWithIds.put(R.id.tv_title, 6);
        sViewsWithIds.put(R.id.line_title, 7);
    }
    // views
    @NonNull
    public final android.widget.ImageView ivBack;
    @NonNull
    public final android.widget.ImageView ivRightOne;
    @NonNull
    public final android.view.View lineTitle;
    @NonNull
    public final android.widget.LinearLayout llRoot;
    @NonNull
    public final android.widget.RelativeLayout llTitleBar;
    @NonNull
    public final android.widget.TextView tvLeftOne;
    @NonNull
    public final android.widget.TextView tvRightOne;
    @NonNull
    public final android.widget.TextView tvTitle;
    // variables
    @Nullable
    private android.view.View.OnClickListener mClick;
    @Nullable
    private java.lang.String mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SimpleTitleActivityBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.ivBack = (android.widget.ImageView) bindings[1];
        this.ivBack.setTag(null);
        this.ivRightOne = (android.widget.ImageView) bindings[2];
        this.ivRightOne.setTag(null);
        this.lineTitle = (android.view.View) bindings[7];
        this.llRoot = (android.widget.LinearLayout) bindings[0];
        this.llRoot.setTag(null);
        this.llTitleBar = (android.widget.RelativeLayout) bindings[4];
        this.tvLeftOne = (android.widget.TextView) bindings[5];
        this.tvRightOne = (android.widget.TextView) bindings[3];
        this.tvRightOne.setTag(null);
        this.tvTitle = (android.widget.TextView) bindings[6];
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
        if (BR.click == variableId) {
            setClick((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((java.lang.String) variable);
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
    public void setViewModel(@Nullable java.lang.String ViewModel) {
        this.mViewModel = ViewModel;
    }
    @Nullable
    public java.lang.String getViewModel() {
        return mViewModel;
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

        if ((dirtyFlags & 0x5L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.ivBack.setOnClickListener(click);
            this.ivRightOne.setOnClickListener(click);
            this.tvRightOne.setOnClickListener(click);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static SimpleTitleActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SimpleTitleActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<SimpleTitleActivityBinding>inflate(inflater, com.global.R.layout.simple_title_activity, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static SimpleTitleActivityBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SimpleTitleActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.global.R.layout.simple_title_activity, null, false), bindingComponent);
    }
    @NonNull
    public static SimpleTitleActivityBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SimpleTitleActivityBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/simple_title_activity_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new SimpleTitleActivityBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): click
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}