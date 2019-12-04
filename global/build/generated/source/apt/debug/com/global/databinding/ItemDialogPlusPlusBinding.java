package com.global.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ItemDialogPlusPlusBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.EditText etSearchMaterials;
    @NonNull
    public final android.widget.ImageView iv;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerview;
    @NonNull
    public final android.widget.TextView tvCommit;
    @NonNull
    public final android.widget.TextView tvTitle;
    // variables
    protected java.lang.String mTitle;
    protected ItemDialogPlusPlusBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.EditText etSearchMaterials1
        , android.widget.ImageView iv1
        , android.support.v7.widget.RecyclerView recyclerview1
        , android.widget.TextView tvCommit1
        , android.widget.TextView tvTitle1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.etSearchMaterials = etSearchMaterials1;
        this.iv = iv1;
        this.recyclerview = recyclerview1;
        this.tvCommit = tvCommit1;
        this.tvTitle = tvTitle1;
    }
    //getters and abstract setters
    public abstract void setTitle(@Nullable java.lang.String Title);
    @Nullable
    public java.lang.String getTitle() {
        return mTitle;
    }
    @NonNull
    public static ItemDialogPlusPlusBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemDialogPlusPlusBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemDialogPlusPlusBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static ItemDialogPlusPlusBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ItemDialogPlusPlusBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ItemDialogPlusPlusBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}