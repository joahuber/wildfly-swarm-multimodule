
package tech.bison.dummy.adapter.jpa;

import javax.enterprise.context.RequestScoped;

import tech.bison.dummy.domain.Dummy;
import tech.bison.dummy.domain.DummyRepository;

@RequestScoped
public class DummyRepositoryImpl implements DummyRepository {

  @Override
  public void save(Dummy dummy) {
    // do nothing
  }

  @Override
  public String getWorld() {
    return "Mars";
  }

}
