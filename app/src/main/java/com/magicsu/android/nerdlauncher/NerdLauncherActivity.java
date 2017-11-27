package com.magicsu.android.nerdlauncher;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.magicsu.android.nerdlauncher.activity.SingleFragmentActivity;
import com.magicsu.android.nerdlauncher.fragment.NerdLauncherFragment;

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
