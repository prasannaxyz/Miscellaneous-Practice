package com.client.app.module.common.validator;

import java.util.Objects;

import org.springframework.stereotype.Component;

import com.client.app.module.common.CreateAdvertisementConstants;
import com.client.app.module.common.CreateAdvertisementMessageCode;
import com.client.app.module.common.exception.BusinessException;

@Component("com.client.app.module.common.validator.CreateAdvertisementValidator")
public class CreateAdvertisementValidator {

	public void basicValidations(Object advertisementVO) {
		if (Objects.isNull(advertisementVO)) {
			throw BusinessException.create(CreateAdvertisementMessageCode.ERROR_REQUIRED
					.withParams(CreateAdvertisementConstants.ADVERTISEMENT_VO));
		}
	}

}
