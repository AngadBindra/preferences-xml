
package nz.net.ultraq.preferences.xml;

import java.util.prefs.Preferences;
import java.util.prefs.PreferencesFactory;

/**
 * Implementation of the <tt>PreferencesFactory</tt> interface of the
 * Preferences API, creates and returns an XML file-based preferences
 * implementation for use with the Preferences API.
 * 
 * @author Emanuel Rabina
 */
public class XMLPreferencesFactory implements PreferencesFactory {

	private static final String username = System.getProperty("user.name").replace(" ", "").toLowerCase();

	private static Preferences SYSTEM_ROOT;
	private static Preferences USER_ROOT;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public synchronized Preferences systemRoot() {

		if (SYSTEM_ROOT == null) {
			SYSTEM_ROOT = new XMLPreferences(username);
		}
		return SYSTEM_ROOT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public synchronized Preferences userRoot() {

		if (USER_ROOT == null) {
			USER_ROOT = new XMLPreferences(username);
		}
		return USER_ROOT;
	}
}
