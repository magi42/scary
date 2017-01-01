package fi.magi.scary.demo

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.annotation.WebServlet
import fi.magi.scary.ScaryServlet

/**
 * Dynamic page generator.
 *
 * Stub, does not do anything yet.
 */
@WebServlet(name = "ScaryDemoServlet", urlPatterns = Array("/*"))
class ScaryDemoServlet extends ScaryServlet {

}
