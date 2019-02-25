package `in`.goals.activities

import `in`.goals.R
import `in`.goals.databinding.ActivityGoalsBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Main Host actvitiy of the application.
 *
 */
class GoalsActivity : AppCompatActivity(),HasSupportFragmentInjector{

    @Inject
    lateinit var supportFragmentInjector: DispatchingAndroidInjector<Fragment>
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        val binding: ActivityGoalsBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_goals)

        navController = Navigation.findNavController(this, R.id.garden_nav_fragment)
        AppBarConfiguration(navController.graph) //Using Nav graph for fragment navigation

    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = supportFragmentInjector


}