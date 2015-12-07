package cwh.textsurfacetext.activity.checks;

import cwh.textsurfacetext.textsurface.contants.Align;
import cwh.textsurfacetext.textsurface.animations.AnimationsSet;
import cwh.textsurfacetext.textsurface.contants.TYPE;
import cwh.textsurfacetext.textsurface.Text;
import cwh.textsurfacetext.textsurface.TextBuilder;
import cwh.textsurfacetext.textsurface.TextSurface;
import cwh.textsurfacetext.textsurface.animations.Rotate3D;
import cwh.textsurfacetext.textsurface.contants.Axis;
import cwh.textsurfacetext.textsurface.contants.Direction;
import cwh.textsurfacetext.textsurface.contants.Pivot;

/**
 * Created by Eugene Levenetc.
 */
public class Rotation3DSample {
	public static void play(TextSurface textSurface) {
		Text textA = TextBuilder.create("How are you?").setPosition(Align.SURFACE_CENTER).build();
		Text textB = TextBuilder.create("I'm fine! And you?").setPosition(Align.SURFACE_CENTER, textA).build();
		Text textC = TextBuilder.create("Haaay!").setPosition(Align.SURFACE_CENTER, textB).build();
		int duration = 2750;

		textSurface.play(TYPE.SEQUENTIAL,
				new AnimationsSet(TYPE.SEQUENTIAL,
						Rotate3D.showFromCenter(textA, duration, Direction.CLOCK, Axis.X),
						Rotate3D.hideFromCenter(textA, duration, Direction.CLOCK, Axis.Y)
				),
				new AnimationsSet(TYPE.SEQUENTIAL,
						Rotate3D.showFromSide(textB, duration, Pivot.LEFT),
						Rotate3D.hideFromSide(textB, duration, Pivot.RIGHT)
				),
				new AnimationsSet(TYPE.SEQUENTIAL,
						Rotate3D.showFromSide(textC, duration, Pivot.TOP),
						Rotate3D.hideFromSide(textC, duration, Pivot.BOTTOM)
				)
		);
	}
}
