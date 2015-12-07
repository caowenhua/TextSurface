package cwh.textsurfacetext.textsurface.interfaces;

import android.support.annotation.NonNull;

import cwh.textsurfacetext.textsurface.Text;

/**
 * Created by Eugene Levenetc.
 */
public interface ITextSurfaceAnimation extends ISurfaceAnimation {

	void setInitValues(@NonNull Text text);

	Text getText();

}