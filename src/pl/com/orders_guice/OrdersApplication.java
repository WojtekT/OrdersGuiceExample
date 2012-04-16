package pl.com.orders_guice;

import java.util.List;

import com.google.inject.Module;

import roboguice.application.RoboApplication;

public class OrdersApplication extends RoboApplication {

	@Override
	protected void addApplicationModules(final List<Module> modules) {
		modules.add(new OrdersModule());
	}
}
