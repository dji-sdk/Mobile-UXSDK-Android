package com.dji.ux.sample;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.VectorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioGroup;
import com.dji.mapkit.maps.DJIMap;
import dji.common.flightcontroller.flyzone.FlyZoneCategory;

import dji.ux.widget.MapWidget;

public class MapWidgetActivity extends Activity implements CompoundButton.OnCheckedChangeListener,
    RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    private static final String TAG = "MapWidgetActivity";
    private MapWidget mapWidget;
    private ImageView selectedIcon;
    int[] iconIds = {R.id.icon_1, R.id.icon_2, R.id.icon_3, R.id.icon_4, R.id.icon_5, R.id.icon_6};
    private boolean isReplacingAircraftIcon = true; // true if replacing aircraft icon, false if replacing home icon

    public static final String MAP_PROVIDER = "MapProvider";
    private final String[] flyZoneType = {"All", "Authorization", "Warning", "Enhanced Warning", "Restricted"};
    private boolean[] flyZoneEnabled = {true, true, true, true, true};
    private Button flyZoneButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_widget);
        mapWidget = (MapWidget) findViewById(R.id.map_widget);
        MapWidget.OnMapReadyListener onMapReadyListener = new MapWidget.OnMapReadyListener() {
            @Override
            public void onMapReady(@NonNull DJIMap map) {
                map.setMapType(DJIMap.MapType.Normal);
            }
        };
        Intent intent = getIntent();
        int mapProvider = intent.getIntExtra(MAP_PROVIDER, 0);
        switch (mapProvider) {
            case 0:
                mapWidget.initHereMap(onMapReadyListener);
                break;
            case 1:
                mapWidget.initGoogleMap(onMapReadyListener);
                break;
            case 2:
                mapWidget.initAMap(onMapReadyListener);
                break;
        }
        mapWidget.onCreate(savedInstanceState);

        ((CheckBox)findViewById(R.id.home_direction)).setOnCheckedChangeListener(this);
        ((CheckBox)findViewById(R.id.lock_bounds)).setOnCheckedChangeListener(this);
        ((CheckBox)findViewById(R.id.flight_path)).setOnCheckedChangeListener(this);
        ((CheckBox)findViewById(R.id.home_point)).setOnCheckedChangeListener(this);

        ((RadioGroup)findViewById(R.id.map_type_selector)).setOnCheckedChangeListener(this);

        findViewById(R.id.clear_flight_path).setOnClickListener(this);

        ((RadioGroup)findViewById(R.id.replace_icon_selector)).setOnCheckedChangeListener(this);
        ((RadioGroup)findViewById(R.id.map_center_selector)).setOnCheckedChangeListener(this);

        findViewById(R.id.replace).setOnClickListener(this);
        selectedIcon = (ImageView) findViewById(R.id.icon_1);
        for (int id : iconIds) {
            findViewById(id).setOnClickListener(this);
        }
        findViewById(R.id.icon_1).setSelected(true);
        flyZoneButton = (Button) findViewById(R.id.btnFlyZone);
        mapWidget.showAllFlyZones();
        flyZoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSelectFlyZoneDialog();
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        switch (compoundButton.getId()) {
            case R.id.home_direction:
                if (isChecked) {
                    mapWidget.showDirectionToHome();
                } else {
                    mapWidget.hideDirectionToHome();
                }
                break;
            case R.id.lock_bounds:
                mapWidget.setAutoFrameMap(isChecked);
                break;
            case R.id.flight_path:
                if (isChecked) {
                    mapWidget.showFlightPath();
                } else {
                    mapWidget.hideFlightPath();
                }
                break;
            case R.id.home_point:
                if (isChecked) {
                    mapWidget.showHome();
                } else {
                    mapWidget.hideHome();
                }
                break;
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int id) {

        switch (id) {
            case R.id.map_type_standard:
                mapWidget.getMap().setMapType(DJIMap.MapType.Normal);
                break;
            case R.id.map_type_satellite:
                mapWidget.getMap().setMapType(DJIMap.MapType.Satellite);
                break;
            case R.id.map_type_hybrid:
                mapWidget.getMap().setMapType(DJIMap.MapType.Hybrid);
                break;
            case R.id.map_center_aircraft:
                mapWidget.setMapCenterLock(MapWidget.MapCenterLock.AIRCRAFT);
                break;
            case R.id.map_center_home:
                mapWidget.setMapCenterLock(MapWidget.MapCenterLock.HOME);
                break;
            case R.id.map_center_none:
                mapWidget.setMapCenterLock(MapWidget.MapCenterLock.NONE);
                break;
            case R.id.replace_icon_aircraft:
                isReplacingAircraftIcon = true;
                break;
            case R.id.replace_icon_home:
                isReplacingAircraftIcon = false;
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.clear_flight_path:
                mapWidget.clearFlightPath();
                break;
            case R.id.replace:
                VectorDrawable drawable = (VectorDrawable) selectedIcon.getDrawable();
                if (isReplacingAircraftIcon) {
                    mapWidget.setAircraftBitmap(getBitmap(drawable));
                } else {
                    mapWidget.setHomeBitmap(getBitmap(drawable));
                }
                break;
            case R.id.icon_1:
            case R.id.icon_2:
            case R.id.icon_3:
            case R.id.icon_4:
            case R.id.icon_5:
            case R.id.icon_6:
                ImageView imageView = (ImageView) view;
                imageView.setSelected(true);
                selectedIcon.setSelected(false);
                selectedIcon = imageView;
                break;
        }
    }

    private static Bitmap getBitmap(VectorDrawable vectorDrawable) {
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(),
                                            vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        vectorDrawable.draw(canvas);
        return bitmap;
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapWidget.onResume();
    }

    @Override
    protected void onPause() {
        mapWidget.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        mapWidget.onDestroy();
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapWidget.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapWidget.onLowMemory();
    }


    private void showSelectFlyZoneDialog() {

        DialogInterface.OnMultiChoiceClickListener flyZoneChangeListener = new DialogInterface.OnMultiChoiceClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                ListView list = ((AlertDialog) dialog).getListView();
                switch (which) {
                    case 0:
                        for (int i = 0; i < list.getCount(); i++) {
                            list.setItemChecked(i, true);
                            flyZoneEnabled[i] = isChecked;
                        }
                        if (isChecked) {
                            mapWidget.showAllFlyZones();
                        } else {
                            mapWidget.hideAllFlyZones();
                        }
                        break;
                    case 1:
                        mapWidget.setFlyZoneVisibility(FlyZoneCategory.AUTHORIZATION, isChecked);
                        break;
                    case 2:
                        mapWidget.setFlyZoneVisibility(FlyZoneCategory.WARNING, isChecked);
                        break;
                    case 3:
                        mapWidget.setFlyZoneVisibility(FlyZoneCategory.ENHANCED_WARNING, isChecked);
                        break;
                    case 4:
                        mapWidget.setFlyZoneVisibility(FlyZoneCategory.RESTRICTED, isChecked);
                        break;
                }
                if (which != 0) {
                    flyZoneEnabled[which] = isChecked;
                    boolean isAllChecked = true;
                    for (int i = 1; i < flyZoneEnabled.length; i++) {
                        if (!flyZoneEnabled[i]) {
                            isAllChecked = false;
                        }
                    }
                    if (isAllChecked) {
                        list.setItemChecked(0, true);
                        flyZoneEnabled[0] = true;
                    } else {
                        list.setItemChecked(0, false);
                        flyZoneEnabled[0] = false;
                    }

                }

                dialog.dismiss();
            }

        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Fly Zones");
        builder.setMultiChoiceItems(flyZoneType, flyZoneEnabled, flyZoneChangeListener);
        AlertDialog dialog = builder.create();
        dialog.show();

    }

}
