
package jaxb;

import java.net.URI;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class UriAdapter
    extends XmlAdapter<String, URI>
{


    public URI unmarshal(String value) {
        return URI.create(value);
    }

    public String marshal(URI value) {
        if (value == null) {
            return null;
        }
        return value.toASCIIString();
    }

}
