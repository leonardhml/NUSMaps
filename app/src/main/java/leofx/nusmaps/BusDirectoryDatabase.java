package leofx.nusmaps;

import android.app.Activity;

import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.PolyUtil;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leona_000 on 25/6/2015.
 */
public class BusDirectoryDatabase {

    public static final String[] BUSLIST = {"A1", "A2", "B", "C", "D1", "D2", "A1E", "A2E(AM)", "A2E(PM)", "UT-CLB Direct", "UT-FoS Direct"};
    public static final int[] COLORS = {0xFF5D8AA8, 0xFFAF002A, 0xFF9966CC, 0xFFFF033E, 0xFF00FFFF, 0xFFB2BEB5, 0xFFFF91AF, 0xFF967117, 0xFF0000FF, 0xFFDE6FA1, 0xFFDC143C};


    static final List<LatLng> a1LatLng = PolyUtil.decode("ek{FaqlxR\\YhAOrAq@XoAM_Bu@{BeBqEdA{@qBqCyCiBo@{@e@As@JeBNuBhA_CrAkCpAo@^q@t@c@v@?NMJOl@GnAkAbBQb@IhADnA@z@PlBX`AHvAo@rC_A|CkAnBwAjAg@j@Oh@Iv@?x@Dt@[`Ao@rAKXpBfAtAhBr@jA`@Z`AZv@RnA|@^V~@xAJjCCz@xB\\hAd@r@HpABfAQjAo@p@s@`@oAJuBiAIm@g@k@u@s@[}@a@[a@Bk@t@{@`@[r@h@cA~@Hd@If@~@f@b@r@l@b@hAJJC\\gBhAkBn@s@lA{@Lu@MqAgBuAcAYsAUi@[I]@eBCqCzBcEd@qBNcBLw@xAyBh@uA");
    static final List<LatLng> a2LatLng = PolyUtil.decode("yi{FycmxR`AvBbA|CX`AF|AOv@k@l@kBZk@^YbAeA|Aq@tAQzAYtBi@jAw@vAg@v@BfF@n@RNn@PhATxAv@lA`ABdAOx@qA`A{ArBq@xBIb@aAKa@Q}@oAkBs@]m@@e@T]~@}@T?d@f@aA|@INPXOh@dAb@v@hAZRz@Fx@J`@{BRMTHBPYlBWvAYtAkAjB{@p@QJ_ATg@No@@a@EQIQOMUGUo@Uw@YiAUi@CMC@iBQ{Ac@u@u@q@uAaAGScBg@w@aAeAeBqC{Am@B_@O_AEkA\\g@\\CZUJk@bA]|@Cf@[ARaATcA`@o@Jc@ZGh@e@`AStAIb@KV?j@Yp@{A@{B@o@\\}@z@s@??fAiAt@mAh@eBh@_Bh@wBKmB[kAOgBEoABeBVy@l@{@^oDDSd@o@~@}@lAs@bAm@nAo@pDyB\\Oh@C|@Gl@OPOVQb@n@l@x@\\Hb@Zb@TvAvAbAlADRyAfA");
    static final List<LatLng> bLatLng = PolyUtil.decode("_`}FiqjxRaEwAx@cEd@{BDmAO}B@kAl@eBXe@?[LMR?f@c@d@Q|@Ix@C^MV?LNFZrBbAl@r@pAlB^h@f@NxAb@rA|@pA|ATzAE`Cv@BrAZjAd@fAJzAIfA_@t@y@n@kAPiBBc@aAIg@W_@i@U]YSk@So@SQOG[Da@X_@r@o@HAj@\\ITu@n@CNNVSn@p@Rb@b@b@n@b@VZFh@Dp@?b@_CRGPHBL[jBk@fDEPOZy@hAcAr@mBl@eA?k@SOUM_@sAe@{AYy@GAuCSiAaAgAsA_A]Y_AYc@O[a@k@u@{@wA_Bu@{@c@]DYOiAEgA^c@VA\\WFcAxBInAFjCErAi@jCc@rBPb@NRnBj@`@H");
    static final List<LatLng> cLatLng = PolyUtil.decode("c`}FoqjxRaEoAdB_IBmAQmBHaB`@yALUT[@YJKT?j@i@jAWdAA\\MZ@d@]f@}@Tw@GkBH}@\\q@n@g@z@u@j@o@r@}AXgAf@oB`@yA?e@I{@U_AUeB?eAEgA@{@\\cAb@o@Ru@J{ABm@POPDBVSd@Kl@An@Yb@i@z@Wn@GfA@v@BnAPhBX`AHlAGn@YfAW~@U~@[bAc@bAy@dAw@p@o@l@U`@Kd@?f@@r@CjAO^]r@e@t@Q^g@@UMw@IoA`@g@XA^]Fm@xASt@EpAHz@D`BKhAu@pCYhAZl@f@VfBh@");
    static final List<LatLng> d1LatLng = PolyUtil.decode("}r{FwqkxRjATTHxA~@h@d@D~@Q|@_Ar@YVo@z@_A|AW|AADm@A_@KQOWYc@o@UQg@Om@QUWGUDa@x@}@XUh@b@eAz@ANLTIl@r@TNJj@z@^\\TJJBt@BDHI~AUjAq@`AaAl@kAVu@Ds@Ag@Ke@Mq@YiB[[GBsASqBo@{@u@y@y@g@]WmA_@a@SgAeBk@{@wBkAc@Mi@BUUsA@yAp@@REPYHy@|AIdA_@?Z{A\\cAVWESi@i@w@EuAf@uBt@a@Fy@Dm@K[Oc@c@QWa@mAGgBEi@UAMQAMPINELVEPHd@DjAFp@L^Rb@j@l@VP^Hx@@RC~@WfCcAbAIXJVJZLTCh@a@dAUxAK^G`@LDXbBdA\\Jp@~@n@~@^n@PNp@VpA^dBtAv@bAVjBGdB@FvB\\`A^x@Lh@@j@?|@ObA]d@g@f@y@Ns@JsAAWc@?a@GUOYYQWYc@g@UaAY[[ESFs@h@g@t@g@n@b@AP}@p@GLPP@HSl@r@Vl@t@^b@XRh@DV@NGFq@`@iAz@qAn@{@lAu@J}@CmAyAkAo@a@e@Oe@G");
    static final List<LatLng> d2LatLng = PolyUtil.decode("sk{FmplxRJ]d@YdAKj@Qf@e@Py@KsAUgA_BuEk@mAlAu@u@eAiAwAaBiAk@Sc@s@i@EcANmADq@PsAx@oBpA}BfAmAp@qA`B@ZMHQn@EjAm@z@g@|@Mp@@fBBhARtBXlAFfA]zAc@fBm@fB[t@iA|AaAr@WVWd@Mp@BxA?j@W|@y@|AWd@]@[Q{@CgAXo@d@AVKHOAe@jAYt@Cj@UCB{@ZkAb@o@C[o@e@w@?sCbAu@Zc@Hc@Ac@C]K}@s@i@wAIg@AoAG_@YIKUHKXCNLCXFvBJd@`@hAn@p@^RfADf@InBq@`Bk@t@?n@XTFX?b@c@nA]jAAn@Kn@Up@yADy@CiAJeAd@{@h@e@bBaB`@}@l@aBb@oBb@mBKiAU}@UsBAeAEqBPw@|@yANc@@y@LoAd@y@vAsAbBy@`B}@dDsBt@]fAEj@C`Ae@TCh@fAp@d@tA|@r@l@xA~AN`@yAbAf@hAbBrEPhAJxAGh@a@f@g@ZuAPc@ROX");
    static final List<LatLng> utclbLatLng = PolyUtil.decode("gq}FwlkxRa@kAIe@EgBEKUAMKBSHKZDBRCPFHFbBFn@`@fAt@t@dAVfAKbBo@lBo@r@@l@VRJX@x@o@x@OpAG^IT@JN?P`@TvAv@h@p@jA~A\\h@VNbBf@RP|@l@|@p@h@`AP|AA`B??MLCs@CeBOaAiAkAsAaASQ}Aa@]WsAwB[e@cB}@o@]a@DSEOMg@Cu@Fs@Z[XATQNWCKOCYa@[SKu@B{@\\oAb@cA\\cAF}@Q_Ay@");
    static final List<LatLng> utfosLatLng = PolyUtil.decode("iq}F{lkxRa@gAGe@EiBCIUAKICOLMPALH?LANBJF|AFl@`@jA`@d@^Xj@Lj@@n@Ir@[rAc@x@]f@C\\DJHl@NX@d@[l@UvBMRKT?NCb@YZo@La@F[?a@EcA?YF[Pk@R]l@g@bAcAh@o@`@aAr@aCz@}CMyAW_AUmB@y@E_@?o@?q@F_@HWf@w@LQRm@NmB?]JKJAFBBJARKFOj@A`AUb@g@r@Yf@Ol@?n@@r@D^?t@RlBV~@JzA{@hDo@~Be@fAk@v@w@p@w@p@U`@K\\Gf@B`ABl@Id@Yn@U\\[h@M`@ULYEUMk@Eq@Fk@Tg@X@PGPUFQKCMGMm@g@MCa@@}@VuAh@_A\\o@Fm@?o@Qi@g@SQ");

