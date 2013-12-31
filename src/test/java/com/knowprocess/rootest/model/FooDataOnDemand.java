package com.knowprocess.rootest.model;

import org.springframework.roo.addon.dod.RooDataOnDemand;

@RooDataOnDemand(entity = Foo.class)
public class FooDataOnDemand {

	public void setATelType(Foo obj, int index) {
		// restrict to 9 digits
		String aTelType = (index + "012345678").substring(0, 9);
        obj.setATelType(aTelType);
    }

	public void setLimitedInteger(Foo obj, int index) {
		// restrict to 8 digits
		Integer limitedInteger = Integer.valueOf(new String(index + "01234567")
				.substring(0, 8));
        obj.setLimitedInteger(limitedInteger);
    }

	public void setAYearType(Foo obj, int index) {
		Integer aYearType = Integer.valueOf(new String(index + "0123")
				.substring(0, 4));
        obj.setAYearType(aYearType);
    }
}
