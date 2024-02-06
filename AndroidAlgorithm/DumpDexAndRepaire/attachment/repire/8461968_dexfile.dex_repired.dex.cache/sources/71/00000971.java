package com.yunmai.valueoflife;

import ac.l0;
import ac.m1;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.RequiresApi;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alipay.mobile.android.verify.sdk.MPVerifyService;
import com.amap.api.location.AMapLocationClient;
import com.google.android.material.navigation.NavigationBarView;
import com.kwad.sdk.utils.c0;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import com.yunmai.valueoflife.base.BaseActivity;
import com.yunmai.valueoflife.base.g;
import com.yunmai.valueoflife.databinding.ActivityMainBinding;
import com.yunmai.valueoflife.empty.UpdateDataBean;
import com.yunmai.valueoflife.empty.home.HomeImageBean;
import com.yunmai.valueoflife.net.httpUtils.GsonUtil;
import com.yunmai.valueoflife.util.EncryptUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import s.h.e.l.l.C;
import tb.j1;
import tb.k;
import tb.n;
import tb.r0;
import tb.x0;
import uc.m;
import wb.e;
import yb.f;
import yb.p;

@com.yunmai.valueoflife.base.e
/* loaded from: /Users/dtateach/Desktop/52.Fart12配套批量修复工具/attachment/repire/8461968_dexfile.dex_repired.dex */
public class MainActivity extends BaseActivity<ActivityMainBinding> {
    public k B;
    public x0 C;
    public j1 D;
    public n E;
    public r0 F;
    public l0 G;
    public ActivityResultLauncher<Intent> H;
    public m1 y;
    public ProgressDialog z;
    public List<Fragment> A = new ArrayList();
    public long I = 0;

    /* loaded from: /Users/dtateach/Desktop/52.Fart12配套批量修复工具/attachment/repire/8461968_dexfile.dex_repired.dex */
    public class a implements e.b {
        public a() {
        }

        @Override // wb.e.b
        public void a(String str) {
            MainActivity.this.z.cancel();
        }

        @Override // wb.e.b
        public void b(int i) {
            ProgressDialog progressDialog = MainActivity.this.z;
            progressDialog.setMessage("下载中：" + i + "%");
        }

        @Override // wb.e.b
        public void c(File file) {
            g.a(file.getAbsolutePath());
            MainActivity.this.z.cancel();
            if (Build.VERSION.SDK_INT < 26) {
                MainActivity.this.z(file);
            } else if (c0.a(MainActivity.this.getPackageManager())) {
                MainActivity.this.z(file);
            } else {
                MainActivity.this.F(file.getAbsolutePath());
            }
        }
    }

