public enum Genre {
    THRILLER("Lots of twists and turns."),
    HORROR("Scary and gory."),
    SCI_FI("Based on science, but fictionalised");

    private final String description;

    Genre(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
