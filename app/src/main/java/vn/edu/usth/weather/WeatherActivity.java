package vn.edu.usth.weather;

import android.os.Bundle;

import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        ForecastFragment fragment = new ForecastFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, fragment)
                .commit();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i("WeatherActivity", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("WeatherActivity", "onStart()");
    }

    @Override
    protected  void onResume(){
        super.onResume();
        Log.i("WeatherActivity", "onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WeatherActivity", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WeatherActivity", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity", "onDestroy()");
    }

}