package in.goals.databinding;
import in.goals.R;
import in.goals.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentGoalListBindingImpl extends FragmentGoalListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar_container, 3);
        sViewsWithIds.put(R.id.toolbar, 4);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGoalListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentGoalListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            );
        this.goalList.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((in.goals.viewmodels.GoalListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable in.goals.viewmodels.GoalListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDisplayMessage((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelMessage((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDisplayMessage(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelDisplayMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMessage(androidx.databinding.ObservableField<java.lang.String> ViewModelMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelDisplayMessageGet = false;
        int viewModelDisplayMessageViewINVISIBLEViewVISIBLE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelDisplayMessage = null;
        boolean viewModelMessageJavaLangObjectNull = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelMessage = null;
        java.lang.String viewModelMessageJavaLangObjectNullViewModelMessageJavaLangStringLoading = null;
        java.lang.Boolean viewModelDisplayMessageGet = null;
        int viewModelDisplayMessageViewVISIBLEViewGONE = 0;
        java.lang.String viewModelMessageGet = null;
        in.goals.viewmodels.GoalListViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayMessage
                        viewModelDisplayMessage = viewModel.getDisplayMessage();
                    }
                    updateRegistration(0, viewModelDisplayMessage);


                    if (viewModelDisplayMessage != null) {
                        // read viewModel.displayMessage.get()
                        viewModelDisplayMessageGet = viewModelDisplayMessage.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.displayMessage.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelDisplayMessageGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDisplayMessageGet);
                if((dirtyFlags & 0xdL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelDisplayMessageGet) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.displayMessage.get()) ? View.INVISIBLE : View.VISIBLE
                    viewModelDisplayMessageViewINVISIBLEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelDisplayMessageGet) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.displayMessage.get()) ? View.VISIBLE : View.GONE
                    viewModelDisplayMessageViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelDisplayMessageGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.message
                        viewModelMessage = viewModel.getMessage();
                    }
                    updateRegistration(1, viewModelMessage);


                    if (viewModelMessage != null) {
                        // read viewModel.message.get()
                        viewModelMessageGet = viewModelMessage.get();
                    }


                    // read viewModel.message.get() != null
                    viewModelMessageJavaLangObjectNull = (viewModelMessageGet) != (null);
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewModelMessageJavaLangObjectNull) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0xeL) != 0) {

                // read viewModel.message.get() != null ? viewModel.message.get() : "loading..."
                viewModelMessageJavaLangObjectNullViewModelMessageJavaLangStringLoading = ((viewModelMessageJavaLangObjectNull) ? (viewModelMessageGet) : ("loading..."));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.goalList.setVisibility(viewModelDisplayMessageViewINVISIBLEViewVISIBLE);
            this.mboundView2.setVisibility(viewModelDisplayMessageViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelMessageJavaLangObjectNullViewModelMessageJavaLangStringLoading);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.displayMessage
        flag 1 (0x2L): viewModel.message
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.displayMessage.get()) ? View.INVISIBLE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.displayMessage.get()) ? View.INVISIBLE : View.VISIBLE
        flag 6 (0x7L): viewModel.message.get() != null ? viewModel.message.get() : "loading..."
        flag 7 (0x8L): viewModel.message.get() != null ? viewModel.message.get() : "loading..."
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.displayMessage.get()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.displayMessage.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}