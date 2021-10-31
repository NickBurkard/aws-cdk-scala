package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityConfiguration {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    securityConfiguration: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emr.CfnSecurityConfiguration =
    software.amazon.awscdk.services.emr.CfnSecurityConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .securityConfiguration(securityConfiguration.orNull)
      .build()
}
