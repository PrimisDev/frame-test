package com.bbva.ar.qa.utils;

import com.google.gson.JsonObject;
import static java.lang.String.valueOf;


public class LoadData {
    private static String jsonPath="json/%s.json";
    private static String USER="user";

    public static String forSignUpSuccess(int id, String username, String firstName, String lastName, String email, String password, String phone, int userStatus){
        JsonObject jsonObject = new JsonObject();
        jsonObject.add(USER,new JsonObject());
        jsonObject.get(USER).getAsJsonObject().addProperty("id",id);
        jsonObject.get(USER).getAsJsonObject().addProperty("username",username);
        jsonObject.get(USER).getAsJsonObject().addProperty("firstName",firstName);
        jsonObject.get(USER).getAsJsonObject().addProperty("lastName",lastName);
        jsonObject.get(USER).getAsJsonObject().addProperty("email", email);
        jsonObject.get(USER).getAsJsonObject().addProperty("password",password);
        jsonObject.get(USER).getAsJsonObject().addProperty("phone",phone);
        jsonObject.get(USER).getAsJsonObject().addProperty("userStatus",userStatus);
        return valueOf(jsonObject);
    }

}
