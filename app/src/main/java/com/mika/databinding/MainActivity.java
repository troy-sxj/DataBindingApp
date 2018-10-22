package com.mika.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mika.databinding.data.User;
import com.mika.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;

    private ObservableField<String> name = new ObservableField<>();
    private ObservableField<String> password = new ObservableField<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        name.set("mika");
        password.set("mika");

        user = new User(name, password);

        viewDataBinding.setUserInfo(user);
        viewDataBinding.setClickHandler(new ClickHandler());
        getSupportFragmentManager().beginTransaction().add(R.id.frame_container, new MainFragment()).commitAllowingStateLoss();

//        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                user.setName("change");
//                user.setPassword("****");
//            }
//        });
    }


    public class ClickHandler {

        public void changeName() {
//            user.setName("change");
        }

        public void changeAll() {
            name.set("change");
            password.set("***");
//            user.setName(new ObservableField<String>("change"));
//            user.setPassword(new ObservableField<String>("***"));
        }
    }
}
