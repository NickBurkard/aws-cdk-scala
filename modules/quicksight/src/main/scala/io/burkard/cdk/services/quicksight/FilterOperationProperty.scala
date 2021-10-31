package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FilterOperationProperty {

  def apply(
    conditionExpression: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty.Builder)
      .conditionExpression(conditionExpression.orNull)
      .build()
}
