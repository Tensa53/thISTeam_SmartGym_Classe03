package com.example.smartgym.infoUtenti.application.service;

import com.example.smartgym.infoUtenti.storage.entity.Utente;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

/**
 * La seguente interfaccia definisce quali funzionalita e servizi bisogna implementare
 */
public interface InfoUtentiService {

    Task<AuthResult> login(String email, String password);

    void logout ();

    Task<DocumentSnapshot> getUserbyId(String id);

    Task<QuerySnapshot> getUserbyEmail(String email);

    Task<AuthResult> registerUserAuth(String email,String password);

    Task<DocumentReference> registerUserData(Utente utente);

    void modificaInfoProfilo();

    void inserimentoCaratteristicheAtleta();

    void modificaCaratteristicheAtleta();

    void cancellazioneProfilo(String email);



}
