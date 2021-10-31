package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsLogDriverProps {

  def apply(
    logRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    datetimeFormat: Option[String] = None,
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    multilinePattern: Option[String] = None,
    streamPrefix: Option[String] = None,
    mode: Option[software.amazon.awscdk.services.ecs.AwsLogDriverMode] = None
  ): software.amazon.awscdk.services.ecs.AwsLogDriverProps =
    (new software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder)
      .logRetention(logRetention.orNull)
      .datetimeFormat(datetimeFormat.orNull)
      .logGroup(logGroup.orNull)
      .multilinePattern(multilinePattern.orNull)
      .streamPrefix(streamPrefix.orNull)
      .mode(mode.orNull)
      .build()
}
