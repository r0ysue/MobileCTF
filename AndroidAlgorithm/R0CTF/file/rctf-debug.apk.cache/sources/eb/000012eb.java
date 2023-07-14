package com.r0ysue.rctf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.r0ysue.rctf.algo.Item01Activity;
import com.r0ysue.rctf.algo.Itme02Activity;
import com.r0ysue.rctf.algo.Itme03Activity;

/* loaded from: classes4.dex */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_item_01).setOnClickListener(this);
        findViewById(R.id.btn_item_02).setOnClickListener(this);
        findViewById(R.id.btn_item_03).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_item_01) {
            Intent intent = new Intent(this, Item01Activity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.btn_item_02) {
            Intent intent2 = new Intent(this, Itme02Activity.class);
            startActivity(intent2);
        } else if (view.getId() == R.id.btn_item_03) {
            Intent intent3 = new Intent(this, Itme03Activity.class);
            startActivity(intent3);
        }
    }
}