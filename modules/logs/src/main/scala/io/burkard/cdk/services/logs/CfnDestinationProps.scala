package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDestinationProps {

  def apply(
    destinationName: Option[String] = None,
    roleArn: Option[String] = None,
    destinationPolicy: Option[String] = None,
    targetArn: Option[String] = None
  ): software.amazon.awscdk.services.logs.CfnDestinationProps =
    (new software.amazon.awscdk.services.logs.CfnDestinationProps.Builder)
      .destinationName(destinationName.orNull)
      .roleArn(roleArn.orNull)
      .destinationPolicy(destinationPolicy.orNull)
      .targetArn(targetArn.orNull)
      .build()
}
