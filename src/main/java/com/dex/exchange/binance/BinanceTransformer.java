package com.dex.exchange.binance;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BinanceTransformer<T> {

    public static Gson gson;
    public static ObjectMapper mapper = new ObjectMapper();

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();
    }

    public static <T> T transform(Object object, Class<T> classOfT) throws JsonProcessingException {
        return gson.fromJson(mapper.writeValueAsString(object), classOfT);
    }

}
