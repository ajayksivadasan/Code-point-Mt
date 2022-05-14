package com.aks.codepointmt.data.network.response;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultDTO {
    @SerializedName("id")
    private String id;
    @SerializedName("email")
    private String email;
    @SerializedName("gender")
    private String gender;
    @SerializedName("date_of_birth")
    private String dateOfBirth;
    @SerializedName("mobile_number")
    private String mobileNumber;
    @SerializedName("country_name")
    private String countryName;
    @SerializedName("country_code")
    private Object countryCode;
    @SerializedName("country_id")
    private String countryId;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    /**
     * id : 53380
     * first_name : ABEL
     * last_name : ANIL
     * name : ABEL ANIL
     * dob : 2014-02-06
     * gender : male
     * academic_year_id : 1992
     * academic_year_label : 2022-2023
     * admission_number : 120
     * batch_name :
     * batch_id : null
     * photo : https://tms-lb-server.s3.ap-south-1.amazonaws.com/TMS/student_profile_images/20220202121458_tms_w_https___www.lifeofpix.com_wp-content_uploads_2018_11_2mb-01439.jpg
     * blood_group :
     * known_allergies :
     * address :
     * father_organization :
     * father_designation :
     * father_qualification :
     * father_address_line_1 :
     * father_address_line_2 :
     * father_address_line_3 :
     * father_areas_of_interest :
     * father_volunteer_interest : no
     * mother_organization :
     * mother_designation :
     * mother_qualification :
     * mother_address_line_1 :
     * mother_address_line_2 :
     * mother_address_line_3 :
     * mother_areas_of_interest :
     * mother_volunteer_interest : no
     * father_instagram :
     * father_facebook :
     * father_twitter :
     * mother_instagram :
     * mother_facebook :
     * mother_twitter :
     * place :
     * origin :
     * show_volunteer_interest : no
     * parent_address_flag : yes
     * school : {"id":16,"logo":"https://tms-lb-server.s3.ap-south-1.amazonaws.com/TMS/common/20210722192921_tms_w_WhatsApp%20Image%202020-05-12%20at%208.50.13%20PM.jpeg","name":"TrackMySchool - Staging","code":"TMS","address":"1st Floor, St. Mary's Tower, \r\nSahodaran Ayyappan Rd, \r\nopp. Naval Quarters, \r\nElamkulam, Kochi, \r\nKerala 682020\r\n\r\ny\r\nhgjfyjyjy\r\nuyjuyjj","subscription_type":"type4","latitude":23.6288292,"longitude":58.0857719,"academic_year_id":1992,"academic_year_label":"2022-2023","academic_year_start_date":"2022-04-01","academic_year_end_date":"2023-03-31"}
     * class : {"id":2175,"name":"I"}
     * division : {"id":3229,"name":"A"}
     */

    @SerializedName("students")
    private List<StudentsDTO> students;

    public static ResultDTO objectFromData(String str) {

        return new Gson().fromJson(str, ResultDTO.class);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Object getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Object countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
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

    public List<StudentsDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentsDTO> students) {
        this.students = students;
    }
}