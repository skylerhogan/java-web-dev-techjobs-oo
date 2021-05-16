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
        assertNotSame(test1, test2);
        assertFalse(test1 == test2);
    }

    @Test
    public void testToStringDisplaysFieldsCorrectly() {
        Job test1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test2 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test3 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertTrue(test1.toString().equals("\nID: " + test1.getId() + "\nName: " + test1.getName() + "\nEmployer: " + test1.getEmployer() + "\nLocation: " + test1.getLocation() + "\nPosition Type: " + test1.getPositionType() + "\nCore Competency: " + test1.getCoreCompetency()));
        assertTrue(test2.toString().equals("\nID: " + test2.getId() + "\nName: " + test2.getName() + "\nEmployer: " + "Data not available" + "\nLocation: " + test2.getLocation() + "\nPosition Type: " + test2.getPositionType() + "\nCore Competency: " + test2.getCoreCompetency()));
        assertTrue(test3.toString().equals("\nOOPS! This job does not seem to exist."));
    }

}
