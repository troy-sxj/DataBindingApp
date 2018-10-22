package com.mika.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mika.databinding.databinding.FragmentMainBinding;


/**
 * @Author: mika
 * @Time: 2018/10/19 下午7:16
 * @Description:
 */
public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMainBinding inflate = FragmentMainBinding.inflate(inflater, container, false);
//        FragmentMainBinding fragmentMainBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
//        return super.onCreateView(inflater, container, savedInstanceState);
        return inflate.getRoot();
    }
}
