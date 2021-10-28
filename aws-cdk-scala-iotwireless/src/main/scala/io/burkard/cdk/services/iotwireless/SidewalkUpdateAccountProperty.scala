package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SidewalkUpdateAccountProperty {

  def apply(
    appServerPrivateKey: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty.Builder)
      .appServerPrivateKey(appServerPrivateKey.orNull)
      .build()
}
