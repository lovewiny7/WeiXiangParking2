package com.global.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemPopupWindowListBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.TextView itemTextView;
    // variables
    protected android.view.View.OnClickListener mClick;
    protected com.global.bean.Parking mViewModel;
    protected ItemPopupWindowListBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.TextView itemTextView1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.itemTextView = itemTextView1;
    }
    //getters and abstract setters
    public abstract void setClick(@Nullable android.view.View.OnClickListener Click);
    @Nullable
    public android.view.View.OnClickListener getClick() {
        return mClick;
    }
    public abstract void setViewModel(@Nullable com.global.bean.Parking ViewModel);
    @Nullable
    public com.global.bean.Parking getViewModel() {
        return mViewModel;
    }
    @NonNull
    public static ItemPopupWindowListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPopupWindowListBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPopupWindowListBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static ItemPopupWindowListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ItemPopupWindowListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ItemPopupWindowListBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}