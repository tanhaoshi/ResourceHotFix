package com.orange.resourcehotfix.network;


import com.orange.resourcehotfix.networkmodel.AllColckModel;
import com.orange.resourcehotfix.networkmodel.AppVersionModel;
import com.orange.resourcehotfix.networkmodel.AttendanceManual;
import com.orange.resourcehotfix.networkmodel.AttendanceRecord;
import com.orange.resourcehotfix.networkmodel.BankModel;
import com.orange.resourcehotfix.networkmodel.CheckPersonModel;
import com.orange.resourcehotfix.networkmodel.ConstructionLikeModel;
import com.orange.resourcehotfix.networkmodel.ConstructionModel;
import com.orange.resourcehotfix.networkmodel.DictionarieModel;
import com.orange.resourcehotfix.networkmodel.DictionariesModel;
import com.orange.resourcehotfix.networkmodel.FeedModelRequetModel;
import com.orange.resourcehotfix.networkmodel.GycStayRecord;
import com.orange.resourcehotfix.networkmodel.HomePagerModel;
import com.orange.resourcehotfix.networkmodel.InspectionLogModel;
import com.orange.resourcehotfix.networkmodel.InspectionModel;
import com.orange.resourcehotfix.networkmodel.LifeAreaModel;
import com.orange.resourcehotfix.networkmodel.LoginModel;
import com.orange.resourcehotfix.networkmodel.MessageModel;
import com.orange.resourcehotfix.networkmodel.MeterUnitModel;
import com.orange.resourcehotfix.networkmodel.MouthAttendanceModel;
import com.orange.resourcehotfix.networkmodel.PeopleTypeModel;
import com.orange.resourcehotfix.networkmodel.PersonDetailsModel;
import com.orange.resourcehotfix.networkmodel.PersonSignalModel;
import com.orange.resourcehotfix.networkmodel.ProjectModel;
import com.orange.resourcehotfix.networkmodel.ProjectWorkerModel;
import com.orange.resourcehotfix.networkmodel.ProjectWorkers;
import com.orange.resourcehotfix.networkmodel.RectifiersModel;
import com.orange.resourcehotfix.networkmodel.RegisterInfoModel;
import com.orange.resourcehotfix.networkmodel.ResponseBodyModel;
import com.orange.resourcehotfix.networkmodel.ResponseModel;
import com.orange.resourcehotfix.networkmodel.SafetyInspection;
import com.orange.resourcehotfix.networkmodel.SafetyInspectionLog;
import com.orange.resourcehotfix.networkmodel.SalaryTeamModel;
import com.orange.resourcehotfix.networkmodel.TeamModel;
import com.orange.resourcehotfix.networkmodel.UpdateUserModel;
import com.orange.resourcehotfix.networkmodel.WorkPostModel;
import com.orange.resourcehotfix.networkmodel.WorkersInfoModel;
import com.orange.resourcehotfix.networkmodel.WorkersTeamModel;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 */

public interface NetService {

    @POST
    Observable<ResponseModel> postUpdatePassword(
            @Header("token") String token,
            @Url String url,
            @Body Map<String, String> map,
            @Header("sign") String header
    );

    @GET
    Observable<BankModel> getBankInfoOfAilPay(
            @Url String url
    );

    @POST
    Observable<LoginModel> postLogin(
            @Url String url,
            @Body Map<String, String> map,
            @Header("sign") String sign
    );

    @POST
    Observable<HomePagerModel> postHomePager(
            @Header("token") String token,
            @Url String url,
            @Body Map<String, String> map,
            @Header("sign") String sign
    );

