package org.glydar.paraglydar.netty.packet.client;

import io.netty.buffer.ByteBuf;
import org.glydar.paraglydar.netty.packet.CubeWorldPacket;

@CubeWorldPacket.Packet(id = 8)
public class Packet8Stealth extends CubeWorldPacket {

    byte[] unknowndata;
    @Override
    protected void internalDecode(ByteBuf buf) {
        buf.readBytes(unknowndata, 0, 40);
    }
}
