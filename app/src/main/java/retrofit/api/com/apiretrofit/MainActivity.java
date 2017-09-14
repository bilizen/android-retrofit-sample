package retrofit.api.com.apiretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Call<Country> call= Retrofit2ApiManager.processApi().getCountry();
        call.enqueue(new Callback<Country>() {
            @Override
            public void onResponse(Call<Country> call, Response<Country> response) {
                ArrayList<Country.Companies>  companiesArrayList=response.body().getCompanies();
                ArrayList<Country.Failures>  failuresArrayList=response.body().getFailures();
                Toast.makeText(MainActivity.this, ""+companiesArrayList.get(0).getB(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Country> call, Throwable t) {

            }
        });

        PostUser postUser= new PostUser("jzevallos","12345");
        Call<User> callUser= Retrofit2ApiManager.processApi().getUser(postUser);
        callUser.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                String A=response.body().getA();
                Toast.makeText(MainActivity.this, ""+A, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
            }
        });

    }

}
