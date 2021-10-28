package io.burkard.cdk.services.transfer

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProtocolDetailsProperty {

  def apply(
    passiveIp: Option[String] = None
  ): software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty =
    (new software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty.Builder)
      .passiveIp(passiveIp.orNull)
      .build()
}
