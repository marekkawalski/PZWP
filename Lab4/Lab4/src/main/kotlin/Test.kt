fun main(){
    val s: IElement = Location("Polska")
    var l = Location("Krakow")
    s.addElement(l)
    val l2 = Location("Krakow Plaszow")
    l.addElement(l2)
    l = l2
    l.addElement(Car("Fiat"))
    l.addElement(Car("Opel"))
    l = Location("Warszawa")
    l.addElement(Car("Mercedes"))
    s.addElement(l)
    s.addElement(Car("Ford"))
    s.info()
}