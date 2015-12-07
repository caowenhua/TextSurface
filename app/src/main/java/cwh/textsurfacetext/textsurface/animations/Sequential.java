package cwh.textsurfacetext.textsurface.animations;

import cwh.textsurfacetext.textsurface.contants.TYPE;
import cwh.textsurfacetext.textsurface.interfaces.ISurfaceAnimation;

/**
 * Created by Eugene Levenetc.
 */
public class Sequential extends AnimationsSet {
	public Sequential(ISurfaceAnimation... animations) {
		super(TYPE.SEQUENTIAL, animations);
	}
}
