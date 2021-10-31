package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SidewalkAccountInfoProperty {

  def apply(
    appServerPrivateKey: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty.Builder)
      .appServerPrivateKey(appServerPrivateKey.orNull)
      .build()
}
