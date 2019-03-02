package com.example.paypay

import com.example.paypay.dto.RateResponse
import com.example.paypay.service.NetworkHelper
import com.example.paypay.service.RateItemTypeAdapter
import com.example.paypay.ui.pojo.RateItem
import com.google.gson.*
import org.junit.Test

import org.junit.Assert.*
import java.math.BigDecimal


/**
 * CurrenciesResponse local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class CurrenciesResponseUnitTest {
    @Test
    fun addition_isCorrect() {
        val input = "{\n" +
                "  \"success\":true,\n" +
                "  \"terms\":\"https:\\/\\/currencylayer.com\\/terms\",\n" +
                "  \"privacy\":\"https:\\/\\/currencylayer.com\\/privacy\",\n" +
                "  \"timestamp\":1551449826,\n" +
                "  \"source\":\"USD\",\n" +
                "  \"quotes\":{\n" +
                "    \"USDAED\":3.672998,\n" +
                "    \"USDAFN\":74.605008,\n" +
                "    \"USDALL\":110.349563,\n" +
                "    \"USDAMD\":490.180121,\n" +
                "    \"USDANG\":1.814903,\n" +
                "    \"USDAOA\":314.172038,\n" +
                "    \"USDARS\":39.264205,\n" +
                "    \"USDAUD\":1.40875,\n" +
                "    \"USDAWG\":1.8,\n" +
                "    \"USDAZN\":1.705035,\n" +
                "    \"USDBAM\":1.7178,\n" +
                "    \"USDBBD\":2.0014,\n" +
                "    \"USDBDT\":83.86503,\n" +
                "    \"USDBGN\":1.71865,\n" +
                "    \"USDBHD\":0.37702,\n" +
                "    \"USDBIF\":1830,\n" +
                "    \"USDBMD\":1,\n" +
                "    \"USDBND\":1.350703,\n" +
                "    \"USDBOB\":6.90925,\n" +
                "    \"USDBRL\":3.7873,\n" +
                "    \"USDBSD\":0.99995,\n" +
                "    \"USDBTC\":0.000261,\n" +
                "    \"USDBTN\":70.88777,\n" +
                "    \"USDBWP\":10.601962,\n" +
                "    \"USDBYN\":2.136903,\n" +
                "    \"USDBYR\":19600,\n" +
                "    \"USDBZD\":2.01545,\n" +
                "    \"USDCAD\":1.323415,\n" +
                "    \"USDCDF\":1629.999926,\n" +
                "    \"USDCHF\":0.998801,\n" +
                "    \"USDCLF\":0.025048,\n" +
                "    \"USDCLP\":657.165039,\n" +
                "    \"USDCNY\":6.709399,\n" +
                "    \"USDCOP\":3081.1,\n" +
                "    \"USDCRC\":606.629929,\n" +
                "    \"USDCUC\":1,\n" +
                "    \"USDCUP\":26.5,\n" +
                "    \"USDCVE\":97.180498,\n" +
                "    \"USDCZK\":22.534986,\n" +
                "    \"USDDJF\":177.719891,\n" +
                "    \"USDDKK\":6.556599,\n" +
                "    \"USDDOP\":50.625005,\n" +
                "    \"USDDZD\":118.610011,\n" +
                "    \"USDEGP\":17.512026,\n" +
                "    \"USDERN\":14.999535,\n" +
                "    \"USDETB\":28.600338,\n" +
                "    \"USDEUR\":0.878755,\n" +
                "    \"USDFJD\":2.12495,\n" +
                "    \"USDFKP\":0.760035,\n" +
                "    \"USDGBP\":0.755705,\n" +
                "    \"USDGEL\":2.660157,\n" +
                "    \"USDGGP\":0.755694,\n" +
                "    \"USDGHS\":5.525051,\n" +
                "    \"USDGIP\":0.76003,\n" +
                "    \"USDGMD\":49.549948,\n" +
                "    \"USDGNF\":9229.999676,\n" +
                "    \"USDGTQ\":7.709698,\n" +
                "    \"USDGYD\":209.020136,\n" +
                "    \"USDHKD\":7.84835,\n" +
                "    \"USDHNL\":24.54971,\n" +
                "    \"USDHRK\":6.528603,\n" +
                "    \"USDHTG\":83.075499,\n" +
                "    \"USDHUF\":277.750425,\n" +
                "    \"USDIDR\":14163.5,\n" +
                "    \"USDILS\":3.63115,\n" +
                "    \"USDIMP\":0.755694,\n" +
                "    \"USDINR\":70.894979,\n" +
                "    \"USDIQD\":1190,\n" +
                "    \"USDIRR\":42105.000229,\n" +
                "    \"USDISK\":119.410177,\n" +
                "    \"USDJEP\":0.755694,\n" +
                "    \"USDJMD\":128.210435,\n" +
                "    \"USDJOD\":0.709302,\n" +
                "    \"USDJPY\":111.910078,\n" +
                "    \"USDKES\":100.050174,\n" +
                "    \"USDKGS\":69.739299,\n" +
                "    \"USDKHR\":3849.999893,\n" +
                "    \"USDKMF\":432.500974,\n" +
                "    \"USDKPW\":900.055026,\n" +
                "    \"USDKRW\":1126.749788,\n" +
                "    \"USDKWD\":0.303503,\n" +
                "    \"USDKYD\":0.83332,\n" +
                "    \"USDKZT\":377.449803,\n" +
                "    \"USDLAK\":8569.999839,\n" +
                "    \"USDLBP\":1508.49364,\n" +
                "    \"USDLKR\":179.750439,\n" +
                "    \"USDLRD\":161.591204,\n" +
                "    \"USDLSL\":13.990103,\n" +
                "    \"USDLTL\":2.95274,\n" +
                "    \"USDLVL\":0.60489,\n" +
                "    \"USDLYD\":1.389792,\n" +
                "    \"USDMAD\":9.548967,\n" +
                "    \"USDMDL\":17.137999,\n" +
                "    \"USDMGA\":3530.000122,\n" +
                "    \"USDMKD\":54.044979,\n" +
                "    \"USDMMK\":1512.897143,\n" +
                "    \"USDMNT\":2634.793585,\n" +
                "    \"USDMOP\":8.08405,\n" +
                "    \"USDMRO\":356.999945,\n" +
                "    \"USDMUR\":34.167967,\n" +
                "    \"USDMVR\":15.449916,\n" +
                "    \"USDMWK\":728.095027,\n" +
                "    \"USDMXN\":19.312401,\n" +
                "    \"USDMYR\":4.077002,\n" +
                "    \"USDMZN\":62.704982,\n" +
                "    \"USDNAD\":13.990283,\n" +
                "    \"USDNGN\":361.496166,\n" +
                "    \"USDNIO\":32.649575,\n" +
                "    \"USDNOK\":8.564205,\n" +
                "    \"USDNPR\":113.335034,\n" +
                "    \"USDNZD\":1.46675,\n" +
                "    \"USDOMR\":0.384975,\n" +
                "    \"USDPAB\":0.99995,\n" +
                "    \"USDPEN\":3.30345,\n" +
                "    \"USDPGK\":3.3625,\n" +
                "    \"USDPHP\":51.846499,\n" +
                "    \"USDPKR\":139.697777,\n" +
                "    \"USDPLN\":3.78605,\n" +
                "    \"USDPYG\":6089.809337,\n" +
                "    \"USDQAR\":3.640954,\n" +
                "    \"USDRON\":4.16795,\n" +
                "    \"USDRSD\":103.689989,\n" +
                "    \"USDRUB\":65.868014,\n" +
                "    \"USDRWF\":885,\n" +
                "    \"USDSAR\":3.751401,\n" +
                "    \"USDSBD\":8.174297,\n" +
                "    \"USDSCR\":13.659975,\n" +
                "    \"USDSDG\":47.605499,\n" +
                "    \"USDSEK\":9.25261,\n" +
                "    \"USDSGD\":1.35362,\n" +
                "    \"USDSHP\":1.3209,\n" +
                "    \"USDSLL\":8700.000111,\n" +
                "    \"USDSOS\":581.000028,\n" +
                "    \"USDSRD\":7.457964,\n" +
                "    \"USDSTD\":21050.59961,\n" +
                "    \"USDSVC\":8.74885,\n" +
                "    \"USDSYP\":515.000053,\n" +
                "    \"USDSZL\":13.989835,\n" +
                "    \"USDTHB\":31.741018,\n" +
                "    \"USDTJS\":9.43745,\n" +
                "    \"USDTMT\":3.51,\n" +
                "    \"USDTND\":3.049199,\n" +
                "    \"USDTOP\":2.26225,\n" +
                "    \"USDTRY\":5.3861,\n" +
                "    \"USDTTD\":6.78735,\n" +
                "    \"USDTWD\":30.828995,\n" +
                "    \"USDTZS\":2345.298985,\n" +
                "    \"USDUAH\":26.836999,\n" +
                "    \"USDUGX\":3704.549582,\n" +
                "    \"USDUSD\":1,\n" +
                "    \"USDUYU\":32.680392,\n" +
                "    \"USDUZS\":8399.999907,\n" +
                "    \"USDVEF\":9.9875,\n" +
                "    \"USDVND\":23201.1,\n" +
                "    \"USDVUV\":114.177657,\n" +
                "    \"USDWST\":2.600938,\n" +
                "    \"USDXAF\":576.169812,\n" +
                "    \"USDXAG\":0.064735,\n" +
                "    \"USDXAU\":0.000766,\n" +
                "    \"USDXCD\":2.70255,\n" +
                "    \"USDXDR\":0.717197,\n" +
                "    \"USDXOF\":581.000187,\n" +
                "    \"USDXPF\":105.198368,\n" +
                "    \"USDYER\":249.795747,\n" +
                "    \"USDZAR\":14.18055,\n" +
                "    \"USDZMK\":9001.194952,\n" +
                "    \"USDZMW\":11.978047,\n" +
                "    \"USDZWL\":322.355011\n" +
                "  }\n" +
                "}"
        val gson = NetworkHelper.createGson()
        val rateResponse = gson.fromJson(input, RateResponse::class.java)
        assertEquals(rateResponse.quotes!!.isNotEmpty(), true)
    }
}