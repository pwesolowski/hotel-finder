package com.hrs.sourcing.coding_task.review.currency;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Sets;

public class Currency {

    public static final Currency AED = new Currency("AED");

    public static final Currency AFA = new Currency("AFA");

    public static final Currency AFN = new Currency("AFN");

    public static final Currency ALL = new Currency("ALL");

    public static final Currency AMD = new Currency("AMD");

    public static final Currency ANG = new Currency("ANG");

    public static final Currency ARA = new Currency("ARA");

    public static final Currency ARS = new Currency("ARS");

    public static final Currency ATS = new Currency("ATS");

    public static final Currency AUD = new Currency("AUD");

    public static final Currency AWG = new Currency("AWG");

    public static final Currency AZM = new Currency("AZM");

    public static final Currency AZN = new Currency("AZN");

    public static final Currency BAM = new Currency("BAM");

    public static final Currency BBD = new Currency("BBD");

    public static final Currency BDT = new Currency("BDT");

    public static final Currency BEF = new Currency("BEF");

    public static final Currency BGL = new Currency("BGL");

    public static final Currency BGN = new Currency("BGN");

    public static final Currency BHD = new Currency("BHD");

    public static final Currency BIF = new Currency("BIF");

    public static final Currency BMD = new Currency("BMD");

    public static final Currency BND = new Currency("BND");

    public static final Currency BOB = new Currency("BOB");

    public static final Currency BOP = new Currency("BOP");

    public static final Currency BRC = new Currency("BRC");

    public static final Currency BRL = new Currency("BRL");

    public static final Currency BSD = new Currency("BSD");

    public static final Currency BTN = new Currency("BTN");

    public static final Currency BUK = new Currency("BUK");

    public static final Currency BWP = new Currency("BWP");

    public static final Currency BYR = new Currency("BYR");

    public static final Currency BZD = new Currency("BZD");

    public static final Currency CAD = new Currency("CAD");

    public static final Currency CDF = new Currency("CDF");

    public static final Currency CHF = new Currency("CHF");

    public static final Currency CLP = new Currency("CLP");

    public static final Currency CNY = new Currency("CNY");

    public static final Currency COP = new Currency("COP");

    public static final Currency CRC = new Currency("CRC");

    public static final Currency CSD = new Currency("CSD");

    public static final Currency CSK = new Currency("CSK");

    public static final Currency CUC = new Currency("CUC");

    public static final Currency CUP = new Currency("CUP");

    public static final Currency CVE = new Currency("CVE");

    public static final Currency CYP = new Currency("CYP");

    public static final Currency CZK = new Currency("CZK");

    public static final Currency DEM = new Currency("DEM");

    public static final Currency DJF = new Currency("DJF");

    public static final Currency DKK = new Currency("DKK");

    public static final Currency DOP = new Currency("DOP");

    public static final Currency DZD = new Currency("DZD");

    public static final Currency ECS = new Currency("ECS");

    public static final Currency EEK = new Currency("EEK");

    public static final Currency EGP = new Currency("EGP");

    public static final Currency ESP = new Currency("ESP");

    public static final Currency ETB = new Currency("ETB");

    public static final Currency EUR = new Currency("EUR");

    public static final Currency FIM = new Currency("FIM");

    public static final Currency FJD = new Currency("FJD");

    public static final Currency FKP = new Currency("FKP");

    public static final Currency FRF = new Currency("FRF");

    public static final Currency GBP = new Currency("GBP");

    public static final Currency GEL = new Currency("GEL");

    public static final Currency GHC = new Currency("GHC");

    public static final Currency GHS = new Currency("GHS");

    public static final Currency GIP = new Currency("GIP");

    public static final Currency GMD = new Currency("GMD");

    public static final Currency GNF = new Currency("GNF");

    public static final Currency GNS = new Currency("GNS");

    public static final Currency GRD = new Currency("GRD");

    public static final Currency GTQ = new Currency("GTQ");

    public static final Currency GWP = new Currency("GWP");

    public static final Currency GYD = new Currency("GYD");

    public static final Currency HKD = new Currency("HKD");

    public static final Currency HNL = new Currency("HNL");

    public static final Currency HRK = new Currency("HRK");

    public static final Currency HTG = new Currency("HTG");

    public static final Currency HUF = new Currency("HUF");

    public static final Currency IDR = new Currency("IDR");

    public static final Currency IEP = new Currency("IEP");

