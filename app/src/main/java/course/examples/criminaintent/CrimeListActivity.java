package course.examples.criminaintent;
/**
 * Class extends SingleFragmentActivity and
 * create abstract Fragment(createFragment) after that
 * return CrimeListFragment();
 */
import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
