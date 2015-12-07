package cwh.textsurfacetext.textsurface.interfaces;

import java.util.LinkedList;

import cwh.textsurfacetext.textsurface.contants.TYPE;

/**
 * Created by Eugene Levenetc.
 */
public interface ISet extends ISurfaceAnimation {
	TYPE getType();

	LinkedList<ISurfaceAnimation> getAnimations();
}
