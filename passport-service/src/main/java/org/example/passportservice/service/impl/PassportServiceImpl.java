package org.example.passportservice.service.impl;

import org.example.passportservice.model.Passport;
import org.example.passportservice.service.PassportService;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService {
    @Override
    public Passport getPassport(Long passportId) {
        return null;
    }

    @Override
    public Passport createPassport(Long passportId, String fullName, String secondName) {
        return null;
    }
}
