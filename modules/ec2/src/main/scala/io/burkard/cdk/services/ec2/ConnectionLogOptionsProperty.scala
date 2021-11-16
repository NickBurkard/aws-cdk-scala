package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectionLogOptionsProperty {

  def apply(
    enabled: Boolean,
    cloudwatchLogGroup: Option[String] = None,
    cloudwatchLogStream: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty.Builder)
      .enabled(enabled)
      .cloudwatchLogGroup(cloudwatchLogGroup.orNull)
      .cloudwatchLogStream(cloudwatchLogStream.orNull)
      .build()
}
