package sila.sayar.retrofitxml;

/**
 * Created by zisan on 18.03.2017.
 */

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("article.rss")
    Call<RSSFeed> loadRSSFeed();
}