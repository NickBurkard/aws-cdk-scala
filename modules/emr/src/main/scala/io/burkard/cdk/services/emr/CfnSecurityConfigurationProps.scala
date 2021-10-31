package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityConfigurationProps {

  def apply(
    name: Option[String] = None,
    securityConfiguration: Option[AnyRef] = None
  ): software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps =
    (new software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.Builder)
      .name(name.orNull)
      .securityConfiguration(securityConfiguration.orNull)
      .build()
}
