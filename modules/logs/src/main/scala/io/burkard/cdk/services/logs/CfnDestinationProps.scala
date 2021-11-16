package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDestinationProps {

  def apply(
    destinationName: String,
    roleArn: String,
    destinationPolicy: String,
    targetArn: String
  ): software.amazon.awscdk.services.logs.CfnDestinationProps =
    (new software.amazon.awscdk.services.logs.CfnDestinationProps.Builder)
      .destinationName(destinationName)
      .roleArn(roleArn)
      .destinationPolicy(destinationPolicy)
      .targetArn(targetArn)
      .build()
}
