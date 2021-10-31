package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserTokenConfigurationProperty {

  def apply(
    jwtTokenTypeConfiguration: Option[software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty] = None,
    jsonTokenTypeConfiguration: Option[software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty.Builder)
      .jwtTokenTypeConfiguration(jwtTokenTypeConfiguration.orNull)
      .jsonTokenTypeConfiguration(jsonTokenTypeConfiguration.orNull)
      .build()
}
