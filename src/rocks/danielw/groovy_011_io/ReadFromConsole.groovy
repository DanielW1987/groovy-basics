package rocks.danielw.groovy_011_io

println("Please enter your favorite team: ")
String team
System.in.withReader {
  team = it.readLine()
}

println("Your favorite team is: $team")