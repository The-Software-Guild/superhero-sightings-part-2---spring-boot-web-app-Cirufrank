/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.we.superherosighting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Cirũ Franklin (she/they), Software Engineer
 * @course DI002 Full Stack Development Using Java and React (2210)
 * @project Assessment: Superhero Sightings
 * 
 * @description This application allows users to add, edit, and read resources
 * by interacting with the Superhero Sightings Application
 * 
 * It uses the MVC architectural paradigm to organize files
 * in order to keep code DRY while separating concerns
 * 
 * Through the use of local database storage the games and rounds created 
 * persist
 * 
 * Additionally, Spring dependency injection is utilized in order to take advantage
 * of loose coupling through Spring's Inversion of Control container
 * 
 * Lastly, Spring Boot starts Spring MVC with a main method
 *
 * Spring Boot is bundled with a Web Server
 * which is why Spring Boot starts the web server and not vice
 * versa
 * 
 *
 * 
 * 
 */

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
