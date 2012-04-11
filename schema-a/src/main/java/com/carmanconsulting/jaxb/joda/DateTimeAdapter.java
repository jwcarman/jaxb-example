package com.carmanconsulting.jaxb.joda;

import com.carmanconsulting.jaxb.AbstractXmlAdapter;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateTimeAdapter extends AbstractXmlAdapter<String, DateTime>
{
//----------------------------------------------------------------------------------------------------------------------
// Other Methods
//----------------------------------------------------------------------------------------------------------------------

    public String marshalImpl(DateTime value)
    {
        return value.toString();
    }

    public DateTime unmarshalImpl(String value)
    {
        return new DateTime(value);
    }
}
