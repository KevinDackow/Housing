package Housing
import scala.collection.mutable.HashMap

class Group(val size : Int, val people : PersonList) {

		val groups: HashMap[Int, List[Person]] = HashMap.empty[Int, List[Person]]

		val specs: Specs = new Specs()

		// Adds a person to the given index
		def addToList(p : Person, index : Int){
			try{
				groups(index) = p :: groups(index)
			} catch {
				case e: NoSuchElementException => groups += index -> List(p)
				case ex: Exception => {
					print(ex)
					return
				}
			}
		}

		// Randomly adds a person to the list of lists
		def placePerson(p : Person){
			var spot : Int = Math.abs(scala.util.Random.nextInt()) % size
			if (spot < 0){
				spot = 0
			} else if(spot >= size){
				spot = size - 1
			}
			addToList(p, spot)
		}

		// Randomly places all people
		def placeAll = {
			for(p <- people.people){
				placePerson(p)
			}
			for((nume, lst) <- groups){
				if(specs.carMichael(lst)){
					for(person <- lst){
						if(person.name == "Michael"){
							groups(nume) = lst.filter(_.name != "Michael")
							if(nume > 0){
								addToList(person, nume - 1)
							} else if (nume < size - 1){
								addToList(person, nume + 1)
							} else {
								addToList(person, nume)
							}
						}
					}
				}	
			}
		}

		placeAll
}
