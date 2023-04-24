/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import entities.Utilisateur;

/**
 *
 * @author Winxspace
 */
public class Smstools {
     public static void sendSms( Utilisateur user, String code ) {
        String ACCOUNT_SID = "AC53c8043817337304a53c5a849ee6ea1a";
        String AUTH_TOKEN = "12dec889392893c0623584f0768424c0";
        
         
          Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                // to phone number
                new com.twilio.type.PhoneNumber("+216"+user.getCin()),
                new com.twilio.type.PhoneNumber("+16813217942"),
                " Votre code de reinitialisation du not de passe est : "+code)
            .create();

        System.out.println(message.getSid());
        }
    
    
}
