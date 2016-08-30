package beast9.com.mismapas;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    int l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        l = extras.getInt("lugar");

        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        if (l == 1)
        {
            LatLng kiosco = new LatLng(24.163972989251743, -110.31662863687745);
            mMap.addMarker(new MarkerOptions().position(kiosco).title("Marker in Kiosco del malecón"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(kiosco));
        }

        if (l == 2)
        {
            LatLng balandra = new LatLng(24.321826428945695,-110.32473963693849);
            mMap.addMarker(new MarkerOptions().position(balandra).title("Marker in Playa Balandra"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(balandra));
        }

        if (l == 3)
        {
            LatLng tecolote = new LatLng(24.336490501180982, -110.31624239877931);
            mMap.addMarker(new MarkerOptions().position(tecolote).title("Marker in Playa El Tecolote"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(tecolote));
        }

        if (l == 4)
        {
            LatLng tec = new LatLng(24.119641837818985, -110.30830306009523);
            mMap.addMarker(new MarkerOptions().position(tec).title("Marker in Tecnológico de La Paz"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(tec));
        }

    }
}
