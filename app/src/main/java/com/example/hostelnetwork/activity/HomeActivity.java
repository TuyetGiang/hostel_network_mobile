//package com.example.hostelnetwork.activity;
//
//import android.graphics.drawable.ColorDrawable;
//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.design.widget.BottomNavigationView;
//import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentTransaction;
//import android.support.v7.app.ActionBar;
//import android.support.v7.app.AppCompatActivity;
//import android.view.MenuItem;
//import android.view.Window;
//
//import com.example.hostelnetwork.R;
//
//public class HomeActivity extends AppCompatActivity {
//
//    private ActionBar toolbar;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        this.setTitle("Bảng tin");
//
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        toolbar = getSupportActionBar();
//        toolbar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorAccent)));
//        setContentView(R.layout.activity_news);
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R. id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//        loadFragment(new NewsFragment());
//    }
//
//    private OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            Fragment fragment;
//            switch (item.getItemId()) {
//                case R.id.menu_personal:
//                    toolbar.setTitle("Cá nhân");
//                    fragment = new ProfileFragment();
//                    loadFragment(fragment);
//                    return true;
//                case R.id.menu_appointment:
//                    toolbar.setTitle("Lịch hẹn");
//                    fragment = new AppointmentFragment();
//                    loadFragment(fragment);
//                    return true;
//                case R.id.menu_wishList:
//                    toolbar.setTitle("Đã lưu");
//                    fragment = new WishListFragment();
//                    loadFragment(fragment);
//                    return true;
//                case R.id.menu_news:
//                    toolbar.setTitle("Bảng tin");
//                    fragment = new NewsFragment();
//                    loadFragment(fragment);
//                    return true;
//            }
//
//            return false;
//        }
//    };
//
//    private void loadFragment(Fragment fragment) {
//        // load fragment
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.frame_container, fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
//
//    private void loadActivity(Fragment fragment) {
//        // load fragment
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.frame_container, fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
//}
