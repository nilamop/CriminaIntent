package course.examples.criminaintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.CompoundButton.OnCheckedChangeListener;

import java.text.SimpleDateFormat;

/**
 * CrimeFragment - realization general fragment, in CrimeActivity
 * we only call him.
 * Create Crime object use onCreate
 * use data from fragment_activity.xml for all full(fill) this 2 gn (main) Fragment
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime; // переменная для экземпляра Crime
    private EditText mTitleField;
    private Button mDateButton; // переменная экземпляр виджета
    private CheckBox mSolvedCheckBox; // переменная экземпляр виджета

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime(); // объяект класса будет храниться в этой переменной
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);

        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(
                    CharSequence c, int start, int before, int count) {
                mCrime.setTitle(c.toString());
            }

            public void beforeTextChanged(
                    CharSequence c, int start, int count, int after) {
                // Здесь намерено оставленно пустое место
            }

            @Override
            public void afterTextChanged(Editable c) {
                //И здесь тоже
            }
        });

        mDateButton = (Button)v.findViewById(R.id.crime_date);
        SimpleDateFormat ft = new SimpleDateFormat("EEEE, d MMM yyyy, hh:mm");
        mDateButton.setText(ft.format(mCrime.getDate()));
        mDateButton.setEnabled(false);

        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Назначение флага раскрытия преступления
                mCrime.setSolved(isChecked);
            }
        });
        return v;
    }
}
