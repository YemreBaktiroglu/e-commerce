package com.example.model.response;

import java.util.Map;

public class BaseResponse {

    private boolean success;

    private String message;

    private Map<String, String> additionalInfoPair;

    public BaseResponse(boolean success, String message, Map<String, String> additionalInfoPair) {
        this.success = success;
        this.message = message;
        this.additionalInfoPair = additionalInfoPair;
    }

    public BaseResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public BaseResponse(boolean success) {
        this.success = success;
    }

    public BaseResponse() {
        this.success = true;
        this.message = "Success";
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getAdditionalInfoPair() {
        return additionalInfoPair;
    }

    public void setAdditionalInfoPair(Map<String, String> additionalInfoPair) {
        this.additionalInfoPair = additionalInfoPair;
    }
}
