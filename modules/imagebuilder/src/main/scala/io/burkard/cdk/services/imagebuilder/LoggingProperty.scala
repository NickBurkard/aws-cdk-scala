package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingProperty {

  def apply(
    s3Logs: Option[software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty.Builder)
      .s3Logs(s3Logs.orNull)
      .build()
}
