package com.global.databinding;
import com.global.R;
import com.global.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AlertOkCancleBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_btn, 5);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout llBtn;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    public final com.global.winy7.view.CustomTextView.RTextView tvCancel;
    @NonNull
    public final com.global.winy7.view.CustomTextView.RTextView tvOk;
    @NonNull
    public final android.widget.TextView tvTitle;
    // variables
    @Nullable
    private android.view.View.OnClickListener mClick;
    @Nullable
    private com.global.winy7.view.customalert.bean.AlertBean mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AlertOkCancleBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.llBtn = (android.widget.LinearLayout) bindings[5];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvCancel = (com.global.winy7.view.CustomTextView.RTextView) bindings[3];
        this.tvCancel.setTag(null);
        this.tvOk = (com.global.winy7.view.CustomTextView.RTextView) bindings[4];
        this.tvOk.setTag(null);
        this.tvTitle = (android.widget.TextView) bindings[1];
        this.tvTitle.setTag(null);
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
            setViewModel((com.global.winy7.view.customalert.bean.AlertBean) variable);
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
    public void setViewModel(@Nullable com.global.winy7.view.customalert.bean.AlertBean ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.global.winy7.view.customalert.bean.AlertBean getViewModel() {
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
        java.lang.String viewModelOk = null;
        java.lang.String viewModelMess = null;
        java.lang.String viewModelTitle = null;
        java.lang.String viewModelCancle = null;
        android.view.View.OnClickListener click = mClick;
        com.global.winy7.view.customalert.bean.AlertBean viewModel = mViewModel;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (viewModel != null) {
                    // read viewModel.ok
                    viewModelOk = viewModel.getOk();
                    // read viewModel.mess
                    viewModelMess = viewModel.getMess();
                    // read viewModel.title
                    viewModelTitle = viewModel.getTitle();
                    // read viewModel.cancle
                    viewModelCancle = viewModel.getCancle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelMess);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvCancel, viewModelCancle);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOk, viewModelOk);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, viewModelTitle);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.tvCancel.setOnClickListener(click);
            this.tvOk.setOnClickListener(click);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static AlertOkCancleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AlertOkCancleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AlertOkCancleBinding>inflate(inflater, com.global.R.layout.alert_ok_cancle, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static AlertOkCancleBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AlertOkCancleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.global.R.layout.alert_ok_cancle, null, false), bindingComponent);
    }
    @NonNull
    public static AlertOkCancleBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AlertOkCancleBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/alert_ok_cancle_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AlertOkCancleBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): click
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}