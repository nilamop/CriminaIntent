package course.examples.criminaintent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 *  Create array-list with objects Crime, named mCrimes
 *  after get to this value-object-array-list all objects
 *  and create special adapter for this objects
 *  who answer for create list on my screen using sdk sample
 */
public class CrimeListFragment extends ListFragment {
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
}
