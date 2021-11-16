package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDestination {

  def apply(
    internalResourceId: String,
    destinationName: String,
    roleArn: String,
    destinationPolicy: String,
    targetArn: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnDestination =
    software.amazon.awscdk.services.logs.CfnDestination.Builder
      .create(stackCtx, internalResourceId)
      .destinationName(destinationName)
      .roleArn(roleArn)
      .destinationPolicy(destinationPolicy)
      .targetArn(targetArn)
      .build()
}
