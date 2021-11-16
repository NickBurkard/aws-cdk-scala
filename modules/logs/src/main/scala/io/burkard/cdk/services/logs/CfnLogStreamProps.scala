package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLogStreamProps {

  def apply(
    logGroupName: String,
    logStreamName: Option[String] = None
  ): software.amazon.awscdk.services.logs.CfnLogStreamProps =
    (new software.amazon.awscdk.services.logs.CfnLogStreamProps.Builder)
      .logGroupName(logGroupName)
      .logStreamName(logStreamName.orNull)
      .build()
}
