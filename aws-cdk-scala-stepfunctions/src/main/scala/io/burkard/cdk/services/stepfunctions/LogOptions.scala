package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogOptions {

  def apply(
    includeExecutionData: Option[Boolean] = None,
    destination: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    level: Option[software.amazon.awscdk.services.stepfunctions.LogLevel] = None
  ): software.amazon.awscdk.services.stepfunctions.LogOptions =
    (new software.amazon.awscdk.services.stepfunctions.LogOptions.Builder)
      .includeExecutionData(includeExecutionData.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .destination(destination.orNull)
      .level(level.orNull)
      .build()
}
