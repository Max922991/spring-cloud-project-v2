package org.example.passportservice.service;

import org.example.passportservice.model.Passport;


public interface PassportService {

    Passport getPassport(Long passportId);
    Passport createPassport(Long passportId, String fullName, String secondName);
}
