package leofx.nusmaps;

import android.graphics.Color;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;


/**
 * Created by HFX on 28/6/15.
 */
public class PolygonCoordinatesDatabase {

    public static class Area1 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng(1.29893619, 103.78017604),new LatLng(1.29748817, 103.78268659), new LatLng(1.29715566, 103.7825042),
                        new LatLng(1.29702695, 103.78237545), new LatLng(1.29698404, 103.78223598), new LatLng(1.29591143, 103.78217161),
                        new LatLng(1.29582562, 103.78217161), new LatLng(1.29552529, 103.78208578), new LatLng(1.2951177, 103.78208578),
                        new LatLng(1.29505335, 103.78208578), new LatLng(1.29498899, 103.78201067), new LatLng(1.29481737, 103.78171027),
                        new LatLng(1.29473156, 103.78164589), new LatLng(1.2946243, 103.78160298), new LatLng(1.29397001, 103.78133476),
                        new LatLng(1.29379839, 103.78106654), new LatLng(1.29376621, 103.78080904), new LatLng(1.29410945, 103.78040135),
                        new LatLng(1.2945814, 103.77999365), new LatLng(1.29472084, 103.77980053), new LatLng(1.29476374, 103.77961814),
                        new LatLng(1.29481737, 103.77904952), new LatLng(1.294871, 103.77878129), new LatLng(1.29478519, 103.77818048),
                        new LatLng(1.2948281, 103.77807319), new LatLng(1.29493536, 103.77783716), new LatLng(1.2950748, 103.77769768),
                        new LatLng(1.29524641, 103.77751529), new LatLng(1.29530005, 103.77738655), new LatLng(1.29524641, 103.77675354),
                        new LatLng(1.29527859, 103.77657115), new LatLng(1.29685533, 103.77744019), new LatLng(1.29652282, 103.77800882),
                        new LatLng(1.29647992, 103.77810538), new LatLng(1.29645846, 103.77823412), new LatLng(1.29653355, 103.77834141),
                        new LatLng(1.29671589, 103.77831995), new LatLng(1.29693041, 103.77831995), new LatLng(1.29716638, 103.77831995),
                        new LatLng(1.29742381,103.77838433), new LatLng(1.29742381, 103.77839506), new LatLng(1.29715566, 103.7791568),
                        new LatLng(1.29716638, 103.77927482), new LatLng(1.29740236, 103.78024042))
                .strokeColor(Color.YELLOW)
                .strokeWidth((float)0.5)
                .fillColor(Color.YELLOW);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }

   public static class Area2 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng(1.3025187, 103.77396673), new LatLng(1.29893619, 103.78017604), new LatLng(1.29740236, 103.78024042),
                        new LatLng(1.29731655, 103.77982199), new LatLng(1.29716638, 103.77927482), new LatLng(1.29715566, 103.7791568),
                        new LatLng(1.29742381, 103.77839506), new LatLng(1.29768124, 103.77771914), new LatLng(1.29788503, 103.77734363),
                        new LatLng(1.29802447, 103.77713978), new LatLng(1.29829262, 103.77687156), new LatLng(1.29859295, 103.77663553),
                        new LatLng(1.29873239, 103.77649605), new LatLng(1.2987753, 103.77642095), new LatLng(1.29885038, 103.77624929),
                        new LatLng(1.29888256, 103.77608836), new LatLng(1.29888256, 103.7759167), new LatLng(1.29888256, 103.77560556),
                        new LatLng(1.29888256, 103.77539098), new LatLng(1.29891474, 103.77523005), new LatLng(1.29904345, 103.77496183),
                        new LatLng(1.29915071,103.77482235), new LatLng(1.30069527, 103.77416521), new LatLng(1.3007918, 103.7742725),
                        new LatLng(1.30098487, 103.77440661), new LatLng(1.30106531, 103.77447098), new LatLng(1.30110822, 103.77448171),
                        new LatLng(1.30120475, 103.77448708), new LatLng(1.30131738, 103.77448708), new LatLng(1.30143, 103.77444953),
                        new LatLng(1.30150508 , 103.77441198), new LatLng(1.30210038, 103.77413303 ), new LatLng(1.30235781, 103.77402037))
                .strokeColor(Color.MAGENTA)
                .strokeWidth((float)0.5)
                .fillColor(Color.MAGENTA);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }

    public static class Area3 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng(1.3025187, 103.77396673), new LatLng(1.30235781, 103.77402037), new LatLng(1.30210038, 103.77413303),
                        new LatLng(1.30150508, 103.77441198), new LatLng(1.30143, 103.77444953), new LatLng(1.30131738, 103.77448708),
                        new LatLng(1.30120475, 103.77448708), new LatLng(1.30110822, 103.77448171), new LatLng(1.30106531, 103.77447098),
                        new LatLng(1.30098487, 103.77440661), new LatLng(1.3007918, 103.7742725), new LatLng(1.30069527, 103.77416521),
                        new LatLng(1.30066845, 103.77416521), new LatLng(1.30085079, 103.77392381), new LatLng(1.30100096, 103.77367705),
                        new LatLng(1.30105459, 103.77355903), new LatLng(1.30109749, 103.77344638), new LatLng(1.30111358, 103.77336055),
                        new LatLng(1.30113503, 103.77322644), new LatLng(1.30114576, 103.77306014), new LatLng(1.30113503, 103.7729153),
                        new LatLng(1.30110822, 103.77271682), new LatLng(1.30109213, 103.77249688), new LatLng(1.3010814, 103.77238423),
                        new LatLng(1.30106531, 103.77221256), new LatLng(1.30108101, 103.77205068), new LatLng(1.30108637, 103.77196485),
                        new LatLng(1.30117754, 103.77165907), new LatLng(1.30136525, 103.77105289), new LatLng(1.30155832, 103.77055937),
                        new LatLng(1.30235205, 103.77099389), new LatLng(1.30248612, 103.77115482), new LatLng(1.30261484, 103.77164298),
                        new LatLng(1.30261484, 103.77180391), new LatLng(1.30283472, 103.77247983), new LatLng(1.30285081, 103.77259785),
                        new LatLng(1.30286154, 103.77272659), new LatLng(1.30285081, 103.77291971), new LatLng(1.30281863, 103.77311283),
                        new LatLng(1.30269528, 103.77346688))
                .strokeColor(Color.GREEN)
                .strokeWidth((float)0.5)
                .fillColor(0x7F00FF00);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }

    public static class Area4 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng(1.30069527, 103.77416521), new LatLng(1.30066845, 103.77416521), new LatLng(1.30085079, 103.77392381),
                        new LatLng(1.30100096, 103.77367705), new LatLng(1.30105459, 103.77355903), new LatLng(1.30109749, 103.77344638),
                        new LatLng(1.30111358, 103.77336055), new LatLng(1.30113503, 103.77322644), new LatLng(1.30114576, 103.77306014),
                        new LatLng(1.30113503, 103.7729153), new LatLng(1.30110822, 103.77271682), new LatLng(1.30109213, 103.77249688),
                        new LatLng(1.3010814, 103.77238423), new LatLng(1.30106531, 103.77221256), new LatLng(1.30108101, 103.77205068),
                        new LatLng(1.30108637, 103.77196485), new LatLng(1.30117754, 103.77165907), new LatLng(1.30136525, 103.77105289),
                        new LatLng(1.30155832, 103.77055937), new LatLng(1.30113772, 103.77028003), new LatLng(1.30064432, 103.77008691),
                        new LatLng(1.30040834, 103.76999035), new LatLng(1.300226, 103.76994744), new LatLng(1.29916412, 103.76990452),
                        new LatLng(1.29833821, 103.76987234), new LatLng(1.29611791, 103.76971141), new LatLng(1.29638606, 103.77103105),
                        new LatLng(1.29637534, 103.77178207), new LatLng(1.2965255, 103.77218977), new LatLng(1.29667567, 103.77239361),
                        new LatLng(1.29693309, 103.77260819), new LatLng(1.29728705, 103.77285495), new LatLng(1.29772682, 103.7730588),
                        new LatLng(1.29793062, 103.77317682), new LatLng(1.2982524, 103.77362743), new LatLng(1.29854201, 103.77400294),
                        new LatLng(1.29889597, 103.7742497), new LatLng(1.29913194, 103.77441064), new LatLng(1.29929283, 103.77450719),
                        new LatLng(1.29929283, 103.77464667), new LatLng (1.29940009, 103.77474323), new LatLng(1.29960389, 103.77470031),
                        new LatLng(1.2997326, 103.77460375), new LatLng(1.29999003, 103.77461448), new LatLng(1.30021527, 103.77460375),
                        new LatLng(1.30035471, 103.77453938), new LatLng(1.30050488, 103.77443209), new LatLng(1.30062286, 103.77427116))
                .strokeColor(Color.BLUE)
                .strokeWidth((float) 0.5)
                .fillColor(Color.BLUE);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }

    public static class Area5 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng(1.29742381,103.77838433), new LatLng(1.29716638, 103.77831995), new LatLng(1.29693041, 103.77831995),
                        new LatLng(1.29671589, 103.77831995), new LatLng(1.29653355, 103.77834141), new LatLng(1.29645846, 103.77823412),
                        new LatLng(1.29647992, 103.77810538), new LatLng(1.29652282, 103.77800882), new LatLng(1.29685533, 103.77744019),
                        new LatLng(1.29527859, 103.77657115), new LatLng(1.29578272, 103.77617419), new LatLng(1.29587925, 103.77607763),
                        new LatLng(1.29490318, 103.77442539), new LatLng(1.29555747, 103.77378166), new LatLng(1.29593288, 103.77350271),
                        new LatLng(1.29622249, 103.77261221), new LatLng(1.29645846, 103.77231181), new LatLng(1.29654427,103.77223402), new LatLng(1.29693309, 103.77260819),
                        new LatLng(1.29728705, 103.77285495), new LatLng(1.29772682, 103.7730588), new LatLng(1.29793062, 103.77317682),
                        new LatLng(1.2982524, 103.77362743), new LatLng(1.29854201, 103.77400294), new LatLng(1.29889597, 103.7742497),
                        new LatLng(1.29913194, 103.77441064), new LatLng(1.29929283, 103.77450719), new LatLng(1.29929283, 103.77464667),
                        new LatLng(1.29940009, 103.77474323), new LatLng(1.29915071,103.77482235), new LatLng(1.29904345, 103.77496183),
                        new LatLng(1.29891474, 103.77523005), new LatLng(1.29888256, 103.77539098), new LatLng(1.29888256, 103.77560556),
                        new LatLng(1.29888256, 103.7759167), new LatLng(1.29888256, 103.77608836), new LatLng(1.29885038, 103.77624929),
                        new LatLng(1.2987753, 103.77642095), new LatLng(1.29873239, 103.77649605), new LatLng(1.29859295, 103.77663553),
                        new LatLng(1.29829262, 103.77687156), new LatLng(1.29802447, 103.77713978), new LatLng(1.29788503, 103.77734363),
                        new LatLng(1.29768124, 103.77771914))
                .strokeColor(Color.LTGRAY)
                .strokeWidth((float) 0.5)
                .fillColor(Color.LTGRAY);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }

    public static class Area6 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng(1.29611791, 103.76971141), new LatLng(1.29638606, 103.77103105), new LatLng(1.29637534, 103.77178207),
                        new LatLng(1.2965255, 103.77218977), new LatLng(1.29654427,103.77223402), new LatLng(1.29645846, 103.77231181),
                        new LatLng(1.29622249, 103.77261221), new LatLng(1.29593288, 103.77350271), new LatLng(1.29555747, 103.77378166),
                        new LatLng(1.29490318, 103.77442539),new LatLng(1.29480339, 103.77461227), new LatLng(1.29387558, 103.7742153), new LatLng(1.29372541, 103.77417775),
                        new LatLng(1.29351625, 103.77423676), new LatLng(1.29301749, 103.77405437), new LatLng(1.29227739, 103.77348574),
                        new LatLng(1.2924061, 103.77035828), new LatLng(1.29259917, 103.77042266), new LatLng(1.2926528, 103.77010079),
                        new LatLng(1.29363424, 103.76907619), new LatLng(1.29383804, 103.76923712), new LatLng(1.29445479, 103.76954289),
                        new LatLng(1.29474439, 103.76963945), new LatLng(1.29486774, 103.76965554), new LatLng(1.29505545, 103.76968773),
                        new LatLng(1.29536651, 103.76971455), new LatLng(1.29560784, 103.76973065),new LatLng(1.29606907, 103.76974137))
                .strokeColor(Color.RED)
                .strokeWidth((float) 0.5)
                .fillColor(Color.RED);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }

    public static class Area7 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng(1.29480339, 103.77461227), new LatLng(1.29387558, 103.7742153), new LatLng(1.29372541, 103.77417775),
                        new LatLng(1.29351625, 103.77423676), new LatLng(1.29301749, 103.77405437), new LatLng(1.29227739, 103.77348574),
                        new LatLng(1.29184624, 103.77337933), new LatLng(1.29079508,103.77626002), new LatLng(1.29155664, 103.77635658),
                        new LatLng(1.29174971, 103.7771827), new LatLng(1.29191596, 103.7773329), new LatLng(1.29202858, 103.7776494),
                        new LatLng(1.29379839, 103.77626538), new LatLng(1.29527859, 103.77657115), new LatLng(1.29578272, 103.77617419),
                        new LatLng(1.29587925, 103.77607763), new LatLng(1.29490318, 103.77442539))
                .strokeColor(Color.GREEN)
                .strokeWidth((float)0.5)
                .fillColor(0x7F00FF00);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }

    public static class Area8 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng(1.29376621, 103.78080904), new LatLng(1.29410945, 103.78040135), new LatLng(1.2945814, 103.77999365), new LatLng(1.29472084, 103.77980053),
                        new LatLng(1.29476374, 103.77961814), new LatLng(1.29481737, 103.77904952), new LatLng(1.294871, 103.77878129),
                        new LatLng(1.29478519, 103.77818048), new LatLng(1.2948281, 103.77807319), new LatLng(1.29493536, 103.77783716),
                        new LatLng(1.2950748, 103.77769768), new LatLng(1.29524641, 103.77751529), new LatLng(1.29530005, 103.77738655),
                        new LatLng(1.29524641, 103.77675354), new LatLng(1.29527859, 103.77657115), new LatLng(1.29527859, 103.77657115),
                        new LatLng(1.29379839, 103.77626538), new LatLng(1.29201786, 103.77768695), new LatLng(1.29203395, 103.77786934),
                        new LatLng(1.29203395, 103.77792299), new LatLng(1.29199104, 103.77806246), new LatLng(1.29188378, 103.77824485),
                        new LatLng(1.29178725, 103.77841115), new LatLng(1.29277405, 103.77918363), new LatLng(1.29240936, 103.7797308),
                        new LatLng(1.29269897, 103.7800312), new LatLng(1.2931441, 103.7794733), new LatLng(1.29366432, 103.78021359))
                .strokeColor(Color.CYAN)
                .strokeWidth((float)0.5)
                .fillColor(Color.CYAN);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }

    public static class Area9 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng(1.29376621, 103.78080904), new LatLng(1.29381448, 103.78071785), new LatLng(1.29367504, 103.78091097),
                        new LatLng(1.29356778, 103.7809968), new LatLng(1.29343907, 103.78110409), new LatLng(1.29295639, 103.78126502),
                        new LatLng(1.29285986, 103.78129721), new LatLng(1.29278477, 103.78139377), new LatLng(1.2925917, 103.78193021),
                        new LatLng(1.29247372, 103.78227353), new LatLng(1.29244154, 103.78264904), new LatLng(1.29228065, 103.78291726),
                        new LatLng(1.29219484, 103.78303528), new LatLng(1.29154055, 103.78348589), new LatLng(1.29118658, 103.78317475),
                        new LatLng(1.29093988, 103.78297091), new LatLng(1.29065028, 103.78260612), new LatLng(1.2905752, 103.78254175),
                        new LatLng(1.28995308, 103.78234863), new LatLng(1.28989945, 103.78234863), new LatLng(1.28968493, 103.78029943),
                        new LatLng(1.29143329, 103.77908707), new LatLng(1.29178725, 103.77841115), new LatLng(1.29277405, 103.77918363),
                        new LatLng(1.29240936, 103.7797308), new LatLng(1.29269897, 103.7800312), new LatLng(1.2931441, 103.7794733),
                        new LatLng(1.29366432, 103.78021359))
                .strokeColor(Color.BLUE)
                .strokeWidth((float)0.5)
                .fillColor(Color.BLUE);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }

    public static class Area10 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng(1.29893619, 103.78017604), new LatLng(1.29748817, 103.78268659), new LatLng(1.29715566, 103.7825042),
                        new LatLng(1.29702695, 103.78237545), new LatLng(1.29698404, 103.78223598), new LatLng(1.29591143, 103.78217161),
                        new LatLng(1.29582562, 103.78217161), new LatLng(1.29552529, 103.78208578), new LatLng(1.2951177, 103.78208578),
                        new LatLng(1.29505335, 103.78208578), new LatLng(1.29498899, 103.78201067), new LatLng(1.29481737, 103.78171027),
                        new LatLng(1.29473156, 103.78164589), new LatLng(1.2946243, 103.78160298), new LatLng(1.29397001, 103.78133476),
                        new LatLng(1.29379839, 103.78106654), new LatLng(1.29376621, 103.78080904), new LatLng(1.29376621, 103.78080904),
                        new LatLng(1.29381448, 103.78071785), new LatLng(1.29367504, 103.78091097), new LatLng(1.29356778, 103.7809968),
                        new LatLng(1.29343907, 103.78110409), new LatLng(1.29295639, 103.78126502), new LatLng(1.29285986, 103.78129721),
                        new LatLng(1.29278477, 103.78139377), new LatLng(1.2925917, 103.78193021), new LatLng(1.29247372, 103.78227353),
                        new LatLng(1.29244154, 103.78264904), new LatLng(1.29228065, 103.78291726), new LatLng(1.29219484, 103.78303528),
                        new LatLng(1.29154055, 103.78348589), new LatLng(1.2925917, 103.78455609), new LatLng(1.29285986, 103.78469557),
                        new LatLng(1.29311192, 103.78494769), new LatLng(1.29329963, 103.78516227), new LatLng(1.2936804, 103.78501207),
                        new LatLng(1.29412017, 103.78495306), new LatLng(1.29431861, 103.78488332), new LatLng(1.29539122, 103.78415912),
                        new LatLng(1.29637802, 103.78363341), new LatLng(1.2968446, 103.78323644))
                .strokeColor(Color.GREEN)
                .strokeWidth((float)0.5)
                .fillColor(0x7F00FF00);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }

/*    public static class Area11 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng)
                .strokeColor(Color.GREEN)
                .strokeWidth((float)0.5)
                .fillColor(0x7F00FF00);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }*/

/*    public static class Area12 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng)
                .strokeColor(Color.GREEN)
                .strokeWidth((float)0.5)
                .fillColor(0x7F00FF00);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }*/

/*    public static class Area13 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng)
                .strokeColor(Color.GREEN)
                .strokeWidth((float)0.5)
                .fillColor(0x7F00FF00);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }*/

/*    public static class Area14 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng)
                .strokeColor(Color.GREEN)
                .strokeWidth((float)0.5)
                .fillColor(0x7F00FF00);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }*/

/*    public static class Area15 {
        private static PolygonOptions Po = new PolygonOptions()
                .add(new LatLng)
                .strokeColor(Color.GREEN)
                .strokeWidth((float)0.5)
                .fillColor(0x7F00FF00);

        public static PolygonOptions getPoly() {
            return Po;
        }
    }*/
}
