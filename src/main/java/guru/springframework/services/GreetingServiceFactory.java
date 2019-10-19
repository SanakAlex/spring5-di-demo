package guru.springframework.services;

public class GreetingServiceFactory {

  private final GreetingRepository greetingRepository;

  public GreetingServiceFactory(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  public GreetingService createGreetingService(String language) {
    switch (language) {
      case "de":
        return new PrimaryGermanGreetingService(greetingRepository);
      case "es":
        return new PrimarySpanishGreetingService(greetingRepository);
      case "en":
      default:
        return new PrimaryGreetingService(greetingRepository);
    }

  }
}
