package dolphinsbrain.com.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by AANU on 3/23/2018.
 */

public class SwipeAdapter extends FragmentStatePagerAdapter
{
    // constructor
    public SwipeAdapter(FragmentManager fragmentManager)
    {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment pageFragment = new FragmentPage();
        // we want this page fragment to know which page we are in , so we use bundle
        Bundle bundle = new Bundle();
        if (position==0)
        {
            bundle.putString("pageNumber","This will be the page content from the navigation drawer. thanks");
        }
        bundle.putInt("pageNumber",position+1);// first position is 0 and we want to show 1
        pageFragment.setArguments(bundle);
        return pageFragment;// after thia implement everything into the main activity
    }

    @Override
    public int getCount() {
        // how many pages you want
        return 10;
    }
}
