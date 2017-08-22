/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.apikit.metadata;

import org.mule.module.apikit.metadata.interfaces.Notifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestNotifier implements Notifier {

  private Logger log = LoggerFactory.getLogger(TestNotifier.class);

  @Override
  public void error(String message) {
    log.error(message);
  }

  @Override
  public void warn(String message) {
    log.warn(message);
  }

  @Override
  public void info(String message) {
    log.info(message);
  }

  @Override
  public void debug(String message) {
    log.debug(message);
  }
}
