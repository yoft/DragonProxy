package org.dragonet.raknet.protocol.packet;

import org.dragonet.raknet.protocol.DataPacket;
import org.dragonet.raknet.protocol.Packet;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class DATA_PACKET_A extends DataPacket {
    public static final byte ID = (byte) 0x8a;

    @Override
    public byte getID() {
        return ID;
    }

    public static final class Factory implements Packet.PacketFactory {

        @Override
        public Packet create() {
            return new DATA_PACKET_A();
        }

    }

}
