package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriptionFilterProps {

  def apply(
    logGroup: software.amazon.awscdk.services.logs.ILogGroup,
    filterPattern: Option[software.amazon.awscdk.services.logs.IFilterPattern] = None,
    destination: Option[software.amazon.awscdk.services.logs.ILogSubscriptionDestination] = None
  ): software.amazon.awscdk.services.logs.SubscriptionFilterProps =
    (new software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder)
      .logGroup(logGroup)
      .filterPattern(filterPattern.orNull)
      .destination(destination.orNull)
      .build()
}
