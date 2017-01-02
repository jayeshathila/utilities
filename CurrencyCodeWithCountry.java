import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by jayeshathila
 */
public enum CurrencyInfo {
    BBD("BBD", "$", Lists.newArrayList("Barbados")),
    HNL("HNL", "L", Lists.newArrayList("Honduras")),
    EUR("EUR", "€", Lists.newArrayList("Belgium", "Ireland", "Lithuania", "Finland", "Akrotiri and Dhekelia", "Austria", "Latvia",
            "Malta", "Portugal", "France", "Montenegro", "Slovakia", "Germany", "Netherlands[N]", "Estonia", "Slovenia", "Kosovo", "Vatican City",
            "Spain", "Andorra", "Greece", "Italy", "Cyprus", "San Marino", "Luxembourg", "Monaco")),
    ILS("ILS", "₪", Lists.newArrayList("Palestine", "Israel")),
    USD("USD", "$", Lists.newArrayList("British Indian Ocean Territory", "Turks and Caicos Islands", "El Salvador", "Saba",
            "East Timor", "Bonaire", "East Timor", "United States", "Marshall Islands", "Sint Eustatius", "Ecuador", "United Kingdom")),
    BND("BND", "$", Lists.newArrayList("Singapore", "Brunei")),
    CHF("CHF", "Fr", Lists.newArrayList("Liechtenstein", "Switzerland")),
    PAB("PAB", "B/.", Lists.newArrayList("Panama")),
    TWD("TWD", "$", Lists.newArrayList("Taiwan")),
    MGA("MGA", "Ar", Lists.newArrayList("Madagascar")),
    BZD("BZD", "$", Lists.newArrayList("Belize")),
    XAF("XAF", "Fr", Lists.newArrayList("Equatorial Guinea", "Congo Republic of the", "Cameroon", "Central African Republic",
            "Chad", "Gabon")),
    CLP("CLP", "$", Lists.newArrayList("Chile")),
    FKP("FKP", "£", Lists.newArrayList("Falkland Islands")),
    VEF("VEF", "Bs F", Lists.newArrayList("Venezuela")),
    GIP("GIP", "£", Lists.newArrayList("Gibraltar")),
    MAD("MAD", "د.م.", Lists.newArrayList("Morocco")),
    VND("VND", "₫", Lists.newArrayList("Vietnam")),
    UYU("UYU", "$", Lists.newArrayList("Uruguay")),
    LAK("LAK", "₭", Lists.newArrayList("Laos")),
    QAR("QAR", "ر.ق", Lists.newArrayList("Qatar")),
    RUB("RUB", "", Lists.newArrayList("Russia", "South Ossetia")),
    CVE("CVE", "Esc or $", Lists.newArrayList("Cape Verde")),
    ARS("ARS", "$", Lists.newArrayList("Argentina")),
    OMR("OMR", "ر.ع.", Lists.newArrayList("Oman")),
    TMT("TMT", "m", Lists.newArrayList("Turkmenistan")),
    SLL("SLL", "Le", Lists.newArrayList("Sierra Leone")),
    GTQ("GTQ", "Q", Lists.newArrayList("Guatemala")),
    TND("TND", "د.ت", Lists.newArrayList("Tunisia")),
    GBP("GBP", "£", Lists.newArrayList("Jersey", "Guernsey", "South Georgia and the South Sandwich Islands", "Isle of Man")),
    ZMW("ZMW", "ZK", Lists.newArrayList("Zambia")),
    MOP("MOP", "P", Lists.newArrayList("Macau")),
    NZD("NZD", "$", Lists.newArrayList("Pitcairn Islands", "New Zealand", "Niue", "Cook Islands")),
    SGD("SGD", "$", Lists.newArrayList("")),
    HTG("HTG", "G", Lists.newArrayList("Haiti")),
    BSD("BSD", "$", Lists.newArrayList("Bahamas The")),
    BWP("BWP", "P", Lists.newArrayList("Zimbabwe[T]", "Botswana")),
    TJS("TJS", "ЅМ", Lists.newArrayList("Tajikistan")),
    UGX("UGX", "Sh", Lists.newArrayList("Uganda")),
    NAD("NAD", "$", Lists.newArrayList("Namibia")),
    ISK("ISK", "kr", Lists.newArrayList("Iceland")),
    CUC("CUC", "$", Lists.newArrayList("Cuba")),
    PLN("PLN", "zł", Lists.newArrayList("Poland")),
    BDT("BDT", "৳", Lists.newArrayList("Bangladesh")),
    PKR("PKR", "₨", Lists.newArrayList("Pakistan")),
    RSD("RSD", "дин. or din.", Lists.newArrayList("Serbia")),
    BRL("BRL", "R$", Lists.newArrayList("Brazil")),
    XPF("XPF", "Fr", Lists.newArrayList("New Caledonia", "Wallis and Futuna", "French Polynesia")),
    BTN("BTN", "Nu.", Lists.newArrayList("Bhutan")),
    DZD("DZD", "د.ج", Lists.newArrayList("Sahrawi Republic", "Algeria")),
    XOF("XOF", "Fr", Lists.newArrayList("Togo", "Mali", "Niger", "Benin", "Senegal", "Burkina Faso", "Guinea-Bissau",
            "Côte d'Ivoire")),
    EGP("EGP", "£ or ج.م", Lists.newArrayList("Egypt")),
    ANG("ANG", "ƒ", Lists.newArrayList("Curaçao", "Sint Maarten")),
    KWD("KWD", "د.ك", Lists.newArrayList("Kuwait")),
    NOK("NOK", "kr", Lists.newArrayList("Norway")),
    XCD("XCD", "$", Lists.newArrayList("Saint Kitts and Nevis", "Saint Kitts and Nevis", "Antigua and Barbuda", "Grenada",
            "Saint Lucia", "Anguilla", "Saint Vincent and the Grenadines", "Dominica", "Montserrat")),
    BMD("BMD", "$", Lists.newArrayList("Bermuda")),
    RON("RON", "lei", Lists.newArrayList("Romania")),
    SEK("SEK", "kr", Lists.newArrayList("Sweden")),
    GEL("GEL", "₾", Lists.newArrayList("Georgia")),
    YER("YER", "﷼", Lists.newArrayList("Yemen")),
    TOP("TOP", "T$", Lists.newArrayList("Tonga")),
    AWG("AWG", "ƒ", Lists.newArrayList("Aruba")),
    BHD("BHD", ".د.ب", Lists.newArrayList("Bahrain")),
    AUD("AUD", "$", Lists.newArrayList("Australia")),
    SSP("SSP", "£", Lists.newArrayList("South Sudan")),
    DKK("DKK", "kr", Lists.newArrayList("Denmark")),
    SDG("SDG", "ج.س.", Lists.newArrayList("Sudan")),
    KES("KES", "Sh", Lists.newArrayList("Kenya")),
    MKD("MKD", "ден", Lists.newArrayList("Macedonia Republic of")),
    PEN("PEN", "S/.", Lists.newArrayList("Peru")),
    ETB("ETB", "Br", Lists.newArrayList("Ethiopia")),
    FJD("FJD", "$", Lists.newArrayList("Fiji")),
    MRO("MRO", "UM", Lists.newArrayList("Mauritania")),
    KGS("KGS", "лв[M]", Lists.newArrayList("Kyrgyzstan")),
    PYG("PYG", "₲", Lists.newArrayList("Paraguay")),
    SYP("SYP", "£ or ل.س", Lists.newArrayList("Syria")),
    CZK("CZK", "Kč", Lists.newArrayList("Czech Republic")),
    SBD("SBD", "$", Lists.newArrayList("Solomon Islands")),
    VUV("VUV", "Vt", Lists.newArrayList("Vanuatu")),
    HKD("HKD", "$", Lists.newArrayList("Hong Kong")),
    SOS("SOS", "Sh", Lists.newArrayList("Somalia")),
    CRC("CRC", "₡", Lists.newArrayList("Costa Rica")),
    MZN("MZN", "MT", Lists.newArrayList("Mozambique")),
    AED("AED", "د.إ", Lists.newArrayList("United Arab Emirates")),
    DOP("DOP", "$", Lists.newArrayList("Dominican Republic")),
    LRD("LRD", "$", Lists.newArrayList("Liberia")),
    MYR("MYR", "RM", Lists.newArrayList("Malaysia")),
    IDR("IDR", "Rp", Lists.newArrayList("Indonesia")),
    MNT("MNT", "₮", Lists.newArrayList("Mongolia")),
    SHP("SHP", "£", Lists.newArrayList("Saint Helena")),
    BYN("BYN", "Br", Lists.newArrayList("Belarus")),
    IRR("IRR", "﷼", Lists.newArrayList("Iran")),
    SRD("SRD", "$", Lists.newArrayList("Suriname")),
    BAM("BAM", "KM or КМ[I]", Lists.newArrayList("Bosnia and Herzegovina")),
    KYD("KYD", "$", Lists.newArrayList("Cayman Islands")),
    ERN("ERN", "Nfk", Lists.newArrayList("Eritrea")),
    AZN("AZN", "", Lists.newArrayList("Azerbaijan")),
    CAD("CAD", "$", Lists.newArrayList("Canada")),
    COP("COP", "$", Lists.newArrayList("Colombia")),
    BIF("BIF", "Fr", Lists.newArrayList("Burundi")),
    KPW("KPW", "₩", Lists.newArrayList("Korea North")),
    DJF("DJF", "Fr", Lists.newArrayList("Djibouti")),
    LSL("LSL", "L", Lists.newArrayList("Lesotho")),
    MUR("MUR", "₨", Lists.newArrayList("Mauritius")),
    NGN("NGN", "₦", Lists.newArrayList("Nigeria")),
    MWK("MWK", "MK", Lists.newArrayList("Malawi")),
    AMD("AMD", "", Lists.newArrayList("Armenia")),
    KRW("KRW", "₩", Lists.newArrayList("Korea South")),
    GYD("GYD", "$", Lists.newArrayList("Guyana")),
    NPR("NPR", "₨", Lists.newArrayList("Nepal")),
    PHP("PHP", "₱", Lists.newArrayList("Philippines")),
    CNY("CNY", "¥ or 元", Lists.newArrayList("China")),
    KZT("KZT", "", Lists.newArrayList("Kazakhstan")),
    JMD("JMD", "$", Lists.newArrayList("Jamaica")),
    THB("THB", "฿", Lists.newArrayList("Thailand")),
    LKR("LKR", "Rs or රු", Lists.newArrayList("Sri Lanka")),
    CDF("CDF", "Fr", Lists.newArrayList("Congo Democratic Republic of the")),
    SAR("SAR", "ر.س", Lists.newArrayList("Saudi Arabia")),
    KMF("KMF", "Fr", Lists.newArrayList("Comoros")),
    BOB("BOB", "Bs.", Lists.newArrayList("Bolivia")),
    ALL("ALL", "L", Lists.newArrayList("Albania")),
    LYD("LYD", "ل.د", Lists.newArrayList("Libya")),
    STD("STD", "Db", Lists.newArrayList("São Tomé and Príncipe")),
    BGN("BGN", "лв", Lists.newArrayList("Bulgaria")),
    INR("INR", "₹", Lists.newArrayList("India")),
    JPY("JPY", "¥", Lists.newArrayList("Japan")),
    MMK("MMK", "Ks", Lists.newArrayList("Myanmar")),
    AFN("AFN", "؋", Lists.newArrayList("Afghanistan")),
    SZL("SZL", "L", Lists.newArrayList("Swaziland")),
    HRK("HRK", "kn", Lists.newArrayList("Croatia")),
    TZS("TZS", "Sh", Lists.newArrayList("Tanzania")),
    TTD("TTD", "$", Lists.newArrayList("Trinidad and Tobago")),
    MXN("MXN", "$", Lists.newArrayList("Mexico")),
    MDL("MDL", "L", Lists.newArrayList("Moldova")),
    LBP("LBP", "ل.ل", Lists.newArrayList("Lebanon")),
    KHR("KHR", "៛", Lists.newArrayList("Cambodia")),
    GNF("GNF", "Fr", Lists.newArrayList("Guinea")),
    GHS("GHS", "₵", Lists.newArrayList("Ghana")),
    WST("WST", "T", Lists.newArrayList("Samoa")),
    ZAR("ZAR", "R", Lists.newArrayList("South Africa")),
    AOA("AOA", "Kz", Lists.newArrayList("Angola")),
    PGK("PGK", "K", Lists.newArrayList("Papua New Guinea")),
    NIO("NIO", "C$", Lists.newArrayList("Nicaragua")),
    JOD("JOD", "د.ا", Lists.newArrayList("Jordan")),
    MVR("MVR", ".ރ", Lists.newArrayList("Maldives")),
    UAH("UAH", "₴", Lists.newArrayList("Ukraine")),
    RWF("RWF", "Fr", Lists.newArrayList("Rwanda")),
    UZS("UZS", "", Lists.newArrayList("Uzbekistan")),
    SCR("SCR", "₨", Lists.newArrayList("Seychelles")),
    HUF("HUF", "Ft", Lists.newArrayList("Hungary")),
    IQD("IQD", "ع.د", Lists.newArrayList("Iraq"));

    private static final Map<String, CurrencyInfo> CODE_VS_CURRENCY_INFO;

    static {
        Map<String, CurrencyInfo> currencyInfoMap = Maps.newHashMap();
        for (CurrencyInfo currencyInfo : CurrencyInfo.values()) {
            currencyInfoMap.put(currencyInfo.code, currencyInfo);
        }
        CODE_VS_CURRENCY_INFO = Collections.unmodifiableMap(currencyInfoMap);
    }

    private final String code;
    private final String currencySymbol;
    private final List<String> countries;

    CurrencyInfo(String code, String currencySymbol, List<String> countries) {
        this.code = code;
        this.currencySymbol = currencySymbol;
        this.countries = countries;
    }

    public static CurrencyInfo getCurrencyForCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }

        return CODE_VS_CURRENCY_INFO.get(code);
    }

    public String getCode() {
        return code;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public List<String> getCountries() {
        return countries;
    }
}
