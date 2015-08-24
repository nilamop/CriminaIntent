package course.examples.criminaintent;

import android.support.v4.app.Fragment;
/**
  * The Activity use SingleFragmentActivity class how fragment,
 * and have data from activity_fragment.xml in this Fragment
  *
 */

public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
