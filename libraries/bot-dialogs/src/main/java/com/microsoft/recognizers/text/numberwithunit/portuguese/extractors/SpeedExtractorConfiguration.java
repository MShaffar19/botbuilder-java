package com.microsoft.recognizers.text.numberwithunit.portuguese.extractors;

import com.microsoft.recognizers.text.Culture;
import com.microsoft.recognizers.text.CultureInfo;
import com.microsoft.recognizers.text.numberwithunit.Constants;
import com.microsoft.recognizers.text.numberwithunit.resources.PortugueseNumericWithUnit;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SpeedExtractorConfiguration extends PortugueseNumberWithUnitExtractorConfiguration {

    public SpeedExtractorConfiguration() {
        this(new CultureInfo(Culture.Portuguese));
    }

    public SpeedExtractorConfiguration(CultureInfo ci) {
        super(ci);
    }

    @Override
    public String getExtractType() {
        return Constants.SYS_UNIT_SPEED;
    }

    @Override
    public Map<String, String> getSuffixList() {
        return SpeedSuffixList;
    }

    @Override
    public Map<String, String> getPrefixList() {
        return Collections.emptyMap();
    }

    @Override
    public List<String> getAmbiguousUnitList() {
        return Collections.emptyList();
    }

    public static Map<String, String> SpeedSuffixList = PortugueseNumericWithUnit.SpeedSuffixList;
}
