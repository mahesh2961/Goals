package in.goals;

import android.content.Context;
import android.util.Log;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.annotation.Nullable;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.LiveData;
import androidx.room.Room;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import in.goals.database.AppDatabase;
import in.goals.database.Goal;
import in.goals.database.GoalDao;
import in.goals.database.GoalRepository;
import in.goals.network.ApiHandler;
import in.goals.network.NetworkManager;
import in.goals.utils.ConstantsKt;
import in.goals.viewmodels.GoalListViewModel;
import io.reactivex.Observer;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@RunWith(MockitoJUnitRunner.class)
public class GoalRepositoryTest {
    private ApiHandler apiHandler;
    private static final String TAG = "ApiUnitTesting";

    private GoalDao dao;

    private GoalRepository goalRepository;

    NetworkManager manager;


    @Rule
    public TestRule rule = new InstantTaskExecutorRule();


    @Before
    public void setup() {

        MockitoAnnotations.initMocks(this);

        Context appContext = InstrumentationRegistry.getTargetContext();

        dao=Room.databaseBuilder(appContext, AppDatabase.class, ConstantsKt.DATABASE_NAME).build().goalDao();


        apiHandler = new Retrofit.Builder()
                .baseUrl(ConstantsKt.API_HOST)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiHandler.class);

        manager= new NetworkManager(apiHandler);


        goalRepository= new GoalRepository(dao,manager);



        RxAndroidPlugins.setInitMainThreadSchedulerHandler(scheduler -> Schedulers.trampoline());

    }

    @Test
    public void testDataInsertAndFetch() {

        List<Goal> goals = getTestData();
          goalRepository.insertData(goals);
          List<Goal> fetchedGoals=  LiveDataTestUtil.INSTANCE.getValue(goalRepository.getGoals());
          Assert.assertThat(fetchedGoals, Matchers.hasItem(goals.get(0)));
    }


    @Test
    public void testIsDataAvailable() {

        List<Goal> goals = getTestData();
        goalRepository.insertData(goals);
        Assert.assertEquals(true,goalRepository.isDataAvailable());
    }



    public List<Goal> getTestData()
    {
        List<Goal> goals = new ArrayList<>();
        Goal goal = new Goal(94, "My Goal", "https://static.qapitalapp.net/assets/ios-staging.api.qapital.com/images/goal/e1811786-19a0-4a59-96a4-9222ff30192e.jpg"
                , 20.0, 20.0, 1, "active", new ArrayList<Integer>(), new ArrayList<Integer>());
//
        goals.add(goal);
        return goals;

    }

}
