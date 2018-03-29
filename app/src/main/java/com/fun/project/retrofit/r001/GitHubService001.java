package com.fun.project.retrofit.r001;

import com.fun.project.data.GitHubUser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface GitHubService001 {

    @Headers({
            "Accept: application/vnd.github.v3.full+json",
            "User-Agent: Retrofit-Sample-App"
    })
    @GET("users/{user}")
    Call<GitHubUser> getUser(@Path("user") String user);
}
