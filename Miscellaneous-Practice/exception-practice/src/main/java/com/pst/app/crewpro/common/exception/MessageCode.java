package com.pst.app.crewpro.common.exception;

import com.pst.app.crewpro.common.vo.MessageType;

public interface MessageCode {

    String getCode();

    String getDefaultMessage();

    MessageType getMessageType();

    Object[] getParameters();

    String getObjectIdentifier();

    MessageCode withParams(final Object... params);

    MessageCode withObjectIdentifierAs(String objectId);
}
