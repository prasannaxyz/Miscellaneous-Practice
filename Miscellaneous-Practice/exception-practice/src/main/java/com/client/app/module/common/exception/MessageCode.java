package com.client.app.module.common.exception;

import com.client.app.module.common.vo.MessageType;

public interface MessageCode {

    String getCode();

    String getDefaultMessage();

    MessageType getMessageType();

    Object[] getParameters();

    String getObjectIdentifier();

    MessageCode withParams(final Object... params);

    MessageCode withObjectIdentifierAs(String objectId);
}
