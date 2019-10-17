package rocks.danielw.groovy_015_gdk

/*
 * A Groovy closure implements the Runnable interface
 */
def t = new Thread() {
  // do something
}
t.start()

/*
 * The Thread class has some static methods to start threads
 */
Thread.start {
  // do something
}

Thread.start("myThread") {
  // do something
}

Thread.startDaemon("myDaemonThread") {
  // do something
}
