package pl.graczyk.matchresults.POJO;

import java.util.Objects;

public class Competitor {
  private  String id;
  private  String name;
  private  String country;
  private  String country_code;
  private  String abbreviation;
  private  String qualifier;
  private  String gender;

    public Competitor(String id, String name,
                      String country, String countryCode,
                      String abbreviation, String qualifier,
                      String gender) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.country_code = countryCode;
        this.abbreviation = abbreviation;
        this.qualifier = qualifier;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "(" + country + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Competitor that = (Competitor) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(country, that.country) && Objects.equals(country_code, that.country_code) && Objects.equals(abbreviation, that.abbreviation) && Objects.equals(qualifier, that.qualifier) && Objects.equals(gender, that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, country_code, abbreviation, qualifier, gender);
    }
}

