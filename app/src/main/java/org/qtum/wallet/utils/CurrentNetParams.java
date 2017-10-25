package org.qtum.wallet.utils;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.QtumMainNetParams;
import org.bitcoinj.params.QtumTestNetParams;


public class CurrentNetParams {

    public  CurrentNetParams(){}

    public static NetworkParameters getNetParams(){
        return QtumTestNetParams.get();
    }

    public static String getUrl(){
        return "http://163.172.251.4:5931/";
    }
}
