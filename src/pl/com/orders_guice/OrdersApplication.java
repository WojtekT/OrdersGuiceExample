package pl.com.orders_guice;

import java.util.List;

import pl.com.orders_guice.module.OrdersModule;

import roboguice.application.RoboApplication;

import com.google.inject.Module;

public class OrdersApplication extends RoboApplication {

	@Override
	protected void addApplicationModules(final List<Module> modules) {
		modules.add(new OrdersModule());
	}
}
