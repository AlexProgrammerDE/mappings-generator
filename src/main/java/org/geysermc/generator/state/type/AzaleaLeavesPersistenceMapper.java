package org.geysermc.generator.state.type;

import org.apache.commons.lang3.tuple.Pair;
import org.geysermc.generator.state.StateMapper;
import org.geysermc.generator.state.StateRemapper;

@StateRemapper(value = "persistent", blockRegex = "^minecraft:azalea_leaves")
public class AzaleaLeavesPersistenceMapper extends StateMapper<Boolean> {
    @Override
    public Pair<String, Boolean> translateState(String fullIdentifier, String value) {
        return Pair.of("persistent_bit", value.equals("true"));
    }
}
