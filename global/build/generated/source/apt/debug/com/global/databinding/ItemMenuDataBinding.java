package com.global.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemMenuDataBinding extends ViewDataBinding {
    @NonNull
    public final com.global.winy7.view.CustomTextView.RTextView tvMenu;
    // variables
    protected android.view.View.OnClickListener mClick;
    protected java.lang.String mViewModel;
    protected ItemMenuDataBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , com.global.winy7.view.CustomTextView.RTextView tvMenu1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.tvMenu = tvMenu1;
    }
    //getters and abstract setters
    public abstract void setClick(@Nullable android.view.View.OnClickListener Click);
    @Nullable
    public android.view.View.OnClickListener getClick() {
        return mClick;
    }
    public abstract void setViewModel(@Nullable java.lang.String ViewModel);
    @Nullable
    public java.lang.String getViewModel() {
        return mViewModel;
    }
    @NonNull
    public static ItemMenuDataBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemMenuDataBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemMenuDataBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static ItemMenuDataBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ItemMenuDataBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ItemMenuDataBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}