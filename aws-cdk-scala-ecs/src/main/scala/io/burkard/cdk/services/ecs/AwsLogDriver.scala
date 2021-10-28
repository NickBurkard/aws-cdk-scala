package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsLogDriver {

  def apply(
    logRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    datetimeFormat: Option[String] = None,
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    multilinePattern: Option[String] = None,
    streamPrefix: Option[String] = None,
    mode: Option[software.amazon.awscdk.services.ecs.AwsLogDriverMode] = None
  ): software.amazon.awscdk.services.ecs.AwsLogDriver =
    software.amazon.awscdk.services.ecs.AwsLogDriver.Builder
      .create()
      .logRetention(logRetention.orNull)
      .datetimeFormat(datetimeFormat.orNull)
      .logGroup(logGroup.orNull)
      .multilinePattern(multilinePattern.orNull)
      .streamPrefix(streamPrefix.orNull)
      .mode(mode.orNull)
      .build()
}
