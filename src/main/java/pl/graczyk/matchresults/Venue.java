package pl.graczyk.matchresults;

public class Venue {
    private   String id;
    private   String name;
    private   int capacity;
    private   String city_name;
    private   String country_name;
    private   String map_coordintes;
    private   String country_code;

       public Venue(String id, String name,
                    int capacity, String cityName,
                    String countryName, String mapCoordinates,
                    String countryCode) {
              this.id = id;
              this.name = name;
              this.capacity = capacity;
              this.city_name = cityName;
              this.country_name = countryName;
              this.map_coordintes = mapCoordinates;
              this.country_code = countryCode;
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

       public int getCapacity() {
              return capacity;
       }

       public void setCapacity(int capacity) {
              this.capacity = capacity;
       }

       public String getCity_name() {
              return city_name;
       }

       public void setCity_name(String city_name) {
              this.city_name = city_name;
       }

       public String getCountry_name() {
              return country_name;
       }

       public void setCountry_name(String country_name) {
              this.country_name = country_name;
       }

       public String getMap_coordintes() {
              return map_coordintes;
       }

       public void setMap_coordintes(String map_coordintes) {
              this.map_coordintes = map_coordintes;
       }

       public String getCountry_code() {
              return country_code;
       }

       public void setCountry_code(String country_code) {
              this.country_code = country_code;
       }

    @Override
    public String toString() {
        return "Venue: " +  name + ",";
    }
}
