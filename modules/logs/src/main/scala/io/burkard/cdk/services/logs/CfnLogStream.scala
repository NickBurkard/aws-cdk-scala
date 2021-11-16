package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLogStream {

  def apply(
    internalResourceId: String,
    logGroupName: String,
    logStreamName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnLogStream =
    software.amazon.awscdk.services.logs.CfnLogStream.Builder
      .create(stackCtx, internalResourceId)
      .logGroupName(logGroupName)
      .logStreamName(logStreamName.orNull)
      .build()
}
