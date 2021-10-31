package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FargatePlatformConfigurationProperty {

  def apply(
    platformVersion: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty.Builder)
      .platformVersion(platformVersion.orNull)
      .build()
}
