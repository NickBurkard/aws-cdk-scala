package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSubscriptionFilter {

  def apply(
    internalResourceId: String,
    filterPattern: Option[String] = None,
    roleArn: Option[String] = None,
    destinationArn: Option[String] = None,
    logGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnSubscriptionFilter =
    software.amazon.awscdk.services.logs.CfnSubscriptionFilter.Builder
      .create(stackCtx, internalResourceId)
      .filterPattern(filterPattern.orNull)
      .roleArn(roleArn.orNull)
      .destinationArn(destinationArn.orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}
