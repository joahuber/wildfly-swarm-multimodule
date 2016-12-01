
package tech.bison.dummy.application;

import javax.ejb.Stateless;
import javax.inject.Inject;

import tech.bison.dummy.application.api.DummyDto;
import tech.bison.dummy.application.api.DummyService;
import tech.bison.dummy.domain.Dummy;
import tech.bison.dummy.domain.DummyRepository;

@Stateless
public class DummyServiceImpl implements DummyService {

  @Inject
  DummyRepository dummyRepository;

  @Override
  public void createDummy(DummyDto dummyDto) {
    final Dummy dummy = new Dummy();
    dummyRepository.save(dummy);
  }

  @Override
  public String helloWorld() {
    return "hello " + dummyRepository.getWorld();
  }
}
