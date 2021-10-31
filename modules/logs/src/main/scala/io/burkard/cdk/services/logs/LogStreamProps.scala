package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogStreamProps {

  def apply(
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    logStreamName: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.logs.LogStreamProps =
    (new software.amazon.awscdk.services.logs.LogStreamProps.Builder)
      .logGroup(logGroup.orNull)
      .logStreamName(logStreamName.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
