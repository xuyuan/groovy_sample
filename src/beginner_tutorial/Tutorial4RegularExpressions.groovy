package beginner_tutorial

// http://groovy.codehaus.org/Tutorial+4+-+Regular+expressions+basics
// http://groovy.codehaus.org/Tutorial+5+-+Capturing+regex+groups
class Tutorial4RegularExpressions {
	static void main(args){
		println "potatoe" ==~ /potatoe/

		println "potato" ==~ /potatoe?/

		println "motato" ==~ /potatoe?/


		// Tutorial 5 - Capturing regex groups
		def locationData = "Liverpool, England: 53d 25m 0s N 3d 0m 0s"
		def myRegularExpression = /([a-zA-Z]+), ([a-zA-Z]+): ([0-9]+). ([0-9]+). ([0-9]+). ([A-Z]) ([0-9]+). ([0-9]+). ([0-9]+)./
		def matcher = ( locationData =~ myRegularExpression )
		println matcher.getCount()
		println matcher[0]
	}
}
