package com.aks.codepointmt.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aks.codepointmt.data.network.request.BaseRequest;
import com.aks.codepointmt.databinding.ActivityMainBinding;
import com.aks.codepointmt.ui.main.MainViewModel;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;
    @Inject
    Context context;
    MainViewModel mainViewModel;
    String requestJson = "{\n" +
            "    \"jsonrpc\": \"1.0\",\n" +
            "    \"method\": \"SyncUserDetails\",\n" +
            "    \"id\": 1,\n" +
            "    \"params\": {\n" +
            "        \"user_id\": \"38046\",\n" +
            "        \"first_name\": \"CODEPOINT Support \",\n" +
            "        \"last_name\": \"Tester\",\n" +
            "        \"email_id\": \"tmsdemo@gmail.com\",\n" +
            "        \"push_token\": \"cVQRyyeCUBI:APA91bEz7HHgzMfGpAiQUDTvIBa4t \",\n" +
            "        \"device_id\": \"d457a6b35849cc2d\",\n" +
            "        \"type\": \"retrieve\",\n" +
            "        \"parent_id\": \"38046\",\n" +
            "        \"user_type\": \"parent\",\n" +
            "        \"platform\": \"android\",\n" +
            "        \"app_code\": \"TMS\",\n" +
            "        \"security_token\": \"sdlkslckckdocmkde933mnke3m\",\n" +
            "        \"version\": 108\n" +
            "    }\n" +
            "}\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        mainViewModel.makeApiCall(BaseRequest.objectFromData(requestJson));
        mainBinding.rvStudents.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));
    }
}