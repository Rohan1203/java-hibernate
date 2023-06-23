package com.card.exception;

/**
 * @author rohan.das on 20/06/23
 * @project system-integration
 */
public enum ErrorMessages {
    MISSING_REQUIRED_FIELD("Missing required field, please check doc for the required fields"),
    RECORD_ALREDY_EXISTS("Record already exists"),
    INTERNAL_SERVER_ERROR("Internal server error");

    private String errorMessage;

    ErrorMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
