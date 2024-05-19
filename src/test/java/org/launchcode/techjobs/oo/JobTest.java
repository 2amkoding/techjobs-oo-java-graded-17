package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;
import org.testng.AssertJUnit;

import javax.lang.model.element.Name;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        Assert.assertNotEquals(test_job1.getId(), test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job3.getName() != null);
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getCoreCompetency() != null);
        assertTrue(test_job3.getLocation() != null);
        assertTrue(test_job3.getPositionType() != null);

        assertEquals(test_job3.getName(), "Product tester");
        assertEquals("ACME", test_job3.getEmployer().toString());
        assertEquals(test_job3.getCoreCompetency().toString(), "Persistence");
        assertEquals(test_job3.getLocation().toString(), "Desert");
        assertEquals(test_job3.getPositionType().toString(), "Quality control");
    }
    @Test
    public void testJobsForEquality() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertNotEquals(test_job3, test_job4);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String s = System.lineSeparator();

        Job blank_job = new Job();

        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(s+ "ID: " + test_job3.getId() +s + "Name: " + test_job3.getName() +s +"Employer: " + test_job3.getEmployer()+s+"Location: " + test_job3.getLocation() +s +"Position Type: " + test_job3.getPositionType() +s +"Core Competency: " + test_job3.getCoreCompetency() +s, test_job3.toString());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String s = System.lineSeparator();

        Job blank_job = new Job();

        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(s+ "ID: " + test_job3.getId() +s + "Name: " + test_job3.getName() +s +"Employer: " + test_job3.getEmployer()+s+"Location: " + test_job3.getLocation() +s +"Position Type: " + test_job3.getPositionType() +s +"Core Competency: " + test_job3.getCoreCompetency() +s, test_job3.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        String s = System.lineSeparator();
        Job test_job3 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(test_job3,s+ "ID: " + test_job3.getId() +s + "Name: " + test_job3.getName() +s +"Employer: " + test_job3.getEmployer() +s+"Location: " + test_job3.getLocation() +s +"Position Type: " + test_job3.getPositionType() +s +"Core Competency: " + test_job3.getCoreCompetency() +s);
    }

}
