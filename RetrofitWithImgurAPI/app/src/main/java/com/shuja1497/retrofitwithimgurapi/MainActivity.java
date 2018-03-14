package com.shuja1497.retrofitwithimgurapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.shuja1497.retrofitwithimgurapi.api.OAuthUtil;
import com.shuja1497.retrofitwithimgurapi.view.ImageAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.btn_sign_in)
    View signInBtn;
    @BindView(R.id.btn_upload_anon)
    View uploadAnon;
    @BindView(R.id.account_images_container)
    View accountImagesContainer;
    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;
    @BindView(R.id.btn_upload)
    View upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        signInBtn.setOnClickListener(this);
        uploadAnon.setOnClickListener(this);
        upload.setOnClickListener(this);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new ImageAdapter(this));

        if (OAuthUtil.isAuthorized()) {
            // TODO set title
            showAccountImages();
        } else {
            toolbar.setTitle("Login");
            showLoginOrAnon();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        // TODO
    }

    private void showLoginOrAnon() {
        accountImagesContainer.setVisibility(View.GONE);
        signInBtn.setVisibility(View.VISIBLE);
        uploadAnon.setVisibility(View.VISIBLE);
    }

    private void showAccountImages() {
        // TODO

        accountImagesContainer.setVisibility(View.VISIBLE);
        signInBtn.setVisibility(View.GONE);
        uploadAnon.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_upload_anon:
                // TODO
                break;
            case R.id.btn_upload:
                // TODO
                break;
            case R.id.btn_sign_in:
                // TODO start login process
                break;
        }
    }


}