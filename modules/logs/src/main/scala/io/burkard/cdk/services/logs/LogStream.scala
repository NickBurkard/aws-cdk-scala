package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogStream {

  def apply(
    internalResourceId: String,
    logGroup: software.amazon.awscdk.services.logs.ILogGroup,
    logStreamName: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.LogStream =
    software.amazon.awscdk.services.logs.LogStream.Builder
      .create(stackCtx, internalResourceId)
      .logGroup(logGroup)
      .logStreamName(logStreamName.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
