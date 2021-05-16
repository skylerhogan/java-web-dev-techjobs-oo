package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job test1 = new Job("job1",new Employer("employer1"),new Location("location1"),new PositionType("position1"),new CoreCompetency("coreCompetency1"));
        Job test2 = new Job("job2",new Employer("employer2"),new Location("location2"),new PositionType("position2"),new CoreCompetency("coreCompetency2"));
        assertEquals(1, test2.getId() - test1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        for (boolean b : new boolean[]{test1.getName() == "Product tester", test1.getEmployer() != null && test1.getEmployer().getValue().equals("ACME"), test1.getLocation() != null && test1.getLocation().getValue().equals("Desert"), test1.getPositionType() != null && test1.getPositionType().getValue().equals("Quality control"), test1.getCoreCompetency() != null && test1.getCoreCompetency().getValue().equals("Persistence")}) {
            assertTrue(b);
        }
    }

    @Test
    public void testJobsForEquality() {
        Job test1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotSame(test1, test2);
    }

    @Test
    public void testToStringDisplaysFieldsCorrectly() {
        Job test1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test2 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test3 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals(test1.toString(), "\nID: " + test1.getId() + "\nName: " + test1.getName() + "\nEmployer: " + test1.getEmployer() + "\nLocation: " + test1.getLocation() + "\nPosition Type: " + test1.getPositionType() + "\nCore Competency: " + test1.getCoreCompetency());
        assertEquals(test2.toString(), "\nID: " + test2.getId() + "\nName: " + test2.getName() + "\nEmployer: " + "Data not available" + "\nLocation: " + test2.getLocation() + "\nPosition Type: " + test2.getPositionType() + "\nCore Competency: " + test2.getCoreCompetency());
        assertEquals("\nOOPS! This job does not seem to exist.", test3.toString());
    }

}
