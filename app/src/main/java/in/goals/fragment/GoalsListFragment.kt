package `in`.goals.fragment

import `in`.goals.R
import `in`.goals.adapters.GoalsAdapter
import `in`.goals.databinding.FragmentGoalListBinding
import `in`.goals.viewmodels.GoalListViewModel
import android.os.Bundle
import android.view.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject

/**
 * Fragment o display List of Goal
 */
const val TAG="GoalsListFragment"
class GoalsListFragment : BaseFragment()
{
    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory
    lateinit var viewModel:GoalListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var binding =  FragmentGoalListBinding.inflate(inflater, container, false)

        viewModel = ViewModelProviders.of(this, vmFactory).get(GoalListViewModel::class.java)
        binding.viewModel=viewModel
        binding.toolbar.inflateMenu(R.menu.fragment_goal_list_menu)
        binding.toolbar.setOnMenuItemClickListener {
                viewModel.refresh()
                true
        }

        var adapter=getAdapter()
        setRecyclerView(adapter,binding)
        subscribeUi(adapter)
        setHasOptionsMenu(true)

        return binding.root
    }

    private fun setRecyclerView(adapter:GoalsAdapter,binding:FragmentGoalListBinding) {
        binding.goalList.adapter = adapter
    }


    private fun getAdapter():GoalsAdapter=GoalsAdapter()

    /**
     * Waits for updates to Model from ViewModel and applies changes accordingly
     */
    private fun subscribeUi(adapter: GoalsAdapter) {
        viewModel.getGoals().observe(viewLifecycleOwner, Observer { goals ->
            adapter.submitList(goals)
        })
    }




}