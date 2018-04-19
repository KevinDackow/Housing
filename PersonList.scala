package Housing
class PersonList(){
	val allie : Person = new Person("Allie", true)
	val andrew : Person = new Person("Andrew", false)
	val becka : Person = new Person("Becka", false)
	val cristian : Person = new Person("Cristian", false)
	val jamie : Person = new Person("Jamie", true)
	val jeremy : Person = new Person("Jeremy", false)
	val michael : Person = new Person("Michael", true)
	val jake : Person = new Person("Jake", true)
	val caroline : Person = new Person("Caroline", true)
	val chris : Person = new Person("Chris", true)
	val kevin : Person = new Person("Kevin", false)

	val people : List[Person] = scala.util.Random.shuffle(allie :: andrew :: becka :: cristian :: jamie :: jeremy :: michael :: jake :: caroline :: chris :: kevin :: Nil)

}