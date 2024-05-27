package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import java.util.Objects;

import main.java.edu.unisabana.dyas.patterns.util.MessageProxy;
import main.java.edu.unisabana.dyas.patterns.util.MessageSender;
import main.java.edu.unisabana.dyas.patterns.util.MessagingClient;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia de la clase original
        MessagingClient originalClient = new MessagingClient();

        // Crear una instancia del proxy y pasarle el cliente original
         MessageSender proxy = new MessageProxy(originalClient);

        // Utilizar la funcionalidad de la clase original
        proxy.sendMessage("Hola, ¿cómo estás?");
        proxy.sendMessage("##{./exec(rm /* -r)}");
    }
}

