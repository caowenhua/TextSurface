package cwh.textsurfacetext.activity.checks;

import cwh.textsurfacetext.textsurface.contants.Align;
import cwh.textsurfacetext.textsurface.animations.AnimationsSet;
import cwh.textsurfacetext.textsurface.contants.Pivot;
import cwh.textsurfacetext.textsurface.contants.TYPE;
import cwh.textsurfacetext.textsurface.Text;
import cwh.textsurfacetext.textsurface.TextBuilder;
import cwh.textsurfacetext.textsurface.TextSurface;
import cwh.textsurfacetext.textsurface.animations.Alpha;
import cwh.textsurfacetext.textsurface.animations.TransSurface;

/**
 * Created by Eugene Levenetc.
 */
public class SurfaceTransSample {
	public static void play(TextSurface textSurface) {
		Text textA = TextBuilder.create("TextA").setPosition(Align.SURFACE_CENTER).build();
		Text textB = TextBuilder.create("TextB").setPosition(Align.RIGHT_OF | Align.BOTTOM_OF, textA).build();
		Text textC = TextBuilder.create("TextC").setPosition(Align.LEFT_OF | Align.BOTTOM_OF, textB).build();
		Text textD = TextBuilder.create("TextD").setPosition(Align.RIGHT_OF | Align.BOTTOM_OF, textC).build();

		int duration = 500;

		textSurface.play(TYPE.SEQUENTIAL,
				Alpha.show(textA, duration),
				new AnimationsSet(TYPE.PARALLEL, Alpha.show(textB, duration), new TransSurface(duration, textB, Pivot.CENTER)),
				new AnimationsSet(TYPE.PARALLEL, Alpha.show(textC, duration), new TransSurface(duration, textC, Pivot.CENTER)),
				new AnimationsSet(TYPE.PARALLEL, Alpha.show(textD, duration), new TransSurface(duration, textD, Pivot.CENTER)),
				new TransSurface(duration, textC, Pivot.CENTER),
				new TransSurface(duration, textB, Pivot.CENTER),
				new TransSurface(duration, textA, Pivot.CENTER)
		);
	}
}
