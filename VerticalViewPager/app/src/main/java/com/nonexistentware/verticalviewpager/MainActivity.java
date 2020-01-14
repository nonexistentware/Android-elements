package com.nonexistentware.verticalviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;

import android.os.Bundle;

import com.nonexistentware.verticalviewpager.Fragments.LoginFragment;
import com.nonexistentware.verticalviewpager.Fragments.SignUp;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Fragment loginFragment;
    Fragment signIn;

    private VerticalViewPager viewPager;
    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginFragment = new LoginFragment();
        signIn = new SignUp();

        List<Fragment> list = new ArrayList<>();
        list.add(new LoginFragment());
        list.add(new SignUp());

        viewPager = findViewById(R.id.viewPager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), list);

        viewPager.setAdapter(adapter);
    }
}
