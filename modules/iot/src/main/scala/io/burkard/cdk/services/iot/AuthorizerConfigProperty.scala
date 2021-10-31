package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthorizerConfigProperty {

  def apply(
    allowAuthorizerOverride: Option[Boolean] = None,
    defaultAuthorizerName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty =
    (new software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty.Builder)
      .allowAuthorizerOverride(allowAuthorizerOverride.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultAuthorizerName(defaultAuthorizerName.orNull)
      .build()
}
