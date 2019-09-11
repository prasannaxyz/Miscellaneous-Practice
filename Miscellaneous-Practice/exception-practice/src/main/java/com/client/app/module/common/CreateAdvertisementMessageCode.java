/*******************************************************************************
 * PS Technology Proprietary and Confidential Copyright (c) 2017 PS Technology Incorporated. All
 * Rights Reserved.
 *
 * NOTICE: All information contained herein is, and remains the property of PST. The intellectual
 * and technical concepts contained herein are proprietary to PST and are protected by trade secret
 * and copyright law. Dissemination of this information or reproduction of this material in any form
 * is strictly forbidden without prior written permission.
 *******************************************************************************/
package com.client.app.module.common;

import com.client.app.module.common.exception.DefaultMessageCode;
import com.client.app.module.common.exception.MessageCode;
import com.client.app.module.common.vo.MessageType;

public enum CreateAdvertisementMessageCode
        implements MessageCode {
    ERROR_REQUIRED(113, "{0} is Required."),
    NOTHING_TO_SAVE(400, "NO RECORDS TO SAVE."),
    CREATE_FAIL(501, "FAILED TO CREATE {0}"),
    ERROR_DUPLICATE(502, "DUPLICATE BULLETIN MASTER CODE/ID FOUND"),
    GET_FAIL(503, "FAILED TO GET {0} DUE TO INTERNAL DATABASE ERROR."),
    CREATED_SUCCESSFULLY(901, "{0} CREATED SUCCESSFULLY", MessageType.SUCCESS),
    OPEN_DATE_INVALID(617, "Close Date cannot be less than open date"),
    EFFECTIVE_DATE_INVALID(618, "Effective Date must be greater than close date"),
    TURN_NOT_FOUND(619, "Turn is not found in the non madeup assignments of the board."),
    TRAINEE_CRAFTS_NOT_ALLOWED(620, "Advertisement of trainee crafts not allowed."),
    JOB_TYPE_REQUIRED(621, "Job type required for change of condition."),
    CLOSE_DATE_REQUIRED(622, "Information in advertisement control record not set up, enter close date."),
    EFFECTIVE_DATE_REQUIRED(623, "Information in advertisement control record not set up, enter effective date."),
    ADVERTISEMET_DESCRIPTION_REQUIRED(624, "Information in advertisement control record not set up, enter advertisement description."),
    JOB_ADVERTISED(625, "Job already advertised as {0}."),
    NO_SENIORITY_FOUND(626, "'No seniority specified for the assignment.");

    private final String message;
    private final int code;
    private final MessageType messageType;

    private CreateAdvertisementMessageCode(final int code, final String message, final MessageType messageType) {
        this.code = code;
        this.message = message;
        this.messageType = messageType;
    }

    private CreateAdvertisementMessageCode(final int code, final String message) {
        this.code = code;
        this.message = message;
        this.messageType = MessageType.ERROR;
    }

    @Override
    public String getCode() {
        return "Create-Advertisement-" + this.code;
    }

    @Override
    public String getDefaultMessage() {
        return message;
    }

    @Override
    public MessageType getMessageType() {
        return messageType;
    }

    @Override
    public String getObjectIdentifier() {
        return null;
    }

    @Override
    public Object[] getParameters() {
        return null;
    }

    @Override
    public MessageCode withObjectIdentifierAs(String arg0) {
        return null;
    }

    @Override
    public MessageCode withParams(Object... params) {
        return new DefaultMessageCode(getCode(), getDefaultMessage(), getMessageType(), params);
    }

}
