package com.global.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class PopSeldateBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.TextView btnCancel;
    @NonNull
    public final android.widget.TextView btnSubmit;
    @NonNull
    public final com.waterbase.widget.pickerview.lib.WheelView options1;
    @NonNull
    public final com.waterbase.widget.pickerview.lib.WheelView options2;
    @NonNull
    public final com.waterbase.widget.pickerview.lib.WheelView options3;
    @NonNull
    public final android.widget.LinearLayout optionspicker;
    // variables
    protected android.view.View.OnClickListener mClick;
    protected PopSeldateBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.TextView btnCancel1
        , android.widget.TextView btnSubmit1
        , com.waterbase.widget.pickerview.lib.WheelView options11
        , com.waterbase.widget.pickerview.lib.WheelView options21
        , com.waterbase.widget.pickerview.lib.WheelView options31
        , android.widget.LinearLayout optionspicker1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.btnCancel = btnCancel1;
        this.btnSubmit = btnSubmit1;
        this.options1 = options11;
        this.options2 = options21;
        this.options3 = options31;
        this.optionspicker = optionspicker1;
    }
    //getters and abstract setters
    public abstract void setClick(@Nullable android.view.View.OnClickListener Click);
    @Nullable
    public android.view.View.OnClickListener getClick() {
        return mClick;
    }
    @NonNull
    public static PopSeldateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PopSeldateBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PopSeldateBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static PopSeldateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static PopSeldateBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static PopSeldateBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}