package ru.antowka.hashequals;

/**
 * Переопределение hashCode и Equals
 */
public class Employer {

    private int id;
    private String name;
    private String lastname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public int hashCode() {

        final int prime = 31;

        int result = 1;
        result = prime * getId();

        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        if (this.hashCode() == obj.hashCode())
            return true;

        return true;
    }
}
