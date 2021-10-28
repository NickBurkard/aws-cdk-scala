package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDestination {

  def apply(
    internalResourceId: String,
    destinationName: Option[String] = None,
    roleArn: Option[String] = None,
    destinationPolicy: Option[String] = None,
    targetArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnDestination =
    software.amazon.awscdk.services.logs.CfnDestination.Builder
      .create(stackCtx, internalResourceId)
      .destinationName(destinationName.orNull)
      .roleArn(roleArn.orNull)
      .destinationPolicy(destinationPolicy.orNull)
      .targetArn(targetArn.orNull)
      .build()
}
