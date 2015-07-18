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
    static final List<LatLng> bLatLng = PolyUtil.decode("_`}FiqjxRaEwAx@cEd@{BDmAO}B@kAl@eBXe@?[LMR?f@c@d@Q|@Ix@C^MV?LNFZrBbAl@r@pAlB^h@f@NxAb@rA|@pA|ATzAE`Cv@BrAZjAd@fAJzAIfA_@t@y@n@kAPiBBc@aAIg@W_@i@U]YSk@So@SQOG[Da@X_@r@o@HAj@\\ITu@n@CNNVSn@p@Rb@b@b@n@b@VZFh@Dp@?b@_CRGPHBL[jBk@fDEPOZy@hAcAr@mBl@eA?k@SOUM_@sAe@{AYy@GAuCSiAaAgAsA_A]Y_AYc@O[a@k@u@{@wA_Bu@{@c@]DYOiAEgA^c@VA\\WFcAxBInAFjCErAi@jCc@rBPb@NRnBj@`@HbB\\fDHlLT`CH|DJfBHHBB[NE^B`@Jv@Th@VRRA`@OTmB{@uASeBOyAAgCGsCMsCMeFCyDMaBW");
    static final List<LatLng> cLatLng = PolyUtil.decode("c`}FoqjxRaEoAdB_IBmAQmBHaB`@yALUT[@YJKT?j@i@jAWdAA\\MZ@d@]f@}@Tw@GkBH}@\\q@n@g@z@u@j@o@r@}AXgAf@oB`@yA?e@I{@U_AUeB?eAEgA@{@\\cAb@o@Ru@J{ABm@POPDBVSd@Kl@An@Yb@i@z@Wn@GfA@v@BnAPhBX`AHlAGn@YfAW~@U~@[bAc@bAy@dAw@p@o@l@U`@Kd@?f@@r@CjAO^]r@e@t@Q^g@@UMw@IoA`@g@XA^]Fm@xASt@EpAHz@D`BKhAu@pCYhAZl@f@VfBh@");
    static final List<LatLng> d1LatLng = PolyUtil.decode("}r{FwqkxRjATTHxA~@h@d@D~@Q|@_Ar@YVo@z@_A|AW|AADm@A_@KQOWYc@o@UQg@Om@QUWGUDa@x@}@XUh@b@eAz@ANLTIl@r@TNJj@z@^\\TJJBt@BDHI~AUjAq@`AaAl@kAVu@Ds@Ag@Ke@Mq@YiB[[GBsASqBo@{@u@y@y@g@]WmA_@a@SgAeBk@{@wBkAc@Mi@BUUsA@yAp@@REPYHy@|AIdA_@?Z{A\\cAVWESi@i@w@EuAf@uBt@a@Fy@Dm@K[Oc@c@QWa@mAGgBEi@UAMQAMPINELVEPHd@DjAFp@L^Rb@j@l@VP^Hx@@RC~@WfCcAbAIXJVJZLTCh@a@dAUxAK^G`@LDXbBdA\\Jp@~@n@~@^n@PNp@VpA^dBtAv@bAVjBGdB@FvB\\`A^x@Lh@@j@?|@ObA]d@g@f@y@Ns@JsAAWc@?a@GUOYYQWYc@g@UaAY[[ESFs@h@g@t@g@n@b@AP}@p@GLPP@HSl@r@Vl@t@^b@XRh@DV@NGFq@`@iAz@qAn@{@lAu@J}@CmAyAkAo@a@e@Oe@G");
    static final List<LatLng> d2LatLng = PolyUtil.decode("sk{FmplxRJ]d@YdAKj@Qf@e@Py@KsAUgA_BuEk@mAlAu@u@eAiAwAaBiAk@Sc@s@i@EcANmADq@PsAx@oBpA}BfAmAp@qA`B@ZMHQn@EjAm@z@g@|@Mp@@fBBhARtBXlAFfA]zAc@fBm@fB[t@iA|AaAr@WVWd@Mp@BxA?j@W|@y@|AWd@]@[Q{@CgAXo@d@AVKHOAe@jAYt@Cj@UCB{@ZkAb@o@C[o@e@w@?sCbAu@Zc@Hc@Ac@C]K}@s@i@wAIg@AoAG_@YIKUHKXCNLCXFvBJd@`@hAn@p@^RfADf@InBq@`Bk@t@?n@XTFX?b@c@nA]jAAn@Kn@Up@yADy@CiAJeAd@{@h@e@bBaB`@}@l@aBb@oBb@mBKiAU}@UsBAeAEqBPw@|@yANc@@y@LoAd@y@vAsAbBy@`B}@dDsBt@]fAEj@C`Ae@TCh@fAp@d@tA|@r@l@xA~AN`@yAbAf@hAbBrEPhAJxAGh@a@f@g@ZuAPc@ROX");
    static final List<LatLng> utclbLatLng = PolyUtil.decode("gq}FwlkxRa@kAIe@EgBEKUAMKBSHKZDBRCPFHFbBFn@`@fAt@t@dAVfAKbBo@lBo@r@@l@VRJX@x@o@x@OpAG^IT@JN?P`@TvAv@h@p@jA~A\\h@VNbBf@RP|@l@|@p@h@`AP|AA`B??MLCs@CeBOaAiAkAsAaASQ}Aa@]WsAwB[e@cB}@o@]a@DSEOMg@Cu@Fs@Z[XATQNWCKOCYa@[SKu@B{@\\oAb@cA\\cAF}@Q_Ay@");
    static final List<LatLng> utfosLatLng = PolyUtil.decode("iq}F{lkxRa@gAGe@EiBCIUAKICOLMPALH?LANBJF|AFl@`@jA`@d@^Xj@Lj@@n@Ir@[rAc@x@]f@C\\DJHl@NX@d@[l@UvBMRKT?NCb@YZo@La@F[?a@EcA?YF[Pk@R]l@g@bAcAh@o@`@aAr@aCz@}CMyAW_AUmB@y@E_@?o@?q@F_@HWf@w@LQRm@NmB?]JKJAFBBJARKFOj@A`AUb@g@r@Yf@Ol@?n@@r@D^?t@RlBV~@JzA{@hDo@~Be@fAk@v@w@p@w@p@U`@K\\Gf@B`ABl@Id@Yn@U\\[h@M`@ULYEUMk@Eq@Fk@Tg@X@PGPUFQKCMGMm@g@MCa@@}@VuAh@_A\\o@Fm@?o@Qi@g@SQ");
    static final List<LatLng> a1eLatLng = PolyUtil.decode("}g{FmrlxRy@Fa@Va@dAs@jA}@zAOl@MnB]vAq@rAkArBG^?xEFd@TR~@RnAVz@h@lAx@JjAWdAgAv@s@z@eAfB]jBa@AYnCUn@k@t@eA\\qBHQ\\SA_A[i@UuBY?oBEmAc@}@c@k@e@YcAs@iBg@e@Wo@eAoAmBcCsAAQb@_A^q@Ls@CwAB_APs@l@k@`Aw@n@u@bAyB`AuD`@qAQ_B[uAMaBE}A@_Bz@eBl@u@@cAPm@LSEMbAuAv@i@zBiAtAw@nBkAt@c@d@KlAEXG");
    static final List<LatLng> a2eAmLatLng = PolyUtil.decode("_u{FoomxRb@Kt@[RIZj@Rb@j@\\hAj@r@p@lAjAd@~@DHw@b@i@\\v@zAjAbDZtALjBOn@m@j@{@Vw@F[RW`AkAjBy@rAEl@CbA[bB_BzCk@x@@nFBd@PPd@RrB\\~AjAh@^FpAWz@kAx@sAfBa@x@Y`BY`Do@lAaAn@oA^eADw@EyAe@}A]o@IKA@iBMyAe@s@}@y@cAq@MUc@OaA]YUg@y@kAaB_@IiBeAOC]FWQEWZU^@n@[b@gANq@EyABy@Vo@\\g@x@g@bAkA^w@n@iB\\oAp@kCKcBYaASeB?{@AaCLa@l@kAZ_AN}B@OJIl@y@j@i@jAw@dBw@zCoBz@i@^Qr@Gb@C");
    static final List<LatLng> a2ePmLatLng = PolyUtil.decode("_u{FoomxRb@Kt@[RIZj@Rb@j@\\hAj@r@p@lAjAd@~@DHw@b@i@\\v@zAjAbDZtALjBOn@m@j@{@Vw@F[RW`AkAjBy@rAEl@CbA[bB_BzCk@x@@nFBd@PPd@RrB\\~AjAh@^FpAWz@kAx@sAfBa@x@Y`BY`Do@lAaAn@oA^eADw@EyAe@}A]o@IKA@iBMyAe@s@}@y@cAq@MUc@OaA]YUg@y@kAaB_@IiBeAOC]FWQEWZU^@n@[b@gANq@EyABy@Vo@\\g@x@g@bAkA^w@n@iB\\oAp@kCKcBYaASeB?{@AaCLa@l@kAZ_AN}B@OJIl@y@j@i@jAw@dBw@zCoBz@i@^Qr@Gb@C");

    static final String[] a1BusStops = {"Busstop: PGP Terminal", "Busstop: After Sci Park Drive/ Kent Ridge Stn", "Busstop: Kent Ridge MRT Station", "Busstop: NUH", "Busstop: LT29", "Busstop: University Hall", "Busstop: Opp UHC", "Busstop: Yusof Ishak House", "Busstop: Central Library", "Busstop: LT13", "Busstop: AS7", "Busstop: COM2", "Busstop: BIZ2", "Busstop: Opp House 12", "Busstop: House 7"};
    static final String[] a2BusStops = {"Busstop: PGP Terminal", "Busstop: Between Houses 14 & 15", "Busstop: House 12", "Busstop: Opp Hon Sui Sen Memorial Lib", "Busstop: Opp NUSS", "Busstop: COM2", "Busstop: Temasek Hall", "Busstop: Eusoff Hall", "Busstop: Ventus", "Busstop: Computer Centre", "Busstop: Opposite YIH", "Busstop: Museum", "Busstop: UHC/Kent Ridge Hall", "Busstop: Opp University Hall", "Busstop: Blk S17", "Busstop: Opp NUH", "Busstop: Opp Kent Ridge MRT Station"};
    static final String[] bBusStops = {"Busstop: Kent Ridge Bus Terminal", "Busstop: The Japanese Primary School", "Busstop: Museum", "Busstop: Yusof Ishak House", "Busstop: Central Library", "Busstop: LT13", "Busstop: AS7", "Busstop: COM2", "Busstop: Temasek Hall", "Busstop: Eusoff Hall", "Busstop: Ventus", "Busstop: Computer Centre", "Busstop: Opposite YIH", "Busstop: Raffles Hall", "Busstop: Opp Blk EA"};
    static final String[] cBusStops = {"Busstop: The Japanese Primary School", "Busstop: Museum", "Busstop: UHC/Kent Ridge Hall", "Busstop: Opp University Hall", "Busstop: Blk S17", "Busstop: LT29", "Busstop: University Hall", "Busstop: Opp UHC", "Busstop: Raffles Hall", "Busstop: Opp Blk EA"};
    static final String[] d1BusStops = {"Busstop: Opp Hon Sui Sen Memorial Lib", "Busstop: COM2", "Busstop: Ventus", "Busstop: Computer Centre", "Busstop: Opposite YIH", "Busstop: Museum", "Busstop: U-Town", "Busstop: Yusof Ishak House", "Busstop: Central Library", "Busstop: LT13", "Busstop: AS7", "Busstop: COM2", "Busstop: BIZ2"};
    static final String[] d2BusStops = {"Busstop: PGP Terminal", "Busstop: Kent Ridge MRT Station", "Busstop: LT29", "Busstop: University Hall", "Busstop: Opp UHC", "Busstop: Museum", "Busstop: U-Town", "Busstop: UHC/Kent Ridge Hall", "Busstop: Opp University Hall", "Busstop: Blk S17", "Busstop: Opp Kent Ridge MRT Station"};
    static final String[] a1eBusStops = {"Busstop: Kent Ridge MRT Station", "Busstop: LT29", "Busstop: Central Library", "Busstop: BIZ2", "Busstop: PGP Terminal"};
    static final String[] a2eAmBusStops = {"Busstop: Opp Kent Ridge MRT Station", "Busstop: Ventus", "Busstop: Computer Centre", "Busstop: Blk S17"};
    static final String[] a2ePmBusStops = {"Busstop: Opp Kent Ridge MRT Station", "Busstop: Ventus", "Busstop: Computer Centre", "Busstop: Blk S17"};
    static final String[] utclbBusStops = {"Busstop: U-Town", "Busstop: Central Library"};
    static final String[] utfosBusStops = {"Busstop: U-Town", "Busstop: LT29"};

    static final String[][] allBusStops = {a1BusStops, a2BusStops, bBusStops, cBusStops, d1BusStops, d2BusStops, a1eBusStops, a2eAmBusStops, a2ePmBusStops, utclbBusStops, utfosBusStops};

    public static List<PolylineOptions> getLatLngList() {
        List<PolylineOptions> LATLNGLIST = new ArrayList<PolylineOptions>();
        LATLNGLIST.add(new PolylineOptions().addAll(a1LatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(a2LatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(bLatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(cLatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(d1LatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(d2LatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(a1eLatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(a2eAmLatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(a2ePmLatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(utclbLatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(utfosLatLng));

        return LATLNGLIST;
    }
}