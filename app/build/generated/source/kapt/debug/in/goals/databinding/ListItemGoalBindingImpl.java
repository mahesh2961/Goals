package in.goals.databinding;
import in.goals.R;
import in.goals.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemGoalBindingImpl extends ListItemGoalBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemGoalBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ListItemGoalBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.goalBalance.setTag(null);
        this.goalItemImage.setTag(null);
        this.goalItemTitle.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.goal == variableId) {
            setGoal((in.goals.database.Goal) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGoal(@Nullable in.goals.database.Goal Goal) {
        this.mGoal = Goal;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.goal);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        in.goals.database.Goal goal = mGoal;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String goalGetGoalCompletion = null;
        java.lang.String goalGoalImageURL = null;
        java.lang.String goalName = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (goal != null) {
                    // read goal.getGoalCompletion
                    goalGetGoalCompletion = goal.getGoalCompletion();
                    // read goal.goalImageURL
                    goalGoalImageURL = goal.getGoalImageURL();
                    // read goal.name
                    goalName = goal.getName();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.goalBalance, goalGetGoalCompletion);
            in.goals.adapters.BindingAdaptersKt.bindImageFromUrl(this.goalItemImage, goalGoalImageURL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.goalItemTitle, goalName);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): goal
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}