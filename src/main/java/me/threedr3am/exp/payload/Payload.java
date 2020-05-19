package me.threedr3am.exp.payload;

/**
 * @author threedr3am
 */
public interface Payload {
    Object getObject(String... command) throws Exception;
}
