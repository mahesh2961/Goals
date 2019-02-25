package in.goals.model;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import in.goals.database.Goal;

@RunWith(MockitoJUnitRunner.class)
public class GoalModelTest {

    Goal goal;
    @Rule
    public TestRule rule = new InstantTaskExecutorRule();


    @Before
    public void  setUp()
    {
        goal = new Goal(2, "My Goal", "https://static.qapitalapp.net/assets/ios-staging.api.qapital.com/images/goal/e1811786-19a0-4a59-96a4-9222ff30192e.jpg"
                , 20.0, 20.0, 1, "active", new ArrayList<Integer>(), new ArrayList<Integer>());
    }


    @Test
    public void testWhenTargetAndCurrentBalanceValueAvailable()
    {
        Assert.assertEquals("$20 of 20",goal.getGoalCompletion());
    }

    @Test
    public void testWhenTargetValueAvailable()
    {
        goal.setCurrentBalance(0);
        Assert.assertEquals("Target Amount: $20",goal.getGoalCompletion());

    }


    @Test
    public void testWhenCurrentBalanceValueAvailable()
    {
        goal.setCurrentBalance(20);
        goal.setTargetAmount(0);
        Assert.assertEquals("Saved $20 till now",goal.getGoalCompletion());

    }
}