    public static final Currency ILS = new Currency("ILS");

    public static final Currency INR = new Currency("INR");

    public static final Currency IQD = new Currency("IQD");

    public static final Currency IRR = new Currency("IRR");

    public static final Currency ISK = new Currency("ISK");

    public static final Currency ITL = new Currency("ITL");

    public static final Currency JMD = new Currency("JMD");

    public static final Currency JOD = new Currency("JOD");

    public static final Currency JPY = new Currency("JPY");

    public static final Currency KES = new Currency("KES");

    public static final Currency KGS = new Currency("KGS");

    public static final Currency KHR = new Currency("KHR");

    public static final Currency KMF = new Currency("KMF");

    public static final Currency KPW = new Currency("KPW");

    public static final Currency KRW = new Currency("KRW");

    public static final Currency KWD = new Currency("KWD");

    public static final Currency KYD = new Currency("KYD");

    public static final Currency KZT = new Currency("KZT");

    public static final Currency LAK = new Currency("LAK");

    public static final Currency LBP = new Currency("LBP");

    public static final Currency LKR = new Currency("LKR");

    public static final Currency LRD = new Currency("LRD");

    public static final Currency LSL = new Currency("LSL");

    public static final Currency LTL = new Currency("LTL");

    public static final Currency LUF = new Currency("LUF");

    public static final Currency LVL = new Currency("LVL");

    public static final Currency LYD = new Currency("LYD");

    public static final Currency MAD = new Currency("MAD");

    public static final Currency MDL = new Currency("MDL");

    public static final Currency MGA = new Currency("MGA");

    public static final Currency MGF = new Currency("MGF");

    public static final Currency MKD = new Currency("MKD");

    public static final Currency MMK = new Currency("MMK");

    public static final Currency MNT = new Currency("MNT");

    public static final Currency MOP = new Currency("MOP");

    public static final Currency MRO = new Currency("MRO");

    public static final Currency MTL = new Currency("MTL");

    public static final Currency MUR = new Currency("MUR");

    public static final Currency MVR = new Currency("MVR");

    public static final Currency MWK = new Currency("MWK");

    public static final Currency MXN = new Currency("MXN");

    public static final Currency MXP = new Currency("MXP");

    public static final Currency MYR = new Currency("MYR");

    public static final Currency MZM = new Currency("MZM");

    public static final Currency MZN = new Currency("MZN");

    public static final Currency NAD = new Currency("NAD");

    public static final Currency NGN = new Currency("NGN");

    public static final Currency NIC = new Currency("NIC");

    public static final Currency NIO = new Currency("NIO");

    public static final Currency NLG = new Currency("NLG");

    public static final Currency NOK = new Currency("NOK");

    public static final Currency NPR = new Currency("NPR");

    public static final Currency NZD = new Currency("NZD");

    public static final Currency OMR = new Currency("OMR");

    public static final Currency PAB = new Currency("PAB");

    public static final Currency PEN = new Currency("PEN");

    public static final Currency PES = new Currency("PES");

    public static final Currency PGK = new Currency("PGK");

    public static final Currency PHP = new Currency("PHP");

    public static final Currency PKR = new Currency("PKR");

    public static final Currency PLN = new Currency("PLN");

    public static final Currency PLZ = new Currency("PLZ");

    public static final Currency PTE = new Currency("PTE");

    public static final Currency PYG = new Currency("PYG");

    public static final Currency QAR = new Currency("QAR");

    public static final Currency ROL = new Currency("ROL");

    public static final Currency RON = new Currency("RON");

    public static final Currency RSD = new Currency("RSD");

    public static final Currency RUB = new Currency("RUB");

    public static final Currency RUR = new Currency("RUR");

    public static final Currency RWF = new Currency("RWF");

    public static final Currency SAR = new Currency("SAR");

    public static final Currency SBD = new Currency("SBD");

    public static final Currency SCR = new Currency("SCR");

    public static final Currency SDD = new Currency("SDD");

    public static final Currency SDG = new Currency("SDG");

    public static final Currency SDP = new Currency("SDP");

    public static final Currency SEK = new Currency("SEK");

    public static final Currency SGD = new Currency("SGD");

    public static final Currency SHP = new Currency("SHP");

    public static final Currency SIT = new Currency("SIT");

    public static final Currency SKK = new Currency("SKK");

    public static final Currency SLL = new Currency("SLL");

    public static final Currency SOS = new Currency("SOS");

