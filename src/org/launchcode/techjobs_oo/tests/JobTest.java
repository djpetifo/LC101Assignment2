package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    private Job job1;
    private Job job2;
    private Job job3;
    private Job job4;

    @Before
    public void createJobObjects() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
        job4 = new Job("Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertTrue(job1.getId() != job2.getId());
    }

    @Test
    public void testConstructorSetsAllFields() {
        assertEquals(3, job3.getId());
        assertTrue(job3.getName() == "Product Tester" && job3.getName() instanceof String);
        assertTrue(job3.getEmployer().getValue() == "ACME" && job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation().getValue() == "Desert" && job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType().getValue() == "Quality Control" && job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency().getValue() == "Persistence" && job3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertEquals(false, job1.equals(job4));
    }

    @Test
    public void testJobToStringMethod() {
        assertEquals("\nOOPS! This job does not seem to exist.\n", job1.toString());
        assertEquals("\nID: 3" +
                "\nName: Product Tester" +
                "\nEmployer: ACME" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality Control" +
                "\nCore Competency: Persistence\n", job3.toString());
    }
}
