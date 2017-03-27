package org.apache.zeppelin.rest;

import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.apache.zeppelin.annotation.ZeppelinApi;
import org.apache.zeppelin.notebook.NotebookAuthorization;
import org.apache.zeppelin.server.JsonResponse;
import org.apache.zeppelin.ticket.TicketContainer;
import org.apache.zeppelin.utils.SecurityUtils;
import org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Rest API end point to restart zeppelin
 */
@Path("/restart")
@Produces("application/json")
public class RestartRestApi {
  private static final Logger LOG = LoggerFactory.getLogger(RestartRestApi.class);

  /**
  * Required by Swagger.
  */
  public RestartRestApi() {
    super();
  }

  @POST
  @ZeppelinApi
  public Response restart() {
    JsonResponse response = null;
    response = new JsonResponse(Response.Status.OK, "", System.getProperty("user.dir"));
    LOG.warn(ConfVars.ZEPPELIN_HOME.toString());
    LOG.warn(response.toString());
    return response.build();
  }
}
