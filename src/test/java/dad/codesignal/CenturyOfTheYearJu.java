package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CenturyOfTheYearJu {
	
	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	@Test
	public void test1() {
		assertEquals(20, tjb.centuryFromYear(1905));
	}
}
