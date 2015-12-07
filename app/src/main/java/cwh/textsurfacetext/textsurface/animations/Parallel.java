package cwh.textsurfacetext.textsurface.animations;

import cwh.textsurfacetext.textsurface.contants.TYPE;
import cwh.textsurfacetext.textsurface.interfaces.ISurfaceAnimation;

/**
 * Created by Eugene Levenetc.
 */
public class Parallel extends AnimationsSet {
	public Parallel(ISurfaceAnimation... animations) {
		super(TYPE.PARALLEL, animations);
	}
}
