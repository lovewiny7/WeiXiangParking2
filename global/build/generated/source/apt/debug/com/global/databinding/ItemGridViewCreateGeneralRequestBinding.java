package com.global.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemGridViewCreateGeneralRequestBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.Button btDel;
    @NonNull
    public final android.widget.ImageView ivImage;
    // variables
    protected android.view.View.OnClickListener mClick;
    protected java.lang.String mViewmodel;
    protected ItemGridViewCreateGeneralRequestBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.Button btDel1
        , android.widget.ImageView ivImage1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.btDel = btDel1;
        this.ivImage = ivImage1;
    }
    //getters and abstract setters
    public abstract void setClick(@Nullable android.view.View.OnClickListener Click);
    @Nullable
    public android.view.View.OnClickListener getClick() {
        return mClick;
    }
    public abstract void setViewmodel(@Nullable java.lang.String Viewmodel);
    @Nullable
    public java.lang.String getViewmodel() {
        return mViewmodel;
    }
    @NonNull
    public static ItemGridViewCreateGeneralRequestBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGridViewCreateGeneralRequestBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGridViewCreateGeneralRequestBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static ItemGridViewCreateGeneralRequestBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ItemGridViewCreateGeneralRequestBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ItemGridViewCreateGeneralRequestBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}