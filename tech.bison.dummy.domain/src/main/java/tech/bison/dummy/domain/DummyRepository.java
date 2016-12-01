package tech.bison.dummy.domain;



public interface DummyRepository {
  void save(Dummy dummy);

  String getWorld();
}
