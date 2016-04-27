package beeradviser.hfad.com.beeradviser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {
    BeerExpert expert= new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    public void onClickFindBeer(View view){
        TextView brands = (TextView) findViewById(R.id.brands);

        Spinner color= (Spinner) findViewById(R.id.color);

        String beerType= String.valueOf(color.getSelectedItem());
        List<String> brandsList=expert.getBrands(beerType);
        StringBuilder stringFormat= new StringBuilder();
        for (String s :
                brandsList) {
            stringFormat.append(s).append("\n");
        }
        brands.setText(stringFormat);


    }
}

