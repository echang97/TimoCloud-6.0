package cloud.timo.TimoCloud.api.events.propertyChanges.serverGroup;

import cloud.timo.TimoCloud.api.events.EventType;
import cloud.timo.TimoCloud.api.objects.ServerGroupObject;

public class ServerGroupRamChangedEvent extends ServerGroupPropertyChangedEvent<Integer> {

    public ServerGroupRamChangedEvent(ServerGroupObject instance, Integer oldValue, Integer newValue) {
        super(instance, oldValue, newValue);
    }

    @Override
    public EventType getType() {
        return EventType.SG_RAM_CHANGED;
    }
}