package ru.netology.domain;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ivan";
        post.passport = "1234 # 1313122";
        post.patronymic = "Ivanovich";
        post.phone = "8(111)-111-11-11";
        post.surname = "Ivanov";
        post.subscription = "true";
        post.birthday = new FormDate();
            post.birthday.day ="13";
            post.birthday.month ="september";
            post.birthday.year  ="1990";
    }
}
