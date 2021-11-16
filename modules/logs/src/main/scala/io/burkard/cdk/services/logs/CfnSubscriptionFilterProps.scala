package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubscriptionFilterProps {

  def apply(
    filterPattern: String,
    destinationArn: String,
    logGroupName: String,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps =
    (new software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder)
      .filterPattern(filterPattern)
      .destinationArn(destinationArn)
      .logGroupName(logGroupName)
      .roleArn(roleArn.orNull)
      .build()
}
