package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.spi.CDI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class CdiBeanClassTest {

  // @Inject CdiBeanClass injectedBean;

  @Test
  void doTestProgrammatic() {
    Instance<CdiBeanClass> selected = CDI.current().select(CdiBeanClass.class);
    Assertions.assertNotNull(selected.get());
  }

  //  @Test
  //  void doTestInjected() {
  //    Assertions.assertNotNull(injectedBean);
  //  }
}
