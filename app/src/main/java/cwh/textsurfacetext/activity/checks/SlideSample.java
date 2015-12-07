package cwh.textsurfacetext.activity.checks;

import cwh.textsurfacetext.textsurface.contants.Align;
import cwh.textsurfacetext.textsurface.animations.AnimationsSet;
import cwh.textsurfacetext.textsurface.contants.TYPE;
import cwh.textsurfacetext.textsurface.Text;
import cwh.textsurfacetext.textsurface.TextBuilder;
import cwh.textsurfacetext.textsurface.TextSurface;
import cwh.textsurfacetext.textsurface.animations.Slide;
import cwh.textsurfacetext.textsurface.animations.TransSurface;
import cwh.textsurfacetext.textsurface.contants.Pivot;
import cwh.textsurfacetext.textsurface.contants.Side;

/**
 * Created by Eugene Levenetc.
 */
public class SlideSample {
	public static void play(TextSurface textSurface) {

		Text textA = TextBuilder.create(" How are you?").build();
		Text textB = TextBuilder.create("I'm fine! ").setPosition(Align.LEFT_OF, textA).build();
		Text textC = TextBuilder.create("Are you sure?").setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textB).build();
		Text textD = TextBuilder.create("Totally!").setPadding(10, 10, 10, 10).setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textC).build();
		int duration = 1250;

		textSurface.play(
				TYPE.SEQUENTIAL,
				new AnimationsSet(TYPE.PARALLEL,
						new AnimationsSet(TYPE.SEQUENTIAL,
								new AnimationsSet(TYPE.PARALLEL, Slide.showFrom(Side.LEFT, textA, duration), Slide.showFrom(Side.RIGHT, textB, duration)),
								Slide.showFrom(Side.TOP, textC, duration),
								Slide.showFrom(Side.BOTTOM, textD, duration)
						),
						new TransSurface(duration * 3, textD, Pivot.CENTER)
				),
				new AnimationsSet(TYPE.PARALLEL,
						new AnimationsSet(TYPE.SEQUENTIAL,
								new AnimationsSet(TYPE.PARALLEL, Slide.hideFrom(Side.LEFT, textD, duration), Slide.hideFrom(Side.RIGHT, textC, duration)),
								Slide.hideFrom(Side.TOP, textB, duration),
								Slide.hideFrom(Side.BOTTOM, textA, duration)
						),
						new TransSurface(duration * 3, textA, Pivot.CENTER)
				)

		);
	}
}
