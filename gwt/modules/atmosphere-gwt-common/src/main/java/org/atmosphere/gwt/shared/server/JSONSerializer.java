package org.atmosphere.gwt.shared.server;

/**
 *
 * @author p.havelaar
 */
public interface JSONSerializer {
    String serialize(Object data) throws SerializationException;
}
