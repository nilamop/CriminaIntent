package course.examples.criminaintent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 *  Create array-list with objects Crime, named mCrimes
 *  after get to this value-object-array-list all objects
 *  and create special adapter for this objects
 *  who answer for create list on my screen using sdk sample
 */
public class CrimeListFragment extends ListFragment {
    private static final String TAG = "CrimeListFragment";

    private ArrayList<Crime> mCrimes;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();

        //Create ArrayAdapter, who uses ListView for CrimeListFragment
        ArrayAdapter<Crime> adapter =
                new ArrayAdapter<Crime>(getActivity(),
                        android.R.layout.simple_list_item_1, //use sample Android SDK
                        mCrimes);
        setListAdapter(adapter);
    }

    // We use method ListFragment's - getListAdapter
    // we get adapter(variable) our list
    // and after use method getItem adapter's with position parameter of onListItemClick
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Crime c = (Crime)(getListAdapter()).getItem(position);
        Log.d(TAG, c.getTitle() + " was clicked");
    }
//We create class who extends to adapter with objects Crime
    private class CrimeAdapter extends ArrayAdapter<Crime> {

        public CrimeAdapter(ArrayList<Crime> crimes) {
            super(getActivity(), 0, crimes);
        }
    }

}
