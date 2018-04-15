package com.vuedata.bustrackingapp;

import java.util.List;



public interface LocationFinderListener {
    void onDirectionFinderStart();

    void onDirectionFinderSuccess(Route route);
}
