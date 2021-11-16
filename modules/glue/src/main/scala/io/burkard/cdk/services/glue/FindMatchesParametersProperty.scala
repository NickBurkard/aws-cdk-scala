package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FindMatchesParametersProperty {

  def apply(
    primaryKeyColumnName: String,
    accuracyCostTradeoff: Option[Number] = None,
    precisionRecallTradeoff: Option[Number] = None,
    enforceProvidedLabels: Option[Boolean] = None
  ): software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty =
    (new software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty.Builder)
      .primaryKeyColumnName(primaryKeyColumnName)
      .accuracyCostTradeoff(accuracyCostTradeoff.orNull)
      .precisionRecallTradeoff(precisionRecallTradeoff.orNull)
      .enforceProvidedLabels(enforceProvidedLabels.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
