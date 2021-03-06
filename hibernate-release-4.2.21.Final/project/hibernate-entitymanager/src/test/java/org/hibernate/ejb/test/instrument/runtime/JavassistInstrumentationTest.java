/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.ejb.test.instrument.runtime;

import org.hibernate.bytecode.internal.javassist.BytecodeProviderImpl;
import org.hibernate.bytecode.spi.BytecodeProvider;

/**
 * @author Steve Ebersole
 */
public class JavassistInstrumentationTest extends AbstractTransformingClassLoaderInstrumentTestCase {
	protected BytecodeProvider buildBytecodeProvider() {
		return new BytecodeProviderImpl();
	}
}
