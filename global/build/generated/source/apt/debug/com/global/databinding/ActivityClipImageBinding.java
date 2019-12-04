package com.global.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityClipImageBinding extends ViewDataBinding {
    @NonNull
    public final com.global.takephoto.view.ClipViewLayout clipViewLayout1;
    @NonNull
    public final com.global.takephoto.view.ClipViewLayout clipViewLayout2;
    @NonNull
    public final android.widget.ImageView ivBack;
    @NonNull
    public final android.widget.TextView stockName;
    @NonNull
    public final android.widget.TextView tvOk;
    // variables
    protected java.lang.String mContent;
    protected android.view.View.OnClickListener mClick;
    protected ActivityClipImageBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , com.global.takephoto.view.ClipViewLayout clipViewLayout11
        , com.global.takephoto.view.ClipViewLayout clipViewLayout21
        , android.widget.ImageView ivBack1
        , android.widget.TextView stockName1
        , android.widget.TextView tvOk1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.clipViewLayout1 = clipViewLayout11;
        this.clipViewLayout2 = clipViewLayout21;
        this.ivBack = ivBack1;
        this.stockName = stockName1;
        this.tvOk = tvOk1;
    }
    //getters and abstract setters
    public abstract void setContent(@Nullable java.lang.String Content);
    @Nullable
    public java.lang.String getContent() {
        return mContent;
    }
    public abstract void setClick(@Nullable android.view.View.OnClickListener Click);
    @Nullable
    public android.view.View.OnClickListener getClick() {
        return mClick;
    }
    @NonNull
    public static ActivityClipImageBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClipImageBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClipImageBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static ActivityClipImageBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ActivityClipImageBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ActivityClipImageBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}