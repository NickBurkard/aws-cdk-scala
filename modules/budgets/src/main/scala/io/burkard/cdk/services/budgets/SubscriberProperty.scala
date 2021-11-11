package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriberProperty {

  def apply(
    address: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.budgets.CfnBudgetsAction.SubscriberProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudgetsAction.SubscriberProperty.Builder)
      .address(address.orNull)
      .`type`(`type`.orNull)
      .build()
}
