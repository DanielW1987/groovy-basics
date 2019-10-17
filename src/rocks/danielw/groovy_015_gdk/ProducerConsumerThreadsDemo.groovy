package rocks.danielw.groovy_015_gdk

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue

BlockingQueue sharedQueue = [] as LinkedBlockingQueue

Thread.start("push") {
  10.times {
    try {
      println "${Thread.currentThread().name}\t: $it"
      sharedQueue << it
      sleep 100
    }
    catch (InterruptedException ie) {
      // handle it
    }
  }
}

Thread.start("pop") {
  for (i in 9..0) {
    sleep 200
    println "${Thread.currentThread().name}\t: ${sharedQueue.take()}"
  }
}