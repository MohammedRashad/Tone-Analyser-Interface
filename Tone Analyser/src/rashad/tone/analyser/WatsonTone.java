/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rashad.tone.analyser;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.ToneAnalyzer;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;

/**
 *
 * @author root
 */
public class WatsonTone {

    public JsonObject AnalyzeText(String textToAnalyze) {
        JsonObject json;

        ToneAnalyzer service = new ToneAnalyzer(ToneAnalyzer.VERSION_DATE_2016_05_19);
        service.setUsernameAndPassword("d0b129c2-f452-40b4-b31c-c0785c1cc71f", "eCaY0W5ohtKP");

        // Call the service and get the tone
        ToneAnalysis tone = service.getTone(textToAnalyze, null).execute();
        System.out.println(tone);

        json = new Gson().fromJson(tone.toString(), JsonObject.class);

        return json;
    }

}
