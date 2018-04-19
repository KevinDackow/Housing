package Housing;

class Specs extends AbsSpecs{
	
	def carMichael(people : List[Person]) : Boolean = {
		var isMichael : Boolean = false
		var isCaroline : Boolean = false 
		for (p <- people){
			if(p.name == "Michael"){
				isMichael = true
			} else if(p.name == "Caroline"){
				isCaroline = true
			}
		}
		isMichael && isCaroline
	}
}
