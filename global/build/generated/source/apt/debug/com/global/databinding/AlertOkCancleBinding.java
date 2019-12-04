package com.global.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class AlertOkCancleBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.LinearLayout llBtn;
    @NonNull
    public final com.global.winy7.view.CustomTextView.RTextView tvCancel;
    @NonNull
    public final com.global.winy7.view.CustomTextView.RTextView tvOk;
    @NonNull
    public final android.widget.TextView tvTitle;
    // variables
    protected android.view.View.OnClickListener mClick;
    protected com.global.winy7.view.customalert.bean.AlertBean mViewModel;
    protected AlertOkCancleBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.LinearLayout llBtn1
        , com.global.winy7.view.CustomTextView.RTextView tvCancel1
        , com.global.winy7.view.CustomTextView.RTextView tvOk1
        , android.widget.TextView tvTitle1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.llBtn = llBtn1;
        this.tvCancel = tvCancel1;
        this.tvOk = tvOk1;
        this.tvTitle = tvTitle1;
    }
    //getters and abstract setters
    public abstract void setClick(@Nullable android.view.View.OnClickListener Click);
    @Nullable
    public android.view.View.OnClickListener getClick() {
        return mClick;
    }
    public abstract void setViewModel(@Nullable com.global.winy7.view.customalert.bean.AlertBean ViewModel);
    @Nullable
    public com.global.winy7.view.customalert.bean.AlertBean getViewModel() {
        return mViewModel;
    }
    @NonNull
    public static AlertOkCancleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AlertOkCancleBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AlertOkCancleBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static AlertOkCancleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static AlertOkCancleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static AlertOkCancleBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}