    public static final Currency SRD = new Currency("SRD");

    public static final Currency SRG = new Currency("SRG");

    public static final Currency STD = new Currency("STD");

    public static final Currency SUR = new Currency("SUR");

    public static final Currency SVC = new Currency("SVC");

    public static final Currency SYP = new Currency("SYP");

    public static final Currency SZL = new Currency("SZL");

    public static final Currency THB = new Currency("THB");

    public static final Currency TJS = new Currency("TJS");

    public static final Currency TMM = new Currency("TMM");

    public static final Currency TND = new Currency("TND");

    public static final Currency TOP = new Currency("TOP");

    public static final Currency TRL = new Currency("TRL");

    public static final Currency TRY = new Currency("TRY");

    public static final Currency TTD = new Currency("TTD");

    public static final Currency TWD = new Currency("TWD");

    public static final Currency TZS = new Currency("TZS");

    public static final Currency UAH = new Currency("UAH");

    public static final Currency UGS = new Currency("UGS");

    public static final Currency UGX = new Currency("UGX");

    public static final Currency USD = new Currency("USD");

    public static final Currency UYP = new Currency("UYP");

    public static final Currency UYU = new Currency("UYU");

    public static final Currency UZS = new Currency("UZS");

    public static final Currency VEB = new Currency("VEB");

    public static final Currency VEF = new Currency("VEF");

    public static final Currency VND = new Currency("VND");

    public static final Currency VUV = new Currency("VUV");

    public static final Currency WST = new Currency("WST");

    public static final Currency XAF = new Currency("XAF");

    public static final Currency XCD = new Currency("XCD");

    public static final Currency XOF = new Currency("XOF");

    public static final Currency XPF = new Currency("XPF");

    public static final Currency YDD = new Currency("YDD");

    public static final Currency YER = new Currency("YER");

    public static final Currency YUD = new Currency("YUD");

    public static final Currency YUM = new Currency("YUM");

    public static final Currency ZAR = new Currency("ZAR");

    public static final Currency ZMK = new Currency("ZMK");

    public static final Currency ZRZ = new Currency("ZRZ");

    public static final Currency ZWD = new Currency("ZWD");

    public static final Currency SSP = new Currency("SSP");

    public static final Currency ZMW = new Currency("ZMW");

    private static final Map<String, Currency> instances = new HashMap();

    private static final int[] num = new int[300];

    private static final Currency[] num2Currency = new Currency[1000];

    private static final Set<Currency> INACTIVE_CURRENCIES;

    private static Currency[] ACTIVE_CURRENCIES;

    private Currency(String name) {
    }

    public static Currency valueOf(String trim) {
        return null;
    }

    public int getIsoNum() {
        return num[this.getIndex()];
    }


    public static Currency forIsoNum(int isoNum) {
        return num2Currency[isoNum];
    }

    public static boolean isActive(Currency currency) {
        return !INACTIVE_CURRENCIES.contains(currency);
    }

    public static boolean isNotActive(Currency currency) {
        return INACTIVE_CURRENCIES.contains(currency);
    }


