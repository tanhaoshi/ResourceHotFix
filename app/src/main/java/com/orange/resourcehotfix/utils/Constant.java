package com.orange.resourcehotfix.utils;

public class Constant {

    // 测试接口地址 http://192.168.1.76/gdb-api/
    // http://127.0.0.1:8005/version/updatePassword
    // 测试机地地址 http://192.168.1.176:8040
    // 生产环境地址 http://123.207.250.61:19999/
    // 方洋本地地址 http://192.168.1.81:8010
    // 生产环境域名地址 : http://yzt.yztzn.com:8040
    //         http://yzt.test.yztzn.com
    // https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201109/36f5b7adc89540a5ba1ec01bed7dc793.so

    //http://192.168.1.201:8010/appUser/getPhoneByUserID

    public static final String BASE_URL = "http://yzt.yztzn.com";
    ///yzt-api
    public static final String NAT_WALL_PATH = "/yzt-api";

    //修改密码
    public static final String UPDATE_PASSWORD_URL = NAT_WALL_PATH + "/appUser/updatePassword/";

    //用户登录 /appUser/appLogin
    public static final String USER_LOGIN_URL = NAT_WALL_PATH + "/appUser/appLogin";

    //工人登录 252451
    public static final String WORKERS_LOGIN_URL = NAT_WALL_PATH + "/appUser/userCodeLogin";

    //登录获取验证码
    public static final String WORKERS_CODE_URL = NAT_WALL_PATH + "/appUser/getVerifyCode";

    //修改密码获取验证码接口
    public static final String MODIFY_PASSWORD_URL = NAT_WALL_PATH + "/appUser/getVerifyCodeUpdatePassWord";

    public static final String USER_TOKEN = "user_token";

    public static final String USER_ID = "user_id";

    public static final String USER_NAME = "user_name";

    public static final String CONSTRUCTION_ID = "construction_id";

    public static final String CONSTRUCTION_NAME = "construction_name";

    public static final String HEADER_IMAGE = "header_image";

    public static final String IS_MANAGER = "is_manager";

    public static final String ORG_ID = "org_id";

    public static final String PROJECT_ID = "project_id";

    public static final String SHOW_SWITCH_PROJECT = "show_switch_project";

    public static final String SEX = "sex";

    public static final String STATUS = "status";

    public static final String USER_TYPE = "user_type";

    public static final String FACE_URL = "face_url";

    public static final String EMP_ID = "emp_id";

    public static final String PROJECT_NAME = "project_name";

    public static final String COMPANY_NAME="company_name";

    public static final String NIKE_NAME = "nike_name";

    public static final String CAMERA_SWITCH = "camera_switch";

    public static final String FACE_ENGINE = "face_engine";

    public static final String LOGIN_ROLE = "login_role";

    public static final String LOGIN_LOGO_URL = "login_logo_url";

    public static final String LOGIN_PHONE = "login_phone";

    //首页人员情况接口
    public static final String HOME_PAGER_URL = NAT_WALL_PATH + "/appUser/personnel";

    //所属分包商列表
    public static final String CONSTRUCTION_LIST_URL = NAT_WALL_PATH + "/appConstruction/getConstList";

    //模糊搜索分包商
    public static final String CONSTRUCTION_LIKE_URL = NAT_WALL_PATH + "/appConstruction/getConstListByName";

    //班组下拉列表接口
    public static final String TEAM_LIST_URL = NAT_WALL_PATH + "/appTeam/getTeamList";

    //工种下拉列表接口
    public static final String DICTIONARIES_HOTDIC_URL = NAT_WALL_PATH + "/appDictionaries/findDictionarie";

    //图片上传地址 user/upload
    public static final String USER_UPLOAD_URL = NAT_WALL_PATH + "/user/upload";

    //人员信息录入
    public static final String WORKERS_SAVEORUPDATE_URL = NAT_WALL_PATH + "/appWorkers/workersSaveOrUpdate";

    //用户考勤
    public static final String ATTENDANCE_RECORD_URL = NAT_WALL_PATH + "/appAttendanceRecord/punchTheClock";

    //人员信息列表
    public static final String WORKERS_PERSONNEL_LIST = NAT_WALL_PATH + "/appWorkers/personnelList";

    //详细人员信息
    public static final String WORKERS_INFO_URL = NAT_WALL_PATH + "/appWorkers/findWorkersInfo";

    //退出登录
    public static final String USER_LOGINOUT = NAT_WALL_PATH + "/appUser/loginOut";

    //版本更新
    public static final String CHECK_VERSION_URL = NAT_WALL_PATH + "/appVersion/findByType";

    //用户反馈
    public static final String FEEDBACK_URL = NAT_WALL_PATH + "/appFeedBack/saveOrUpdata";

    //用户信息更新
    public static final String USER_UPDATE_URL = NAT_WALL_PATH + "/appUser/updateUser";

    //所属项目下拉
    public static final String PROJECT_LIST_URL = NAT_WALL_PATH + "/appProject/getProjectList";

    //切换项目
    public static final String SWITCH_PROJECT_URL = NAT_WALL_PATH + "/appProject/switchProject";

    //获取班组状态下拉
    public static final String APP_TEAM_LIST_URL = NAT_WALL_PATH + "/appTeam/getAllTeamList";

    //日考勤记录 查询
    public static final String WORKERS_DATAINFO_URL = NAT_WALL_PATH + "/appWorkers/getWorkersDataInfo";

