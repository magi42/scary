package fi.magi.scary

import javax.servlet.http.HttpServletResponse

/**
 * Page object reads and generates the page.
 */
class Page(val path: String) {
  def generate(response: HttpServletResponse) = {
    val original = read(path)
    var outs = response.getOutputStream
    outs.println("path=" + path)
    
    // Null path should be treated same as root path
    // TODO Path with or without terminating slash may refer to a directory
    val cleanpath =
      if (path == null) "/" else path
    outs.println("cleanpath=" + cleanpath)

    // val template = templates.match(url)
}
  
  def checkexists(filename: String) : Boolean = {
    false
  }

  def read(path: String): String = {
    null
  }
}