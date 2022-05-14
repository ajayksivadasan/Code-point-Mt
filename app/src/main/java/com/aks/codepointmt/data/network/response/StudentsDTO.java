package com.aks.codepointmt.data.network.response;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class StudentsDTO {
    @SerializedName("id")
    private int id;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("name")
    private String name;
    @SerializedName("dob")
    private String dob;
    @SerializedName("gender")
    private String gender;
    @SerializedName("academic_year_id")
    private int academicYearId;
    @SerializedName("academic_year_label")
    private String academicYearLabel;
    @SerializedName("admission_number")
    private String admissionNumber;
    @SerializedName("batch_name")
    private String batchName;
    @SerializedName("batch_id")
    private Object batchId;
    @SerializedName("photo")
    private String photo;
    @SerializedName("blood_group")
    private String bloodGroup;
    @SerializedName("known_allergies")
    private String knownAllergies;
    @SerializedName("address")
    private String address;
    @SerializedName("father_organization")
    private String fatherOrganization;
    @SerializedName("father_designation")
    private String fatherDesignation;
    @SerializedName("father_qualification")
    private String fatherQualification;
    @SerializedName("father_address_line_1")
    private String fatherAddressLine1;
    @SerializedName("father_address_line_2")
    private String fatherAddressLine2;
    @SerializedName("father_address_line_3")
    private String fatherAddressLine3;
    @SerializedName("father_areas_of_interest")
    private String fatherAreasOfInterest;
    @SerializedName("father_volunteer_interest")
    private String fatherVolunteerInterest;
    @SerializedName("mother_organization")
    private String motherOrganization;
    @SerializedName("mother_designation")
    private String motherDesignation;
    @SerializedName("mother_qualification")
    private String motherQualification;
    @SerializedName("mother_address_line_1")
    private String motherAddressLine1;
    @SerializedName("mother_address_line_2")
    private String motherAddressLine2;
    @SerializedName("mother_address_line_3")
    private String motherAddressLine3;
    @SerializedName("mother_areas_of_interest")
    private String motherAreasOfInterest;
    @SerializedName("mother_volunteer_interest")
    private String motherVolunteerInterest;
    @SerializedName("father_instagram")
    private String fatherInstagram;
    @SerializedName("father_facebook")
    private String fatherFacebook;
    @SerializedName("father_twitter")
    private String fatherTwitter;
    @SerializedName("mother_instagram")
    private String motherInstagram;
    @SerializedName("mother_facebook")
    private String motherFacebook;
    @SerializedName("mother_twitter")
    private String motherTwitter;
    @SerializedName("place")
    private String place;
    @SerializedName("origin")
    private String origin;
    @SerializedName("show_volunteer_interest")
    private String showVolunteerInterest;
    @SerializedName("parent_address_flag")
    private String parentAddressFlag;
    /**
     * id : 16
     * logo : https://tms-lb-server.s3.ap-south-1.amazonaws.com/TMS/common/20210722192921_tms_w_WhatsApp%20Image%202020-05-12%20at%208.50.13%20PM.jpeg
     * name : TrackMySchool - Staging
     * code : TMS
     * address : 1st Floor, St. Mary's Tower,
     * Sahodaran Ayyappan Rd,
     * opp. Naval Quarters,
     * Elamkulam, Kochi,
     * Kerala 682020
     * <p>
     * y
     * hgjfyjyjy
     * uyjuyjj
     * subscription_type : type4
     * latitude : 23.6288292
     * longitude : 58.0857719
     * academic_year_id : 1992
     * academic_year_label : 2022-2023
     * academic_year_start_date : 2022-04-01
     * academic_year_end_date : 2023-03-31
     */

    @SerializedName("school")
    private SchoolDTO school;
    /**
     * id : 2175
     * name : I
     */

    @SerializedName("class")
    private ClassDTO classX;
    /**
     * id : 3229
     * name : A
     */

    @SerializedName("division")
    private DivisionDTO division;

    public static StudentsDTO objectFromData(String str) {

        return new Gson().fromJson(str, StudentsDTO.class);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(int academicYearId) {
        this.academicYearId = academicYearId;
    }

    public String getAcademicYearLabel() {
        return academicYearLabel;
    }

    public void setAcademicYearLabel(String academicYearLabel) {
        this.academicYearLabel = academicYearLabel;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Object getBatchId() {
        return batchId;
    }

    public void setBatchId(Object batchId) {
        this.batchId = batchId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getKnownAllergies() {
        return knownAllergies;
    }

    public void setKnownAllergies(String knownAllergies) {
        this.knownAllergies = knownAllergies;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFatherOrganization() {
        return fatherOrganization;
    }

    public void setFatherOrganization(String fatherOrganization) {
        this.fatherOrganization = fatherOrganization;
    }

    public String getFatherDesignation() {
        return fatherDesignation;
    }

    public void setFatherDesignation(String fatherDesignation) {
        this.fatherDesignation = fatherDesignation;
    }

    public String getFatherQualification() {
        return fatherQualification;
    }

    public void setFatherQualification(String fatherQualification) {
        this.fatherQualification = fatherQualification;
    }

    public String getFatherAddressLine1() {
        return fatherAddressLine1;
    }

    public void setFatherAddressLine1(String fatherAddressLine1) {
        this.fatherAddressLine1 = fatherAddressLine1;
    }

    public String getFatherAddressLine2() {
        return fatherAddressLine2;
    }

    public void setFatherAddressLine2(String fatherAddressLine2) {
        this.fatherAddressLine2 = fatherAddressLine2;
    }

    public String getFatherAddressLine3() {
        return fatherAddressLine3;
    }

    public void setFatherAddressLine3(String fatherAddressLine3) {
        this.fatherAddressLine3 = fatherAddressLine3;
    }

    public String getFatherAreasOfInterest() {
        return fatherAreasOfInterest;
    }

    public void setFatherAreasOfInterest(String fatherAreasOfInterest) {
        this.fatherAreasOfInterest = fatherAreasOfInterest;
    }

    public String getFatherVolunteerInterest() {
        return fatherVolunteerInterest;
    }

    public void setFatherVolunteerInterest(String fatherVolunteerInterest) {
        this.fatherVolunteerInterest = fatherVolunteerInterest;
    }

    public String getMotherOrganization() {
        return motherOrganization;
    }

    public void setMotherOrganization(String motherOrganization) {
        this.motherOrganization = motherOrganization;
    }

    public String getMotherDesignation() {
        return motherDesignation;
    }

    public void setMotherDesignation(String motherDesignation) {
        this.motherDesignation = motherDesignation;
    }

    public String getMotherQualification() {
        return motherQualification;
    }

    public void setMotherQualification(String motherQualification) {
        this.motherQualification = motherQualification;
    }

    public String getMotherAddressLine1() {
        return motherAddressLine1;
    }

    public void setMotherAddressLine1(String motherAddressLine1) {
        this.motherAddressLine1 = motherAddressLine1;
    }

    public String getMotherAddressLine2() {
        return motherAddressLine2;
    }

    public void setMotherAddressLine2(String motherAddressLine2) {
        this.motherAddressLine2 = motherAddressLine2;
    }

    public String getMotherAddressLine3() {
        return motherAddressLine3;
    }

    public void setMotherAddressLine3(String motherAddressLine3) {
        this.motherAddressLine3 = motherAddressLine3;
    }

    public String getMotherAreasOfInterest() {
        return motherAreasOfInterest;
    }

    public void setMotherAreasOfInterest(String motherAreasOfInterest) {
        this.motherAreasOfInterest = motherAreasOfInterest;
    }

    public String getMotherVolunteerInterest() {
        return motherVolunteerInterest;
    }

    public void setMotherVolunteerInterest(String motherVolunteerInterest) {
        this.motherVolunteerInterest = motherVolunteerInterest;
    }

    public String getFatherInstagram() {
        return fatherInstagram;
    }

    public void setFatherInstagram(String fatherInstagram) {
        this.fatherInstagram = fatherInstagram;
    }

    public String getFatherFacebook() {
        return fatherFacebook;
    }

    public void setFatherFacebook(String fatherFacebook) {
        this.fatherFacebook = fatherFacebook;
    }

    public String getFatherTwitter() {
        return fatherTwitter;
    }

    public void setFatherTwitter(String fatherTwitter) {
        this.fatherTwitter = fatherTwitter;
    }

    public String getMotherInstagram() {
        return motherInstagram;
    }

    public void setMotherInstagram(String motherInstagram) {
        this.motherInstagram = motherInstagram;
    }

    public String getMotherFacebook() {
        return motherFacebook;
    }

    public void setMotherFacebook(String motherFacebook) {
        this.motherFacebook = motherFacebook;
    }

    public String getMotherTwitter() {
        return motherTwitter;
    }

    public void setMotherTwitter(String motherTwitter) {
        this.motherTwitter = motherTwitter;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getShowVolunteerInterest() {
        return showVolunteerInterest;
    }

    public void setShowVolunteerInterest(String showVolunteerInterest) {
        this.showVolunteerInterest = showVolunteerInterest;
    }

    public String getParentAddressFlag() {
        return parentAddressFlag;
    }

    public void setParentAddressFlag(String parentAddressFlag) {
        this.parentAddressFlag = parentAddressFlag;
    }

    public SchoolDTO getSchool() {
        return school;
    }

    public void setSchool(SchoolDTO school) {
        this.school = school;
    }

    public ClassDTO getClassX() {
        return classX;
    }

    public void setClassX(ClassDTO classX) {
        this.classX = classX;
    }

    public DivisionDTO getDivision() {
        return division;
    }

    public void setDivision(DivisionDTO division) {
        this.division = division;
    }

    public static class SchoolDTO {
        @SerializedName("id")
        private int id;
        @SerializedName("logo")
        private String logo;
        @SerializedName("name")
        private String name;
        @SerializedName("code")
        private String code;
        @SerializedName("address")
        private String address;
        @SerializedName("subscription_type")
        private String subscriptionType;
        @SerializedName("latitude")
        private double latitude;
        @SerializedName("longitude")
        private double longitude;
        @SerializedName("academic_year_id")
        private int academicYearId;
        @SerializedName("academic_year_label")
        private String academicYearLabel;
        @SerializedName("academic_year_start_date")
        private String academicYearStartDate;
        @SerializedName("academic_year_end_date")
        private String academicYearEndDate;

        public static SchoolDTO objectFromData(String str) {

            return new Gson().fromJson(str, SchoolDTO.class);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getSubscriptionType() {
            return subscriptionType;
        }

        public void setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public int getAcademicYearId() {
            return academicYearId;
        }

        public void setAcademicYearId(int academicYearId) {
            this.academicYearId = academicYearId;
        }

        public String getAcademicYearLabel() {
            return academicYearLabel;
        }

        public void setAcademicYearLabel(String academicYearLabel) {
            this.academicYearLabel = academicYearLabel;
        }

        public String getAcademicYearStartDate() {
            return academicYearStartDate;
        }

        public void setAcademicYearStartDate(String academicYearStartDate) {
            this.academicYearStartDate = academicYearStartDate;
        }

        public String getAcademicYearEndDate() {
            return academicYearEndDate;
        }

        public void setAcademicYearEndDate(String academicYearEndDate) {
            this.academicYearEndDate = academicYearEndDate;
        }
    }
}