    //日工量查询
    public static final String ATTENDANCE_MANUAL_URL = NAT_WALL_PATH + "/appAttendanceManual/getWorkersloadInfo";

    //提交日考勤 工量
    public static final String TODAY_ATTENDANCE_URL = NAT_WALL_PATH + "/appAttendanceManual/saveAttendanceManual";

    //提交日考勤 工时
    public static final String WORK_ATTENDANCE_MANUAL_URL = NAT_WALL_PATH + "/appAttendanceManual/saveOrUpdateWorkload";

    //月工时考勤 查询
    public static final String WORKERS_MOUTH_URL = NAT_WALL_PATH + "/appWorkers/getWorkersMonthDataInfo";


    //月工量考勤从查询
    public static final String WORKERS_LOAD_INFO_URL = NAT_WALL_PATH + "/appAttendanceManual/getWorkersMonthloadInfo";

    // 月工量薪资查询
    public static final String WORKERS_MOUTH_LOAD_INFO = NAT_WALL_PATH + "/appAttendanceManual/getWorkersMonthloadInfo";

    // 工时薪资确定按钮
    public static final String WORKERS_SALARY_CONFIRM_URL = NAT_WALL_PATH + "/salaryData/saveOrUpdateSalaryData";

    // 工时薪资提交按钮
    public static final String SALARY_REVIEW_URL = NAT_WALL_PATH + "/salaryReview/saveOrUpdateSalaryReview";

    //统计考勤 接口
    public static final String ALL_CLOCK_URL = NAT_WALL_PATH + "/appWorkers/isAllClock";

    //计量单位
    public static final String METER_UNIT_URL = NAT_WALL_PATH + "/appDictionaries/getUnit";

    //安全隐患下拉接口
    public static final String DICTIONARIES_GET_URL = NAT_WALL_PATH + "/dictionaries/getHiddenDanger";

    // 人员类型 与 工作岗位接口
    public static final String OPTION_THIRD_URL = NAT_WALL_PATH + "/thirdDic/optionList";

    //整改人下拉
    public static final String INSPECTION_GET_URL = NAT_WALL_PATH + "/safetyInspection/getRectifiers";

    //复查人下拉
    public static final String CHECK_PERSON_URL = NAT_WALL_PATH + "/safetyInspection/getRecheckPerson";

    //安全整改提交
    public static final String SAFETY_SAVE_URL = NAT_WALL_PATH + "/safetyInspection/save";

    //安全巡检查询
    public static final String SAFETY_INSPECTION_URL = NAT_WALL_PATH + "/safetyInspection/list";

    //安全巡检流程查询
    public static final String SAFETY_INSPECTION_LOG_URL = NAT_WALL_PATH + "/safetyInspectionLog/getLog";

    //安全整改 提交,审核,确认
    public static final String SAFETY_INSPECTION_RESULT_URL = NAT_WALL_PATH + "/safetyInspectionLog/handleResultSave";

    //消息模块 获取消息
    public static final String MESSAGE_LIST_URL = NAT_WALL_PATH + "/jpushMessage/list";

    //获取多少条未读消息
    public static final String UNREAD_MESSAGE_URL = NAT_WALL_PATH + "/jpushMessage/unreadCount";

    //银行卡图片识别
    public static final String RECOGNIZE_BANK_URL = NAT_WALL_PATH + "/appWorkers/bankOcr";

    //获取工人列表
    public static final String SITE_WORKERS_URL = NAT_WALL_PATH + "/workers/getWorkers";

    //获取班组列表
    public static final String SITE_TEAM_URL = NAT_WALL_PATH + "/appTeam/getTeamListByConId";

    //获取宿舍三级列表
    public static final String SITE_LIVE_LIST_URL = NAT_WALL_PATH + "/gycLiveArea/getDormitory";

    //宿舍入住
    public static final String SITE_RECORD_DROMITORY_URL = NAT_WALL_PATH + "/gycStayRecord/inOrOutLive";

    //身份证认证对比
    public static final String SITE_FACE_COMPARE_URL = NAT_WALL_PATH + "/appFacedata/compareCard";

    //校验是否绑定手机号
    public static final String SITE_USER_BINDING_PHPNE = NAT_WALL_PATH + "/appUser/getPhoneByUserID";

    //安装APK 名字
    public static final String APK_NAME = "site-master.apk";

    public static final String PLUG_FILE_NAME = "libarcsoft_face.so";

    public static final String PLUG_FILE_MD5 = "c94fd3ab6c7ca9088909eee1aead58b6";

    public static final String FACE_SO_PATH = "https://yztcos-1301448263.cos.ap-guangzhou.myqcloud.com/20201109/36f5b7adc89540a5ba1ec01bed7dc793.so";

    public static final String PLUG_FILE_PATH = "/storage/emulated/0/Android/data/com.tomcat.ocr.idcard/files/libarcsoft_face.so";

    //虹软
    //小米5s BqkBdwpRbi6iJWEE8BcgUBddrfXAqrUJ9iRhaxJGhCxc
    public static final String APP_ID = "839bFTR4q4EbqXJBhZQjXR6ArtoJqRNw1vwuV4wzSo8Z";
    //小米5s BQV74Rd5ERqun64QdrjZ7SWKEohTfnShLdQ6KhPYy3jc
    public static final String SDK_KEY = "8THqDze4XoHRiztyyt3Ry1pwkvzGGLXF5cLxLLhtGeha";

    //腾讯Bugly id
    public static final String BUGLY_APP_ID = "1c424c0be4";

}
