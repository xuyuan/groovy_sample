package beginner_tutorial

// http://groovy.codehaus.org/Tutorial+2+-+Code+as+data%2C+or+closures
class Tutorial2 {
	static void main(args){
		def square = { it * it }
		println square(9)

		def s = [1, 2, 3, 4].collect(square)
		println s

		def printMapClosure = { key, value -> println key + "=" + value }
		[ "Yue" : "Wu", "Mark" : "Williams", "sudha" : "Kumari" ].each(printMapClosure)

		println this.inspect() // You can use the this keyword inside static methods (which refers to this class).
		println this.dump()
	}
}
