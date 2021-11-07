package tw.cody.receiverbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_LOW");
        MyReceiverBroadcast receiverBroadcast = new MyReceiverBroadcast();
        registerReceiver(receiverBroadcast,intentFilter);
    }
    
}