    static {
        num[AED.getIndex()] = 784;
        num[AFA.getIndex()] = 4;
        num[AFN.getIndex()] = 971;
        num[ALL.getIndex()] = 8;
        num[AMD.getIndex()] = 51;
        num[ANG.getIndex()] = 532;
        num[ARA.getIndex()] = 0;
        num[ARS.getIndex()] = 32;
        num[ATS.getIndex()] = 40;
        num[AUD.getIndex()] = 36;
        num[AWG.getIndex()] = 533;
        num[AZM.getIndex()] = 31;
        num[AZN.getIndex()] = 944;
        num[BAM.getIndex()] = 977;
        num[BBD.getIndex()] = 52;
        num[BDT.getIndex()] = 50;
        num[BEF.getIndex()] = 56;
        num[BGL.getIndex()] = 100;
        num[BGN.getIndex()] = 975;
        num[BHD.getIndex()] = 48;
        num[BIF.getIndex()] = 108;
        num[BMD.getIndex()] = 60;
        num[BND.getIndex()] = 96;
        num[BOB.getIndex()] = 68;
        num[BOP.getIndex()] = 0;
        num[BRC.getIndex()] = 0;
        num[BRL.getIndex()] = 986;
        num[BSD.getIndex()] = 44;
        num[BTN.getIndex()] = 64;
        num[BUK.getIndex()] = 104;
        num[BWP.getIndex()] = 72;
        num[BYR.getIndex()] = 974;
        num[BZD.getIndex()] = 84;
        num[CAD.getIndex()] = 124;
        num[CDF.getIndex()] = 976;
        num[CHF.getIndex()] = 756;
        num[CLP.getIndex()] = 152;
        num[CNY.getIndex()] = 156;
        num[COP.getIndex()] = 170;
        num[CRC.getIndex()] = 188;
        num[CSD.getIndex()] = 891;
        num[CSK.getIndex()] = 200;
        num[CUC.getIndex()] = 931;
        num[CUP.getIndex()] = 192;
        num[CVE.getIndex()] = 132;
        num[CYP.getIndex()] = 196;
        num[CZK.getIndex()] = 203;
        num[DEM.getIndex()] = 276;
        num[DJF.getIndex()] = 262;
        num[DKK.getIndex()] = 208;
        num[DOP.getIndex()] = 214;
        num[DZD.getIndex()] = 12;
        num[ECS.getIndex()] = 218;
        num[EEK.getIndex()] = 233;
        num[EGP.getIndex()] = 818;
        num[ESP.getIndex()] = 724;
        num[ETB.getIndex()] = 230;
        num[EUR.getIndex()] = 978;
        num[FIM.getIndex()] = 246;
        num[FJD.getIndex()] = 242;
        num[FKP.getIndex()] = 238;
        num[FRF.getIndex()] = 250;
        num[GBP.getIndex()] = 826;
        num[GEL.getIndex()] = 981;
        num[GHC.getIndex()] = 288;
        num[GHS.getIndex()] = 936;
        num[GIP.getIndex()] = 292;
        num[GMD.getIndex()] = 270;
        num[GNF.getIndex()] = 324;
        num[GNS.getIndex()] = 0;
        num[GRD.getIndex()] = 300;
        num[GTQ.getIndex()] = 320;
        num[GWP.getIndex()] = 624;
        num[GYD.getIndex()] = 328;
        num[HKD.getIndex()] = 344;
        num[HNL.getIndex()] = 340;
        num[HRK.getIndex()] = 191;
        num[HTG.getIndex()] = 332;
        num[HUF.getIndex()] = 348;
        num[IDR.getIndex()] = 360;
        num[IEP.getIndex()] = 372;
        num[ILS.getIndex()] = 376;
        num[INR.getIndex()] = 356;
        num[IQD.getIndex()] = 368;
        num[IRR.getIndex()] = 364;
        num[ISK.getIndex()] = 352;
        num[ITL.getIndex()] = 380;
        num[JMD.getIndex()] = 388;
        num[JOD.getIndex()] = 400;
        num[JPY.getIndex()] = 392;
        num[KES.getIndex()] = 404;
        num[KGS.getIndex()] = 417;
        num[KHR.getIndex()] = 116;
        num[KMF.getIndex()] = 174;
        num[KPW.getIndex()] = 408;
        num[KRW.getIndex()] = 410;
        num[KWD.getIndex()] = 414;
        num[KYD.getIndex()] = 136;
        num[KZT.getIndex()] = 398;
        num[LAK.getIndex()] = 418;
        num[LBP.getIndex()] = 422;
        num[LKR.getIndex()] = 144;
        num[LRD.getIndex()] = 430;
        num[LSL.getIndex()] = 426;
        num[LTL.getIndex()] = 440;
        num[LUF.getIndex()] = 442;
        num[LVL.getIndex()] = 428;
        num[LYD.getIndex()] = 434;
        num[MAD.getIndex()] = 504;
        num[MDL.getIndex()] = 498;
        num[MGA.getIndex()] = 969;
        num[MGF.getIndex()] = 450;
        num[MKD.getIndex()] = 807;
        num[MMK.getIndex()] = 104;
        num[MNT.getIndex()] = 496;
        num[MOP.getIndex()] = 446;
        num[MRO.getIndex()] = 478;
        num[MTL.getIndex()] = 470;
        num[MUR.getIndex()] = 480;
        num[MVR.getIndex()] = 462;
        num[MWK.getIndex()] = 454;
        num[MXN.getIndex()] = 484;
        num[MXP.getIndex()] = 0;
        num[MYR.getIndex()] = 458;
        num[MZM.getIndex()] = 508;
        num[MZN.getIndex()] = 943;
        num[NAD.getIndex()] = 516;
        num[NGN.getIndex()] = 566;
        num[NIC.getIndex()] = 0;
        num[NIO.getIndex()] = 558;
        num[NLG.getIndex()] = 528;
        num[NOK.getIndex()] = 578;
        num[NPR.getIndex()] = 524;
        num[NZD.getIndex()] = 554;
        num[OMR.getIndex()] = 512;
        num[PAB.getIndex()] = 590;
        num[PEN.getIndex()] = 604;
        num[PES.getIndex()] = 604;
        num[PGK.getIndex()] = 598;
        num[PHP.getIndex()] = 608;
        num[PKR.getIndex()] = 586;
        num[PLN.getIndex()] = 985;
        num[PLZ.getIndex()] = 616;
        num[PTE.getIndex()] = 620;
        num[PYG.getIndex()] = 600;
        num[QAR.getIndex()] = 634;
        num[ROL.getIndex()] = 642;
        num[RON.getIndex()] = 946;
        num[RSD.getIndex()] = 941;
        num[RUB.getIndex()] = 643;
        num[RUR.getIndex()] = 810;
        num[RWF.getIndex()] = 646;
        num[SAR.getIndex()] = 682;
        num[SBD.getIndex()] = 90;
        num[SCR.getIndex()] = 690;
        num[SDD.getIndex()] = 736;
        num[SDG.getIndex()] = 938;
        num[SDP.getIndex()] = 736;
        num[SEK.getIndex()] = 752;
        num[SGD.getIndex()] = 702;
        num[SHP.getIndex()] = 654;
        num[SIT.getIndex()] = 705;
        num[SKK.getIndex()] = 703;
        num[SLL.getIndex()] = 694;
        num[SOS.getIndex()] = 706;
        num[SRD.getIndex()] = 968;
        num[SRG.getIndex()] = 740;
        num[SSP.getIndex()] = 225;
        num[STD.getIndex()] = 678;
        num[SUR.getIndex()] = 0;
        num[SVC.getIndex()] = 222;
        num[SYP.getIndex()] = 760;
        num[SZL.getIndex()] = 748;
        num[THB.getIndex()] = 764;
        num[TJS.getIndex()] = 972;
        num[TMM.getIndex()] = 795;
        num[TND.getIndex()] = 788;
        num[TOP.getIndex()] = 776;
        num[TRL.getIndex()] = 792;
        num[TRY.getIndex()] = 949;
        num[TTD.getIndex()] = 780;
        num[TWD.getIndex()] = 901;
        num[TZS.getIndex()] = 834;
        num[UAH.getIndex()] = 980;
        num[UGS.getIndex()] = 0;
        num[UGX.getIndex()] = 800;
        num[USD.getIndex()] = 840;
        num[UYP.getIndex()] = 0;
        num[UYU.getIndex()] = 858;
        num[UZS.getIndex()] = 860;
        num[VEB.getIndex()] = 862;
        num[VEF.getIndex()] = 937;
        num[VND.getIndex()] = 704;
        num[VUV.getIndex()] = 548;
        num[WST.getIndex()] = 882;
        num[XAF.getIndex()] = 950;
        num[XCD.getIndex()] = 951;
        num[XOF.getIndex()] = 952;
        num[XPF.getIndex()] = 953;
        num[YDD.getIndex()] = 720;
        num[YER.getIndex()] = 886;
        num[YUD.getIndex()] = 0;
        num[YUM.getIndex()] = 891;
        num[ZAR.getIndex()] = 710;
        num[ZMK.getIndex()] = 0;
        num[ZMW.getIndex()] = 967;
        num[ZRZ.getIndex()] = 0;
        num[ZWD.getIndex()] = 716;

        INACTIVE_CURRENCIES = Sets.newHashSet(new Currency[]{AFA, ARA, ATS, AZM, BEF, BGL, BOP, BRC, BUK, CSD, CSK, CYP, DEM, ECS, EEK, ESP, FIM, FRF, GHC, GNS, GRD, GWP, IEP, ITL, LUF, MGF, MTL, MXP, MZM, NIC, NLG, PES, PLZ, PTE, ROL, RUR, SDD, SDP, SIT, SKK, SRG, SUR, TRL, UGS, UYP, VEB, YDD, YUD, YUM, ZMK, ZRZ});
        ACTIVE_CURRENCIES = null;
    }

    private int getIndex() {
        return 0;
    }

    public String getInt_symbol() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String name() {
        return null;
    }
}

