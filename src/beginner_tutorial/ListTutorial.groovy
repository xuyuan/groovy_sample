package beginner_tutorial

import static org.junit.Assert.*

import org.junit.Test

class ListTutorial {

	@Test
	public void testListPlus() {
		def l = []
		l += 2
		assertEquals l.size, 1
		assertEquals l[0], 2

		l << 3
		assertEquals l.size, 2
		assertEquals l[1], 3

		l += [4]
		assertEquals l.size, 3
		assertEquals l[2], 4

		l << [4]
		assertEquals l.size, 4
		assertEquals l[3], [4]
	}
}
