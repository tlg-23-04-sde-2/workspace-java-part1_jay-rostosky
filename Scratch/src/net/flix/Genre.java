package net.flix;

enum Genre {
    // these are the 8 named Genre objects (instances)
    // each of these calls the ctor below, passing a display string
    ROMANCE("Romance"),
    SCI_FI("Sci-Fi"),
    COMEDY("Comedy :)"),
    HORROR("HORROR"),
    DOCUMENTARY("Documentary"),
    ACTION("Action"),
    THRILLER("Thriller"),
    DRAMA("Drama");

    // everything below here is regular class definition stuff, i.e., fields, ctors, methods
    private final String display;

    // constructor - implicitly private, only called from inside (8 times above)
    Genre(String display) {
        // System.out.println("Genre ctor called");
        this.display = display;
    }

    // accessor methods - here, we provide "read-only" access to the display property
    public String display() {
        return display;
    }

    public String toString() {
        return display();  // generally better to call your own getter
    }
}