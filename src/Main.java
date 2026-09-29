public class Main {
    static void main() {
        Movies movie1 = new Movies("The Dark Knight",
                "Batman saves Gotham again",
                135,
                "https://www.youtube.com/watch?v=dQw4w9WgXcQ",
                "Action"
        );

        Movies movie2 = new Movies("Mean Girls",
                "Veldig slemme jenter",
                160,
                "https://youtu.be/U8YCbEcmlfM",
                "Drama/Comedy");

        Movies movie3 = new Movies("The Fifth Element",
                "A disgruntled taxi driver saves the universe",
                170,
                "https://www.youtube.com/watch?v=TAeNlpUIlRs",
                "Action/Comedy");


//        System.out.println(movie1.getName());
//        System.out.println(movie1.getDescription());
        movie1.playMovie();

        User user1 = new User("Eirik", "epost@epostland.no");
        User user2 = new User("Ole", "email@gmail.com");
        user1.watchMovie(movie1);
        user2.watchMovie(movie2);
        movie1.getName();



        // https://chatgpt.com/share/6aba9b95-30cc-83eb-a39a-7ef219f660ff tostring sout movie1 explanation
    }
}
