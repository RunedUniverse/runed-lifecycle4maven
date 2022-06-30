package net.runeduniverse.tools.runes4tools.maven.lifecycle.artifacts;

import org.apache.maven.artifact.handler.ArtifactHandler;
import org.codehaus.plexus.component.annotations.Component;

// native C / C++ App

@Component( role = ArtifactHandler.class)
public class NativeAppArtifactHandler extends AArtifactHandler{
	public NativeAppArtifactHandler() {
		super("native-app");
	}
}
