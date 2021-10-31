package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubscriptionFilterProps {

  def apply(
    filterPattern: Option[String] = None,
    roleArn: Option[String] = None,
    destinationArn: Option[String] = None,
    logGroupName: Option[String] = None
  ): software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps =
    (new software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder)
      .filterPattern(filterPattern.orNull)
      .roleArn(roleArn.orNull)
      .destinationArn(destinationArn.orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}
