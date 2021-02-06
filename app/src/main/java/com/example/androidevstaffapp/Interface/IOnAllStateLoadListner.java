package com.example.androidevstaffapp.Interface;


import com.example.androidevstaffapp.Model.City;

import java.util.List;

public interface IOnAllStateLoadListner {
    void onAllStateLoadSuccess(List<City> cityList);
    void onAllStateLoadFailed(String message);
}
