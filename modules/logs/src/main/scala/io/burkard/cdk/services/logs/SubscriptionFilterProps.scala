package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriptionFilterProps {

  def apply(
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    filterPattern: Option[software.amazon.awscdk.services.logs.IFilterPattern] = None,
    destination: Option[software.amazon.awscdk.services.logs.ILogSubscriptionDestination] = None
  ): software.amazon.awscdk.services.logs.SubscriptionFilterProps =
    (new software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder)
      .logGroup(logGroup.orNull)
      .filterPattern(filterPattern.orNull)
      .destination(destination.orNull)
      .build()
}
