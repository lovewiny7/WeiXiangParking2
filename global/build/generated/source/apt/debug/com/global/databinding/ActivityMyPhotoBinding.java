package com.global.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityMyPhotoBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.GridView gvPhoto;
    @NonNull
    public final android.widget.ImageView ivBackClipImage;
    // variables
    protected java.lang.String mContent;
    protected android.view.View.OnClickListener mClick;
    protected ActivityMyPhotoBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.GridView gvPhoto1
        , android.widget.ImageView ivBackClipImage1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.gvPhoto = gvPhoto1;
        this.ivBackClipImage = ivBackClipImage1;
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
    public static ActivityMyPhotoBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMyPhotoBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMyPhotoBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static ActivityMyPhotoBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ActivityMyPhotoBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ActivityMyPhotoBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}