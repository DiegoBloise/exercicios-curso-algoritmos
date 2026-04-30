package cursoJava.secao12.ex02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import cursoJava.secao12.ex02.models.Comment;
import cursoJava.secao12.ex02.models.Post;

public class Main {

    public static void main(String[] args) {
        List<Post> posts = createPosts();
        showFeed(posts);
    }

    public static List<Post> createPosts() {
        List<Post> posts = new ArrayList<>();

        posts.add(
                new Post(
                        LocalDateTime.of(2018, 6, 21, 13, 5, 44),
                        "Travelling to New Zealand",
                        "I'm going to visit this wonderfull country!",
                        12));
        posts.getLast().addComent(new Comment("Have a nice trip"));
        posts.getLast().addComent(new Comment("Wow that's awesome!"));

        posts.add(
                new Post(
                        LocalDateTime.of(2018, 7, 28, 23, 14, 19),
                        "Good night guys",
                        "See you tomorrow",
                        12));
        posts.getLast().addComent(new Comment("Good night"));
        posts.getLast().addComent(new Comment("May the Force be with you"));

        return posts;
    }

    public static void showFeed(List<Post> posts) {
        posts.forEach(System.out::println);
    }
}