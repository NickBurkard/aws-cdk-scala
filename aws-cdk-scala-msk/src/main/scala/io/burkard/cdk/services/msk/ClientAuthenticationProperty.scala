package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClientAuthenticationProperty {

  def apply(
    sasl: Option[software.amazon.awscdk.services.msk.CfnCluster.SaslProperty] = None,
    unauthenticated: Option[software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty] = None,
    tls: Option[software.amazon.awscdk.services.msk.CfnCluster.TlsProperty] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty.Builder)
      .sasl(sasl.orNull)
      .unauthenticated(unauthenticated.orNull)
      .tls(tls.orNull)
      .build()
}
