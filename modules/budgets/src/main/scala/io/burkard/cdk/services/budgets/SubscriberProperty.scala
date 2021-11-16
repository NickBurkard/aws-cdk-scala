package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriberProperty {

  def apply(
    address: String,
    subscriptionType: String
  ): software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.Builder)
      .address(address)
      .subscriptionType(subscriptionType)
      .build()
}
