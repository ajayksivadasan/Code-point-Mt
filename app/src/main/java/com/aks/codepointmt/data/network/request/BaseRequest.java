package com.aks.codepointmt.data.network.request;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class BaseRequest {
    /**
     * jsonrpc : 1.0
     * method : SyncUserDetails
     * id : 1
     * params : {"user_id":"38046","first_name":"CODEPOINT Support ","last_name":"Tester","email_id":"tmsdemo@gmail.com","push_token":"cVQRyyeCUBI:APA91bEz7HHgzMfGpAiQUDTvIBa4t ","device_id":"d457a6b35849cc2d","type":"retrieve","parent_id":"38046","user_type":"parent","platform":"android","app_code":"TMS","security_token":"sdlkslckckdocmkde933mnke3m","version":108}
     */

    @SerializedName("jsonrpc")
    private String jsonrpc;
    @SerializedName("method")
    private String method;
    @SerializedName("id")
    private int id;
    /**
     * user_id : 38046
     * first_name : CODEPOINT Support
     * last_name : Tester
     * email_id : tmsdemo@gmail.com
     * push_token : cVQRyyeCUBI:APA91bEz7HHgzMfGpAiQUDTvIBa4t
     * device_id : d457a6b35849cc2d
     * type : retrieve
     * parent_id : 38046
     * user_type : parent
     * platform : android
     * app_code : TMS
     * security_token : sdlkslckckdocmkde933mnke3m
     * version : 108
     */

    @SerializedName("params")
    private DtoClass params;

    public static BaseRequest objectFromData(String str) {
        return new Gson().fromJson(str, BaseRequest.class);
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DtoClass getParams() {
        return params;
    }

    public void setParams(DtoClass params) {
        this.params = params;
    }
}
