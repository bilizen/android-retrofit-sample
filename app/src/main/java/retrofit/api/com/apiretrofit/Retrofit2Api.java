package retrofit.api.com.apiretrofit;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by bill on 14/09/17.
 */

public interface Retrofit2Api {

    @GET("GetCompaniesAndFailures")
    retrofit2.Call<Country> getCountry();

    @POST("PostAuthenticationByAccountAndPassword")
    retrofit2.Call<User> getUser(@Body PostUser postUser);
}
