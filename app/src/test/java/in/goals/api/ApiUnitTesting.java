package in.goals.api;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.List;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import in.goals.IGoalListNetworkResponse;
import in.goals.database.Goal;
import in.goals.database.GoalDao;
import in.goals.database.GoalRepository;
import in.goals.network.ApiHandler;
import in.goals.network.NetworkManager;
import in.goals.pojos.GoalsResponse;


@RunWith(MockitoJUnitRunner.class)
public class ApiUnitTesting {

    @Mock
    private ApiHandler apiHandler;
    private static final String TAG = "ApiUnitTesting";


    @Mock
    private GoalDao dao;

    private GoalRepository goalRepository;
    @Rule
    public TestRule rule = new InstantTaskExecutorRule();

    @Mock
    NetworkManager manager;

    @Mock
    IGoalListNetworkResponse<List<Goal>> callback;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        goalRepository = new GoalRepository(dao, manager);
    }

    @Test
    public void verifySuccessResponse() {

        GoalsResponse response= getTestData();

        Mockito.doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                ((IGoalListNetworkResponse<List<Goal>>)invocation.getArguments()[0]).sucessReponse(response.getSavingsGoals());
                return null;
            }
        }).when(manager).getGoals(ArgumentMatchers.any());



        goalRepository.fetchGoals(callback);

        Mockito.verify(callback, Mockito.times(1)).sucessReponse(ArgumentMatchers.any());

    }

    @Test
    public void verifyErrorResponse() {

        Mockito.doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                ((IGoalListNetworkResponse<List<Goal>>)invocation.getArguments()[0]).error(new Exception("Something went wrong"));
                return null;
            }
        }).when(manager).getGoals(ArgumentMatchers.any());

        goalRepository.fetchGoals(callback);

        Mockito.verify(callback, Mockito.times(1)).error(ArgumentMatchers.any());

    }


    private GoalsResponse getTestData()
    {
        List<Goal> goals = new ArrayList<>();
        Goal goal = new Goal(2, "My Goal", "https://static.qapitalapp.net/assets/ios-staging.api.qapital.com/images/goal/e1811786-19a0-4a59-96a4-9222ff30192e.jpg"
                , 20.0, 20.0, 1, "active", new ArrayList<Integer>(), new ArrayList<Integer>());
//
        goals.add(goal);

        GoalsResponse response= new GoalsResponse();
        response.setSavingsGoals(goals);
        return response;
    }

}
