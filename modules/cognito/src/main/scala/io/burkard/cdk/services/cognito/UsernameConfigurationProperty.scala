package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UsernameConfigurationProperty {

  def apply(
    caseSensitive: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty.Builder)
      .caseSensitive(caseSensitive.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
