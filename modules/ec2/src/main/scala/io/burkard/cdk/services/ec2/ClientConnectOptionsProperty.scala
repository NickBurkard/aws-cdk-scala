package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientConnectOptionsProperty {

  def apply(
    enabled: Boolean,
    lambdaFunctionArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder)
      .enabled(enabled)
      .lambdaFunctionArn(lambdaFunctionArn.orNull)
      .build()
}
