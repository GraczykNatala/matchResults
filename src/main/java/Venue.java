public class Venue {
    private   String id;
    private   String name;
    private   int capacity;
    private   String cityName;
    private   String countryName;
    private   String mapCoordinates;
    private   String countryCode;

       public Venue(String id, String name,
                    int capacity, String cityName,
                    String countryName, String mapCoordinates,
                    String countryCode) {
              this.id = id;
              this.name = name;
              this.capacity = capacity;
              this.cityName = cityName;
              this.countryName = countryName;
              this.mapCoordinates = mapCoordinates;
              this.countryCode = countryCode;
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

       public String getCityName() {
              return cityName;
       }

       public void setCityName(String cityName) {
              this.cityName = cityName;
       }

       public String getCountryName() {
              return countryName;
       }

       public void setCountryName(String countryName) {
              this.countryName = countryName;
       }

       public String getMapCoordinates() {
              return mapCoordinates;
       }

       public void setMapCoordinates(String mapCoordinates) {
              this.mapCoordinates = mapCoordinates;
       }

       public String getCountryCode() {
              return countryCode;
       }

       public void setCountryCode(String countryCode) {
              this.countryCode = countryCode;
       }
}
