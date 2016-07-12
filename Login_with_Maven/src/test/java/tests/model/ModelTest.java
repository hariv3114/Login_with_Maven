
package tests.model;

import static org.junit.Assert.*;
import org.junit.Test;

import com.prac.model.User;

/**
 * Created by Harigarakumar_Velayudam
 * on Jul 11, 2016
 * @version 1.0
 * @since
 */

public class ModelTest {

	@Test
	public void testUser() {
		
		User user = new User("HariV", "Doin");
		
		assertEquals(user.getEmail(), "HariV");
		
	}

}
