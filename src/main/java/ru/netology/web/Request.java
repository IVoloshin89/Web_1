package ru.netology.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Request {
    private final String method;
    private final String message;
    private final Map<String, String> headers;
  //  private final String body;


    public Request(BufferedReader in) throws IOException {
        String requestLine = in.readLine();

        var parts = requestLine.split(" ");
        if (parts.length < 2) {
            throw new IOException("Не корректный формат");
        }
        this.method = parts[0];
        this.message = parts[1];

        this.headers = new HashMap<>();
        String headerLine = in.readLine();
        while (!(headerLine = in.readLine()).isEmpty()) {
            int separator = headerLine.indexOf(':');
            if (separator > 0) {
                String key = headerLine.substring(0, separator).trim();
                String value = headerLine.substring(separator + 1).trim();
                headers.put(key, value);
            }
        }
    }
}


