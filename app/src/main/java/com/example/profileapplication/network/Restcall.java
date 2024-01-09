package com.example.profileapplication.network;


import com.example.profileapplication.Response.Contact;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Single;

public interface Restcall {

    @FormUrlEncoded
    @POST("profileMenuController.php")
    Single<Contact.ProfileListResponse> GetProfileMenuDetails(
            @Field("tag") String tag,
            @Field("society_id") String society_id,
            @Field("user_id") String user_id,
            @Field("unit_id") String unit_id,
            @Field("block_id") String block_id,
            @Field("floor_id") String floor_id,
            @Field("language_id") String language_id,
            @Field("other_user_block_id") String other_user_block_id,
            @Field("other_user_floor_id") String other_user_floor_id,
            @Field("my_user_id") String my_user_id,
            @Field("my_profile") String my_profile);




/*    @FormUrlEncoded
    @POST("blood_donorsapi/blood_donation_apis.php")
    Single<BloodRequestListResponse>CallRequestForBlood(
            @Field("tag") String tag,
            @Field("blood_type") String blood_type,
            @Field("blood_group") String blood_group,
            @Field("patient_full_name") String patient_full_name,
            @Field("patient_mobileno") String patient_mobileno,
            @Field("date") String date,
            @Field("select_units") String select_units,
            @Field("critical_situation") String critical_situation,
            @Field("description") String description,
            @Field("location") String location,
            @Field("request_status") String request_status);

    @FormUrlEncoded
    @POST("blood_donorsapi/blood_donation_apis.php")
    Single<BloodDonateListResponse>GetallBloodgroups(
            @Field("tag") String tag);

    @FormUrlEncoded
    @POST("blood_donorsapi/blood_donation_apis.php")
    Single<LocationListResponse>LocationCall(
            @Field("tag") String tag,
            @Field("area") String area);

    @FormUrlEncoded
    @POST("blood_donorsapi/blood_donation_apis.php")
    Single<EditStatusListResponse>EditStatus(
            @Field("tag") String tag,
            @Field("request_id") String request_id,
            @Field("user_id") String user_id);


    @FormUrlEncoded
    @POST("blood_donorsapi/blood_donation_apis.php")
    Single<AcceptedBloodListResponse>AcceptedBloodCall(
            @Field("tag") String tag);

    @FormUrlEncoded
    @POST("blood_donorsapi/blood_donation_apis.php")
    Single<ImageSliderListResponse>ImagesCall(
            @Field("tag") String tag,
            @Field("banner_status") String banner_status);*/

}


