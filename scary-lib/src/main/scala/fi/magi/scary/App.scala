package fi.magi.scary

/**
 * For running the static page generator.
 * 
 * Does not do anything at the moment.
 * 
 * @author magi42
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}
