package test

import java.util.Date

class TestProgram {
	static void main(args){
		println "Hello World"

		def a = 'Axel'
		a = new Object()
		a = 10
		println a

		def b = 7
		println 'a + b = ${a + b}'
		println "a + b = ${a + b}"

		// list
		def myList = [
			10,
			"John",
			new Integer(5),
			new Double(7.6d)
		]
		myList = [
			"Apple",
			"Basketball",
			"Championship"
		]
		println myList*.length()

		// map
		def emptyMap = [:]
		def mapWithValues = [fruit:'Apple',  veggie:'Carrot']
		println mapWithValues['fruit']
		println mapWithValues.get('car')

		// loop
		5.times { println "Hello" }

		myList.each { n -> println n }

		mapWithValues.each { k, v ->
			println "${k} = ${v}"
		}
	}
}
