package cwh.textsurfacetext.activity.checks;

import cwh.textsurfacetext.textsurface.contants.Align;
import cwh.textsurfacetext.textsurface.animations.AnimationsSet;
import cwh.textsurfacetext.textsurface.contants.TYPE;
import cwh.textsurfacetext.textsurface.Text;
import cwh.textsurfacetext.textsurface.TextBuilder;
import cwh.textsurfacetext.textsurface.TextSurface;
import cwh.textsurfacetext.textsurface.animations.Alpha;
import cwh.textsurfacetext.textsurface.animations.Delay;
import cwh.textsurfacetext.textsurface.animations.ScaleSurface;
import cwh.textsurfacetext.textsurface.contants.Fit;

/**
 * Created by Eugene Levenetc.
 */
public class SurfaceScaleSample {
	public static void play(TextSurface textSurface) {

		Text textA = TextBuilder.create("How are you?").setPosition(Align.SURFACE_CENTER).build();
		Text textB = TextBuilder.create("Would you mind?").setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textA).build();
		Text textC = TextBuilder.create("Yes!").setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textB).build();


		textSurface.play(TYPE.SEQUENTIAL,
				Alpha.show(textA, 500),
				new AnimationsSet(TYPE.PARALLEL,
						new AnimationsSet(TYPE.PARALLEL, Alpha.show(textB, 500), Alpha.hide(textA, 500)),
						new ScaleSurface(500, textB, Fit.WIDTH)
				),
				Delay.duration(1000),
				new AnimationsSet(TYPE.PARALLEL,
						new AnimationsSet(TYPE.PARALLEL, Alpha.show(textC, 500), Alpha.hide(textB, 500)),
						new ScaleSurface(500, textC, Fit.WIDTH)
				)
		);
	}
}