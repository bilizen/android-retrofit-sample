package retrofit.api.com.apiretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bill on 14/09/17.
 */

public class Retrofit2ApiManager {
    private static Retrofit2Api retrofit2Api;

    public static Retrofit2Api processApi(){
        if(retrofit2Api==null){
            Retrofit retrofit=new Retrofit.Builder().baseUrl("http://192.168.0.100:80/wSYuraMobile/api/Mobile/").
                    addConverterFactory(GsonConverterFactory.create()).build();
            retrofit2Api=retrofit.create(Retrofit2Api.class);
        }
        return retrofit2Api;
    }
}
