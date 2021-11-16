package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogOptions {

  def apply(
    destination: software.amazon.awscdk.services.logs.ILogGroup,
    includeExecutionData: Option[Boolean] = None,
    level: Option[software.amazon.awscdk.services.stepfunctions.LogLevel] = None
  ): software.amazon.awscdk.services.stepfunctions.LogOptions =
    (new software.amazon.awscdk.services.stepfunctions.LogOptions.Builder)
      .destination(destination)
      .includeExecutionData(includeExecutionData.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .level(level.orNull)
      .build()
}
