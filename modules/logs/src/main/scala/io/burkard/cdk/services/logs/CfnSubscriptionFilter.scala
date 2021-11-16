package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubscriptionFilter {

  def apply(
    internalResourceId: String,
    filterPattern: String,
    destinationArn: String,
    logGroupName: String,
    roleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnSubscriptionFilter =
    software.amazon.awscdk.services.logs.CfnSubscriptionFilter.Builder
      .create(stackCtx, internalResourceId)
      .filterPattern(filterPattern)
      .destinationArn(destinationArn)
      .logGroupName(logGroupName)
      .roleArn(roleArn.orNull)
      .build()
}
