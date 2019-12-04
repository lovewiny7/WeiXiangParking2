package com.global.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemHorizontalDataBinding extends ViewDataBinding {
    @NonNull
    public final android.view.View viewProgress;
    // variables
    protected android.view.View.OnClickListener mClick;
    protected com.global.winy7.horizontalchart.bean.HorizontalDataVm mViewModel;
    protected ItemHorizontalDataBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.view.View viewProgress1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.viewProgress = viewProgress1;
    }
    //getters and abstract setters
    public abstract void setClick(@Nullable android.view.View.OnClickListener Click);
    @Nullable
    public android.view.View.OnClickListener getClick() {
        return mClick;
    }
    public abstract void setViewModel(@Nullable com.global.winy7.horizontalchart.bean.HorizontalDataVm ViewModel);
    @Nullable
    public com.global.winy7.horizontalchart.bean.HorizontalDataVm getViewModel() {
        return mViewModel;
    }
    @NonNull
    public static ItemHorizontalDataBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemHorizontalDataBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemHorizontalDataBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static ItemHorizontalDataBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ItemHorizontalDataBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ItemHorizontalDataBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}