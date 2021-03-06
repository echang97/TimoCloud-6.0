package cloud.timo.TimoCloud.api.events.serverGroup;

import cloud.timo.TimoCloud.api.events.Event;
import cloud.timo.TimoCloud.api.objects.ServerGroupObject;

public interface ServerGroupStaticChangeEvent extends Event {

    ServerGroupObject getServerGroup();

    Boolean getOldValue();

    Boolean getNewValue();

}
