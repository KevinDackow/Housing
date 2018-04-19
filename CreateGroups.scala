package Housing;


object CreateGroups {
  def main(args: Array[String]): Unit = {
  	if(args.length != 1){
  		println("Usage: <number of groups>")
  		return
  	}
  	val size : Int = args(0).toInt
    val people : PersonList = new PersonList()
    val group : Group = new Group(size, people)
    var count : Int = 1
   	for((nume, lst) <- group.groups) {
    	println("Group " + count + ":")
    	for(p <- lst){
    		print(p.toString + " ")
    	}
    	count = count + 1
    	println("")
    	println("")
    }
  }
}