    public static List<PolylineOptions> getLatLngList() {
        List<PolylineOptions> LATLNGLIST = new ArrayList<PolylineOptions>();
        LATLNGLIST.add(new PolylineOptions().addAll(a1LatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(a2LatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(bLatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(cLatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(d1LatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(d2LatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(utclbLatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(utfosLatLng));

        return LATLNGLIST;
    }

    public static List<List<PlaceOfInterestInfo>> getBusMarkersList() {
        List<List<PlaceOfInterestInfo>> busMarkersList = new ArrayList<List<PlaceOfInterestInfo>>();
        //A1
        List<PlaceOfInterestInfo> a1BusStops = new ArrayList<PlaceOfInterestInfo>();
        a1BusStops.add(MainScreen.POIListByArea.get(9).get("Busstop: PGP Terminal"));
        a1BusStops.add(MainScreen.POIListByArea.get(10).get("Busstop: After Sci Park Drive/ Kent Ridge Stn"));
        a1BusStops.add(MainScreen.POIListByArea.get(10).get("Busstop: Kent Ridge MRT Station"));
        a1BusStops.add(MainScreen.POIListByArea.get(10).get("Busstop: NUH"));
        a1BusStops.add(MainScreen.POIListByArea.get(1).get("Busstop: LT29"));
        a1BusStops.add(MainScreen.POIListByArea.get(1).get("Busstop: University Hall"));
        a1BusStops.add(MainScreen.POIListByArea.get(5).get("Busstop: Opp UHC"));
        a1BusStops.add(MainScreen.POIListByArea.get(5).get("Busstop: Yusof Ishak House"));
        a1BusStops.add(MainScreen.POIListByArea.get(5).get("Busstop: Central Library"));
        a1BusStops.add(MainScreen.POIListByArea.get(6).get("Busstop: LT13"));
        a1BusStops.add(MainScreen.POIListByArea.get(6).get("Busstop: AS7"));
        a1BusStops.add(MainScreen.POIListByArea.get(6).get("Busstop: COM2"));
        a1BusStops.add(MainScreen.POIListByArea.get(7).get("Busstop: BIZ2"));
        a1BusStops.add(MainScreen.POIListByArea.get(8).get("Busstop: Opp House 12"));
        a1BusStops.add(MainScreen.POIListByArea.get(8).get("Busstop: House 7"));

        busMarkersList.add(a1BusStops);

        return busMarkersList;
    }
}
