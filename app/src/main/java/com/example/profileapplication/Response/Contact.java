package com.example.profileapplication.Response;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Contact implements Serializable
{

    @SerializedName("user_mobile")
    @Expose
    private String userMobile;
    @SerializedName("alt_mobile")
    @Expose
    private String altMobile;
    @SerializedName("whatsapp_number")
    @Expose
    private String whatsappNumber;
    @SerializedName("emergency_number")
    @Expose
    private String emergencyNumber;
    @SerializedName("user_email")
    @Expose
    private String userEmail;
    @SerializedName("personal_email")
    @Expose
    private String personalEmail;
    @SerializedName("current_address")
    @Expose
    private String currentAddress;
    @SerializedName("permanent_address")
    @Expose
    private String permanentAddress;
    @SerializedName("current_address_lat")
    @Expose
    private String currentAddressLat;
    @SerializedName("current_address_long")
    @Expose
    private String currentAddressLong;
    @SerializedName("permanent_address_lat")
    @Expose
    private String permanentAddressLat;
    @SerializedName("permanent_address_long")
    @Expose
    private String permanentAddressLong;
    @SerializedName("public_mobile")
    @Expose
    private Boolean publicMobile;
    @SerializedName("user_mobile_country_code")
    @Expose
    private String userMobileCountryCode;
    @SerializedName("without_country_code_user_mobile")
    @Expose
    private String withoutCountryCodeUserMobile;
    @SerializedName("alt_mobile_country_code")
    @Expose
    private String altMobileCountryCode;
    @SerializedName("without_country_code_alt_mobile")
    @Expose
    private String withoutCountryCodeAltMobile;
    @SerializedName("whatsapp_number_country_code")
    @Expose
    private String whatsappNumberCountryCode;
    @SerializedName("without_country_code_whatsapp_number")
    @Expose
    private String withoutCountryCodeWhatsappNumber;
    @SerializedName("emergency_number_country_code")
    @Expose
    private String emergencyNumberCountryCode;
    @SerializedName("without_country_code_emergency_number")
    @Expose
    private String withoutCountryCodeEmergencyNumber;
    private final static long serialVersionUID = 958776067037298112L;


    public Contact() {
    }


    public Contact(String userMobile, String altMobile, String whatsappNumber, String emergencyNumber, String userEmail, String personalEmail, String currentAddress, String permanentAddress, String currentAddressLat, String currentAddressLong, String permanentAddressLat, String permanentAddressLong, Boolean publicMobile, String userMobileCountryCode, String withoutCountryCodeUserMobile, String altMobileCountryCode, String withoutCountryCodeAltMobile, String whatsappNumberCountryCode, String withoutCountryCodeWhatsappNumber, String emergencyNumberCountryCode, String withoutCountryCodeEmergencyNumber) {
        super();
        this.userMobile = userMobile;
        this.altMobile = altMobile;
        this.whatsappNumber = whatsappNumber;
        this.emergencyNumber = emergencyNumber;
        this.userEmail = userEmail;
        this.personalEmail = personalEmail;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
        this.currentAddressLat = currentAddressLat;
        this.currentAddressLong = currentAddressLong;
        this.permanentAddressLat = permanentAddressLat;
        this.permanentAddressLong = permanentAddressLong;
        this.publicMobile = publicMobile;
        this.userMobileCountryCode = userMobileCountryCode;
        this.withoutCountryCodeUserMobile = withoutCountryCodeUserMobile;
        this.altMobileCountryCode = altMobileCountryCode;
        this.withoutCountryCodeAltMobile = withoutCountryCodeAltMobile;
        this.whatsappNumberCountryCode = whatsappNumberCountryCode;
        this.withoutCountryCodeWhatsappNumber = withoutCountryCodeWhatsappNumber;
        this.emergencyNumberCountryCode = emergencyNumberCountryCode;
        this.withoutCountryCodeEmergencyNumber = withoutCountryCodeEmergencyNumber;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getAltMobile() {
        return altMobile;
    }

    public void setAltMobile(String altMobile) {
        this.altMobile = altMobile;
    }

    public String getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(String whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    public String getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getCurrentAddressLat() {
        return currentAddressLat;
    }

    public void setCurrentAddressLat(String currentAddressLat) {
        this.currentAddressLat = currentAddressLat;
    }

    public String getCurrentAddressLong() {
        return currentAddressLong;
    }

    public void setCurrentAddressLong(String currentAddressLong) {
        this.currentAddressLong = currentAddressLong;
    }

    public String getPermanentAddressLat() {
        return permanentAddressLat;
    }

    public void setPermanentAddressLat(String permanentAddressLat) {
        this.permanentAddressLat = permanentAddressLat;
    }

    public String getPermanentAddressLong() {
        return permanentAddressLong;
    }

    public void setPermanentAddressLong(String permanentAddressLong) {
        this.permanentAddressLong = permanentAddressLong;
    }

    public Boolean getPublicMobile() {
        return publicMobile;
    }

    public void setPublicMobile(Boolean publicMobile) {
        this.publicMobile = publicMobile;
    }

    public String getUserMobileCountryCode() {
        return userMobileCountryCode;
    }

    public void setUserMobileCountryCode(String userMobileCountryCode) {
        this.userMobileCountryCode = userMobileCountryCode;
    }

    public String getWithoutCountryCodeUserMobile() {
        return withoutCountryCodeUserMobile;
    }

    public void setWithoutCountryCodeUserMobile(String withoutCountryCodeUserMobile) {
        this.withoutCountryCodeUserMobile = withoutCountryCodeUserMobile;
    }

    public String getAltMobileCountryCode() {
        return altMobileCountryCode;
    }

    public void setAltMobileCountryCode(String altMobileCountryCode) {
        this.altMobileCountryCode = altMobileCountryCode;
    }

    public String getWithoutCountryCodeAltMobile() {
        return withoutCountryCodeAltMobile;
    }

    public void setWithoutCountryCodeAltMobile(String withoutCountryCodeAltMobile) {
        this.withoutCountryCodeAltMobile = withoutCountryCodeAltMobile;
    }

    public String getWhatsappNumberCountryCode() {
        return whatsappNumberCountryCode;
    }

    public void setWhatsappNumberCountryCode(String whatsappNumberCountryCode) {
        this.whatsappNumberCountryCode = whatsappNumberCountryCode;
    }

    public String getWithoutCountryCodeWhatsappNumber() {
        return withoutCountryCodeWhatsappNumber;
    }

    public void setWithoutCountryCodeWhatsappNumber(String withoutCountryCodeWhatsappNumber) {
        this.withoutCountryCodeWhatsappNumber = withoutCountryCodeWhatsappNumber;
    }

    public String getEmergencyNumberCountryCode() {
        return emergencyNumberCountryCode;
    }

    public void setEmergencyNumberCountryCode(String emergencyNumberCountryCode) {
        this.emergencyNumberCountryCode = emergencyNumberCountryCode;
    }

    public String getWithoutCountryCodeEmergencyNumber() {
        return withoutCountryCodeEmergencyNumber;
    }

    public void setWithoutCountryCodeEmergencyNumber(String withoutCountryCodeEmergencyNumber) {
        this.withoutCountryCodeEmergencyNumber = withoutCountryCodeEmergencyNumber;
    }

@Generated("jsonschema2pojo")
public class EmployeementSkill implements Serializable
{

    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("employee_id")
    @Expose
    private String employeeId;
    @SerializedName("employment_type")
    @Expose
    private String employmentType;
    @SerializedName("joining_date")
    @Expose
    private String joiningDate;
    @SerializedName("joining_date_view")
    @Expose
    private String joiningDateView;
    @SerializedName("company_experience")
    @Expose
    private String companyExperience;
    @SerializedName("total_experience")
    @Expose
    private String totalExperience;
    private final static long serialVersionUID = 2398994264489632674L;

    /**
     * No args constructor for use in serialization
     *
     */
    public EmployeementSkill() {
    }

    /**
     *
     * @param employmentType
     * @param totalExperience
     * @param companyExperience
     * @param joiningDateView
     * @param employeeId
     * @param joiningDate
     * @param designation
     */
    public EmployeementSkill(String designation, String employeeId, String employmentType, String joiningDate, String joiningDateView, String companyExperience, String totalExperience) {
        super();
        this.designation = designation;
        this.employeeId = employeeId;
        this.employmentType = employmentType;
        this.joiningDate = joiningDate;
        this.joiningDateView = joiningDateView;
        this.companyExperience = companyExperience;
        this.totalExperience = totalExperience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getJoiningDateView() {
        return joiningDateView;
    }

    public void setJoiningDateView(String joiningDateView) {
        this.joiningDateView = joiningDateView;
    }

    public String getCompanyExperience() {
        return companyExperience;
    }

    public void setCompanyExperience(String companyExperience) {
        this.companyExperience = companyExperience;
    }

    public String getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(String totalExperience) {
        this.totalExperience = totalExperience;
    }

}
@Generated("jsonschema2pojo")
public class MyTeam implements Serializable
{

    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("level_id")
    @Expose
    private String levelId;
    @SerializedName("level_name")
    @Expose
    private String levelName;
    @SerializedName("user_full_name")
    @Expose
    private String userFullName;
    @SerializedName("user_designation")
    @Expose
    private String userDesignation;
    @SerializedName("short_name")
    @Expose
    private String shortName;
    @SerializedName("user_profile_pic")
    @Expose
    private String userProfilePic;
    @SerializedName("is_present")
    @Expose
    private Boolean isPresent;
    @SerializedName("status_view")
    @Expose
    private String statusView;
    @SerializedName("is_break")
    @Expose
    private Boolean isBreak;
    @SerializedName("leave_data")
    @Expose
    private List<Object> leaveData;
    @SerializedName("is_leave_full")
    @Expose
    private Boolean isLeaveFull;
    @SerializedName("is_leave_half")
    @Expose
    private Boolean isLeaveHalf;
    private final static long serialVersionUID = -3209312538085038486L;


    public MyTeam(String userId, String levelId, String levelName, String userFullName, String userDesignation, String shortName, String userProfilePic, Boolean isPresent, String statusView, Boolean isBreak, List<Object> leaveData, Boolean isLeaveFull, Boolean isLeaveHalf) {
        super();
        this.userId = userId;
        this.levelId = levelId;
        this.levelName = levelName;
        this.userFullName = userFullName;
        this.userDesignation = userDesignation;
        this.shortName = shortName;
        this.userProfilePic = userProfilePic;
        this.isPresent = isPresent;
        this.statusView = statusView;
        this.isBreak = isBreak;
        this.leaveData = leaveData;
        this.isLeaveFull = isLeaveFull;
        this.isLeaveHalf = isLeaveHalf;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserDesignation() {
        return userDesignation;
    }

    public void setUserDesignation(String userDesignation) {
        this.userDesignation = userDesignation;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getUserProfilePic() {
        return userProfilePic;
    }

    public void setUserProfilePic(String userProfilePic) {
        this.userProfilePic = userProfilePic;
    }

    public Boolean getIsPresent() {
        return isPresent;
    }

    public void setIsPresent(Boolean isPresent) {
        this.isPresent = isPresent;
    }

    public String getStatusView() {
        return statusView;
    }

    public void setStatusView(String statusView) {
        this.statusView = statusView;
    }

    public Boolean getIsBreak() {
        return isBreak;
    }

    public void setIsBreak(Boolean isBreak) {
        this.isBreak = isBreak;
    }

    public List<Object> getLeaveData() {
        return leaveData;
    }

    public void setLeaveData(List<Object> leaveData) {
        this.leaveData = leaveData;
    }

    public Boolean getIsLeaveFull() {
        return isLeaveFull;
    }

    public void setIsLeaveFull(Boolean isLeaveFull) {
        this.isLeaveFull = isLeaveFull;
    }

    public Boolean getIsLeaveHalf() {
        return isLeaveHalf;
    }

    public void setIsLeaveHalf(Boolean isLeaveHalf) {
        this.isLeaveHalf = isLeaveHalf;
    }

}

@Generated("jsonschema2pojo")
public class Personal implements Serializable
{

    @SerializedName("member_date_of_birth")
    @Expose
    private String memberDateOfBirth;
    @SerializedName("wedding_anniversary_date")
    @Expose
    private String weddingAnniversaryDate;
    @SerializedName("blood_group")
    @Expose
    private String bloodGroup;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("marital_status")
    @Expose
    private String maritalStatus;
    @SerializedName("marital_status_st")
    @Expose
    private String maritalStatusSt;
    @SerializedName("total_family_members")
    @Expose
    private String totalFamilyMembers;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("member_date_of_birth_view")
    @Expose
    private String memberDateOfBirthView;
    @SerializedName("wedding_anniversary_date_view")
    @Expose
    private String weddingAnniversaryDateView;
    @SerializedName("intrest_hobbies")
    @Expose
    private String intrestHobbies;
    @SerializedName("professional_skills")
    @Expose
    private String professionalSkills;
    @SerializedName("special_skills")
    @Expose
    private String specialSkills;
    @SerializedName("language_known")
    @Expose
    private String languageKnown;
    private final static long serialVersionUID = 7677971497217862936L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Personal() {
    }

    /**
     *
     * @param weddingAnniversaryDate
     * @param gender
     * @param memberDateOfBirthView
     * @param specialSkills
     * @param professionalSkills
     * @param bloodGroup
     * @param maritalStatusSt
     * @param totalFamilyMembers
     * @param nationality
     * @param intrestHobbies
     * @param weddingAnniversaryDateView
     * @param memberDateOfBirth
     * @param languageKnown
     * @param maritalStatus
     */
    public Personal(String memberDateOfBirth, String weddingAnniversaryDate, String bloodGroup, String gender, String maritalStatus, String maritalStatusSt, String totalFamilyMembers, String nationality, String memberDateOfBirthView, String weddingAnniversaryDateView, String intrestHobbies, String professionalSkills, String specialSkills, String languageKnown) {
        super();
        this.memberDateOfBirth = memberDateOfBirth;
        this.weddingAnniversaryDate = weddingAnniversaryDate;
        this.bloodGroup = bloodGroup;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.maritalStatusSt = maritalStatusSt;
        this.totalFamilyMembers = totalFamilyMembers;
        this.nationality = nationality;
        this.memberDateOfBirthView = memberDateOfBirthView;
        this.weddingAnniversaryDateView = weddingAnniversaryDateView;
        this.intrestHobbies = intrestHobbies;
        this.professionalSkills = professionalSkills;
        this.specialSkills = specialSkills;
        this.languageKnown = languageKnown;
    }

    public String getMemberDateOfBirth() {
        return memberDateOfBirth;
    }

    public void setMemberDateOfBirth(String memberDateOfBirth) {
        this.memberDateOfBirth = memberDateOfBirth;
    }

    public String getWeddingAnniversaryDate() {
        return weddingAnniversaryDate;
    }

    public void setWeddingAnniversaryDate(String weddingAnniversaryDate) {
        this.weddingAnniversaryDate = weddingAnniversaryDate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatusSt() {
        return maritalStatusSt;
    }

    public void setMaritalStatusSt(String maritalStatusSt) {
        this.maritalStatusSt = maritalStatusSt;
    }

    public String getTotalFamilyMembers() {
        return totalFamilyMembers;
    }

    public void setTotalFamilyMembers(String totalFamilyMembers) {
        this.totalFamilyMembers = totalFamilyMembers;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMemberDateOfBirthView() {
        return memberDateOfBirthView;
    }

    public void setMemberDateOfBirthView(String memberDateOfBirthView) {
        this.memberDateOfBirthView = memberDateOfBirthView;
    }

    public String getWeddingAnniversaryDateView() {
        return weddingAnniversaryDateView;
    }

    public void setWeddingAnniversaryDateView(String weddingAnniversaryDateView) {
        this.weddingAnniversaryDateView = weddingAnniversaryDateView;
    }

    public String getIntrestHobbies() {
        return intrestHobbies;
    }

    public void setIntrestHobbies(String intrestHobbies) {
        this.intrestHobbies = intrestHobbies;
    }

    public String getProfessionalSkills() {
        return professionalSkills;
    }

    public void setProfessionalSkills(String professionalSkills) {
        this.professionalSkills = professionalSkills;
    }

    public String getSpecialSkills() {
        return specialSkills;
    }

    public void setSpecialSkills(String specialSkills) {
        this.specialSkills = specialSkills;
    }

    public String getLanguageKnown() {
        return languageKnown;
    }

    public void setLanguageKnown(String languageKnown) {
        this.languageKnown = languageKnown;
    }

}

@Generated("jsonschema2pojo")
public class ProfileListResponse implements Serializable
{

    @SerializedName("block_status")
    @Expose
    private String blockStatus;
    @SerializedName("profileMenu")
    @Expose
    private List<ProfileMenu> profileMenu;
    @SerializedName("praise_list")
    @Expose
    private List<Object> praiseList;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("level_id")
    @Expose
    private String levelId;
    @SerializedName("level_name")
    @Expose
    private String levelName;
    @SerializedName("parent_level_id")
    @Expose
    private String parentLevelId;
    @SerializedName("user_first_name")
    @Expose
    private String userFirstName;
    @SerializedName("user_last_name")
    @Expose
    private String userLastName;
    @SerializedName("sub_department_id")
    @Expose
    private String subDepartmentId;
    @SerializedName("sub_department_name")
    @Expose
    private String subDepartmentName;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("short_name")
    @Expose
    private String shortName;
    @SerializedName("user_face_data")
    @Expose
    private String userFaceData;
    @SerializedName("face_added_date")
    @Expose
    private String faceAddedDate;
    @SerializedName("face_data_image")
    @Expose
    private String faceDataImage;
    @SerializedName("face_data_image_two")
    @Expose
    private String faceDataImageTwo;
    @SerializedName("face_data_image_ios")
    @Expose
    private String faceDataImageIos;
    @SerializedName("face_data_image_two_ios")
    @Expose
    private String faceDataImageTwoIos;
    @SerializedName("reporting_persons")
    @Expose
    private List<ReportingPerson> reportingPersons;
    @SerializedName("reporting_person_id")
    @Expose
    private Object reportingPersonId;
    @SerializedName("reporting_person")
    @Expose
    private Object reportingPerson;
    @SerializedName("reporting_person_level_name")
    @Expose
    private Object reportingPersonLevelName;
    @SerializedName("reporting_person_user_designation")
    @Expose
    private Object reportingPersonUserDesignation;
    @SerializedName("reporting_short_name")
    @Expose
    private String reportingShortName;
    @SerializedName("reporting_person_profile_pic")
    @Expose
    private String reportingPersonProfilePic;
    @SerializedName("user_full_name")
    @Expose
    private String userFullName;
    @SerializedName("user_profile_pic")
    @Expose
    private String userProfilePic;
    @SerializedName("user_mobile")
    @Expose
    private String userMobile;
    @SerializedName("user_email")
    @Expose
    private String userEmail;
    @SerializedName("personal_email")
    @Expose
    private String personalEmail;
    @SerializedName("alt_mobile")
    @Expose
    private String altMobile;
    @SerializedName("emergency_number")
    @Expose
    private String emergencyNumber;
    @SerializedName("whatsapp_number")
    @Expose
    private String whatsappNumber;
    @SerializedName("employee_id")
    @Expose
    private String employeeId;
    @SerializedName("member_date_of_birth")
    @Expose
    private String memberDateOfBirth;
    @SerializedName("blood_group")
    @Expose
    private String bloodGroup;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("user_token")
    @Expose
    private String userToken;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("marital_status")
    @Expose
    private String maritalStatus;
    @SerializedName("total_family_members")
    @Expose
    private String totalFamilyMembers;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("public_mobile")
    @Expose
    private Boolean publicMobile;
    @SerializedName("member_access_denied")
    @Expose
    private Boolean memberAccessDenied;
    @SerializedName("chat_access_denied")
    @Expose
    private Boolean chatAccessDenied;
    @SerializedName("timline_access_denied")
    @Expose
    private Boolean timlineAccessDenied;
    @SerializedName("personal")
    @Expose
    private List<Personal> personal;
    @SerializedName("employeement_skills")
    @Expose
    private List<EmployeementSkill> employeementSkills;
    @SerializedName("contact")
    @Expose
    private List<Contact> contact;
    @SerializedName("experience")
    @Expose
    private List<Object> experience;
    @SerializedName("education")
    @Expose
    private List<Object> education;
    @SerializedName("social_link")
    @Expose
    private List<SocialLink> socialLink;
    @SerializedName("my_team")
    @Expose
    private List<MyTeam> myTeam;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;
    private final static long serialVersionUID = -1868602985469257825L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ProfileListResponse() {
    }

    /**
     *
     * @param subDepartmentId
     * @param education
     * @param faceDataImage
     * @param experience
     * @param personalEmail
     * @param bloodGroup
     * @param userLastName
     * @param userMobile
     * @param levelId
     * @param contact
     * @param faceDataImageIos
     * @param publicMobile
     * @param userFullName
     * @param personal
     * @param userFirstName
     * @param memberAccessDenied
     * @param reportingPersons
     * @param nationality
     * @param designation
     * @param profileMenu
     * @param shortName
     * @param maritalStatus
     * @param status
     * @param altMobile
     * @param gender
     * @param reportingPersonId
     * @param subDepartmentName
     * @param reportingPerson
     * @param reportingPersonLevelName
     * @param socialLink
     * @param whatsappNumber
     * @param chatAccessDenied
     * @param employeementSkills
     * @param countryCode
     * @param reportingShortName
     * @param reportingPersonUserDesignation
     * @param faceDataImageTwo
     * @param userEmail
     * @param userFaceData
     * @param faceAddedDate
     * @param faceDataImageTwoIos
     * @param blockStatus
     * @param levelName
     * @param employeeId
     * @param emergencyNumber
     * @param message
     * @param userId
     * @param parentLevelId
     * @param reportingPersonProfilePic
     * @param praiseList
     * @param userToken
     * @param userProfilePic
     * @param totalFamilyMembers
     * @param myTeam
     * @param memberDateOfBirth
     * @param timlineAccessDenied
     */
    public ProfileListResponse(String blockStatus, List<ProfileMenu> profileMenu, List<Object> praiseList, String userId, String levelId, String levelName, String parentLevelId, String userFirstName, String userLastName, String subDepartmentId, String subDepartmentName, String designation, String shortName, String userFaceData, String faceAddedDate, String faceDataImage, String faceDataImageTwo, String faceDataImageIos, String faceDataImageTwoIos, List<ReportingPerson> reportingPersons, Object reportingPersonId, Object reportingPerson, Object reportingPersonLevelName, Object reportingPersonUserDesignation, String reportingShortName, String reportingPersonProfilePic, String userFullName, String userProfilePic, String userMobile, String userEmail, String personalEmail, String altMobile, String emergencyNumber, String whatsappNumber, String employeeId, String memberDateOfBirth, String bloodGroup, String gender, String userToken, String countryCode, String maritalStatus, String totalFamilyMembers, String nationality, Boolean publicMobile, Boolean memberAccessDenied, Boolean chatAccessDenied, Boolean timlineAccessDenied, List<Personal> personal, List<EmployeementSkill> employeementSkills, List<Contact> contact, List<Object> experience, List<Object> education, List<SocialLink> socialLink, List<MyTeam> myTeam, String message, String status) {
        super();
        this.blockStatus = blockStatus;
        this.profileMenu = profileMenu;
        this.praiseList = praiseList;
        this.userId = userId;
        this.levelId = levelId;
        this.levelName = levelName;
        this.parentLevelId = parentLevelId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.subDepartmentId = subDepartmentId;
        this.subDepartmentName = subDepartmentName;
        this.designation = designation;
        this.shortName = shortName;
        this.userFaceData = userFaceData;
        this.faceAddedDate = faceAddedDate;
        this.faceDataImage = faceDataImage;
        this.faceDataImageTwo = faceDataImageTwo;
        this.faceDataImageIos = faceDataImageIos;
        this.faceDataImageTwoIos = faceDataImageTwoIos;
        this.reportingPersons = reportingPersons;
        this.reportingPersonId = reportingPersonId;
        this.reportingPerson = reportingPerson;
        this.reportingPersonLevelName = reportingPersonLevelName;
        this.reportingPersonUserDesignation = reportingPersonUserDesignation;
        this.reportingShortName = reportingShortName;
        this.reportingPersonProfilePic = reportingPersonProfilePic;
        this.userFullName = userFullName;
        this.userProfilePic = userProfilePic;
        this.userMobile = userMobile;
        this.userEmail = userEmail;
        this.personalEmail = personalEmail;
        this.altMobile = altMobile;
        this.emergencyNumber = emergencyNumber;
        this.whatsappNumber = whatsappNumber;
        this.employeeId = employeeId;
        this.memberDateOfBirth = memberDateOfBirth;
        this.bloodGroup = bloodGroup;
        this.gender = gender;
        this.userToken = userToken;
        this.countryCode = countryCode;
        this.maritalStatus = maritalStatus;
        this.totalFamilyMembers = totalFamilyMembers;
        this.nationality = nationality;
        this.publicMobile = publicMobile;
        this.memberAccessDenied = memberAccessDenied;
        this.chatAccessDenied = chatAccessDenied;
        this.timlineAccessDenied = timlineAccessDenied;
        this.personal = personal;
        this.employeementSkills = employeementSkills;
        this.contact = contact;
        this.experience = experience;
        this.education = education;
        this.socialLink = socialLink;
        this.myTeam = myTeam;
        this.message = message;
        this.status = status;
    }

    public String getBlockStatus() {
        return blockStatus;
    }

    public void setBlockStatus(String blockStatus) {
        this.blockStatus = blockStatus;
    }

    public List<ProfileMenu> getProfileMenu() {
        return profileMenu;
    }

    public void setProfileMenu(List<ProfileMenu> profileMenu) {
        this.profileMenu = profileMenu;
    }

    public List<Object> getPraiseList() {
        return praiseList;
    }

    public void setPraiseList(List<Object> praiseList) {
        this.praiseList = praiseList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getParentLevelId() {
        return parentLevelId;
    }

    public void setParentLevelId(String parentLevelId) {
        this.parentLevelId = parentLevelId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getSubDepartmentId() {
        return subDepartmentId;
    }

    public void setSubDepartmentId(String subDepartmentId) {
        this.subDepartmentId = subDepartmentId;
    }

    public String getSubDepartmentName() {
        return subDepartmentName;
    }

    public void setSubDepartmentName(String subDepartmentName) {
        this.subDepartmentName = subDepartmentName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getUserFaceData() {
        return userFaceData;
    }

    public void setUserFaceData(String userFaceData) {
        this.userFaceData = userFaceData;
    }

    public String getFaceAddedDate() {
        return faceAddedDate;
    }

    public void setFaceAddedDate(String faceAddedDate) {
        this.faceAddedDate = faceAddedDate;
    }

    public String getFaceDataImage() {
        return faceDataImage;
    }

    public void setFaceDataImage(String faceDataImage) {
        this.faceDataImage = faceDataImage;
    }

    public String getFaceDataImageTwo() {
        return faceDataImageTwo;
    }

    public void setFaceDataImageTwo(String faceDataImageTwo) {
        this.faceDataImageTwo = faceDataImageTwo;
    }

    public String getFaceDataImageIos() {
        return faceDataImageIos;
    }

    public void setFaceDataImageIos(String faceDataImageIos) {
        this.faceDataImageIos = faceDataImageIos;
    }

    public String getFaceDataImageTwoIos() {
        return faceDataImageTwoIos;
    }

    public void setFaceDataImageTwoIos(String faceDataImageTwoIos) {
        this.faceDataImageTwoIos = faceDataImageTwoIos;
    }

    public List<ReportingPerson> getReportingPersons() {
        return reportingPersons;
    }

    public void setReportingPersons(List<ReportingPerson> reportingPersons) {
        this.reportingPersons = reportingPersons;
    }

    public Object getReportingPersonId() {
        return reportingPersonId;
    }

    public void setReportingPersonId(Object reportingPersonId) {
        this.reportingPersonId = reportingPersonId;
    }

    public Object getReportingPerson() {
        return reportingPerson;
    }

    public void setReportingPerson(Object reportingPerson) {
        this.reportingPerson = reportingPerson;
    }

    public Object getReportingPersonLevelName() {
        return reportingPersonLevelName;
    }

    public void setReportingPersonLevelName(Object reportingPersonLevelName) {
        this.reportingPersonLevelName = reportingPersonLevelName;
    }

    public Object getReportingPersonUserDesignation() {
        return reportingPersonUserDesignation;
    }

    public void setReportingPersonUserDesignation(Object reportingPersonUserDesignation) {
        this.reportingPersonUserDesignation = reportingPersonUserDesignation;
    }

    public String getReportingShortName() {
        return reportingShortName;
    }

    public void setReportingShortName(String reportingShortName) {
        this.reportingShortName = reportingShortName;
    }

    public String getReportingPersonProfilePic() {
        return reportingPersonProfilePic;
    }

    public void setReportingPersonProfilePic(String reportingPersonProfilePic) {
        this.reportingPersonProfilePic = reportingPersonProfilePic;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserProfilePic() {
        return userProfilePic;
    }

    public void setUserProfilePic(String userProfilePic) {
        this.userProfilePic = userProfilePic;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getAltMobile() {
        return altMobile;
    }

    public void setAltMobile(String altMobile) {
        this.altMobile = altMobile;
    }

    public String getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

    public String getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(String whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getMemberDateOfBirth() {
        return memberDateOfBirth;
    }

    public void setMemberDateOfBirth(String memberDateOfBirth) {
        this.memberDateOfBirth = memberDateOfBirth;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getTotalFamilyMembers() {
        return totalFamilyMembers;
    }

    public void setTotalFamilyMembers(String totalFamilyMembers) {
        this.totalFamilyMembers = totalFamilyMembers;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Boolean getPublicMobile() {
        return publicMobile;
    }

    public void setPublicMobile(Boolean publicMobile) {
        this.publicMobile = publicMobile;
    }

    public Boolean getMemberAccessDenied() {
        return memberAccessDenied;
    }

    public void setMemberAccessDenied(Boolean memberAccessDenied) {
        this.memberAccessDenied = memberAccessDenied;
    }

    public Boolean getChatAccessDenied() {
        return chatAccessDenied;
    }

    public void setChatAccessDenied(Boolean chatAccessDenied) {
        this.chatAccessDenied = chatAccessDenied;
    }

    public Boolean getTimlineAccessDenied() {
        return timlineAccessDenied;
    }

    public void setTimlineAccessDenied(Boolean timlineAccessDenied) {
        this.timlineAccessDenied = timlineAccessDenied;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }

    public List<EmployeementSkill> getEmployeementSkills() {
        return employeementSkills;
    }

    public void setEmployeementSkills(List<EmployeementSkill> employeementSkills) {
        this.employeementSkills = employeementSkills;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public List<Object> getExperience() {
        return experience;
    }

    public void setExperience(List<Object> experience) {
        this.experience = experience;
    }

    public List<Object> getEducation() {
        return education;
    }

    public void setEducation(List<Object> education) {
        this.education = education;
    }

    public List<SocialLink> getSocialLink() {
        return socialLink;
    }

    public void setSocialLink(List<SocialLink> socialLink) {
        this.socialLink = socialLink;
    }

    public List<MyTeam> getMyTeam() {
        return myTeam;
    }

    public void setMyTeam(List<MyTeam> myTeam) {
        this.myTeam = myTeam;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

@Generated("jsonschema2pojo")
public class ProfileMenu implements Serializable
{

    @SerializedName("profile_menu_id")
    @Expose
    private String profileMenuId;
    @SerializedName("profile_menu_name")
    @Expose
    private String profileMenuName;
    @SerializedName("menu_click")
    @Expose
    private String menuClick;
    @SerializedName("profile_menu_photo")
    @Expose
    private String profileMenuPhoto;
    @SerializedName("access_type")
    @Expose
    private String accessType;
    @SerializedName("language_key_name")
    @Expose
    private String languageKeyName;
    private final static long serialVersionUID = 3591182482891460345L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ProfileMenu() {
    }

    /**
     *
     * @param accessType
     * @param languageKeyName
     * @param menuClick
     * @param profileMenuId
     * @param profileMenuPhoto
     * @param profileMenuName
     */
    public ProfileMenu(String profileMenuId, String profileMenuName, String menuClick, String profileMenuPhoto, String accessType, String languageKeyName) {
        super();
        this.profileMenuId = profileMenuId;
        this.profileMenuName = profileMenuName;
        this.menuClick = menuClick;
        this.profileMenuPhoto = profileMenuPhoto;
        this.accessType = accessType;
        this.languageKeyName = languageKeyName;
    }

    public String getProfileMenuId() {
        return profileMenuId;
    }

    public void setProfileMenuId(String profileMenuId) {
        this.profileMenuId = profileMenuId;
    }

    public String getProfileMenuName() {
        return profileMenuName;
    }

    public void setProfileMenuName(String profileMenuName) {
        this.profileMenuName = profileMenuName;
    }

    public String getMenuClick() {
        return menuClick;
    }

    public void setMenuClick(String menuClick) {
        this.menuClick = menuClick;
    }

    public String getProfileMenuPhoto() {
        return profileMenuPhoto;
    }

    public void setProfileMenuPhoto(String profileMenuPhoto) {
        this.profileMenuPhoto = profileMenuPhoto;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public String getLanguageKeyName() {
        return languageKeyName;
    }

    public void setLanguageKeyName(String languageKeyName) {
        this.languageKeyName = languageKeyName;
    }

}

@Generated("jsonschema2pojo")
public class ReportingPerson implements Serializable
{

    @SerializedName("reporting_person_id")
    @Expose
    private String reportingPersonId;
    @SerializedName("reporting_person")
    @Expose
    private String reportingPerson;
    @SerializedName("reporting_person_level_name")
    @Expose
    private String reportingPersonLevelName;
    @SerializedName("reporting_person_user_designation")
    @Expose
    private String reportingPersonUserDesignation;
    @SerializedName("reporting_short_name")
    @Expose
    private String reportingShortName;
    @SerializedName("reporting_person_profile_pic")
    @Expose
    private String reportingPersonProfilePic;
    private final static long serialVersionUID = 4837585836143000873L;

    public ReportingPerson() {
    }


    public ReportingPerson(String reportingPersonId, String reportingPerson, String reportingPersonLevelName, String reportingPersonUserDesignation, String reportingShortName, String reportingPersonProfilePic) {
        super();
        this.reportingPersonId = reportingPersonId;
        this.reportingPerson = reportingPerson;
        this.reportingPersonLevelName = reportingPersonLevelName;
        this.reportingPersonUserDesignation = reportingPersonUserDesignation;
        this.reportingShortName = reportingShortName;
        this.reportingPersonProfilePic = reportingPersonProfilePic;
    }

    public String getReportingPersonId() {
        return reportingPersonId;
    }

    public void setReportingPersonId(String reportingPersonId) {
        this.reportingPersonId = reportingPersonId;
    }

    public String getReportingPerson() {
        return reportingPerson;
    }

    public void setReportingPerson(String reportingPerson) {
        this.reportingPerson = reportingPerson;
    }

    public String getReportingPersonLevelName() {
        return reportingPersonLevelName;
    }

    public void setReportingPersonLevelName(String reportingPersonLevelName) {
        this.reportingPersonLevelName = reportingPersonLevelName;
    }

    public String getReportingPersonUserDesignation() {
        return reportingPersonUserDesignation;
    }

    public void setReportingPersonUserDesignation(String reportingPersonUserDesignation) {
        this.reportingPersonUserDesignation = reportingPersonUserDesignation;
    }

    public String getReportingShortName() {
        return reportingShortName;
    }

    public void setReportingShortName(String reportingShortName) {
        this.reportingShortName = reportingShortName;
    }

    public String getReportingPersonProfilePic() {
        return reportingPersonProfilePic;
    }

    public void setReportingPersonProfilePic(String reportingPersonProfilePic) {
        this.reportingPersonProfilePic = reportingPersonProfilePic;
    }

}

@Generated("jsonschema2pojo")
public class SocialLink implements Serializable {

    @SerializedName("facebook")
    @Expose
    private String facebook;
    @SerializedName("instagram")
    @Expose
    private String instagram;
    @SerializedName("linkedin")
    @Expose
    private String linkedin;
    @SerializedName("twitter")
    @Expose
    private String twitter;
    @SerializedName("whatsapp_number")
    @Expose
    private String whatsappNumber;
    @SerializedName("whatsapp_number_country_code")
    @Expose
    private String whatsappNumberCountryCode;
    @SerializedName("whatsapp_number_without_country_code")
    @Expose
    private String whatsappNumberWithoutCountryCode;
    private final static long serialVersionUID = 2965062083585547040L;

    /**
     * No args constructor for use in serialization
     */
    public SocialLink() {
    }

    /**
     * @param whatsappNumber
     * @param twitter
     * @param whatsappNumberCountryCode
     * @param whatsappNumberWithoutCountryCode
     * @param facebook
     * @param instagram
     * @param linkedin
     */
    public SocialLink(String facebook, String instagram, String linkedin, String twitter, String whatsappNumber, String whatsappNumberCountryCode, String whatsappNumberWithoutCountryCode) {
        super();
        this.facebook = facebook;
        this.instagram = instagram;
        this.linkedin = linkedin;
        this.twitter = twitter;
        this.whatsappNumber = whatsappNumber;
        this.whatsappNumberCountryCode = whatsappNumberCountryCode;
        this.whatsappNumberWithoutCountryCode = whatsappNumberWithoutCountryCode;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(String whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    public String getWhatsappNumberCountryCode() {
        return whatsappNumberCountryCode;
    }

    public void setWhatsappNumberCountryCode(String whatsappNumberCountryCode) {
        this.whatsappNumberCountryCode = whatsappNumberCountryCode;
    }

    public String getWhatsappNumberWithoutCountryCode() {
        return whatsappNumberWithoutCountryCode;
    }

    public void setWhatsappNumberWithoutCountryCode(String whatsappNumberWithoutCountryCode) {
        this.whatsappNumberWithoutCountryCode = whatsappNumberWithoutCountryCode;
    }
}

}