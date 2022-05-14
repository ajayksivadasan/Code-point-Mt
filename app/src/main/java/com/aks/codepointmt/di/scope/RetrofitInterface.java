package com.aks.codepointmt.di.scope;

import com.aks.codepointmt.data.network.request.BaseRequest;
import com.aks.codepointmt.data.network.response.BaseResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitInterface {
    @POST("invokefn")
    Observable<BaseResponse> getResponseFromWeb(@Body BaseRequest baseRequest);
}
