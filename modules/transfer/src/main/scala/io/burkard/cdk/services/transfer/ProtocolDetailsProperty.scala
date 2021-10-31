package io.burkard.cdk.services.transfer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProtocolDetailsProperty {

  def apply(
    passiveIp: Option[String] = None
  ): software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty =
    (new software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty.Builder)
      .passiveIp(passiveIp.orNull)
      .build()
}
