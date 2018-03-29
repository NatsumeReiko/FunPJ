package com.fun.project.retrofit.r001;


import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder001 {
    private static final RetrofitBuilder001 ourInstance = new RetrofitBuilder001();

    private final GitHubService001 gitHubService;

    public static RetrofitBuilder001 getInstance() {
        return ourInstance;
    }

    private RetrofitBuilder001() {
        gitHubService = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(GitHubService001.class);
    }

    public GitHubService001 getGitHubService() {
        return gitHubService;
    }


}
