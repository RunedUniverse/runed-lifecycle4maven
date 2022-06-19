package net.runeduniverse.tools.runes4tools.maven.lifecycle;

import org.apache.maven.AbstractMavenLifecycleParticipant;
import org.apache.maven.MavenExecutionException;
import org.apache.maven.execution.MavenSession;
import org.codehaus.plexus.component.annotations.Component;

@Component(role = AbstractMavenLifecycleParticipant.class, hint = "runes4tools")
public class RunesMavenLifecycleParticipant extends AbstractMavenLifecycleParticipant {
	@Override
	public void afterSessionStart(MavenSession session) throws MavenExecutionException {
		// start the beer machine
	}

	@Override
	public void afterProjectsRead(MavenSession session) throws MavenExecutionException {
		// ask a beer to the machine
	}

	public void afterSessionEnd(MavenSession session) throws MavenExecutionException {
		// do nothing
	}
}
