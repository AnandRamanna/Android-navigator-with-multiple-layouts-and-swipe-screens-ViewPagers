package dolphinsbrain.com.navigationdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by AANU on 3/23/2018.
 */

public class FragmentPage extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        //return super.onCreateView(inflater, container, savedInstanceState);
        final View view;
        Bundle bundle= getArguments();
        int pageNumber = bundle.getInt("pageNumber");

        // logic
        // we took the layout and inflated it
        view = inflater.inflate(R.layout.page_fragment_layout,container,false);
        TextView textView = (TextView) view.findViewById(R.id.pageNumber);

        // take the page number from the view
        // put current page into view
        textView.setText(Integer.toString(pageNumber));
        return view;
    }
}
