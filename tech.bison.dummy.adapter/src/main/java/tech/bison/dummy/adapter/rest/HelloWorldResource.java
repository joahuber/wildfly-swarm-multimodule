
package tech.bison.dummy.adapter.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("HelloWorld")
public interface HelloWorldResource {

  /**
   * 
   */
  @GET
  @Produces({ "application/json" })
  HelloWorldResource.GetHelloWorldResponse getHelloWorld() throws Exception;

  public class GetHelloWorldResponse extends ResponseWrapper {

    private GetHelloWorldResponse(Response delegate) {
      super(delegate);
    }

    /**
     * 
     * @param entity
     * 
     */
    public static HelloWorldResource.GetHelloWorldResponse withJsonOK(Greeting entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new HelloWorldResource.GetHelloWorldResponse(responseBuilder.build());
    }

  }

}
