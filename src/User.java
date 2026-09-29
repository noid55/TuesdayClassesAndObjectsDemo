public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void watchMovie(Movies movies){
        System.out.println(name + " started watching " + movies.getName());
    }
    public void watchTest(String text){
        System.out.println(text);
    }

}
