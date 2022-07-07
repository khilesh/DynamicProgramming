package org.dynamic.Programming;


//import org.dynamic.Programming.HouseRobber;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


//public class HouseRobberTest extends TestCase {
public class HouseRobberTest {

    final int[] input1 = new int[]{2, 7, 9, 3, 1};
    final int[] input2 = new int[]{1, 2, 3, 1};
    HouseRobber houseRobberObj = new HouseRobber();

    @Test
    @DisplayName("Testing House Robbers")
    public void testRob() {

        assertAll(() -> assertEquals(12, houseRobberObj.rob(input1)),
                () -> assertEquals(11, houseRobberObj.rob(input2)));

    }


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

}