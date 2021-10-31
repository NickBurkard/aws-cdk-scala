package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventStream {

  def apply(
    internalResourceId: String,
    applicationId: Option[String] = None,
    destinationStreamArn: Option[String] = None,
    roleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnEventStream =
    software.amazon.awscdk.services.pinpoint.CfnEventStream.Builder
      .create(stackCtx, internalResourceId)
      .applicationId(applicationId.orNull)
      .destinationStreamArn(destinationStreamArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
