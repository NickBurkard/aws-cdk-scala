package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityConfigurationProps {

  def apply(
    securityConfiguration: AnyRef,
    name: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps =
    (new software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.Builder)
      .securityConfiguration(securityConfiguration)
      .name(name.orNull)
      .build()
}