    @POST
    Observable<ProjectModel> postProjectList(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<ConstructionModel> postConstructionList(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<ConstructionLikeModel> postConstListByName(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<DictionarieModel> postDictionaionarie(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<TeamModel> postTeamList(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<DictionariesModel> postHotDicList(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<RegisterInfoModel> postWorkersSaveOrUpdate(
            @Header("token") String token,
            @Url String url,
            @Body ProjectWorkers projectWorkers,
            @Header("sign") String header
    );

    @POST
    Observable<ResponseModel> postAttendanceRecord(
            @Header("token") String token,
            @Url String url,
            @Body AttendanceRecord data,
            @Header("sign") String header
    );

    @POST
    Observable<PersonDetailsModel> postWorkersPersonnelList(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<ResponseBody> postLoginOut(
            @Url String url,
            @Header("token") String token,
            @Header("sign") String header
    );

    @GET
    Observable<PersonSignalModel> getSignalPersonInfo(
            @Url String url,
            @Header("token") String token,
            @Header("sign") String header
    );

    @POST
    Observable<AppVersionModel> getAppVersionInfo(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String sign
    );

    @POST
    Observable<ResponseModel> postFeedbackInfo(
            @Url String url,
            @Header("token") String token,
            @Body FeedModelRequetModel feedModelRequetModel,
            @Header("sign") String header
    );

    @POST
    Observable<ResponseModel> postUpdateUserInfo(
            @Url String url,
            @Header("token") String token,
            @Body UpdateUserModel model,
            @Header("sign") String header
    );

    @POST
    Observable<ProjectModel> postSwitchProject(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<SalaryTeamModel> postSalaryTeamList(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<WorkersInfoModel> postWorkersDataInfo(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<MouthAttendanceModel> postWorkersManual(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<RegisterInfoModel> postTodayAttendance(
            @Url String url,
            @Header("token") String token,
            @Body List<AttendanceManual> map,
            @Header("sign") String header
    );

    @POST
    Observable<RegisterInfoModel> postWorkloadDataInfo(
            @Url String url,
            @Header("token") String token,
            @Body List<AttendanceManual> map,
            @Header("sign") String header
    );

    @POST
    Observable<MouthAttendanceModel> postWorkersMouthDataInfo(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<RegisterInfoModel> postSaveSalaryConfirm(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<RegisterInfoModel> postSaveSalaryCommit(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<AllColckModel> postAllClock(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<MeterUnitModel> postAllMeterUnit(
            @Url String url,
            @Header("token") String token,
            @Header("sign") String header,
            @Body String placeholder
    );

    @POST
    Observable<PeopleTypeModel> postPeopleTypeInfo(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<WorkPostModel> postWorkPostInfo(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<LoginModel> postWorkerPostLogin(
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<ResponseModel> postGetVerifyCode(
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<RectifiersModel> postSafetyInspection(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<CheckPersonModel> postCheckPerson(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<RegisterInfoModel> postSaveInspection(
            @Header("token") String token,
            @Url String url,
            @Body SafetyInspection safetyInspection,
            @Header("sign") String header
    );

    @POST
    Observable<InspectionModel> postInspectionData(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<InspectionLogModel> postInspectionLog(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<RegisterInfoModel> postSaveResult(
            @Header("token") String token,
            @Url String url,
            @Body SafetyInspectionLog safetyInspectionLog,
            @Header("sign") String header
    );

    @POST
    Observable<MessageModel> postMessageModel(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<RegisterInfoModel> postMessageIsRead(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<RegisterInfoModel> postUnReadList(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<ProjectWorkerModel> postWorkersList(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<WorkersTeamModel> postWorkersTeamList(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<LifeAreaModel> postLifeAreaList(
            @Header("token") String token,
            @Url String url,
            @Body Map map,
            @Header("sign") String header
    );

    @POST
    Observable<RegisterInfoModel> postWorkersSave(
            @Header("token") String token,
            @Url String url,
            @Body List<GycStayRecord> list,
            @Header("sign") String header
    );

    @POST
    Observable<ResponseBodyModel> postPhoneByUserID(
            @Header("token") String token,
            @Url String url,
            @Body Map body,
            @Header("sign") String header
    );

    @POST
    Observable<ResponseModel> postModifyPassword(
            @Url String url,
            @Header("token") String token,
            @Body Map map,
            @Header("sign") String header
    );

}
