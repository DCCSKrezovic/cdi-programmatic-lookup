package org.acme;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Typed;
import org.jboss.logging.Logger;

@Dependent
@Typed(CdiBeanClass.class)
public class CdiBeanClass implements CdiBeanInterface {
  private static final Logger LOG = Logger.getLogger(CdiBeanClass.class);

  @Override
  public void doSomething() {
    LOG.info("Inside method");
  }
}
