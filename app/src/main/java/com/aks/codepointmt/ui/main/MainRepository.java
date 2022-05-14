package com.aks.codepointmt.ui.main;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.aks.codepointmt.data.network.request.BaseRequest;
import com.aks.codepointmt.data.network.response.BaseResponse;
import com.aks.codepointmt.di.scope.RetrofitInterface;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainRepository {
    RetrofitInterface retrofitInterface;

    private MainRepository(RetrofitInterface retrofitInterface) {
        this.retrofitInterface = retrofitInterface;
    }

    public static MainRepository getInstance(RetrofitInterface retrofitInterface) {
        return new MainRepository(retrofitInterface);
    }

    public void makeApiCall(MutableLiveData<BaseResponse> baseResponseLiveData, CompositeDisposable disposable, BaseRequest baseRequest) {
        Observable<BaseResponse> responseObservable = retrofitInterface.getResponseFromWeb(baseRequest);
        responseObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        disposable.add(d);
                    }

                    @Override
                    public void onNext(BaseResponse baseResponse) {
                        baseResponseLiveData.postValue(baseResponse);
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        Log.e("onComplete: ", "completed");
                    }
                });
    }
}
