package com.olheiros.dateOlheiros;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseHelper {
    public static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference userReference = database.getReference("usuarios/jogadores");
}
