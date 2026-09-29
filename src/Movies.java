public class Movies {
    private String name;
    private String description;
    private int length;
    private String filePath;
    private String genre;

    public Movies(String name, String description, int length, String filePath, String genre) {
        this.name = name;
        this.description = description;
        this.length = length;
        this.filePath = filePath;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void playMovie(){
        System.out.println("Spiller av " + name);
    }

}
