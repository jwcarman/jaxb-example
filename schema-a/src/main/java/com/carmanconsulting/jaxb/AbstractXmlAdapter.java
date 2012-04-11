package com.carmanconsulting.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public abstract class AbstractXmlAdapter<ValueType,BoundType> extends XmlAdapter<ValueType,BoundType>
{
//----------------------------------------------------------------------------------------------------------------------
// Abstract Methods
//----------------------------------------------------------------------------------------------------------------------

    protected abstract ValueType marshalImpl(BoundType v) throws Exception;
    protected abstract BoundType unmarshalImpl(ValueType v) throws Exception;

//----------------------------------------------------------------------------------------------------------------------
// Other Methods
//----------------------------------------------------------------------------------------------------------------------

    @Override
    public ValueType marshal(BoundType v) throws Exception
    {
        return v == null ? null : marshalImpl(v);
    }

    @Override
    public BoundType unmarshal(ValueType v) throws Exception
    {
        return v == null ? null : unmarshalImpl(v);
    }
}
