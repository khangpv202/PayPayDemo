package com.example.paypay.dto

import com.example.paypay.ui.pojo.RateItem
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RateResponse {

    @SerializedName("success")
    @Expose
    var success: Boolean? = null
    @SerializedName("terms")
    @Expose
    var terms: String? = null
    @SerializedName("privacy")
    @Expose
    var privacy: String? = null
    @SerializedName("timestamp")
    @Expose
    var timestamp: Int? = null
    @SerializedName("source")
    @Expose
    var source: String? = null
    @SerializedName("quotes")
    @Expose
    var quotes: List<RateItem>? = null

}

class CurrenciesResponse {

    @SerializedName("success")
    @Expose
    var success: Boolean? = null
    @SerializedName("terms")
    @Expose
    var terms: String? = null
    @SerializedName("privacy")
    @Expose
    var privacy: String? = null
    @SerializedName("currencies")
    @Expose
    var currencies: Currencies? = null

}

class Currencies {

    @SerializedName("AED")
    @Expose
    var aED: String? = null
    @SerializedName("AFN")
    @Expose
    var aFN: String? = null
    @SerializedName("ALL")
    @Expose
    var aLL: String? = null
    @SerializedName("AMD")
    @Expose
    var aMD: String? = null
    @SerializedName("ANG")
    @Expose
    var aNG: String? = null
    @SerializedName("AOA")
    @Expose
    var aOA: String? = null
    @SerializedName("ARS")
    @Expose
    var aRS: String? = null
    @SerializedName("AUD")
    @Expose
    var aUD: String? = null
    @SerializedName("AWG")
    @Expose
    var aWG: String? = null
    @SerializedName("AZN")
    @Expose
    var aZN: String? = null
    @SerializedName("BAM")
    @Expose
    var bAM: String? = null
    @SerializedName("BBD")
    @Expose
    var bBD: String? = null
    @SerializedName("BDT")
    @Expose
    var bDT: String? = null
    @SerializedName("BGN")
    @Expose
    var bGN: String? = null
    @SerializedName("BHD")
    @Expose
    var bHD: String? = null
    @SerializedName("BIF")
    @Expose
    var bIF: String? = null
    @SerializedName("BMD")
    @Expose
    var bMD: String? = null
    @SerializedName("BND")
    @Expose
    var bND: String? = null
    @SerializedName("BOB")
    @Expose
    var bOB: String? = null
    @SerializedName("BRL")
    @Expose
    var bRL: String? = null
    @SerializedName("BSD")
    @Expose
    var bSD: String? = null
    @SerializedName("BTC")
    @Expose
    var bTC: String? = null
    @SerializedName("BTN")
    @Expose
    var bTN: String? = null
    @SerializedName("BWP")
    @Expose
    var bWP: String? = null
    @SerializedName("BYN")
    @Expose
    var bYN: String? = null
    @SerializedName("BYR")
    @Expose
    var bYR: String? = null
    @SerializedName("BZD")
    @Expose
    var bZD: String? = null
    @SerializedName("CAD")
    @Expose
    var cAD: String? = null
    @SerializedName("CDF")
    @Expose
    var cDF: String? = null
    @SerializedName("CHF")
    @Expose
    var cHF: String? = null
    @SerializedName("CLF")
    @Expose
    var cLF: String? = null
    @SerializedName("CLP")
    @Expose
    var cLP: String? = null
    @SerializedName("CNY")
    @Expose
    var cNY: String? = null
    @SerializedName("COP")
    @Expose
    var cOP: String? = null
    @SerializedName("CRC")
    @Expose
    var cRC: String? = null
    @SerializedName("CUC")
    @Expose
    var cUC: String? = null
    @SerializedName("CUP")
    @Expose
    var cUP: String? = null
    @SerializedName("CVE")
    @Expose
    var cVE: String? = null
    @SerializedName("CZK")
    @Expose
    var cZK: String? = null
    @SerializedName("DJF")
    @Expose
    var dJF: String? = null
    @SerializedName("DKK")
    @Expose
    var dKK: String? = null
    @SerializedName("DOP")
    @Expose
    var dOP: String? = null
    @SerializedName("DZD")
    @Expose
    var dZD: String? = null
    @SerializedName("EGP")
    @Expose
    var eGP: String? = null
    @SerializedName("ERN")
    @Expose
    var eRN: String? = null
    @SerializedName("ETB")
    @Expose
    var eTB: String? = null
    @SerializedName("EUR")
    @Expose
    var eUR: String? = null
    @SerializedName("FJD")
    @Expose
    var fJD: String? = null
    @SerializedName("FKP")
    @Expose
    var fKP: String? = null
    @SerializedName("GBP")
    @Expose
    var gBP: String? = null
    @SerializedName("GEL")
    @Expose
    var gEL: String? = null
    @SerializedName("GGP")
    @Expose
    var gGP: String? = null
    @SerializedName("GHS")
    @Expose
    var gHS: String? = null
    @SerializedName("GIP")
    @Expose
    var gIP: String? = null
    @SerializedName("GMD")
    @Expose
    var gMD: String? = null
    @SerializedName("GNF")
    @Expose
    var gNF: String? = null
    @SerializedName("GTQ")
    @Expose
    var gTQ: String? = null
    @SerializedName("GYD")
    @Expose
    var gYD: String? = null
    @SerializedName("HKD")
    @Expose
    var hKD: String? = null
    @SerializedName("HNL")
    @Expose
    var hNL: String? = null
    @SerializedName("HRK")
    @Expose
    var hRK: String? = null
    @SerializedName("HTG")
    @Expose
    var hTG: String? = null
    @SerializedName("HUF")
    @Expose
    var hUF: String? = null
    @SerializedName("IDR")
    @Expose
    var iDR: String? = null
    @SerializedName("ILS")
    @Expose
    var iLS: String? = null
    @SerializedName("IMP")
    @Expose
    var iMP: String? = null
    @SerializedName("INR")
    @Expose
    var iNR: String? = null
    @SerializedName("IQD")
    @Expose
    var iQD: String? = null
    @SerializedName("IRR")
    @Expose
    var iRR: String? = null
    @SerializedName("ISK")
    @Expose
    var iSK: String? = null
    @SerializedName("JEP")
    @Expose
    var jEP: String? = null
    @SerializedName("JMD")
    @Expose
    var jMD: String? = null
    @SerializedName("JOD")
    @Expose
    var jOD: String? = null
    @SerializedName("JPY")
    @Expose
    var jPY: String? = null
    @SerializedName("KES")
    @Expose
    var kES: String? = null
    @SerializedName("KGS")
    @Expose
    var kGS: String? = null
    @SerializedName("KHR")
    @Expose
    var kHR: String? = null
    @SerializedName("KMF")
    @Expose
    var kMF: String? = null
    @SerializedName("KPW")
    @Expose
    var kPW: String? = null
    @SerializedName("KRW")
    @Expose
    var kRW: String? = null
    @SerializedName("KWD")
    @Expose
    var kWD: String? = null
    @SerializedName("KYD")
    @Expose
    var kYD: String? = null
    @SerializedName("KZT")
    @Expose
    var kZT: String? = null
    @SerializedName("LAK")
    @Expose
    var lAK: String? = null
    @SerializedName("LBP")
    @Expose
    var lBP: String? = null
    @SerializedName("LKR")
    @Expose
    var lKR: String? = null
    @SerializedName("LRD")
    @Expose
    var lRD: String? = null
    @SerializedName("LSL")
    @Expose
    var lSL: String? = null
    @SerializedName("LTL")
    @Expose
    var lTL: String? = null
    @SerializedName("LVL")
    @Expose
    var lVL: String? = null
    @SerializedName("LYD")
    @Expose
    var lYD: String? = null
    @SerializedName("MAD")
    @Expose
    var mAD: String? = null
    @SerializedName("MDL")
    @Expose
    var mDL: String? = null
    @SerializedName("MGA")
    @Expose
    var mGA: String? = null
    @SerializedName("MKD")
    @Expose
    var mKD: String? = null
    @SerializedName("MMK")
    @Expose
    var mMK: String? = null
    @SerializedName("MNT")
    @Expose
    var mNT: String? = null
    @SerializedName("MOP")
    @Expose
    var mOP: String? = null
    @SerializedName("MRO")
    @Expose
    var mRO: String? = null
    @SerializedName("MUR")
    @Expose
    var mUR: String? = null
    @SerializedName("MVR")
    @Expose
    var mVR: String? = null
    @SerializedName("MWK")
    @Expose
    var mWK: String? = null
    @SerializedName("MXN")
    @Expose
    var mXN: String? = null
    @SerializedName("MYR")
    @Expose
    var mYR: String? = null
    @SerializedName("MZN")
    @Expose
    var mZN: String? = null
    @SerializedName("NAD")
    @Expose
    var nAD: String? = null
    @SerializedName("NGN")
    @Expose
    var nGN: String? = null
    @SerializedName("NIO")
    @Expose
    var nIO: String? = null
    @SerializedName("NOK")
    @Expose
    var nOK: String? = null
    @SerializedName("NPR")
    @Expose
    var nPR: String? = null
    @SerializedName("NZD")
    @Expose
    var nZD: String? = null
    @SerializedName("OMR")
    @Expose
    var oMR: String? = null
    @SerializedName("PAB")
    @Expose
    var pAB: String? = null
    @SerializedName("PEN")
    @Expose
    var pEN: String? = null
    @SerializedName("PGK")
    @Expose
    var pGK: String? = null
    @SerializedName("PHP")
    @Expose
    var pHP: String? = null
    @SerializedName("PKR")
    @Expose
    var pKR: String? = null
    @SerializedName("PLN")
    @Expose
    var pLN: String? = null
    @SerializedName("PYG")
    @Expose
    var pYG: String? = null
    @SerializedName("QAR")
    @Expose
    var qAR: String? = null
    @SerializedName("RON")
    @Expose
    var rON: String? = null
    @SerializedName("RSD")
    @Expose
    var rSD: String? = null
    @SerializedName("RUB")
    @Expose
    var rUB: String? = null
    @SerializedName("RWF")
    @Expose
    var rWF: String? = null
    @SerializedName("SAR")
    @Expose
    var sAR: String? = null
    @SerializedName("SBD")
    @Expose
    var sBD: String? = null
    @SerializedName("SCR")
    @Expose
    var sCR: String? = null
    @SerializedName("SDG")
    @Expose
    var sDG: String? = null
    @SerializedName("SEK")
    @Expose
    var sEK: String? = null
    @SerializedName("SGD")
    @Expose
    var sGD: String? = null
    @SerializedName("SHP")
    @Expose
    var sHP: String? = null
    @SerializedName("SLL")
    @Expose
    var sLL: String? = null
    @SerializedName("SOS")
    @Expose
    var sOS: String? = null
    @SerializedName("SRD")
    @Expose
    var sRD: String? = null
    @SerializedName("STD")
    @Expose
    var sTD: String? = null
    @SerializedName("SVC")
    @Expose
    var sVC: String? = null
    @SerializedName("SYP")
    @Expose
    var sYP: String? = null
    @SerializedName("SZL")
    @Expose
    var sZL: String? = null
    @SerializedName("THB")
    @Expose
    var tHB: String? = null
    @SerializedName("TJS")
    @Expose
    var tJS: String? = null
    @SerializedName("TMT")
    @Expose
    var tMT: String? = null
    @SerializedName("TND")
    @Expose
    var tND: String? = null
    @SerializedName("TOP")
    @Expose
    var tOP: String? = null
    @SerializedName("TRY")
    @Expose
    var tRY: String? = null
    @SerializedName("TTD")
    @Expose
    var tTD: String? = null
    @SerializedName("TWD")
    @Expose
    var tWD: String? = null
    @SerializedName("TZS")
    @Expose
    var tZS: String? = null
    @SerializedName("UAH")
    @Expose
    var uAH: String? = null
    @SerializedName("UGX")
    @Expose
    var uGX: String? = null
    @SerializedName("USD")
    @Expose
    var uSD: String? = null
    @SerializedName("UYU")
    @Expose
    var uYU: String? = null
    @SerializedName("UZS")
    @Expose
    var uZS: String? = null
    @SerializedName("VEF")
    @Expose
    var vEF: String? = null
    @SerializedName("VND")
    @Expose
    var vND: String? = null
    @SerializedName("VUV")
    @Expose
    var vUV: String? = null
    @SerializedName("WST")
    @Expose
    var wST: String? = null
    @SerializedName("XAF")
    @Expose
    var xAF: String? = null
    @SerializedName("XAG")
    @Expose
    var xAG: String? = null
    @SerializedName("XAU")
    @Expose
    var xAU: String? = null
    @SerializedName("XCD")
    @Expose
    var xCD: String? = null
    @SerializedName("XDR")
    @Expose
    var xDR: String? = null
    @SerializedName("XOF")
    @Expose
    var xOF: String? = null
    @SerializedName("XPF")
    @Expose
    var xPF: String? = null
    @SerializedName("YER")
    @Expose
    var yER: String? = null
    @SerializedName("ZAR")
    @Expose
    var zAR: String? = null
    @SerializedName("ZMK")
    @Expose
    var zMK: String? = null
    @SerializedName("ZMW")
    @Expose
    var zMW: String? = null
    @SerializedName("ZWL")
    @Expose
    var zWL: String? = null

}