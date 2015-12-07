package cwh.textsurfacetext.textsurface.interfaces;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import cwh.textsurfacetext.textsurface.TextSurface;

/**
 * Created by Eugene Levenetc.
 */
public interface ISurfaceAnimation {

	void onStart();

	void start(@Nullable IEndListener listener);

	void setTextSurface(@NonNull TextSurface textSurface);

	long getDuration();

	void cancel();

}
