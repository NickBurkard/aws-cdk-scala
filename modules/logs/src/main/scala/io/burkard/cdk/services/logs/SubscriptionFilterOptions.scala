package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriptionFilterOptions {

  def apply(
    filterPattern: software.amazon.awscdk.services.logs.IFilterPattern,
    destination: software.amazon.awscdk.services.logs.ILogSubscriptionDestination
  ): software.amazon.awscdk.services.logs.SubscriptionFilterOptions =
    (new software.amazon.awscdk.services.logs.SubscriptionFilterOptions.Builder)
      .filterPattern(filterPattern)
      .destination(destination)
      .build()
}
