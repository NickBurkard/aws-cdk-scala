package io.burkard.cdk.services.mwaa

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModuleLoggingConfigurationProperty {

  def apply(
    enabled: Option[Boolean] = None,
    cloudWatchLogGroupArn: Option[String] = None,
    logLevel: Option[String] = None
  ): software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty =
    (new software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudWatchLogGroupArn(cloudWatchLogGroupArn.orNull)
      .logLevel(logLevel.orNull)
      .build()
}
