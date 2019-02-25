package in.goals.network;


import in.goals.pojos.GoalsResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Api Handler for Retrofit
 */
public interface ApiHandler {

    @GET("/savingsgoals")
    Observable<GoalsResponse> getGoals();

}
