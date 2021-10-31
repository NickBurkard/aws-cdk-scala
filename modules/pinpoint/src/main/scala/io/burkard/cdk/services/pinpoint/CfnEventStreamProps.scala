package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventStreamProps {

  def apply(
    applicationId: Option[String] = None,
    destinationStreamArn: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnEventStreamProps =
    (new software.amazon.awscdk.services.pinpoint.CfnEventStreamProps.Builder)
      .applicationId(applicationId.orNull)
      .destinationStreamArn(destinationStreamArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
