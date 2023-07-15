package com.r0ysue.rctf.algo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.r0ysue.rctf.R;
import com.r0ysue.rctf.utils.AlgoHelper;
import java.io.UnsupportedEncodingException;

/* loaded from: classes5.dex */
public class Item01Activity extends AppCompatActivity {
    private String mKey = "0123456789roysue";
    TextView message_tv;
    EditText username_et;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item01);
        this.username_et = (EditText) findViewById(R.id.editText);
        this.message_tv = (TextView) findViewById(R.id.textView);
        findViewById(R.id.button_item_01).setOnClickListener(new View.OnClickListener() { // from class: com.r0ysue.rctf.algo.Item01Activity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String result1 = null;
                try {
                    result1 = AlgoHelper.doMath(Item01Activity.this.username_et.getText().toString().getBytes("utf-8")) + "";
                    String str = AlgoHelper.doMath(result1.getBytes()) + "";
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                String result3 = AlgoHelper.encryp(result1, Item01Activity.this.mKey);
                if (result3.equals("8237CE97506C0FB1D389F2A906FE04FC0A")) {
                    Item01Activity.this.message_tv.setText("Congratulation for you!!!");
                } else {
                    Item01Activity.this.message_tv.setText("Keep Going........");
                }
            }
        });
    }
}