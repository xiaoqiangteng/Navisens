package com.ccstm.navi.navisens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.navisens.pojostick.navisenscore.NavisensCore;
import com.navisens.pojostick.navisensmaps.NavisensMaps;

public class MainActivity extends AppCompatActivity {
    private static final String MOTIONDNA_KEY = "aBJ1Y30n8OXtOk6vIQqx81ro5LKFC8f0vXCbwoLhmJk8BqTQLlyeO5suiTiF8x7c";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavisensCore core = new NavisensCore(MOTIONDNA_KEY, this);
        NavisensMaps maps = core.init(NavisensMaps.class)
                .useLocalOnly()
                .showPath().hideMarkers();

        getFragmentManager().beginTransaction().add(android.R.id.content, maps).commit();
    }
}
