package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriptionFilter {

  def apply(
    internalResourceId: String,
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    filterPattern: Option[software.amazon.awscdk.services.logs.IFilterPattern] = None,
    destination: Option[software.amazon.awscdk.services.logs.ILogSubscriptionDestination] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.SubscriptionFilter =
    software.amazon.awscdk.services.logs.SubscriptionFilter.Builder
      .create(stackCtx, internalResourceId)
      .logGroup(logGroup.orNull)
      .filterPattern(filterPattern.orNull)
      .destination(destination.orNull)
      .build()
}
