package course.labs.fragmentslab;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

/**
 * Created by Dario on 07/04/2017.
 */

public interface IdoFragmentsTransaction {
     void doTransaction(int conntainerViewId, FragmentTransaction fragmentTransaction, Fragment fragment);


}
