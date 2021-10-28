package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLogStream {

  def apply(
    internalResourceId: String,
    logStreamName: Option[String] = None,
    logGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnLogStream =
    software.amazon.awscdk.services.logs.CfnLogStream.Builder
      .create(stackCtx, internalResourceId)
      .logStreamName(logStreamName.orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}
