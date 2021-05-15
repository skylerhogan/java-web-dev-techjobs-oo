package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job test1 = new Job("job1",new Employer("employer1"),new Location("location1"),new PositionType("position1"),new CoreCompetency("coreCompetency1"));
        Job test2 = new Job("job2",new Employer("employer2"),new Location("location2"),new PositionType("position2"),new CoreCompetency("coreCompetency2"));
        assertEquals(test1.getId()+1, test2.getId());
        assertTrue(test2.getId() - test1.getId() == 1);
        assertFalse(test1.getId() == test2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test1 instanceof Job && test1.getName()=="Product tester");
        assertTrue(test1.getEmployer() instanceof Employer && test1.getEmployer().getValue()=="ACME");
        assertTrue(test1.getLocation() instanceof Location && test1.getLocation().getValue()=="Desert");
        assertTrue(test1.getPositionType() instanceof PositionType && test1.getPositionType().getValue()=="Quality control");
        assertTrue(test1.getCoreCompetency() instanceof CoreCompetency && test1.getCoreCompetency().getValue()=="Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job test1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test1 == test2);
    }

}
