package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogStream {

  def apply(
    internalResourceId: String,
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    logStreamName: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.LogStream =
    software.amazon.awscdk.services.logs.LogStream.Builder
      .create(stackCtx, internalResourceId)
      .logGroup(logGroup.orNull)
      .logStreamName(logStreamName.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
