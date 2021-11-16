package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FederatedAuthenticationRequestProperty {

  def apply(
    samlProviderArn: String,
    selfServiceSamlProviderArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.Builder)
      .samlProviderArn(samlProviderArn)
      .selfServiceSamlProviderArn(selfServiceSamlProviderArn.orNull)
      .build()
}
