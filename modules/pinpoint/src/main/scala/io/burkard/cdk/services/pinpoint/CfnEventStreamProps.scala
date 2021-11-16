package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventStreamProps {

  def apply(
    applicationId: String,
    destinationStreamArn: String,
    roleArn: String
  ): software.amazon.awscdk.services.pinpoint.CfnEventStreamProps =
    (new software.amazon.awscdk.services.pinpoint.CfnEventStreamProps.Builder)
      .applicationId(applicationId)
      .destinationStreamArn(destinationStreamArn)
      .roleArn(roleArn)
      .build()
}
