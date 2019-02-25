package `in`.goals.adapters
import `in`.goals.database.Goal
import `in`.goals.databinding.ListItemGoalBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView


/**
 * Adapter to Display Goal List
 */
class GoalsAdapter : ListAdapter<Goal, GoalsAdapter.ViewHolder>(DiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val goal = getItem(position)
        holder.apply {
            bind(createOnClickListener(goal.id), goal)
            itemView.tag = goal
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ListItemGoalBinding.inflate(
                LayoutInflater.from(parent.context), parent, false))
    }

    private fun createOnClickListener(goalId: Int): View.OnClickListener {
        return View.OnClickListener {
         //Onclick
        }
    }

    class ViewHolder(
        private val binding: ListItemGoalBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(listener: View.OnClickListener, item: Goal) {
            binding.apply {
                clickListener = listener
                goal = item
                executePendingBindings()
            }
        }
    }
}

/**
 * checks if List contains same objects after notifyDatasetChange
 */
private class DiffCallback : DiffUtil.ItemCallback<Goal>() {

    override fun areItemsTheSame(oldItem: Goal, newItem: Goal): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Goal, newItem: Goal): Boolean {
        return oldItem == newItem
    }
}