package io.burkard.cdk.services.budgets

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CostTypesProperty {

  def apply(
    includeRefund: Option[Boolean] = None,
    useAmortized: Option[Boolean] = None,
    includeUpfront: Option[Boolean] = None,
    includeDiscount: Option[Boolean] = None,
    includeSubscription: Option[Boolean] = None,
    includeTax: Option[Boolean] = None,
    includeSupport: Option[Boolean] = None,
    useBlended: Option[Boolean] = None,
    includeOtherSubscription: Option[Boolean] = None,
    includeRecurring: Option[Boolean] = None,
    includeCredit: Option[Boolean] = None
  ): software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty =
    (new software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder)
      .includeRefund(includeRefund.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .useAmortized(useAmortized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeUpfront(includeUpfront.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeDiscount(includeDiscount.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeSubscription(includeSubscription.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeTax(includeTax.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeSupport(includeSupport.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .useBlended(useBlended.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeOtherSubscription(includeOtherSubscription.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeRecurring(includeRecurring.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeCredit(includeCredit.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
