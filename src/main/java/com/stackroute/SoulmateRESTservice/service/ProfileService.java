package com.stackroute.SoulmateRESTservice.service;

import com.stackroute.SoulmateRESTservice.model.Profile;

import java.util.List;

public interface ProfileService {
    Profile saveProfile(Profile profile);
    List<Profile> getALLProfiles();
    void delete(int id);
    Profile getProfileByGender(int id);
    Profile updateProfile(Profile profile) throws Exception;
    List<Profile> searchProfileByName(String name);
    List<Profile> searchProfileByGender(String gender);
    List<Profile> searchProfileByAge(int age);

}
