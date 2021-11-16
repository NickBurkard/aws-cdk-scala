package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityConfiguration {

  def apply(
    internalResourceId: String,
    securityConfiguration: AnyRef,
    name: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emr.CfnSecurityConfiguration =
    software.amazon.awscdk.services.emr.CfnSecurityConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .securityConfiguration(securityConfiguration)
      .name(name.orNull)
      .build()
}
