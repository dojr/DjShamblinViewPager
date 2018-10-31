package e.hambl_000.shamblindjviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        mViewPager = (ViewPager) findViewById(R.id.sick_view_pager);
        FragmentManager fragmentManager = getSupportFragmentManager();

        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int i) {
                switch (i) {
                    case 0:
                        return new Fragment1();
                    case 1:
                        return new Fragment2();
                    case 2:
                        return new Fragment3();

                }
                return null;
            }

            @Override
            public int getCount() {
                return 3;
            }
        });

    }
}
