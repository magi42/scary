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
@WebServlet(name="ScaryServlet", urlPatterns=Array("/*"))
class ScaryServlet extends HttpServlet {
  override def service(request:HttpServletRequest, response:HttpServletResponse) = { 
    var outs = response.getOutputStream
    outs.println("Hello, world!")
  }
}