    static {
        C.i(33554475);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void A(String str) {
        HomeImageBean homeImageBean = (HomeImageBean) GsonUtil.parseJsonWithGson(str, HomeImageBean.class);
        if (homeImageBean != null && homeImageBean.getData().getIs_open().intValue() == 1) {
            l0 l0Var = new l0(this, homeImageBean.getData().getImg());
            this.G = l0Var;
            if (!l0Var.isShowing()) {
                this.G.show();
            }
        }
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void B(UpdateDataBean updateDataBean, boolean z) {
        if (!z && updateDataBean.getData().getEdition_force() == 1) {
            finish();
            yb.a.a().g();
        }
        if (z) {
            if (TextUtils.isEmpty(updateDataBean.getData().getEdition_url()) || !updateDataBean.getData().getEdition_url().endsWith("_beta.apk")) {
                toast("更新地址错误！");
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog(this, R$style.ThemeProgressDialogStyle);
            this.z = progressDialog;
            progressDialog.setTitle("APP升级中");
            this.z.setMessage("下载中：0%");
            this.z.setCancelable(false);
            this.z.setCanceledOnTouchOutside(false);
            this.z.show();
            wb.e.e().f(this, updateDataBean.getData().getEdition_url(), new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void C(String str) {
        final UpdateDataBean updateDataBean = (UpdateDataBean) GsonUtil.parseJsonWithGson(str, UpdateDataBean.class);
        if (updateDataBean != null) {
            String b = p.a().b(this);
            String c = p.a().c(this);
            if (updateDataBean.getData().getEdition_number() <= Integer.parseInt(b) || TextUtils.equals(updateDataBean.getData().getEdition_name(), c)) {
                return;
            }
            m1 m1Var = new m1(this, new m1.a() { // from class: com.yunmai.valueoflife.e
                @Override // ac.m1.a
                public final void a(boolean z) {
                    MainActivity.this.B(updateDataBean, z);
                }
            });
            this.y = m1Var;
            if (m1Var.isShowing()) {
                return;
            }
            this.y.show();
            this.y.e(updateDataBean.getData().getDescribe());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean D(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R$id.main_bnv_home /* 2131231871 */:
                s(0);
                return true;
            case R$id.main_bnv_inter /* 2131231872 */:
                s(3);
                return true;
            case R$id.main_bnv_mine /* 2131231873 */:
                s(4);
                return true;
            case R$id.main_bnv_nearby /* 2131231874 */:
                s(1);
                return true;
            case R$id.main_bnv_welfare /* 2131231875 */:
                s(2);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(ActivityResult activityResult) {
        if (activityResult.getResultCode() != -1 || activityResult.getData() == null) {
            return;
        }
        String stringExtra = activityResult.getData().getStringExtra("filePath");
        g.a(stringExtra);
        z(new File(stringExtra));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RequiresApi(api = 26)
    public final void F(String str) {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(Uri.parse("package:" + getPackageName()));
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("filePath", str);
        this.H.launch(intent);
    }

    @m(threadMode = ThreadMode.MAIN)
    public void eventMessage(f fVar) {
        r0 r0Var;
        if (fVar.b() == 4001) {
            s(2);
        } else if (fVar.b() != 7001 || (r0Var = this.F) == null) {
        } else {
            r0Var.B0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yunmai.valueoflife.base.BaseActivity
    public void initView(Bundle bundle) {
        EncryptUtils.a(this, "123456");
        EncryptUtils.b(this, "123456");
        EncryptUtils.a(this, this.map.toString());
        this.H = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.yunmai.valueoflife.a
            public final void onActivityResult(Object obj) {
                MainActivity.this.E((ActivityResult) obj);
            }
        });
        y();
        x();
        AMapLocationClient.updatePrivacyShow(this, true, true);
        AMapLocationClient.updatePrivacyAgree(this, true);
        u();
        MPVerifyService.markUserAgreedPrivacyPolicy(getApplicationContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.I > 1500) {
            Toast.makeText((Context) this, (CharSequence) "再按一次退出程序", 0).show();
            this.I = currentTimeMillis;
            return;
        }
        finish();
        System.exit(0);
    }

    @Override // com.yunmai.valueoflife.base.BaseActivity
    public native void onDestroy();

    public native void onRestart();

    public final void s(int i) {
        w();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(i + "");
        if (findFragmentByTag != null) {
            beginTransaction.show(findFragmentByTag);
        } else {
            beginTransaction.add((int) R$id.frameLayout, this.A.get(i), i + "");
        }
        beginTransaction.commitAllowingStateLoss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yunmai.valueoflife.base.BaseActivity
    /* renamed from: t */
    public ActivityMainBinding getBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }

    public final void u() {
        HashMap<String, Object> hashMap = new HashMap<>();
        this.map = hashMap;
        hashMap.put("control", "load-popup");
        this.http.g("/app/common", this.map, new vb.c() { // from class: com.yunmai.valueoflife.b
            @Override // vb.c
            public /* synthetic */ void onFailed(int i, Throwable th) {
                vb.b.a(this, i, th);
            }

            @Override // vb.c
            public final void onSuccess(String str) {
                MainActivity.this.A(str);
            }
        });
    }

    public final void v() {
        HashMap<String, Object> hashMap = new HashMap<>();
        this.map = hashMap;
        hashMap.put("control", "load-version");
        this.map.put("version_type", "android");
        this.http.g("/app/common", this.map, new vb.c() { // from class: com.yunmai.valueoflife.d
            @Override // vb.c
            public /* synthetic */ void onFailed(int i, Throwable th) {
                vb.b.a(this, i, th);
            }

            @Override // vb.c
            public final void onSuccess(String str) {
                MainActivity.this.C(str);
            }
        });
    }

    public final void w() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        for (int i = 0; i < this.A.size(); i++) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(i + "");
            if (findFragmentByTag != null) {
                beginTransaction.hide(findFragmentByTag);
            }
        }
        beginTransaction.commitAllowingStateLoss();
    }

    public final void x() {
        ((ActivityMainBinding) this.binding).navView.setOnItemSelectedListener(new NavigationBarView.c() { // from class: com.yunmai.valueoflife.c
            public final boolean a(MenuItem menuItem) {
                boolean D;
                D = MainActivity.this.D(menuItem);
                return D;
            }
        });
    }

    public final void y() {
        k kVar = new k();
        this.B = kVar;
        this.A.add(kVar);
        x0 x0Var = new x0();
        this.C = x0Var;
        this.A.add(x0Var);
        j1 j1Var = new j1();
        this.D = j1Var;
        this.A.add(j1Var);
        n nVar = new n();
        this.E = nVar;
        this.A.add(nVar);
        r0 r0Var = new r0();
        this.F = r0Var;
        this.A.add(r0Var);
        s(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(File file) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
            intent.addFlags(1);
            if (Build.VERSION.SDK_INT >= 24) {
                intent.setFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
                Uri uriForFile = FileProvider.getUriForFile(this, "com.yunmai.valueoflife.FileProvider", file);
                intent.addFlags(1);
                intent.setDataAndType(uriForFile, AdBaseConstants.MIME_APK);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("installAPK: ");
                sb2.append(uriForFile);
            } else {
                intent.setDataAndType(Uri.parse("file://" + file), AdBaseConstants.MIME_APK);
            }
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}