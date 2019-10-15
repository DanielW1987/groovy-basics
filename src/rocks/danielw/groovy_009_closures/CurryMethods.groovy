package rocks.danielw.groovy_009_closures

/*
 * curry()
 */
def log = {String type, Date createdOn, String msg ->
  println "$createdOn [$type] - $msg"
}
log("DEBUG", new Date(), "This is my first debug statement")


def debugLog = log.curry("DEBUG")
debugLog(new Date(), "This is my second debug statement")

def currentTimeDebugLog = debugLog.curry(new Date())
currentTimeDebugLog("This is my third debug statement")


/*
 * index based currying
 * ncurry()
 */
def typeMsgLog = log.ncurry(1, new Date())
typeMsgLog("INFO", "An info message")


/*
 * right curry - starts currying from the right
 * rcurry()
 */
def crazyPersonLog = log.rcurry("Why am I logging this way?")
crazyPersonLog("ERROR", new Date())