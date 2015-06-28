package leofx.nusmaps;

import android.graphics.Color;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.PolyUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HFX on 28/6/15.
 */
public class PolygonCoordinatesDatabase {

    public static final String[] AREALIST = {"A1", "A2", "B", "C", "D1", "D2", "A1E", "A2E(AM)", "A2E(PM)", "UT-CLB Direct", "UT-FoS Direct"};
    public static final int[] COLORS = {0xFF5D8AA8, 0xFFAF002A, 0xFF9966CC, 0xFFFF033E, 0xFF00FFFF, 0xFFB2BEB5, 0xFFFF91AF, 0xFF967117, 0xFF0000FF, 0xFFDE6FA1, 0xFFDC143C};
    static final List<LatLng> a1LatLng = PolyUtil.decode("ek{FaqlxR\\YhAOrAq@XoAM_Bu@{BeBqEdA{@qBqCyCiBo@{@e@As@JeBNuBhA_CrAkCpAo@^q@t@c@v@?NMJOl@GnAkAbBQb@IhADnA@z@PlBX`AHvAo@rC_A|CkAnBwAjAg@j@Oh@Iv@?x@Dt@[`Ao@rAKXpBfAtAhBr@jA`@Z`AZv@RnA|@^V~@xAJjCCz@xB\\hAd@r@HpABfAQjAo@p@s@`@oAJuBiAIm@g@k@u@s@[}@a@[a@Bk@t@{@`@[r@h@cA~@Hd@If@~@f@b@r@l@b@hAJJC\\gBhAkBn@s@lA{@Lu@MqAgBuAcAYsAUi@[I]@eBCqCzBcEd@qBNcBLw@xAyBh@uA");
    static final List<LatLng> a2LatLng = PolyUtil.decode("yi{FycmxR`AvBbA|CX`AF|AOv@k@l@kBZk@^YbAeA|Aq@tAQzAYtBi@jAw@vAg@v@BfF@n@RNn@PhATxAv@lA`ABdAOx@qA`A{ArBq@xBIb@aAKa@Q}@oAkBs@]m@@e@T]~@}@T?d@f@aA|@INPXOh@dAb@v@hAZRz@Fx@J`@{BRMTHBPYlBWvAYtAkAjB{@p@QJ_ATg@No@@a@EQIQOMUGUo@Uw@YiAUi@CMC@iBQ{Ac@u@u@q@uAaAGScBg@w@aAeAeBqC{Am@B_@O_AEkA\\g@\\CZUJk@bA]|@Cf@[ARaATcA`@o@Jc@ZGh@e@`AStAIb@KV?j@Yp@{A@{B@o@\\}@z@s@??fAiAt@mAh@eBh@_Bh@wBKmB[kAOgBEoABeBVy@l@{@^oDDSd@o@~@}@lAs@bAm@nAo@pDyB\\Oh@C|@Gl@OPOVQb@n@l@x@\\Hb@Zb@TvAvAbAlADRyAfA");
    static final List<LatLng> bLatLng = PolyUtil.decode("_`}FiqjxRaEwAx@cEd@{BDmAO}B@kAl@eBXe@?[LMR?f@c@d@Q|@Ix@C^MV?LNFZrBbAl@r@pAlB^h@f@NxAb@rA|@pA|ATzAE`Cv@BrAZjAd@fAJzAIfA_@t@y@n@kAPiBBc@aAIg@W_@i@U]YSk@So@SQOG[Da@X_@r@o@HAj@\\ITu@n@CNNVSn@p@Rb@b@b@n@b@VZFh@Dp@?b@_CRGPHBL[jBk@fDEPOZy@hAcAr@mBl@eA?k@SOUM_@sAe@{AYy@GAuCSiAaAgAsA_A]Y_AYc@O[a@k@u@{@wA_Bu@{@c@]DYOiAEgA^c@VA\\WFcAxBInAFjCErAi@jCc@rBPb@NRnBj@`@H");
    static final List<LatLng> cLatLng = PolyUtil.decode("c`}FoqjxRaEoAdB_IBmAQmBHaB`@yALUT[@YJKT?j@i@jAWdAA\\MZ@d@]f@}@Tw@GkBH}@\\q@n@g@z@u@j@o@r@}AXgAf@oB`@yA?e@I{@U_AUeB?eAEgA@{@\\cAb@o@Ru@J{ABm@POPDBVSd@Kl@An@Yb@i@z@Wn@GfA@v@BnAPhBX`AHlAGn@YfAW~@U~@[bAc@bAy@dAw@p@o@l@U`@Kd@?f@@r@CjAO^]r@e@t@Q^g@@UMw@IoA`@g@XA^]Fm@xASt@EpAHz@D`BKhAu@pCYhAZl@f@VfBh@");
    static final List<LatLng> d1LatLng = PolyUtil.decode("}r{FwqkxRjATTHxA~@h@d@D~@Q|@_Ar@YVo@z@_A|AW|AADm@A_@KQOWYc@o@UQg@Om@QUWGUDa@x@}@XUh@b@eAz@ANLTIl@r@TNJj@z@^\\TJJBt@BDHI~AUjAq@`AaAl@kAVu@Ds@Ag@Ke@Mq@YiB[[GBsASqBo@{@u@y@y@g@]WmA_@a@SgAeBk@{@wBkAc@Mi@BUUsA@yAp@@REPYHy@|AIdA_@?Z{A\\cAVWESi@i@w@EuAf@uBt@a@Fy@Dm@K[Oc@c@QWa@mAGgBEi@UAMQAMPINELVEPHd@DjAFp@L^Rb@j@l@VP^Hx@@RC~@WfCcAbAIXJVJZLTCh@a@dAUxAK^G`@LDXbBdA\\Jp@~@n@~@^n@PNp@VpA^dBtAv@bAVjBGdB@FvB\\`A^x@Lh@@j@?|@ObA]d@g@f@y@Ns@JsAAWc@?a@GUOYYQWYc@g@UaAY[[ESFs@h@g@t@g@n@b@AP}@p@GLPP@HSl@r@Vl@t@^b@XRh@DV@NGFq@`@iAz@qAn@{@lAu@J}@CmAyAkAo@a@e@Oe@G");
    static final List<LatLng> d2LatLng = PolyUtil.decode("sk{FmplxRJ]d@YdAKj@Qf@e@Py@KsAUgA_BuEk@mAlAu@u@eAiAwAaBiAk@Sc@s@i@EcANmADq@PsAx@oBpA}BfAmAp@qA`B@ZMHQn@EjAm@z@g@|@Mp@@fBBhARtBXlAFfA]zAc@fBm@fB[t@iA|AaAr@WVWd@Mp@BxA?j@W|@y@|AWd@]@[Q{@CgAXo@d@AVKHOAe@jAYt@Cj@UCB{@ZkAb@o@C[o@e@w@?sCbAu@Zc@Hc@Ac@C]K}@s@i@wAIg@AoAG_@YIKUHKXCNLCXFvBJd@`@hAn@p@^RfADf@InBq@`Bk@t@?n@XTFX?b@c@nA]jAAn@Kn@Up@yADy@CiAJeAd@{@h@e@bBaB`@}@l@aBb@oBb@mBKiAU}@UsBAeAEqBPw@|@yANc@@y@LoAd@y@vAsAbBy@`B}@dDsBt@]fAEj@C`Ae@TCh@fAp@d@tA|@r@l@xA~AN`@yAbAf@hAbBrEPhAJxAGh@a@f@g@ZuAPc@ROX");

    public static List<PolylineOptions> getLatLngList() {
        List<PolylineOptions> LATLNGLIST = new ArrayList<PolylineOptions>();
        LATLNGLIST.add(new PolylineOptions().addAll(a1LatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(a2LatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(bLatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(cLatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(d1LatLng));
        LATLNGLIST.add(new PolylineOptions().addAll(d2LatLng));

        return LATLNGLIST;
    }

    /*Polygon polygon = map.addPolygon(new PolygonOptions()
            .add(new LatLng(1.30104923, 103.7753119), new LatLng(1.29991494, 103.7763231), new LatLng(1.29913462, 103.7764116), new LatLng(1.30155603, 103.7736569))
            .strokeColor(Color.RED)
            .fillColor(Color.BLUE));*/
}
