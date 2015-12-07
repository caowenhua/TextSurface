package cwh.textsurfacetext.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import cwh.textsurfacetext.R;
import cwh.textsurfacetext.activity.checks.AlignSample;
import cwh.textsurfacetext.activity.checks.ColorSample;
import cwh.textsurfacetext.activity.checks.CookieThumperSample;
import cwh.textsurfacetext.activity.checks.Rotation3DSample;
import cwh.textsurfacetext.activity.checks.ScaleTextSample;
import cwh.textsurfacetext.activity.checks.ShapeRevealLoopSample;
import cwh.textsurfacetext.activity.checks.ShapeRevealSample;
import cwh.textsurfacetext.activity.checks.SlideSample;
import cwh.textsurfacetext.activity.checks.SurfaceScaleSample;
import cwh.textsurfacetext.activity.checks.SurfaceTransSample;
import cwh.textsurfacetext.textsurface.Debug;
import cwh.textsurfacetext.textsurface.TextSurface;

/**
 * Created by Eugene Levenetc.
 */
public class SampleActivity extends AppCompatActivity {

	private TextSurface textSurface;
	int count = 4;

	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sample_activity);
		textSurface = (TextSurface) findViewById(R.id.text_surface);

		textSurface.postDelayed(new Runnable() {
			@Override public void run() {
				show();
			}
		}, 1000);

		findViewById(R.id.btn_refresh).setOnClickListener(new View.OnClickListener() {
			@Override public void onClick(View v) {
				show();
			}
		});

		CheckBox checkDebug = (CheckBox) findViewById(R.id.check_debug);
		checkDebug.setChecked(Debug.ENABLED);
		checkDebug.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				Debug.ENABLED = isChecked;
				textSurface.invalidate();
			}
		});

		findViewById(R.id.btn_change).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if(count > 9){
					count = 0;
				}
				showw();
				count++;
			}
		});
	}

	void showw(){
		switch (count){
			case 0:
				AlignSample.play(textSurface);
				break;
			case 1:
				ColorSample.play(textSurface);
				break;
			case 2:
				CookieThumperSample.play(textSurface, getAssets());
				break;
			case 3:
				Rotation3DSample.play(textSurface);
				break;
			case 4:
				ScaleTextSample.run(textSurface);
				break;
			case 5:
				ShapeRevealLoopSample.play(textSurface);
				break;
			case 6:
				ShapeRevealSample.play(textSurface);
				break;
			case 7:
				SlideSample.play(textSurface);
				break;
			case 8:
				SurfaceScaleSample.play(textSurface);
				break;
			case 9:
				SurfaceTransSample.play(textSurface);
				break;
		}
	}

	private void show() {
		textSurface.reset();
//		CookieThumperSample.play(textSurface, getAssets());
		Rotation3DSample.play(textSurface);
	}

}