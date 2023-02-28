public class Main {

  public static void main(String[] args) {
    WeatherWarnings weatherWarnings = new WeatherWarnings();

    MacedoniaCity skopje = new MacedoniaCity("Skopje", 100);
    weatherWarnings.postWarning(skopje);

    MacedoniaCity tetovo = new MacedoniaCity("Tetovo", 40);
    weatherWarnings.postWarning(tetovo);

    MacedoniaCity struga = new MacedoniaCity("Struga", 30);
    weatherWarnings.postWarning(struga);

    AsianCity shanghai = new AsianCity("Shanghai", 60);
    Adapter adapter = new Adapter(shanghai);
    weatherWarnings.postWarning(adapter);

  }

}
