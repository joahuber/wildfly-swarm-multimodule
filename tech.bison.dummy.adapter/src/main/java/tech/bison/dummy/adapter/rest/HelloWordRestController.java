
package tech.bison.dummy.adapter.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

import tech.bison.dummy.application.api.DummyService;

@RequestScoped
@Path("/HelloWorld")
public class HelloWordRestController implements HelloWorldResource {
  @Inject
  DummyService dummyService;

  public GetHelloWorldResponse getHelloWorld() {
    final Greeting greeting = new Greeting();
    greeting.setText(dummyService.helloWorld());
    return GetHelloWorldResponse.withJsonOK(greeting);
  }

}
