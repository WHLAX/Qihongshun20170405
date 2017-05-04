package baway.com.qihongshun20170405;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by hasee on 2017/4/5.
 */

public class App extends Application{
    static final  String htmlStr =  "{\n" +
            "    \"dataSize\": 54,\n" +
            "    \"apk\": [\n" +
            "        {\n" +
            "            \"id\": \"143\",\n" +
            "            \"name\": \"诛仙\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/zhuxian_logo.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/zhuxian_xiaoyao_ew1995111626.apk\",\n" +
            "            \"packageName\": \"com.wanmei.zhuxian.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.99.5\",\n" +
            "            \"versionCode\": \"1102\",\n" +
            "            \"apkSize\": \"517749503\",\n" +
            "            \"downloadTimes\": \"680500\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1\",\n" +
            "            \"name\": \"梦幻西游\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/mhxy/mhxy.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/mhxy_xiaoyao_ew_1113077746.apk\",\n" +
            "            \"packageName\": \"com.netease.my.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.113.0\",\n" +
            "            \"versionCode\": \"0\",\n" +
            "            \"apkSize\": \"322961408\",\n" +
            "            \"downloadTimes\": \"993007\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"163\",\n" +
            "            \"name\": \"阴阳师\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/yys_icon2.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/com.shouyou.yys.xyaz.20170324.apk\",\n" +
            "            \"packageName\": \"com.shouyou.yys.xyaz\",\n" +
            "            \"versionName\": \"1.0.15\",\n" +
            "            \"versionCode\": \"15\",\n" +
            "            \"apkSize\": \"687455352\",\n" +
            "            \"downloadTimes\": \"424372\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"74\",\n" +
            "            \"name\": \"问道\",\n" +
            "            \"iconUrl\": \"http://p16.qhimg.com/t012110dd7b94cd4cee.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/com.gbits.atm.qihoo.juhe.ewan.xyaz.20170325.apk\",\n" +
            "            \"packageName\": \"com.gbits.atm.qihoo.juhe.ewan.xyaz\",\n" +
            "            \"versionName\": \"2.002.0321\",\n" +
            "            \"versionCode\": \"201703210\",\n" +
            "            \"apkSize\": \"404744852\",\n" +
            "            \"downloadTimes\": \"305000\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"71\",\n" +
            "            \"name\": \"仙灵世界\",\n" +
            "            \"iconUrl\": \"http://img2.2345.com/zhushouimg/img/logo/25/57025_1459487319.png?1459487319\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/xlsj_xiaoyao_ew091788732.apk\",\n" +
            "            \"packageName\": \"com.tiancity.xlsj.ewan.xyaz\",\n" +
            "            \"versionName\": \"0.9.17\",\n" +
            "            \"versionCode\": \"68572\",\n" +
            "            \"apkSize\": \"307325327\",\n" +
            "            \"downloadTimes\": \"4650\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"19\",\n" +
            "            \"name\": \"COK列王的纷争\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/lwdfz.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/cok_xiaoyao_ew233079972.apk\",\n" +
            "            \"packageName\": \"com.hcg.cok.ewan.xyaz\",\n" +
            "            \"versionName\": \"2.33.0\",\n" +
            "            \"versionCode\": \"552\",\n" +
            "            \"apkSize\": \"45193625\",\n" +
            "            \"downloadTimes\": \"42900\",\n" +
            "            \"categoryName\": \"经营策略\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"23\",\n" +
            "            \"name\": \"大话西游\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/dhxy_icon_new.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/dhxy_xiaoyao_ew_117879971.apk\",\n" +
            "            \"packageName\": \"com.netease.dhxy.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.1.78\",\n" +
            "            \"versionCode\": \"19329\",\n" +
            "            \"apkSize\": \"309969551\",\n" +
            "            \"downloadTimes\": \"293000\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"70\",\n" +
            "            \"name\": \"部落冲突:皇室战争\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/hszz_icon.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/hszz_xiaoyao_ew18191507.apk\",\n" +
            "            \"packageName\": \"com.supercell.clashroyale.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.8.1\",\n" +
            "            \"versionCode\": \"139\",\n" +
            "            \"apkSize\": \"102152857\",\n" +
            "            \"downloadTimes\": \"104200\",\n" +
            "            \"categoryName\": \"经营策略\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"37\",\n" +
            "            \"name\": \"部落冲突\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/blct_icon.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/com.supercell.clashofclans.ewan.xyaz.20170325.apk\",\n" +
            "            \"packageName\": \"com.supercell.clashofclans.ewan.xyaz\",\n" +
            "            \"versionName\": \"8.709.16\",\n" +
            "            \"versionCode\": \"837\",\n" +
            "            \"apkSize\": \"75917916\",\n" +
            "            \"downloadTimes\": \"606520\",\n" +
            "            \"categoryName\": \"经营策略\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"140\",\n" +
            "            \"name\": \"水浒Q传\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/shqz_icon_new.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/shqz_xiaoyao_ew129111627.apk\",\n" +
            "            \"packageName\": \"com.joygames.shqz.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.29\",\n" +
            "            \"versionCode\": \"1029\",\n" +
            "            \"apkSize\": \"223522835\",\n" +
            "            \"downloadTimes\": \"72700\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"146\",\n" +
            "            \"name\": \"御龙在天\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/ylzt_Icon_512.png\",\n" +
            "            \"downloadUrl\": \"http://dlied5.myapp.com/myapp/1104680867/ylm/10018305_com.tencent.tmgp.ylm_h101_1.232.0.1.apk\",\n" +
            "            \"packageName\": \"com.tencent.tmgp.ylm\",\n" +
            "            \"versionName\": \"1.201.0.1\",\n" +
            "            \"versionCode\": \"23\",\n" +
            "            \"apkSize\": \"394452079\",\n" +
            "            \"downloadTimes\": \"531000\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"121\",\n" +
            "            \"name\": \"小冰冰传奇\",\n" +
            "            \"iconUrl\": \"http://p16.qhimg.com/t015d42d08aa89d0ccf.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/dtcq_xiaoyao_ew50029108686.apk\",\n" +
            "            \"packageName\": \"sh.lilith.dgame.yiwan.xyaz\",\n" +
            "            \"versionName\": \"5.0.029\",\n" +
            "            \"versionCode\": \"107005\",\n" +
            "            \"apkSize\": \"323299183\",\n" +
            "            \"downloadTimes\": \"17400\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"161\",\n" +
            "            \"name\": \"黎明之光\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/lmzg_icon.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/lmzg_xiaoyao_ew024163244116899.apk\",\n" +
            "            \"packageName\": \"com.linekong.dbm.ewan.xyaz\",\n" +
            "            \"versionName\": \"0.24.16.3244\",\n" +
            "            \"versionCode\": \"32208\",\n" +
            "            \"apkSize\": \"307152070\",\n" +
            "            \"downloadTimes\": \"223240\",\n" +
            "            \"categoryName\": \"动作冒险\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"94\",\n" +
            "            \"name\": \"倩女幽魂\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/qnyh_512x512.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/qnyh_xiaoyao_ew11997722.apk\",\n" +
            "            \"packageName\": \"com.netease.l10.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.1.9\",\n" +
            "            \"versionCode\": \"19\",\n" +
            "            \"apkSize\": \"309776821\",\n" +
            "            \"downloadTimes\": \"531000\",\n" +
            "            \"categoryName\": \"动作冒险\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"165\",\n" +
            "            \"name\": \"青云志\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/qyz_icon_new.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/qyz_xiaoyao_ew106116900.apk\",\n" +
            "            \"packageName\": \"com.wanmei.qyz.android.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.06\",\n" +
            "            \"versionCode\": \"20\",\n" +
            "            \"apkSize\": \"679807840\",\n" +
            "            \"downloadTimes\": \"393240\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"189\",\n" +
            "            \"name\": \"合金弹头OL\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/hjdt_icon.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/hjdt_7930_xiaoyao_1.0.8.apk\",\n" +
            "            \"packageName\": \"com.tuo3.hjdt.ju360.xiaoyao\",\n" +
            "            \"versionName\": \"1.0.8\",\n" +
            "            \"versionCode\": \"8\",\n" +
            "            \"apkSize\": \"191589766\",\n" +
            "            \"downloadTimes\": \"772710\",\n" +
            "            \"categoryName\": \"动作射击\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"190\",\n" +
            "            \"name\": \"迷城物语\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/mcwy_icon.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/mcwy_7929_xiaoyao_1.43.apk\",\n" +
            "            \"packageName\": \"com.wanxin.zoo.ju360.kf.xiaoyao\",\n" +
            "            \"versionName\": \"1.43\",\n" +
            "            \"versionCode\": \"40\",\n" +
            "            \"apkSize\": \"187874319\",\n" +
            "            \"downloadTimes\": \"632710\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"126\",\n" +
            "            \"name\": \"御剑情缘\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/yjqy_512.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/yjqy_xiaoyao_ew132109406.apk\",\n" +
            "            \"packageName\": \"com.zlongame.yjqy.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.3.2\",\n" +
            "            \"versionCode\": \"19\",\n" +
            "            \"apkSize\": \"294198381\",\n" +
            "            \"downloadTimes\": \"131100\",\n" +
            "            \"categoryName\": \"动作冒险\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"186\",\n" +
            "            \"name\": \"探墓风云\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/tmfy_icon.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/tmfy_xiaoyao_ew110121728.apk\",\n" +
            "            \"packageName\": \"com.hoolai.tmfy.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.1.0\",\n" +
            "            \"versionCode\": \"10\",\n" +
            "            \"apkSize\": \"253915555\",\n" +
            "            \"downloadTimes\": \"261527\",\n" +
            "            \"categoryName\": \"动作冒险\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"179\",\n" +
            "            \"name\": \"天堂2:血盟\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/tt2_icon_new.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/tt2xm_xiaoyao_20170313184026.apk\",\n" +
            "            \"packageName\": \"com.snailgame.lineage.ly.xyaz\",\n" +
            "            \"versionName\": \"1.4.0\",\n" +
            "            \"versionCode\": \"16\",\n" +
            "            \"apkSize\": \"554034004\",\n" +
            "            \"downloadTimes\": \"693240\",\n" +
            "            \"categoryName\": \"动作冒险\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"184\",\n" +
            "            \"name\": \"异次元战姬\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/ycyzj_icon.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/ycyzj_7757_xiaoyao_1.2.238.apk\",\n" +
            "            \"packageName\": \"com.netease.ycyzj.kf.xiaoyao\",\n" +
            "            \"versionName\": \"1.2.238\",\n" +
            "            \"versionCode\": \"238\",\n" +
            "            \"apkSize\": \"292751970\",\n" +
            "            \"downloadTimes\": \"431527\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"162\",\n" +
            "            \"name\": \"九阴真经3D\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/jyzj3d_icon_new.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/6270f1a1e565c9e989fde2b5a7bf5270.apk\",\n" +
            "            \"packageName\": \"com.snailgame.jyzjyd.guopan.xyaz\",\n" +
            "            \"versionName\": \"1.0.9\",\n" +
            "            \"versionCode\": \"9\",\n" +
            "            \"apkSize\": \"669880325\",\n" +
            "            \"downloadTimes\": \"323240\",\n" +
            "            \"categoryName\": \"动作冒险\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"118\",\n" +
            "            \"name\": \"新仙剑奇侠传\",\n" +
            "            \"iconUrl\": \"http://p16.qhimg.com/t01cb094cd1d74657a5.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/xxjqxz_xiaoyao_ew320108690.apk\",\n" +
            "            \"packageName\": \"com.cmge.xianjian.ewan.xyaz\",\n" +
            "            \"versionName\": \"3.2.0\",\n" +
            "            \"versionCode\": \"320\",\n" +
            "            \"apkSize\": \"173641240\",\n" +
            "            \"downloadTimes\": \"52385\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"176\",\n" +
            "            \"name\": \"螺旋境界线\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/lxjjx.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/lxjjx_xiaoyao_ew171116975.apk\",\n" +
            "            \"packageName\": \"com.longtugame.lxjjx.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.7.1\",\n" +
            "            \"versionCode\": \"593\",\n" +
            "            \"apkSize\": \"311626425\",\n" +
            "            \"downloadTimes\": \"293240\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"166\",\n" +
            "            \"name\": \"大航海之路\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/dhhzl_icon.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/dhhzl_xiaoyao_ew113116977.apk\",\n" +
            "            \"packageName\": \"com.netease.dhhzl.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.1.3\",\n" +
            "            \"versionCode\": \"13\",\n" +
            "            \"apkSize\": \"409800050\",\n" +
            "            \"downloadTimes\": \"393606\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"156\",\n" +
            "            \"name\": \"新世纪福音战士OL\",\n" +
            "            \"iconUrl\": \"http://p15.qhimg.com/t010ed8a8edc3c4502d.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/xsjfyzol_xiaoyao_20170210145935.apk\",\n" +
            "            \"packageName\": \"com.heitao.eva.linyou.xyaz\",\n" +
            "            \"versionName\": \"1.6.0\",\n" +
            "            \"versionCode\": \"160\",\n" +
            "            \"apkSize\": \"100362746\",\n" +
            "            \"downloadTimes\": \"323240\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"66\",\n" +
            "            \"name\": \"率土之滨\",\n" +
            "            \"iconUrl\": \"http://img4.2345.com/zhushouimg/img/logo/752/50752_1450952403.png?1450952403\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/stzb_xiaoyao_ew12888728.apk\",\n" +
            "            \"packageName\": \"com.netease.stzb.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.2.8\",\n" +
            "            \"versionCode\": \"74985\",\n" +
            "            \"apkSize\": \"147618529\",\n" +
            "            \"downloadTimes\": \"8166\",\n" +
            "            \"categoryName\": \"经营策略\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"149\",\n" +
            "            \"name\": \"口袋妖怪重制\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/kdygcz_128.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/kdygcz_xiaoyao_ew141114445.apk\",\n" +
            "            \"packageName\": \"com.istorm.kdygcz.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.4.1\",\n" +
            "            \"versionCode\": \"41\",\n" +
            "            \"apkSize\": \"210229033\",\n" +
            "            \"downloadTimes\": \"293000\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"151\",\n" +
            "            \"name\": \"数码宝贝大冒险\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/smbbdmx_128.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/smbbdmx_xiaoyao_ew13015446114444.apk\",\n" +
            "            \"packageName\": \"com.tianji.digimons.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.3.0.11645\",\n" +
            "            \"versionCode\": \"32\",\n" +
            "            \"apkSize\": \"152169417\",\n" +
            "            \"downloadTimes\": \"73000\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"103\",\n" +
            "            \"name\": \"刀剑神域黑衣骑士\",\n" +
            "            \"iconUrl\": \"http://p15.qhimg.com/t019db83044e03c1f02.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/djsy_xiaoyao_ew1800102665.apk\",\n" +
            "            \"packageName\": \"com.yunchang.djsy.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.8.0.0\",\n" +
            "            \"versionCode\": \"800\",\n" +
            "            \"apkSize\": \"429290915\",\n" +
            "            \"downloadTimes\": \"11400\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"155\",\n" +
            "            \"name\": \"小李飞刀\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/xlfd_icon_new.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/xlfd_xiaoyao_ew106114447.apk\",\n" +
            "            \"packageName\": \"com.netease.knifelee.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.0.6\",\n" +
            "            \"versionCode\": \"6\",\n" +
            "            \"apkSize\": \"220261721\",\n" +
            "            \"downloadTimes\": \"5982385\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"169\",\n" +
            "            \"name\": \"塔防三国志\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/tfsgz_icon2.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/com.shouyou.tfsgz.xyaz.20170321.apk\",\n" +
            "            \"packageName\": \"com.shouyou.tfsgz.xyaz\",\n" +
            "            \"versionName\": \"2.1.00\",\n" +
            "            \"versionCode\": \"2100\",\n" +
            "            \"apkSize\": \"84014700\",\n" +
            "            \"downloadTimes\": \"193240\",\n" +
            "            \"categoryName\": \"经营策略\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"137\",\n" +
            "            \"name\": \"圣斗士星矢-集结\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/sdsxs_128.png\",\n" +
            "            \"downloadUrl\": \"http://apkdownload.ewan.cn/sdsxsjj/xiaoyao/sdsxsjj_xiaoyao_ew16660new109405.apk\",\n" +
            "            \"packageName\": \"com.freejoy.seiya.idreamsky.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.6.660\",\n" +
            "            \"versionCode\": \"660\",\n" +
            "            \"apkSize\": \"344959447\",\n" +
            "            \"downloadTimes\": \"18829\",\n" +
            "            \"categoryName\": \"动作冒险\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"152\",\n" +
            "            \"name\": \"微微一笑很倾城\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/wwyxhqc106.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/wwyxhqc_xiaoyao_ew1500114446.apk\",\n" +
            "            \"packageName\": \"com.EastFantasy.EastWW.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.5.00.00.170220\",\n" +
            "            \"versionCode\": \"170220\",\n" +
            "            \"apkSize\": \"299964041\",\n" +
            "            \"downloadTimes\": \"931000\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"116\",\n" +
            "            \"name\": \"暗黑啪啪啪\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/ahppp_icon.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/ahppp_Android_xiaoyao_1.9.1_201608021446update.apk\",\n" +
            "            \"packageName\": \"com.shouyou.ahppp.xyaz\",\n" +
            "            \"versionName\": \"1.6.0\",\n" +
            "            \"versionCode\": \"160\",\n" +
            "            \"apkSize\": \"148018199\",\n" +
            "            \"downloadTimes\": \"12385\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"177\",\n" +
            "            \"name\": \"数码宝贝复刻\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/smbbfk_icon_new.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/smbbfk_dd_Android_xiaoyao_2.0.0_201609221902.apk\",\n" +
            "            \"packageName\": \"com.shouyou.smbbfk.xyaz\",\n" +
            "            \"versionName\": \"1.2\",\n" +
            "            \"versionCode\": \"3\",\n" +
            "            \"apkSize\": \"313080878\",\n" +
            "            \"downloadTimes\": \"293240\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"122\",\n" +
            "            \"name\": \"秦时明月\",\n" +
            "            \"iconUrl\": \"http://p16.qhimg.com/t01a2ce421e0174cf45.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/qsmy_xiaoyao_ew530108688.apk\",\n" +
            "            \"packageName\": \"cc.thedream.qinsmoon.ewan.xyaz\",\n" +
            "            \"versionName\": \"5.3.0\",\n" +
            "            \"versionCode\": \"57\",\n" +
            "            \"apkSize\": \"162283795\",\n" +
            "            \"downloadTimes\": \"52385\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"58\",\n" +
            "            \"name\": \"青丘狐传说\",\n" +
            "            \"iconUrl\": \"http://p15.qhimg.com/t016e883759ce0e69ee.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/qqhcs_xiaoyao_ew14386807.apk\",\n" +
            "            \"packageName\": \"com.zlongame.qqh.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.4.3\",\n" +
            "            \"versionCode\": \"25\",\n" +
            "            \"apkSize\": \"271942933\",\n" +
            "            \"downloadTimes\": \"12800\",\n" +
            "            \"categoryName\": \"角色扮演\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"128\",\n" +
            "            \"name\": \"老九门\",\n" +
            "            \"iconUrl\": \"http://www.microvirt.com/new_market/img/ljm_512.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/ljm_xiaoyao_ewan1080109408.apk\",\n" +
            "            \"packageName\": \"com.miller.laojiumen.platform.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.0.8.0\",\n" +
            "            \"versionCode\": \"40\",\n" +
            "            \"apkSize\": \"202539051\",\n" +
            "            \"downloadTimes\": \"30000\",\n" +
            "            \"categoryName\": \"动作冒险\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"129\",\n" +
            "            \"name\": \"全民大主宰\",\n" +
            "            \"iconUrl\": \"http://p19.qhimg.com/t0113287dafd3948cbf.png\",\n" +
            "            \"downloadUrl\": \"http://www.microvirt.com/new_market/apk/qmdzz_xiaoyao_ew125109409.apk\",\n" +
            "            \"packageName\": \"com.wanmei.dzz.android.ewan.xyaz\",\n" +
            "            \"versionName\": \"1.2.5\",\n" +
            "            \"versionCode\": \"11\",\n" +
            "            \"apkSize\": \"276089832\",\n" +
            "            \"downloadTimes\": \"9300\",\n" +
            "            \"categoryName\": \"动作冒险\",\n" +
            "            \"from\": \"官方\",\n" +
            "            \"markid\": 0\n" +
            "        }\n" +
            "    ]\n" +
            "}";
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(getApplicationContext()).build();
        ImageLoader.getInstance().init(configuration);
    }
}
