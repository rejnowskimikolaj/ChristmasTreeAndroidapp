package com.example.root.christmastree.retrofit;

import com.example.root.christmastree.Frame;
import com.example.root.christmastree.SendFrameResponse;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by root on 12/15/17.
 */

public interface TreeApiClient {

    @GET("setlevel")
    Call<SendFrameResponse> sendFrame(Frame frame);

    @GET("getlevel")
    Call<Frame> getFrame();


}
