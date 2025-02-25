package powerpackage;


import org.junit.Test;

public class powertest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert powerfinder.power(1,1) == 1;
    }

    @Test
    public void twoRaisesToOneIsTwo() {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void twoRaisedToThreeIsNine() {
        assert powerfinder.OF(3, 2) == 3*3;
    }
}
