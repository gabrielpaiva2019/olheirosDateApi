package com.olheiros.dateOlheiros;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.*;
import jdk.incubator.jpackage.internal.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Handler;

@Controller
public class DateOlheirosController {

    @GetMapping("/trueDate")
    @ResponseBody
    public ResponseEntity<DateModel> currentMonth() {

        DateModel dateModel = new DateModel();
        dateModel.setDay(String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)));
        dateModel.setMonth(String.valueOf(Calendar.getInstance().get(Calendar.MONTH) + 1));
        dateModel.setYear(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));

        return ResponseEntity.ok(dateModel);
    }

    @GetMapping("/deleteUser/{uid}")
    @ResponseBody
    public void deleteUser(@PathVariable("uid") String uid) {

        try {
            FirebaseAuth.getInstance().deleteUser(uid);
        } catch (FirebaseAuthException e) {
            e.printStackTrace();
        }

    }

    @GetMapping("/listaUsuariosCadastrados")
    @ResponseBody
    public ResponseEntity<List<Jogador>> listaUsuariosCadastrados() {
        List<Jogador> jogadores = new ArrayList<>();
        FirebaseHelper.userReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {

                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    jogadores.add(dataSnapshot.getValue(Jogador.class));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }

        });

        responseAfterTenSeconds();
        return ResponseEntity.ok(jogadores);

    }

    @Async
    void responseAfterTenSeconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // do service B call stuff
    }
}
