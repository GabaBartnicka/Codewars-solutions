package gababartnicka.dev;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void sampleTests() {
        assertEquals(Arrays.asList("e", "d", "a"), Solution.top3("a a a  b  c c  d d d d  e e e e e"));
        assertEquals(Arrays.asList("e", "ddd", "aa"), Solution.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
        assertEquals(Arrays.asList("won't", "wont"), Solution.top3("  //wont won't won't "));
        assertEquals(Arrays.asList("e"), Solution.top3("  , e   .. "));
        assertEquals(Arrays.asList(), Solution.top3("  ...  "));
        assertEquals(Arrays.asList(), Solution.top3("  '  "));
        assertEquals(Arrays.asList(), Solution.top3("  '''  "));
        assertEquals(Arrays.asList("a", "of", "on"), Solution.top3(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n"))));
    }

    @Test
    public void single() {
        assertEquals(Arrays.asList("won't", "wont"), Solution.top3("  //wont won't won't "));
    }

    @Test
    public void failingRandom() {
        assertEquals(Arrays.asList("qbs", "hsytypj", "oatsu"),
                Solution.top3("qgRpOKpZBp " +
                        "avanKUkJmh!jbUmOSde_qgRpOKpZBp " +
                        "jbUmOSde " +
                        "jbUmOSde.qgRpOKpZBp?avanKUkJmh " +
                        "jbUmOSde " +
                        "avanKUkJmh;qgRpOKpZBp " +
                        "avanKUkJmh " +
                        "TmaaRj'n " +
                        "avanKUkJmh?jbUmOSde.TmaaRj'n/avanKUkJmh " +
                        "avanKUkJmh " +
                        "jbUmOSde:qgRpOKpZBp;avanKUkJmh:avanKUkJmh " +
                        "avanKUkJmh_avanKUkJmh " +
                        "jbUmOSde " +
                        "qgRpOKpZBp " +
                        "avanKUkJmh " +
                        "jbUmOSde " +
                        "avanKUkJmh_jbUmOSde;avanKUkJmh " +
                        "jbUmOSde " +
                        "TmaaRj'n-avanKUkJmh " +
                        "jbUmOSde " +
                        "qgRpOKpZBp-jbUmOSde " +
                        "qgRpOKpZBp " +
                        "avanKUkJmh " +
                        "avanKUkJmh " +
                        "avanKUkJmh?jbUmOSde TmaaRj'n-avanKUkJmh jbUmOSde/jbUmOSde!jbUmOSde avanKUkJmh qgRpOKpZBp qgRpOKpZBp avanKUkJmh/jbUmOSde:qgRpOKpZBp?avanKUkJmh-qgRpOKpZBp_TmaaRj'n avanKUkJmh:jbUmOSde\n" +
                        "RyAnBrHZr;VQNe XdmVJ HSYTYpJ:Qbs CsAsAwTtUz-ohmld oaTsU.VQNe_Qbs_oaTsU Qbs_HSYTYpJ_EJFCmwOMS-VQNe.EJFCmwOMS:EJFCmwOMS:HSYTYpJ!CsAsAwTtUz uwNnXVfv;EJFCmwOMS CsAsAwTtUz CsAsAwTtUz HSYTYpJ,HSYTYpJ IruFa.HmNzdwtlpN:HSYTYpJ XdmVJ kkzpDnDP;ohmld.EJFCmwOMS-Qbs PwuPOV Gduxmzq CsAsAwTtUz HSYTYpJ.VQNe XdmVJ PwuPOV?Qbs?oaTsU:oaTsU RyAnBrHZr?HmNzdwtlpN,kkzpDnDP Qbs PwuPOV/CsAsAwTtUz VQNe?Qbs-VQNe?HSYTYpJ VQNe_IruFa-oaTsU/oaTsU;HSYTYpJ EJFCmwOMS_oaTsU_CsAsAwTtUz,oaTsU:PwuPOV:RyAnBrHZr/VQNe.oaTsU RyAnBrHZr.EJFCmwOMS PwuPOV PwuPOV RyAnBrHZr kkzpDnDP-kkzpDnDP;IruFa kkzpDnDP kkzpDnDP.Qbs oaTsU-Qbs Qbs WvEiacsA VQNe,oaTsU;HSYTYpJ ITWtGvpPZS oaTsU Qbs HSYTYpJ Qbs Qbs HSYTYpJ/XdmVJ:Gduxmzq VQNe ohmld ohmld?HSYTYpJ HSYTYpJ/yHFkr_Qbs:IruFa,Qbs.VQNe-EJFCmwOMS,oaTsU RyAnBrHZr.HmNzdwtlpN HSYTYpJ PwuPOV oaTsU PwuPOV XdmVJ VQNe/WvEiacsA Qbs/WvEiacsA:Qbs EJFCmwOMS,IruFa,XdmVJ!kkzpDnDP yHFkr XdmVJ XdmVJ PwuPOV:Qbs?oaTsU XdmVJ.XdmVJ oaTsU.Qbs VQNe RyAnBrHZr?IruFa;Qbs;HSYTYpJ-Qbs PwuPOV VQNe PwuPOV bmINGcuV EJFCmwOMS/WvEiacsA kkzpDnDP!HSYTYpJ IruFa HSYTYpJ,VQNe.kkzpDnDP PwuPOV:HmNzdwtlpN uwNnXVfv CsAsAwTtUz VQNe CsAsAwTtUz XdmVJ PwuPOV!oaTsU EJFCmwOMS ohmld:Qbs;IruFa!Qbs;RyAnBrHZr HSYTYpJ PwuPOV.IruFa,VQNe HSYTYpJ IruFa;Qbs EJFCmwOMS kkzpDnDP?XdmVJ?HSYTYpJ oaTsU EJFCmwOMS.PwuPOV,oaTsU_CsAsAwTtUz-HSYTYpJ oaTsU!VQNe_XdmVJ oaTsU:VQNe VQNe?XdmVJ EJFCmwOMS EJFCmwOMS-oaTsU;oaTsU_HSYTYpJ?VQNe VQNe XdmVJ oaTsU Qbs CsAsAwTtUz_HSYTYpJ Qbs-PwuPOV;EJFCmwOMS HSYTYpJ!Qbs Qbs kkzpDnDP?HSYTYpJ;oaTsU VQNe XdmVJ VQNe EJFCmwOMS ohmld kkzpDnDP_HmNzdwtlpN-Qbs XdmVJ XdmVJ-XdmVJ oaTsU"));
    }
}
