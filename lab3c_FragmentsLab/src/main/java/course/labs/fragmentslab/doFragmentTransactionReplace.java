package course.labs.fragmentslab;

import android.app.Fragment;
import android.app.FragmentTransaction;

/**
 * Created by Dario on 07/04/2017.
 */

public class doFragmentTransactionReplace implements IdoFragmentsTransaction {
    @Override
    public void doTransaction(int conntainerViewId, FragmentTransaction fragmentTransaction, Fragment fragment) {


        fragmentTransaction.replace(conntainerViewId, fragment);
        fragmentTransaction.addToBackStack(null);



    }
}
