package com.zerokol.nurseme;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.TabHost;

// Minha activity agora herda de TabActivity
public class MainActivity extends TabActivity {
	private Resources res; // objeto Resource para acessr os assets
	private TabHost tabHost; // O TabHost da activity
	private TabHost.TabSpec tabSpec; // TabSpec reusavel para cada TAB
	private Intent intent; // Intent reusavel para cada TAB

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		res = getResources();
		tabHost = getTabHost();

		// Creando uma Intent para chamar cada activity de cada TAB
		intent = new Intent().setClass(this, PillActivity.class);
		// Inicializar um TabSpec para cada TAB e adicionar no TabHost
		tabSpec = tabHost
				.newTabSpec(res.getString(R.string.main_tab_host_dashboard))
				.setIndicator(res.getString(R.string.main_tab_host_dashboard),
						res.getDrawable(R.drawable.dashboard))
				.setContent(intent);
		tabHost.addTab(tabSpec);

		// Creando uma Intent para chamar cada activity de cada TAB
		intent = new Intent().setClass(this, PillActivity.class);
		// Inicializar um TabSpec para cada TAB e adicionar no TabHost
		tabSpec = tabHost
				.newTabSpec(res.getString(R.string.main_tab_host_pill))
				.setIndicator(res.getString(R.string.main_tab_host_pill),
						res.getDrawable(R.drawable.pill)).setContent(intent);
		tabHost.addTab(tabSpec);

		// Creando uma Intent para chamar cada activity de cada TAB
		intent = new Intent().setClass(this, PillActivity.class);
		// Inicializar um TabSpec para cada TAB e adicionar no TabHost
		tabSpec = tabHost
				.newTabSpec(res.getString(R.string.main_tab_host_controls))
				.setIndicator(res.getString(R.string.main_tab_host_controls),
						res.getDrawable(R.drawable.controls))
				.setContent(intent);
		tabHost.addTab(tabSpec);

		// Creando uma Intent para chamar cada activity de cada TAB
		intent = new Intent().setClass(this, PillActivity.class);
		// Inicializar um TabSpec para cada TAB e adicionar no TabHost
		tabSpec = tabHost
				.newTabSpec(res.getString(R.string.main_tab_host_injection))
				.setIndicator(res.getString(R.string.main_tab_host_injection),
						res.getDrawable(R.drawable.injection))
				.setContent(intent);
		tabHost.addTab(tabSpec);

		tabHost.setCurrentTab(0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
