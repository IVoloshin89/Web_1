package ru.netology.web;

import java.io.*;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        final var validPaths = List.of("/index.html", "/spring.svg", "/spring.png",
//                "/resources.html", "/styles.css", "/app.js", "/links.html", "/forms.html",
//                "/classic.html", "/events.html", "/events.js");

        var server = new Server(9999);
        server.start();

        // добавление хендлеров (обработчиков)
        server.addHandler("GET", "/messages", new Handler() {
            @Override
            public void handle(com.sun.net.httpserver.Request request, BufferedOutputStream responseStream) {

            }

            public void handle(Request request, BufferedOutputStream responseStream) {
                // TODO: handlers code
            }
        });
        server.addHandler("POST", "/messages", new Handler() {
            @Override
            public void handle(com.sun.net.httpserver.Request request, BufferedOutputStream responseStream) {

            }

            public void handle(Request request, BufferedOutputStream responseStream) {
                // TODO: handlers code
            }
        });

 //       server.listen(9999);
    }

}

