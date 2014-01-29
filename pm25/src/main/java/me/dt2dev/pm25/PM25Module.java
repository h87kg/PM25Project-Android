package me.dt2dev.pm25;

import dagger.Module;
import me.dt2dev.pm25.data.DataModule;

/**
 * Created by darktiny on 14-1-29.
 */
@Module(
        includes = {DataModule.class}
)
public class PM25Module {
}
