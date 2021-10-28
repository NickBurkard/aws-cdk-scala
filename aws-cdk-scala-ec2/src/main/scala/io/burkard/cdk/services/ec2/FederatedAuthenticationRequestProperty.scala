package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FederatedAuthenticationRequestProperty {

  def apply(
    samlProviderArn: Option[String] = None,
    selfServiceSamlProviderArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.Builder)
      .samlProviderArn(samlProviderArn.orNull)
      .selfServiceSamlProviderArn(selfServiceSamlProviderArn.orNull)
      .build()
}
