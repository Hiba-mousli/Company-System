 package org.closure.systemcompany.Services;

import javax.annotation.PostConstruct;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.util.Objects;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@Service
public class FCMService {
    @Autowired
    ResourceLoader resourceLoader; 
    @Autowired
    private FirebaseMessaging firebaseMessaging;

    
    @Bean
    public FirebaseMessaging init() throws IOException
    {
      //  try{
      //       FileInputStream serviceAccount =
      //         new FileInputStream("C:/Users/ASUS/Documents/GitHub/Company-System/systemcompany/src/main/resources/credentials.json");

      //       FirebaseOptions options = new FirebaseOptions.Builder()
      //         .setCredentials(GoogleCredentials.fromStream(serviceAccount))
      //         .build();

      //       FirebaseApp.initializeApp(options);
      //      }
      //  catch(Exception e){
      //       e.printStackTrace();
      //   }
       // initalize firebase app

      //  try{
      //  ClassLoader classLoader = FCMService.class.getClassLoader();
      //  File file = new File(Objects.requireNonNull(classLoader.getResource("credentials.json")).getFile());
      //  FileInputStream serviceAccount = new FileInputStream(file.getAbsolutePath());

      //  FirebaseOptions options = new FirebaseOptions.Builder()
      //                                               .setCredentials(GoogleCredentials.fromStream(serviceAccount))
      //                                               .build();
      //  FirebaseApp.initializeApp(options);
      //     }
      //   catch(Exception e){
      //     e.printStackTrace();
      //   }  

        InputStream serviceAccount =
        resourceLoader.getResource("classpath:googlecred.json").getInputStream();
        
        FirebaseOptions.Builder builder = FirebaseOptions.builder();
        GoogleCredentials googleCredentials = GoogleCredentials.fromStream(serviceAccount);
        FirebaseOptions options = builder.setCredentials(googleCredentials).build();
        FirebaseApp app = FirebaseApp.initializeApp(options);
        return FirebaseMessaging.getInstance(app);

    //     GoogleCredentials googleCredentials = GoogleCredentials
    //         .fromStream(new ClassPathResource("firebase-service-account.json").getInputStream());
    // FirebaseOptions firebaseOptions = FirebaseOptions
    //         .builder()
    //         .setCredentials(googleCredentials)
    //         .build();
    // FirebaseApp app = FirebaseApp.initializeApp(firebaseOptions, "my-app");
    // return FirebaseMessaging.getInstance(app);
    }

    public String sendMessage(String title,String message, String token) throws FirebaseMessagingException
    {

        Notification notification = Notification
                .builder()
                .setTitle(title)
                .setBody(message)
                .setImage("https://static.vecteezy.com/system/resources/previews/000/377/611/original/notification-vector-icon.jpg")
                .build();

        Message packet = Message
                .builder()
                .setToken(token)
                .setNotification(notification)
                .build();

        return firebaseMessaging.send(packet);
    }

  //   public String sendNotification(Note note, String token) throws FirebaseMessagingException {

  //     Notification notification = Notification
  //             .builder()
  //             .setTitle(note.getSubject())
  //             .setBody(note.getContent())
  //             .build();

  //     Message message = Message
  //             .builder()
  //             .setToken(token)
  //             .setNotification(notification)
  //             .putAllData(note.getData())
  //             .build();

  //     return firebaseMessaging.send(message);
  // }
    
}
