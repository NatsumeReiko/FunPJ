package com.fun.project;

import com.fun.project.data.GitHubUser;
import com.fun.project.retrofit.r001.RetrofitBuilder001;

import java.io.IOException;

import retrofit2.Response;

public class Retrofit001 {

    //For example: "octocat"
    public GitHubUser requestUser(String user) throws IOException {
        Response<GitHubUser> response = RetrofitBuilder001.getInstance().getGitHubService().getUser(user).execute();
        return response.body();
    }
}
