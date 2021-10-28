package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLogStreamProps {

  def apply(
    logStreamName: Option[String] = None,
    logGroupName: Option[String] = None
  ): software.amazon.awscdk.services.logs.CfnLogStreamProps =
    (new software.amazon.awscdk.services.logs.CfnLogStreamProps.Builder)
      .logStreamName(logStreamName.orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}
