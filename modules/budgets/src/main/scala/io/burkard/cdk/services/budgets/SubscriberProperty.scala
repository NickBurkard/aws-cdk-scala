package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriberProperty {

  def apply(
    address: Option[String] = None,
    subscriptionType: Option[String] = None
  ): software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.Builder)
      .address(address.orNull)
      .subscriptionType(subscriptionType.orNull)
      .build()
}
