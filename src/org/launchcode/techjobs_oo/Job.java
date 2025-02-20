package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {
    private static final String defaultMessage = "Data not available";
    private static final String oopsMessage = "\nOOPS! This job does not seem to exist.";
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if(name.equals("") && employer.toString().equals("") && location.toString().equals("")
                && positionType.toString().equals("") && coreCompetency.toString().equals(""))
            return oopsMessage;
        if(name.equals("")) setName(defaultMessage);
        if(employer.toString().equals("")) employer.setValue(defaultMessage);
        if(location.toString().equals("")) location.setValue(defaultMessage);
        if(positionType.toString().equals("")) positionType.setValue(defaultMessage);
        if(coreCompetency.toString().equals("")) coreCompetency.setValue(defaultMessage);
        return "\nID: " + id + "\nName: "
                + name + "\nEmployer: " + employer
                + "\nLocation: " + location + "\nPosition Type: "
                + positionType + "\nCore Competency: "
                + coreCompetency;
    }
}
