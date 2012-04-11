package com.carmanconsulting.jaxb.joda;

import com.carmanconsulting.jaxb.AbstractXmlAdapter;
import org.joda.time.LocalDate;

public class LocalDateAdapter extends AbstractXmlAdapter<String, LocalDate>
{
//----------------------------------------------------------------------------------------------------------------------
// Other Methods
//----------------------------------------------------------------------------------------------------------------------

    public String marshalImpl(LocalDate value)
    {
        return value.toString();
    }

    public LocalDate unmarshalImpl(String value)
    {
        return new LocalDate(value);
    }
}
