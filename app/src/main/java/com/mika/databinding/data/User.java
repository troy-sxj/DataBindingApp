package com.mika.databinding.data;

import android.databinding.ObservableField;

/**
 * @Author: mika
 * @Time: 2018/10/19 下午6:55
 * @Description:
 */
public class User {

//    //如果是 private 修饰符，则在成员变量的 get 方法上添加 @Bindable 注解
//    private String name;
//    //如果是 public 修饰符，则可以直接在成员变量上方加上 @Bindable 注解
//    @Bindable
//    public String password;
//
//    @Bindable
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//        //只更新本字段
//        notifyPropertyChanged(BR.name);
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//        //更新所有字段
//        notifyChange();
//    }
//
//    public User(String name, String password) {
//        this.name = name;
//        this.password = password;
//    }

    private ObservableField<String> name;
    private ObservableField<String> password;


    public User(ObservableField<String> name, ObservableField<String> password) {
        this.name = name;
        this.password = password;
    }

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<String> getPassword() {
        return password;
    }

    public void setPassword(ObservableField<String> password) {
        this.password = password;
    }
}
