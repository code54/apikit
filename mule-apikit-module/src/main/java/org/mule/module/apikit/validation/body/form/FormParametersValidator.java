/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.apikit.validation.body.form;

import org.mule.module.apikit.api.exception.BadRequestException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FormParametersValidator {

  protected static final Logger logger = LoggerFactory.getLogger(FormParametersValidator.class);

  FormValidatorStrategy strategy;

  public FormParametersValidator(FormValidatorStrategy strategy) {
    this.strategy = strategy;
  }

  public Object validate(Object payload) throws BadRequestException {
    return this.strategy.validate(payload);
  }
}
