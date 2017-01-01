package fi.magi.scary

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.annotation.WebServlet

/**
 * Dynamic page generator.
 *
 * Stub, does not do anything yet.
 */
@WebServlet(name = "ScaryServlet", urlPatterns = Array("/*"))
class ScaryServlet extends HttpServlet {
  private final val scary_webroot = "scary.webroot"
  
  override def service(request: HttpServletRequest, response: HttpServletResponse) = {
    var outs = response.getOutputStream
    outs.println("Hello, world!")
    
    // Get webroot path
    val env = System.getenv
    outs.println(
      if (env.containsKey(scary_webroot)) {
        val webroot: String = env.get(scary_webroot)
        "webroot=" + webroot
      } else
        "No webroot")

    val path = request.getPathInfo
    val page = new Page(path)
    page.generate(response)
  }
}
