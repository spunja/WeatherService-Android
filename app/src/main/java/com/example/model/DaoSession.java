package com.example.model;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.model.WeatherInfo;

import com.example.model.WeatherInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig weatherInfoDaoConfig;

    private final WeatherInfoDao weatherInfoDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        weatherInfoDaoConfig = daoConfigMap.get(WeatherInfoDao.class).clone();
        weatherInfoDaoConfig.initIdentityScope(type);

        weatherInfoDao = new WeatherInfoDao(weatherInfoDaoConfig, this);

        registerDao(WeatherInfo.class, weatherInfoDao);
    }
    
    public void clear() {
        weatherInfoDaoConfig.getIdentityScope().clear();
    }

    public WeatherInfoDao getWeatherInfoDao() {
        return weatherInfoDao;
    }

}
