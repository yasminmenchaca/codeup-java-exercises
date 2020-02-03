package movies;

// TODO Create a class named Movie. It should have private fields for name and category, and a constructor that sets both of these. Create methods to access these properties and change them (getters and setters).

// https://www.w3schools.com/java/java_encapsulation.asp

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // returns the movies's name
    public String getName() {
        return name;
    }

    // changes the name property to the passed value
    public void setName(String newName) {
        this.name = newName;
    }

    // returns the category's name
    public String getCategory() {
        return category;
    }

    // changes the name property to the passed value
    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

}
