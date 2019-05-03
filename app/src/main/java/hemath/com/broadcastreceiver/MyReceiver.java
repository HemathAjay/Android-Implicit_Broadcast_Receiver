package hemath.com.broadcastreceiver;

import android.content.*;
import android.widget.*;

public class MyReceiver extends BroadcastReceiver {

    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context,Intent intent) {

        Toast.makeText(context, "Received" , Toast.LENGTH_LONG).show();

    }
}
