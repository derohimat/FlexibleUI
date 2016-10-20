package net.derohimat.flexibleui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import net.derohimat.flexibleui.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().
                    add(R.id.frame_container,
                            new FirstFragment(),
                            FirstFragment.class.getSimpleName()).commit();
        }
    }

}