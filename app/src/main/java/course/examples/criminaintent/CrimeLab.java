package course.examples.criminaintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Create array(list), objects Crime(class Crime)
 * and add they to array, each two objects have value: true/false
 */
public class CrimeLab {
    private ArrayList<Crime> mCrimes; //create variable for array list

    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private CrimeLab(Context appContext) {
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();
        for(int i= 0; i<100; i++){
            Crime c = new Crime();
            c.setTitle("Crime #" +i);
            c.setSolved(i % 2 == 0); //Для каждого второго variable(true/false)
            mCrimes.add(c);
        }
    }

    public static CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime c : mCrimes) {
            if (c.getId().equals(id))
                return c;
            }
            return null;
        }
}

