package com.fun.project;

import android.util.Log;

import java.util.Arrays;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class PlayGround001RxJava {
    private static final String TAG = "TEST RxJava";
    private static final String TEST_STRING = "PlayGround001RxJava";
    private static final String TEST_STRING_01 = "PlayGround001RxJava_01";
    private static final Integer[] TEST_INTEGER_ARRAY_01 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    private PlayGround001RxJava() {
    }


    public static void F001_MAP() {
        Observable.just(TEST_STRING)
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) throws Exception {
                        return s.length();
                    }
                })
                .subscribe(i -> Log.d(TAG, Integer.toString(i)));

        //lambda
        Observable.just(TEST_STRING)
                .map(s -> s.length())
                .subscribe(i -> Log.d(TAG, Integer.toString(i)));

        Observable.just(TEST_STRING)
                .map(String::length)
                .subscribe(i -> Log.d(TAG, Integer.toString(i)));
    }


    public static void F002_LIST() {
        Observable.fromIterable(Arrays.asList(TEST_STRING, TEST_STRING_01))
                .subscribe(str -> Log.d(TAG, str));
    }

    public static void F003_BUFFER() {
        Observable.fromArray(TEST_INTEGER_ARRAY_01)
                .buffer(3, 2)
                .subscribe(items -> {
                    Log.d(TAG, String.valueOf(items));
                });

        //lambda
        Observable.fromArray(TEST_INTEGER_ARRAY_01)
                .buffer(3, 2)
                .subscribe(items -> Log.d(TAG, String.valueOf(items)));
    }

}
