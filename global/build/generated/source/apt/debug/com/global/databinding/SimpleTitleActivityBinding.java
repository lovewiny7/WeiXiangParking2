package com.global.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class SimpleTitleActivityBinding extends ViewDataBinding {
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
    protected android.view.View.OnClickListener mClick;
    protected java.lang.String mViewModel;
    protected SimpleTitleActivityBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.ImageView ivBack1
        , android.widget.ImageView ivRightOne1
        , android.view.View lineTitle1
        , android.widget.LinearLayout llRoot1
        , android.widget.RelativeLayout llTitleBar1
        , android.widget.TextView tvLeftOne1
        , android.widget.TextView tvRightOne1
        , android.widget.TextView tvTitle1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.ivBack = ivBack1;
        this.ivRightOne = ivRightOne1;
        this.lineTitle = lineTitle1;
        this.llRoot = llRoot1;
        this.llTitleBar = llTitleBar1;
        this.tvLeftOne = tvLeftOne1;
        this.tvRightOne = tvRightOne1;
        this.tvTitle = tvTitle1;
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
    public static SimpleTitleActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SimpleTitleActivityBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SimpleTitleActivityBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static SimpleTitleActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static SimpleTitleActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static SimpleTitleActivityBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}