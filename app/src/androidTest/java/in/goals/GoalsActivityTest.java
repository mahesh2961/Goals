package in.goals;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import in.goals.activities.GoalsActivity;

import static androidx.test.espresso.Espresso.onData;

public class GoalsActivityTest {
    @Rule public final ActivityRule<GoalsActivity> main= new ActivityRule<>(GoalsActivity.class);

    @Test public void shouldLaunchMainScreen() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onData(Matchers.anything()).inAdapterView(ViewMatchers.withId(R.id.goal_list)).atPosition(0).perform(ViewActions.click());
    }
}
