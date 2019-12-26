package com.nonexistentware.bottomnavigationbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation_view);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,
                    new DashboardFragment()).commit();
        }

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment fragment = null;

                switch (menuItem.getItemId()) {
                    case R.id.dashboard_menu:
                        fragment = new DashboardFragment();
                        break;
                    case R.id.search_menu:
                        fragment = new SearchFragment();
                        break;
                    case R.id.favorite_menu:
                        fragment = new FavoriteFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
                return true;
            }
        });
    }
}
