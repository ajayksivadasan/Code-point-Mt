package com.aks.codepointmt.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.aks.codepointmt.data.network.request.BaseRequest;
import com.aks.codepointmt.data.network.response.BaseResponse;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.disposables.CompositeDisposable;

@HiltViewModel
public class MainViewModel extends ViewModel {
    private final MutableLiveData<BaseResponse> baseResponseLiveData;
    private final CompositeDisposable disposable;
    @Inject
    MainRepository mainRepository;

    public MainViewModel() {
        baseResponseLiveData = new MutableLiveData<>();
        disposable = new CompositeDisposable();
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        disposable.dispose();
    }

    public void makeApiCall(BaseRequest baseRequest) {
        mainRepository.makeApiCall(baseResponseLiveData, disposable, baseRequest);
    }
}