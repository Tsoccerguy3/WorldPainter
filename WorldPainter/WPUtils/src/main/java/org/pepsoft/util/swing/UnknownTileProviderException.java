package org.pepsoft.util.swing;

/**
 * Created by Pepijn on 27-11-2016.
 */
public class UnknownTileProviderException extends Exception {
    public UnknownTileProviderException(TileProvider tileProvider) {
        super("Unknown tile provider " + tileProvider + " specified");
    }
}