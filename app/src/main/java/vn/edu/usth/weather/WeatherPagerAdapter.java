package vn.edu.usth.weather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

// Adapter cho ViewPager, trả về 3 WeatherAndForecastFragment
public class WeatherPagerAdapter extends FragmentPagerAdapter {
    public WeatherPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public Fragment getItem(int position) {
        // Bạn có thể truyền Bundle để đổi nội dung cho từng trang nếu muốn!
        return new WeatherAndForecastFragment();
    }

    @Override
    public int getCount() {
        return 3; // số trang vuốt được
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0: return "HANOI, VIETNAM";
            case 1: return "PARIS, FRANCE";
            case 2: return "TOULOUSE, FR";
            default: return "City";
        }
    }

}
