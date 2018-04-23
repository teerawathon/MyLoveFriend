package teerawat.skyict.co.th.mylovefriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import teerawat.skyict.co.th.mylovefriend.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add fragment
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();
        }

    }   // onCreate

}   // Main Class
